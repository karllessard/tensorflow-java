package org.tensorflow.tools.buffer.impl.adapter;

import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.ShortDataBuffer;
import org.tensorflow.tools.buffer.impl.Validator;
import org.tensorflow.tools.buffer.layout.ShortDataLayout;

class ShortDataBufferAdapter extends AbstractDataBufferAdapter<Short, ShortDataBuffer>
    implements ShortDataBuffer {

  @Override
  public short getShort(long index) {
    Validator.getArgs(this, index);
    return layout.readShort(buffer(), index * layout.sizeInBytes());
  }

  @Override
  public ShortDataBuffer setShort(short value, long index) {
    Validator.setArgs(this, index);
    layout.writeShort(buffer(), value, index * layout.sizeInBytes());
    return this;
  }

  @Override
  public ShortDataBuffer read(short[] dst, int offset, int length) {
    Validator.readArgs(this, dst.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      dst[j] = layout.readShort(buffer(), i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public ShortDataBuffer write(short[] src, int offset, int length) {
    Validator.writeArgs(this, src.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      layout.writeShort(buffer(), src[j], i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public ShortDataBuffer offset(long index) {
    return new ShortDataBufferAdapter(buffer().offset(index * layout.sizeInBytes()), layout);
  }

  @Override
  public ShortDataBuffer narrow(long size) {
    return new ShortDataBufferAdapter(buffer().narrow(size * layout.sizeInBytes()), layout);
  }

  ShortDataBufferAdapter(ByteDataBuffer physicalBuffer, ShortDataLayout layout) {
    super(physicalBuffer, layout);
    this.layout = layout;
  }

  private ShortDataLayout layout;
}
