/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.infra.lock.exception;

import org.apache.shardingsphere.infra.util.exception.external.sql.sqlstate.XOpenSQLState;

/**
 * Table locked exception.
 */
public final class TableLockedException extends LockSQLException {
    
    private static final long serialVersionUID = 2622020743612706932L;
    
    public TableLockedException(final String databaseName, final String schemaName, final String tableNames) {
        super(XOpenSQLState.GENERAL_ERROR, 0, "The table `%s` of schema `%s` is locked in database `%s`.", tableNames, schemaName, databaseName);
    }
}
