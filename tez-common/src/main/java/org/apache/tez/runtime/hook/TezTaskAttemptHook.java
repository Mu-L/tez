/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tez.runtime.hook;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.tez.dag.records.TezTaskAttemptID;

/**
 * A hook which is instantiated and triggered before and after a task attempt is executed.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface TezTaskAttemptHook {
  /**
   * Invoked before the task attempt starts.
   *
   * @param id the task attempt id
   * @param conf the conf
   */
  void start(TezTaskAttemptID id, Configuration conf);

  /**
   * Invoked after the task attempt finishes.
   */
  void stop();
}