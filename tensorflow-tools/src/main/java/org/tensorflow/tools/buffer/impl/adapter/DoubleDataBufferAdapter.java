package org.tensorflow.tools.buffer.impl.adapter;

import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.DoubleDataBuffer;
import org.tensorflow.tools.buffer.impl.Validator;
import org.tensorflow.tools.buffer.layout.DoubleDataLayout;

class DoubleDataBufferAdapter extends AbstractDataBufferAdapter<Double, DoubleDataBuffer>
    implements DoubleDataBuffer {

  @Override
  public double getDouble(long index) {
    Validator.getArgs(this, index);
    return layout.readDouble(buffer(), index * layout.sizeInBytes());
  }

  @Override
  public DoubleDataBuffer setDouble(double value, long index) {
    Validator.setArgs(this, index);
    layout.writeDouble(buffer(), value, index * layout.sizeInBytes());
    return this;
  }

  @Override
  public DoubleDataBuffer read(double[] dst, int offset, int length) {
    Validator.readArgs(this, dst.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      dst[j] = layout.readDouble(buffer(), i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public DoubleDataBuffer write(double[] src, int offset, int length) {
    Validator.writeArgs(this, src.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      layout.writeDouble(buffer(), src[j], i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public DoubleDataBuffer offset(long index) {
    return new DoubleDataBufferAdapter(buffer().offset(index * layout.sizeInBytes()), layout);
  }

  @Override
  public DoubleDataBuffer narrow(long size) {
    return new DoubleDataBufferAdapter(buffer().narrow(size * layout.sizeInBytes()), layout);
  }

  DoubleDataBufferAdapter(ByteDataBuffer physicalBuffer, DoubleDataLayout layout) {
    super(physicalBuffer, layout);
    this.layout = layout;
  }

  private DoubleDataLayout layout;
}
