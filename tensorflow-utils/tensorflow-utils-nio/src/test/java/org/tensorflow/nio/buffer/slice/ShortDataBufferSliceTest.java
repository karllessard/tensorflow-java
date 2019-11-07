package org.tensorflow.nio.buffer.slice;

import org.tensorflow.nio.buffer.DataBuffer;
import org.tensorflow.nio.buffer.DataBuffers;

public class ShortDataBufferSliceTest extends DataBufferSliceTestBase<Short> {

  @Override
  protected Short valueOf(Long val) {
    return val.shortValue();
  }

  @Override
  protected DataBuffer<Short> allocate(long capacity) {
    return DataBuffers.ofShorts(capacity);
  }
}
