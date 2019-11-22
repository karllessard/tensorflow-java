/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */
package org.tensorflow.nio.benchmark;

import static org.tensorflow.nio.nd.index.Indices.all;
import static org.tensorflow.nio.nd.index.Indices.at;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.RunnerException;
import org.tensorflow.nio.nd.FloatNdArray;
import org.tensorflow.nio.nd.NdArrays;
import org.tensorflow.nio.nd.Shape;

@Fork(value = 1, jvmArgs = {"-Xms4G", "-Xmx4G"})
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3)
@Measurement(iterations = 5)
@State(Scope.Benchmark)
public class NdArrayBenchmark {

	static final String TEST_IMAGE = "1500x916.jpg";
	static final int BATCH_SIZE = 100;

	private FloatNdArray array;
	private FloatNdArray pixels;
	private FloatNdArray channels;

	@Setup
	public void setUp() throws IOException {
		BufferedImage image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(TEST_IMAGE));

		int numPixels = image.getWidth() * image.getHeight();
		pixels = NdArrays.ofFloats(Shape.make(numPixels, 3));
		channels = NdArrays.ofFloats(Shape.make(3, numPixels));

		Raster imageData = image.getData();
		float[] pixel = new float[3];
		for (int y = 0, pixelIdx = 0; y < image.getHeight(); ++y) {
			for (int x = 0; x < image.getWidth(); ++x, ++pixelIdx) {
				imageData.getPixel(x, y, pixel);
				pixels.get(pixelIdx).write(pixel);
				channels.slice(all(), at(pixelIdx)).write(pixel);
			}
		}
		array = NdArrays.ofFloats(Shape.make(BATCH_SIZE, 3, numPixels));
	}

	@Benchmark
  @Measurement(batchSize = 1500 * 916)
	public void getElementAtIndex() {
	  pixels.get(0);
	}

	@Benchmark
	@Measurement(batchSize = 1500 * 916)
	public void slicing() {
		array.slice(at(0), all(), at(0));
	}

	@Benchmark
	public void iteratingAllPixels() {
		pixels.elements(0).forEach(pixel -> {});
	}

	@Benchmark
	public void writeAllChannels() {
	  array.elements(0).forEach(batch ->
			batch.set(channels)
		);
	}

	@Benchmark
	@Measurement(batchSize = 1500 * 916)
	public void writeOnePixelBySlicing() {
		array.slice(at(0), all(), at(0)).set(pixels.get(0));
	}

	@Benchmark
	public void writeAllPixelsBySlicing() {
		array.elements(0).forEach(batch ->
				pixels.elements(0).forEachIndexed((coords, pixel) ->
            batch.slice(all(), at(coords[0])).set(pixel)
				)
		);
	}

	@Benchmark
	@Measurement(batchSize = 1500 * 916)
	public void writeOnePixelsByIndex() {
		array
				.setFloat(pixels.getFloat(0, 0), 0, 0, 0)
				.setFloat(pixels.getFloat(0, 1), 0, 1, 0)
				.setFloat(pixels.getFloat(0, 2), 0, 2, 0);
	}

	@Benchmark
	public void writeAllPixelsByIndex() {
		array.elements(0).forEach(batch ->
				pixels.elements(0).forEachIndexed((coords, pixel) -> {
				  long pixelIndex = coords[0];
					batch
							.setFloat(pixel.getFloat(0), 0, pixelIndex)
							.setFloat(pixel.getFloat(1), 1, pixelIndex)
							.setFloat(pixel.getFloat(2), 2, pixelIndex);
				})
		);
	}

	public static void main(String[] args) throws IOException, RunnerException {
		org.openjdk.jmh.Main.main(args);
	}
}
