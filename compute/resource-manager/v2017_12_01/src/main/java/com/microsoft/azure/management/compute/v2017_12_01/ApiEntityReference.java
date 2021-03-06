/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The API entity reference.
 */
public class ApiEntityReference {
    /**
     * The ARM resource id in the form of
     * /subscriptions/{SubcriptionId}/resourceGroups/{ResourceGroupName}/...
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ApiEntityReference object itself.
     */
    public ApiEntityReference withId(String id) {
        this.id = id;
        return this;
    }

}
