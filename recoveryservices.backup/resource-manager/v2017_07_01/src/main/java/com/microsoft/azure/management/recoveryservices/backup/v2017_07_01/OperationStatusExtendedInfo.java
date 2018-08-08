/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for additional information of operation status.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusExtendedInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "OperationStatusJobExtendedInfo", value = OperationStatusJobExtendedInfo.class),
    @JsonSubTypes.Type(name = "OperationStatusJobsExtendedInfo", value = OperationStatusJobsExtendedInfo.class),
    @JsonSubTypes.Type(name = "OperationStatusProvisionILRExtendedInfo", value = OperationStatusProvisionILRExtendedInfo.class)
})
public class OperationStatusExtendedInfo {
}