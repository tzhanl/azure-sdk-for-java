/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.OnboardingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Dedicated cloud service model.
 */
@JsonFlatten
public class DedicatedCloudServiceInner extends Resource {
    /**
     * indicates whether account onboarded or not in a given region. Possible
     * values include: 'notOnBoarded', 'onBoarded', 'onBoardingFailed',
     * 'onBoarding'.
     */
    @JsonProperty(value = "properties.accountOnboardingState", access = JsonProperty.Access.WRITE_ONLY)
    private OnboardingStatus accountOnboardingState;

    /**
     * gateway Subnet for the account. It will collect the subnet address and
     * always treat it as /28.
     */
    @JsonProperty(value = "properties.gatewaySubnet", required = true)
    private String gatewaySubnet;

    /**
     * total nodes purchased.
     */
    @JsonProperty(value = "properties.nodes")
    private Integer nodes;

    /**
     * link to a service management web portal.
     */
    @JsonProperty(value = "properties.serviceURL")
    private String serviceURL;

    /**
     * Get indicates whether account onboarded or not in a given region. Possible values include: 'notOnBoarded', 'onBoarded', 'onBoardingFailed', 'onBoarding'.
     *
     * @return the accountOnboardingState value
     */
    public OnboardingStatus accountOnboardingState() {
        return this.accountOnboardingState;
    }

    /**
     * Get gateway Subnet for the account. It will collect the subnet address and always treat it as /28.
     *
     * @return the gatewaySubnet value
     */
    public String gatewaySubnet() {
        return this.gatewaySubnet;
    }

    /**
     * Set gateway Subnet for the account. It will collect the subnet address and always treat it as /28.
     *
     * @param gatewaySubnet the gatewaySubnet value to set
     * @return the DedicatedCloudServiceInner object itself.
     */
    public DedicatedCloudServiceInner withGatewaySubnet(String gatewaySubnet) {
        this.gatewaySubnet = gatewaySubnet;
        return this;
    }

    /**
     * Get total nodes purchased.
     *
     * @return the nodes value
     */
    public Integer nodes() {
        return this.nodes;
    }

    /**
     * Set total nodes purchased.
     *
     * @param nodes the nodes value to set
     * @return the DedicatedCloudServiceInner object itself.
     */
    public DedicatedCloudServiceInner withNodes(Integer nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Get link to a service management web portal.
     *
     * @return the serviceURL value
     */
    public String serviceURL() {
        return this.serviceURL;
    }

    /**
     * Set link to a service management web portal.
     *
     * @param serviceURL the serviceURL value to set
     * @return the DedicatedCloudServiceInner object itself.
     */
    public DedicatedCloudServiceInner withServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
        return this;
    }

}
