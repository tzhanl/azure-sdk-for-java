/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.PrivateCloudInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VMwareCloudSimpleManager;
import org.joda.time.DateTime;
import java.util.List;
import java.util.UUID;

/**
 * Type representing PrivateCloud.
 */
public interface PrivateCloud extends HasInner<PrivateCloudInner>, HasManager<VMwareCloudSimpleManager> {
    /**
     * @return the clustersNumber value.
     */
    Integer clustersNumber();

    /**
     * @return the createdBy value.
     */
    String createdBy();

    /**
     * @return the createdOn value.
     */
    DateTime createdOn();

    /**
     * @return the dedicatedAvailabilityZoneId value.
     */
    String dedicatedAvailabilityZoneId();

    /**
     * @return the dedicatedAvailabilityZoneName value.
     */
    String dedicatedAvailabilityZoneName();

    /**
     * @return the dedicatedPlacementGroupId value.
     */
    String dedicatedPlacementGroupId();

    /**
     * @return the dedicatedPlacementGroupName value.
     */
    String dedicatedPlacementGroupName();

    /**
     * @return the dnsServers value.
     */
    List<String> dnsServers();

    /**
     * @return the expires value.
     */
    String expires();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nsxType value.
     */
    String nsxType();

    /**
     * @return the privateCloudId value.
     */
    UUID privateCloudId();

    /**
     * @return the privateCloudPropertiesType value.
     */
    String privateCloudPropertiesType();

    /**
     * @return the resourcePools value.
     */
    List<PrivateCloudLocationResourcePool> resourcePools();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the totalCpuCores value.
     */
    Integer totalCpuCores();

    /**
     * @return the totalNodes value.
     */
    Integer totalNodes();

    /**
     * @return the totalRam value.
     */
    Integer totalRam();

    /**
     * @return the totalStorage value.
     */
    Double totalStorage();

    /**
     * @return the type value.
     */
    PrivateCloudResourceType type();

    /**
     * @return the vcenterFqdn value.
     */
    String vcenterFqdn();

    /**
     * @return the vcenterRefid value.
     */
    String vcenterRefid();

    /**
     * @return the virtualMachineTemplates value.
     */
    List<PrivateCloudLocationVirtualMachineTemplate> virtualMachineTemplates();

    /**
     * @return the virtualNetworks value.
     */
    List<PrivateCloudLocationVirtualNetwork> virtualNetworks();

    /**
     * @return the vrOpsEnabled value.
     */
    Boolean vrOpsEnabled();

    /**
     * @return the vSphereVersion value.
     */
    String vSphereVersion();

}
