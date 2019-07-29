/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure container mapping of the endpoint.
 */
public class AzureContainerInfo {
    /**
     * ID of the storage account credential used to access storage.
     */
    @JsonProperty(value = "storageAccountCredentialId", required = true)
    private String storageAccountCredentialId;

    /**
     * Container name (Based on the data format specified, this represents the
     * name of Azure Files/Page blob/Block blob).
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /**
     * Storage format used for the file represented by the share. Possible
     * values include: 'BlockBlob', 'PageBlob', 'AzureFile'.
     */
    @JsonProperty(value = "dataFormat", required = true)
    private AzureContainerDataFormat dataFormat;

    /**
     * Get iD of the storage account credential used to access storage.
     *
     * @return the storageAccountCredentialId value
     */
    public String storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    /**
     * Set iD of the storage account credential used to access storage.
     *
     * @param storageAccountCredentialId the storageAccountCredentialId value to set
     * @return the AzureContainerInfo object itself.
     */
    public AzureContainerInfo withStorageAccountCredentialId(String storageAccountCredentialId) {
        this.storageAccountCredentialId = storageAccountCredentialId;
        return this;
    }

    /**
     * Get container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     *
     * @param containerName the containerName value to set
     * @return the AzureContainerInfo object itself.
     */
    public AzureContainerInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get storage format used for the file represented by the share. Possible values include: 'BlockBlob', 'PageBlob', 'AzureFile'.
     *
     * @return the dataFormat value
     */
    public AzureContainerDataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set storage format used for the file represented by the share. Possible values include: 'BlockBlob', 'PageBlob', 'AzureFile'.
     *
     * @param dataFormat the dataFormat value to set
     * @return the AzureContainerInfo object itself.
     */
    public AzureContainerInfo withDataFormat(AzureContainerDataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

}
