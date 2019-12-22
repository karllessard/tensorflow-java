package org.tensorflow.tools.buffer.impl.adapter;

import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.FloatDataBuffer;
import org.tensorflow.tools.buffer.impl.Validator;
import org.tensorflow.tools.buffer.layout.FloatDataLayout;

class FloatDataBufferAdapter extends AbstractDataBufferAdapter<Float, FloatDataBuffer>
    implements FloatDataBuffer {

  @Override
  public float getFloat(long index) {
    Validator.getArgs(this, index);
    return layout.readFloat(buffer(), index * layout.sizeInBytes());
  }

  @Override
  public FloatDataBuffer setFloat(float value, long index) {
    Validator.setArgs(this, index);
    layout.writeFloat(buffer(), value, index * layout.sizeInBytes());
    return this;
  }

  @Override
  public FloatDataBuffer read(float[] dst, int offset, int length) {
    Validator.readArgs(this, dst.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      dst[j] = layout.readFloat(buffer(), i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public FloatDataBuffer write(float[] src, int offset, int length) {
    Validator.writeArgs(this, src.length, offset, length);
    for (int i = 0, j = offset; i < length; ++i, ++j) {
      layout.writeFloat(buffer(), src[j], i * layout.sizeInBytes());
    }
    return this;
  }

  @Override
  public FloatDataBuffer offset(long index) {
    return new FloatDataBufferAdapter(buffer().offset(index * layout.sizeInBytes()), layout);
  }

  @Override
  public FloatDataBuffer narrow(long size) {
    return new FloatDataBufferAdapter(buffer().narrow(size * layout.sizeInBytes()), layout);
  }

  FloatDataBufferAdapter(ByteDataBuffer physicalBuffer, FloatDataLayout layout) {
    super(physicalBuffer, layout);
    this.layout = layout;
  }

  private FloatDataLayout layout;
}
