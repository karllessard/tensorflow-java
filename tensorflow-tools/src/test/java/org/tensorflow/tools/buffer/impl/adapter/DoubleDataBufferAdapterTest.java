package org.tensorflow.tools.buffer.impl.adapter;

import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.DataBuffers;
import org.tensorflow.tools.buffer.DoubleDataBuffer;
import org.tensorflow.tools.buffer.DoubleDataBufferTestBase;
import org.tensorflow.tools.buffer.layout.DoubleDataLayout;

public class DoubleDataBufferAdapterTest extends DoubleDataBufferTestBase {

  @Override
  protected DoubleDataBuffer allocate(long size) {
    return DataBuffers.ofDoubles(size, new TestDoubleLayout());
  }

  @Override
  protected long maxSize() {
    return super.maxSize() / 3;
  }

  private static class TestDoubleLayout implements DoubleDataLayout {

    @Override
    public void writeDouble(ByteDataBuffer buffer, double value, long index) {
      long bits = Double.doubleToLongBits(value);
      buffer.setObject((byte)((bits >> 56) & 0xFF), index);
      buffer.setObject((byte)((bits >> 48) & 0xFF), index + 1);
      buffer.setObject((byte)((bits >> 40) & 0xFF), index + 2);
    }

    @Override
    public double readDouble(ByteDataBuffer buffer, long index) {
      long byte7 = buffer.getObject(index);
      long byte6 = buffer.getObject(index + 1);
      long byte5 = buffer.getObject(index + 2);
      return Double.longBitsToDouble(((byte7 & 0xFF) << 56) | ((byte6 & 0xFF) << 48) | ((byte5 & 0xFF) << 40));
    }

    @Override
    public int sizeInBytes() {
      return 3;
    }
  }
}
