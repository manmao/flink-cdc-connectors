/*
 * Copyright 2022 Ververica Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ververica.cdc.debezium.table;

import org.apache.kafka.connect.data.Schema;

import java.io.Serializable;

/**
 * Runtime converter that converts objects of Debezium into objects of Flink Table & SQL internal
 * data structures.
 */
@FunctionalInterface
public interface DeserializationRuntimeConverter extends Serializable {
    Object convert(Object dbzObj, Schema schema) throws Exception;
}
