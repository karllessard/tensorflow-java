/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */
package org.tensorflow.nio.buffer.impl;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ReadOnlyBufferException;
import org.tensorflow.nio.buffer.DataBuffer;

public class Validator {

  public static <T> void getArgs(DataBuffer<T> buffer, long index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index must be non-negative");
    }
    if (index >= buffer.capacity()) {
      throw new IndexOutOfBoundsException("Index must be smaller than the buffer capacity");
    }
  }

  public static <T> void putArgs(DataBuffer<T> buffer, long index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index must be non-negative");
    }
    if (index >= buffer.capacity()) {
      throw new IndexOutOfBoundsException("Index must be smaller than the buffer capacity");
    }
    if (buffer.isReadOnly()) {
      throw new ReadOnlyBufferException();
    }
  }

  public static <T> void copyToArgs(DataBuffer<T> src, DataBuffer<T> dst) {
    if (dst == src) {
      throw new IllegalArgumentException("Source cannot be the same buffer as destination");
    }
    if (src.capacity() > dst.capacity()) {
      throw new BufferOverflowException();
    }
    if (dst.isReadOnly()) {
      throw new ReadOnlyBufferException();
    }
  }

  public static <T> void readArgs(DataBuffer<T> buffer, int arrayLength, int offset, int length) {
    if (length > buffer.capacity()) {
      throw new BufferUnderflowException();
    }
    arrayArgs(arrayLength, offset, length);
  }

  public static <T> void writeArgs(DataBuffer<T> buffer, int arrayLength, int offset, int length) {
    if (length > buffer.capacity()) {
      throw new BufferOverflowException();
    }
    if (buffer.isReadOnly()) {
      throw new ReadOnlyBufferException();
    }
    arrayArgs(arrayLength, offset, length);
  }

  public static <T> void offsetArgs(DataBuffer<T> buffer, long index) {
    if (index < 0 || index >= buffer.capacity()) {
      throw new IllegalArgumentException();
    }
  }

  public static <T> void narrowArgs(DataBuffer<T> buffer, long capacity) {
    if (capacity < 0 || capacity > buffer.capacity()) {
      throw new IllegalArgumentException();
    }
  }

  private static void arrayArgs(int arrayLength, int offset, int length) {
    if (offset < 0) {
      throw new IndexOutOfBoundsException("Offset must be non-negative");
    }
    if (offset > arrayLength) {
      throw new IndexOutOfBoundsException("Offset must be no larger than array length");
    }
    if (length < 0) {
      throw new IndexOutOfBoundsException("Length must be non-negative");
    }
    if (length > arrayLength - offset) {
      throw new IndexOutOfBoundsException("Length must be no larger than array length minus the offset");
    }
  }
}
