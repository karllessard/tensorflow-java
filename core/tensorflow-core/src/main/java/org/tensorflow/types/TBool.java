package org.tensorflow.types;

import java.nio.ByteBuffer;
import org.tensorflow.DataType;
import org.tensorflow.Tensor;
import org.tensorflow.nio.buffer.BooleanDataBuffer.BooleanMapper;
import org.tensorflow.nio.buffer.ByteDataBuffer;
import org.tensorflow.nio.buffer.impl.logical.BooleanLogicalDataBuffer;
import org.tensorflow.nio.buffer.impl.single.ByteJdkDataBuffer;
import org.tensorflow.nio.nd.BooleanNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dense.BooleanDenseNdArray;
import org.tensorflow.types.family.TType;

public interface TBool extends BooleanNdArray, TType {

  DataType<TBool> DTYPE = new DataType<>(10, 1, TBoolImpl::new);

  static Tensor<TBool> scalar(boolean value) {
    Tensor<TBool> t = tensorOfShape(Shape.scalar());
    t.data().set(value);
    return t;
  }

  static Tensor<TBool> vector(boolean... values) {
    Tensor<TBool> t = tensorOfShape(Shape.make(values.length));
    t.data().write(values);
    return t;
  }

  static Tensor<TBool> tensorOfShape(Shape shape) {
    return Tensor.allocate(DTYPE, shape);
  }
}

class TBoolImpl extends BooleanDenseNdArray implements TBool {

  private static BooleanMapper BOOL_MAPPER = new BooleanMapper() {

    @Override
    public void writeBoolean(ByteDataBuffer physicalBuffer, boolean value) {
      physicalBuffer.put((byte)(value ? 1 : 0));
    }

    @Override
    public boolean readBoolean(ByteDataBuffer physicalBuffer) {
      return physicalBuffer.get() > 0;
    }

    @Override
    public int sizeInBytes() {
      return TBool.DTYPE.byteSize();
    }
  };

  TBoolImpl(ByteBuffer[] tensorBuffers, Shape shape) {
    super(BufferUtils.toBooleanDataBuffer(tensorBuffers, b -> BooleanLogicalDataBuffer.map(ByteJdkDataBuffer.wrap(b), BOOL_MAPPER)), shape);
  }
}
