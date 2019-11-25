package org.tensorflow.op;

import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.op.data.AnonymousIterator;
import org.tensorflow.op.data.DeserializeIterator;
import org.tensorflow.op.data.IteratorGetNext;
import org.tensorflow.op.data.IteratorGetNextAsOptional;
import org.tensorflow.op.data.IteratorGetNextSync;
import org.tensorflow.op.data.IteratorToStringHandle;
import org.tensorflow.op.data.KafkaDataset;
import org.tensorflow.op.data.MakeIterator;
import org.tensorflow.op.data.OptionalFromValue;
import org.tensorflow.op.data.OptionalGetValue;
import org.tensorflow.op.data.OptionalHasValue;
import org.tensorflow.op.data.OptionalNone;
import org.tensorflow.op.data.SerializeIterator;
import org.tensorflow.types.TBool;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.TString;

/**
 * An API for building {@code data} operations as {@link Op Op}s
 *
 * @see {@link Ops}
 */
public final class DataOps {
  private final Scope scope;

  DataOps(Scope scope) {
    this.scope = scope;
  }

  /**
   * Builds an {@link IteratorGetNextAsOptional} operation
   *
   * @param iterator 
   * @param outputTypes 
   * @param outputShapes 
   * @return a new instance of IteratorGetNextAsOptional
   * @see org.tensorflow.op.data.IteratorGetNextAsOptional
   */
  public IteratorGetNextAsOptional iteratorGetNextAsOptional(Operand<?> iterator,
      List<DataType<?>> outputTypes, List<Shape> outputShapes) {
    return IteratorGetNextAsOptional.create(scope, iterator, outputTypes, outputShapes);
  }

  /**
   * Builds an {@link KafkaDataset} operation
   *
   * @param topics A `tf.string` tensor containing one or more subscriptions,
   * @param servers A list of bootstrap servers.
   * @param group The consumer group id.
   * @param eof If True, the kafka reader will stop on EOF.
   * @param timeout The timeout value for the Kafka Consumer to wait
   * @param configGlobal A `tf.string` tensor containing global configuration
   * @param configTopic A `tf.string` tensor containing topic configuration
   * @return a new instance of KafkaDataset
   * @see org.tensorflow.op.data.KafkaDataset
   */
  public KafkaDataset kafkaDataset(Operand<TString> topics, Operand<TString> servers,
      Operand<TString> group, Operand<TBool> eof, Operand<TInt64> timeout,
      Operand<TString> configGlobal, Operand<TString> configTopic) {
    return KafkaDataset.create(scope, topics, servers, group, eof, timeout, configGlobal, configTopic);
  }

  /**
   * Builds an {@link AnonymousIterator} operation
   *
   * @param outputTypes 
   * @param outputShapes 
   * @return a new instance of AnonymousIterator
   * @see org.tensorflow.op.data.AnonymousIterator
   */
  public AnonymousIterator anonymousIterator(List<DataType<?>> outputTypes,
      List<Shape> outputShapes) {
    return AnonymousIterator.create(scope, outputTypes, outputShapes);
  }

  /**
   * Builds an {@link DeserializeIterator} operation
   *
   * @param resourceHandle A handle to an iterator resource.
   * @param serialized A variant tensor storing the state of the iterator contained in the
   * @return a new instance of DeserializeIterator
   * @see org.tensorflow.op.data.DeserializeIterator
   */
  public DeserializeIterator deserializeIterator(Operand<?> resourceHandle, Operand<?> serialized) {
    return DeserializeIterator.create(scope, resourceHandle, serialized);
  }

  /**
   * Builds an {@link OptionalNone} operation
   *
   * @return a new instance of OptionalNone
   * @see org.tensorflow.op.data.OptionalNone
   */
  public OptionalNone optionalNone() {
    return OptionalNone.create(scope);
  }

  /**
   * Builds an {@link IteratorGetNext} operation
   *
   * @param iterator 
   * @param outputTypes 
   * @param outputShapes 
   * @return a new instance of IteratorGetNext
   * @see org.tensorflow.op.data.IteratorGetNext
   */
  public IteratorGetNext iteratorGetNext(Operand<?> iterator, List<DataType<?>> outputTypes,
      List<Shape> outputShapes) {
    return IteratorGetNext.create(scope, iterator, outputTypes, outputShapes);
  }

  /**
   * Builds an {@link OptionalFromValue} operation
   *
   * @param components 
   * @return a new instance of OptionalFromValue
   * @see org.tensorflow.op.data.OptionalFromValue
   */
  public OptionalFromValue optionalFromValue(Iterable<Operand<?>> components) {
    return OptionalFromValue.create(scope, components);
  }

  /**
   * Builds an {@link IteratorGetNextSync} operation
   *
   * @param iterator 
   * @param outputTypes 
   * @param outputShapes 
   * @return a new instance of IteratorGetNextSync
   * @see org.tensorflow.op.data.IteratorGetNextSync
   */
  public IteratorGetNextSync iteratorGetNextSync(Operand<?> iterator, List<DataType<?>> outputTypes,
      List<Shape> outputShapes) {
    return IteratorGetNextSync.create(scope, iterator, outputTypes, outputShapes);
  }

  /**
   * Builds an {@link OptionalGetValue} operation
   *
   * @param optional 
   * @param outputTypes 
   * @param outputShapes 
   * @return a new instance of OptionalGetValue
   * @see org.tensorflow.op.data.OptionalGetValue
   */
  public OptionalGetValue optionalGetValue(Operand<?> optional, List<DataType<?>> outputTypes,
      List<Shape> outputShapes) {
    return OptionalGetValue.create(scope, optional, outputTypes, outputShapes);
  }

  /**
   * Builds an {@link IteratorToStringHandle} operation
   *
   * @param resourceHandle A handle to an iterator resource.
   * @return a new instance of IteratorToStringHandle
   * @see org.tensorflow.op.data.IteratorToStringHandle
   */
  public IteratorToStringHandle iteratorToStringHandle(Operand<?> resourceHandle) {
    return IteratorToStringHandle.create(scope, resourceHandle);
  }

  /**
   * Builds an {@link OptionalHasValue} operation
   *
   * @param optional 
   * @return a new instance of OptionalHasValue
   * @see org.tensorflow.op.data.OptionalHasValue
   */
  public OptionalHasValue optionalHasValue(Operand<?> optional) {
    return OptionalHasValue.create(scope, optional);
  }

  /**
   * Builds an {@link SerializeIterator} operation
   *
   * @param resourceHandle A handle to an iterator resource.
   * @return a new instance of SerializeIterator
   * @see org.tensorflow.op.data.SerializeIterator
   */
  public SerializeIterator serializeIterator(Operand<?> resourceHandle) {
    return SerializeIterator.create(scope, resourceHandle);
  }

  /**
   * Builds an {@link MakeIterator} operation
   *
   * @param dataset 
   * @param iterator 
   * @return a new instance of MakeIterator
   * @see org.tensorflow.op.data.MakeIterator
   */
  public MakeIterator makeIterator(Operand<?> dataset, Operand<?> iterator) {
    return MakeIterator.create(scope, dataset, iterator);
  }
}
