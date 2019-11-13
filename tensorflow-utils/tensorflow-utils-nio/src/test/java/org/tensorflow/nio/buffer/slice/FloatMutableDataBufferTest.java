package org.tensorflow.nio.buffer.slice;

import org.tensorflow.nio.buffer.DataBuffer;
import org.tensorflow.nio.buffer.DataBuffers;

public class FloatMutableDataBufferTest extends MutableDataBufferTestBase<Float> {

  @Override
  protected Float valueOf(Long val) {
    return val.floatValue();
  }

  @Override
  protected DataBuffer<Float> allocate(long capacity) {
    return DataBuffers.ofFloats(capacity);
  }
}
