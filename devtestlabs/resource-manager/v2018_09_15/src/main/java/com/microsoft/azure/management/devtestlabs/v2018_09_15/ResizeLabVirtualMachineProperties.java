/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for resizing a virtual machine.
 */
public class ResizeLabVirtualMachineProperties {
    /**
     * Specifies the size of the virtual machine.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Get specifies the size of the virtual machine.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set specifies the size of the virtual machine.
     *
     * @param size the size value to set
     * @return the ResizeLabVirtualMachineProperties object itself.
     */
    public ResizeLabVirtualMachineProperties withSize(String size) {
        this.size = size;
        return this;
    }

}
