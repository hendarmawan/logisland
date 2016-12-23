/**
 * Copyright (C) 2016 Hurence (bailet.thomas@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hurence.logisland.stream.spark

import com.hurence.logisland.stream.{RecordStream, StreamContext}
import org.apache.spark.streaming.StreamingContext


trait KafkaRecordStream extends RecordStream{

    /**
      * ssetup the stream with spark app properties
      *
      * @param appName
      * @param ssc
      * @param streamContext
      */
    def setup(appName: String,ssc: StreamingContext, streamContext: StreamContext);
}