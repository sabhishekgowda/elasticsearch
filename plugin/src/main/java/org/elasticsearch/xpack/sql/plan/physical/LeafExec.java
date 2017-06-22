/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.sql.plan.physical;

import java.util.Collections;

import org.elasticsearch.xpack.sql.tree.Location;

abstract class LeafExec extends PhysicalPlan {
    LeafExec(Location location) {
        super(location, Collections.emptyList());
    }
}
