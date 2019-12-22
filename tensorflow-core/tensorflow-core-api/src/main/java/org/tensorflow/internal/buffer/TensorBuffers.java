package org.tensorflow.internal.buffer;

import static org.tensorflow.internal.c_api.global.tensorflow.TF_TensorByteSize;
import static org.tensorflow.internal.c_api.global.tensorflow.TF_TensorData;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.bytedeco.javacpp.Pointer;
import org.tensorflow.internal.c_api.TF_Tensor;
import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.DataBuffers;
import org.tensorflow.tools.buffer.DoubleDataBuffer;
import org.tensorflow.tools.buffer.FloatDataBuffer;
import org.tensorflow.tools.buffer.IntDataBuffer;
import org.tensorflow.tools.buffer.LongDataBuffer;

public final class TensorBuffers {

  public static ByteDataBuffer toBytes(TF_Tensor nativeTensor) {
    Pointer tensorMemory = tensorMemory(nativeTensor);
    if (TensorRawDataBufferFactory.canBeUsed()) {
      return TensorRawDataBufferFactory.mapTensorToBytes(tensorMemory);
    }
    return DataBuffers.from(tensorMemory.asByteBuffer());
  }

  public static IntDataBuffer toInts(TF_Tensor nativeTensor) {
    Pointer tensorMemory = tensorMemory(nativeTensor);
    if (TensorRawDataBufferFactory.canBeUsed()) {
      return TensorRawDataBufferFactory.mapTensorToInts(tensorMemory);
    }
    return DataBuffers.from(tensorMemory.asByteBuffer().asIntBuffer());
  }

  public static LongDataBuffer toLongs(TF_Tensor nativeTensor) {
    Pointer tensorMemory = tensorMemory(nativeTensor);
    if (TensorRawDataBufferFactory.canBeUsed()) {
      return TensorRawDataBufferFactory.mapTensorToLongs(tensorMemory);
    }
    return DataBuffers.from(tensorMemory.asByteBuffer().asLongBuffer());
  }

  public static FloatDataBuffer toFloats(TF_Tensor nativeTensor) {
    Pointer tensorMemory = tensorMemory(nativeTensor);
    if (TensorRawDataBufferFactory.canBeUsed()) {
      return TensorRawDataBufferFactory.mapTensorToFloats(tensorMemory);
    }
    return DataBuffers.from(tensorMemory.asByteBuffer().asFloatBuffer());
  }

  public static DoubleDataBuffer toDoubles(TF_Tensor nativeTensor) {
    Pointer tensorMemory = tensorMemory(nativeTensor);
    if (TensorRawDataBufferFactory.canBeUsed()) {
      return TensorRawDataBufferFactory.mapTensorToDoubles(tensorMemory);
    }
    return DataBuffers.from(tensorMemory.asByteBuffer().asDoubleBuffer());
  }

  public static StringTensorBuffer toStrings(TF_Tensor nativeTensor, long numElements) {
    Pointer tensorMemory = tensorMemory(nativeTensor);
    if (TensorRawDataBufferFactory.canBeUsed()) {
      return TensorRawDataBufferFactory.mapTensorToStrings(tensorMemory, numElements);
    }
    if (numElements > Integer.MAX_VALUE) {
      throw new IllegalArgumentException("Cannot map string tensor of " + numElements + " elements");
    }
    ByteBuffer dataBuffer = tensorMemory.asByteBuffer();

    LongBuffer offsetBuffer = dataBuffer.asLongBuffer();
    offsetBuffer.limit((int)numElements);
    LongDataBuffer offsets = DataBuffers.from(offsetBuffer.slice());

    dataBuffer.position((int)numElements * Long.BYTES);
    ByteDataBuffer data = DataBuffers.from(dataBuffer.slice());

    return new StringTensorBuffer(offsets, data);
  }

  private static Pointer tensorMemory(TF_Tensor nativeTensor) {
    return TF_TensorData(nativeTensor).capacity(TF_TensorByteSize(nativeTensor));
  }
}
