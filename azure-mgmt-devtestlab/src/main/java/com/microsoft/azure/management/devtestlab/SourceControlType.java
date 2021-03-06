/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SourceControlType.
 */
public final class SourceControlType {
    /** Static value VsoGit for SourceControlType. */
    public static final SourceControlType VSO_GIT = new SourceControlType("VsoGit");

    /** Static value GitHub for SourceControlType. */
    public static final SourceControlType GIT_HUB = new SourceControlType("GitHub");

    private String value;

    /**
     * Creates a custom value for SourceControlType.
     * @param value the custom value
     */
    public SourceControlType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SourceControlType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SourceControlType rhs = (SourceControlType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
