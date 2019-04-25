/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for creating multiple virtual machines as a single action.
 */
public class BulkCreationParametersFragment {
    /**
     * The number of virtual machine instances to create.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /**
     * Get the number of virtual machine instances to create.
     *
     * @return the instanceCount value
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the number of virtual machine instances to create.
     *
     * @param instanceCount the instanceCount value to set
     * @return the BulkCreationParametersFragment object itself.
     */
    public BulkCreationParametersFragment withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

}