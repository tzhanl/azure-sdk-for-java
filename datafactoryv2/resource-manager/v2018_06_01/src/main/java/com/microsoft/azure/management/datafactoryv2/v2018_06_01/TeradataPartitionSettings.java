/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings that will be leveraged for teradata source partitioning.
 */
public class TeradataPartitionSettings {
    /**
     * The name of the column in integer type that will be used for proceeding
     * range or hash partitioning. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "partitionColumnName")
    private Object partitionColumnName;

    /**
     * The maximum value of column specified in partitionColumnName that will
     * be used for proceeding range partitioning. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "partitionUpperBound")
    private Object partitionUpperBound;

    /**
     * The minimum value of column specified in partitionColumnName that will
     * be used for proceeding range partitioning. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "partitionLowerBound")
    private Object partitionLowerBound;

    /**
     * Get the name of the column in integer type that will be used for proceeding range or hash partitioning. Type: string (or Expression with resultType string).
     *
     * @return the partitionColumnName value
     */
    public Object partitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the name of the column in integer type that will be used for proceeding range or hash partitioning. Type: string (or Expression with resultType string).
     *
     * @param partitionColumnName the partitionColumnName value to set
     * @return the TeradataPartitionSettings object itself.
     */
    public TeradataPartitionSettings withPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * Get the maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @return the partitionUpperBound value
     */
    public Object partitionUpperBound() {
        return this.partitionUpperBound;
    }

    /**
     * Set the maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @param partitionUpperBound the partitionUpperBound value to set
     * @return the TeradataPartitionSettings object itself.
     */
    public TeradataPartitionSettings withPartitionUpperBound(Object partitionUpperBound) {
        this.partitionUpperBound = partitionUpperBound;
        return this;
    }

    /**
     * Get the minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @return the partitionLowerBound value
     */
    public Object partitionLowerBound() {
        return this.partitionLowerBound;
    }

    /**
     * Set the minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @param partitionLowerBound the partitionLowerBound value to set
     * @return the TeradataPartitionSettings object itself.
     */
    public TeradataPartitionSettings withPartitionLowerBound(Object partitionLowerBound) {
        this.partitionLowerBound = partitionLowerBound;
        return this;
    }

}
