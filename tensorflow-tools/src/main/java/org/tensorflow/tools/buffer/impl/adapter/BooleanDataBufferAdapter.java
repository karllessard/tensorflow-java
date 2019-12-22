package org.tensorflow.tools.buffer.impl.adapter;

import org.tensorflow.tools.buffer.BooleanDataBuffer;
import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.impl.Validator;
import org.tensorflow.tools.buffer.layout.BooleanDataLayout;

class BooleanDataBufferAdapter extends AbstractDataBufferAdapter<Boolean, BooleanDataBuffer>
    implements BooleanDataBuffer {

  @Override
  public boolean getBoolean(long index) {
    Validator.getArgs(this, index);
    return layout.readBoolean(buffer(), index * layout.sizeInBytes());
  }

  @Override
  public BooleanDataBuffer setBoolean(boolean value, long index) {
    Validator.setArgs(this, index);
    layout.writeBoolean(buffer(), value, index * layout.sizeInBytes());
    return this;
  }

  @Override
  public BooleanDataBuffer read(boolean[] dst, int offset, int length) {
    Validator.readArgs(this, dst.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      dst[j] = layout.readBoolean(buffer(), i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public BooleanDataBuffer write(boolean[] src, int offset, int length) {
    Validator.writeArgs(this, src.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      layout.writeBoolean(buffer(), src[j], i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public BooleanDataBuffer offset(long index) {
    return new BooleanDataBufferAdapter(buffer().offset(index * layout.sizeInBytes()), layout);
  }

  @Override
  public BooleanDataBuffer narrow(long size) {
    return new BooleanDataBufferAdapter(buffer().narrow(size * layout.sizeInBytes()), layout);
  }

  BooleanDataBufferAdapter(ByteDataBuffer physicalBuffer, BooleanDataLayout layout) {
    super(physicalBuffer, layout);
    this.layout = layout;
  }

  private BooleanDataLayout layout;
}
