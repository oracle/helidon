/*
 * Copyright (c) 2020 Oracle and/or its affiliates.
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

package io.helidon.microprofile.graphql.server;

import java.io.IOException;
import java.util.Set;

import io.helidon.microprofile.graphql.server.test.queries.VoidQueries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for void queries.
 */
class VoidQueriesIT extends AbstractGraphQlIT {

    VoidQueriesIT() {
        super(Set.of(VoidQueries.class));
    }

    @Test
    void testVoidQueries() throws IOException {
        setupIndex(indexFileName, VoidQueries.class);
        assertThrows(RuntimeException.class, this::createInvocationHandler);
    }
}
