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
package org.tensorflow.nio.buffer.impl.join;

import org.tensorflow.nio.buffer.ShortDataBuffer;
import org.tensorflow.nio.buffer.ShortDataBufferTestBase;

public class ShortLargeDataBufferTest extends ShortDataBufferTestBase {

  @Override
  protected long maxCapacity() {
    return ShortJoinDataBuffer.MAX_CAPACITY;
  }

  @Override
  protected ShortDataBuffer allocate(long capacity) {
    return ShortJoinDataBuffer.allocate(capacity);
  }
}
