package org.tensorflow.types;

import org.tensorflow.DataType;
import org.tensorflow.Tensor;
import org.tensorflow.c_api.TF_Tensor;
import org.tensorflow.nio.buffer.ByteDataBuffer;
import org.tensorflow.nio.nd.ByteNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dense.ByteDenseNdArray;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.impl.buffer.ByteTensorBuffer;

public interface TUInt8 extends ByteNdArray, TNumber {

  DataType<TUInt8> DTYPE = DataType.create("UINT8", 4, 1, TUInt8Impl::mapTensor);

  static Tensor<TUInt8> scalar(byte value) {
    Tensor<TUInt8> t = tensorOfShape();
    t.data().setByte(value);
    return t;
  }

  static Tensor<TUInt8> vector(byte... values) {
    Tensor<TUInt8> t = tensorOfShape(values.length);
    t.data().write(values);
    return t;
  }

  static Tensor<TUInt8> tensorOfShape(long... dimensionSizes) {
    return Tensor.allocate(DTYPE, Shape.make(dimensionSizes));
  }
}

class TUInt8Impl extends ByteDenseNdArray implements TUInt8 {

  static TUInt8 mapTensor(TF_Tensor nativeTensor, Shape shape) {
    return new TUInt8Impl(ByteTensorBuffer.map(nativeTensor), shape);
  }

  private TUInt8Impl(ByteDataBuffer buffer, Shape shape) {
    super(buffer, shape);
  }
}
