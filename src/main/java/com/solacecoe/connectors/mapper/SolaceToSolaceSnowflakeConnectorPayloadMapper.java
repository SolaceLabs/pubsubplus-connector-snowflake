/*
 * Licensed to Solace Corporation under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Solace licenses this file to You under the Solace Community License, Version 1.0
 * (the "License"); you may not use this file except in compliance with
 * the License. A copy of the License must be provided to you with the source code
 * distribution.

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.solacecoe.connectors.mapper;

import com.solace.connector.core.service.SimpleFromSolaceBinderAwarePayloadMapper;

import java.util.Set;

/**
 * Payload mapper to map payloads from Solace to solace-snowflake.
 */
public class SolaceToSolaceSnowflakeConnectorPayloadMapper extends SimpleFromSolaceBinderAwarePayloadMapper {

    @Override
    public boolean supports(Set<String> inputBinders, Set<String> outputBinders) {
        return (inputBinders.contains("solace") && outputBinders.contains("solace-snowflake-stream")) ||
                (inputBinders.contains("solace") && outputBinders.contains("solace-snowflake-jdbc"));
    }

}
