package org.tensorflow.types;

import java.nio.ByteBuffer;
import org.tensorflow.DataType;
import org.tensorflow.Tensor;
import org.tensorflow.nio.buffer.impl.single.DoubleJdkDataBuffer;
import org.tensorflow.nio.nd.DoubleNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dense.DoubleDenseNdArray;
import org.tensorflow.types.family.TDecimal;

public interface TDouble extends DoubleNdArray, TDecimal {

  DataType<TDouble> DTYPE = new DataType<>(2, 8, TDoubleImpl::new);

  static Tensor<TDouble> scalar(double value) {
    Tensor<TDouble> t = tensorOfShape(Shape.scalar());
    t.data().set(value);
    return t;
  }

  static Tensor<TDouble> vector(double... values) {
    Tensor<TDouble> t = tensorOfShape(Shape.make(values.length));
    t.data().write(values);
    return t;
  }

  static Tensor<TDouble> tensorOfShape(Shape shape) {
    return Tensor.allocate(DTYPE, shape);
  }
}

class TDoubleImpl extends DoubleDenseNdArray implements TDouble {

  TDoubleImpl(ByteBuffer[] tensorBuffers, Shape shape) {
    super(BufferUtils.toDoubleDataBuffer(tensorBuffers, b -> DoubleJdkDataBuffer.wrap(b.asDoubleBuffer())), shape);
  }
}
