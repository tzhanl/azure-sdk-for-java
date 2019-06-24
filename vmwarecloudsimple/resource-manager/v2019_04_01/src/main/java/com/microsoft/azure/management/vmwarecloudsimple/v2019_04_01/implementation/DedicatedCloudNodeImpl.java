/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.DedicatedCloudNode;
import rx.Observable;
import java.util.UUID;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.NodeStatus;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.Sku;

class DedicatedCloudNodeImpl extends GroupableResourceCoreImpl<DedicatedCloudNode, DedicatedCloudNodeInner, DedicatedCloudNodeImpl, VMwareCloudSimpleManager> implements DedicatedCloudNode, DedicatedCloudNode.Definition, DedicatedCloudNode.Update {
    DedicatedCloudNodeImpl(String name, DedicatedCloudNodeInner inner, VMwareCloudSimpleManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DedicatedCloudNode> createResourceAsync() {
        DedicatedCloudNodesInner client = this.manager().inner().dedicatedCloudNodes();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DedicatedCloudNode> updateResourceAsync() {
        DedicatedCloudNodesInner client = this.manager().inner().dedicatedCloudNodes();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DedicatedCloudNodeInner> getInnerAsync() {
        DedicatedCloudNodesInner client = this.manager().inner().dedicatedCloudNodes();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String cloudRackName() {
        return this.inner().cloudRackName();
    }

    @Override
    public Object created() {
        return this.inner().created();
    }

    @Override
    public String dedicatedAvailabilityZoneId() {
        return this.inner().dedicatedAvailabilityZoneId();
    }

    @Override
    public String dedicatedAvailabilityZoneName() {
        return this.inner().dedicatedAvailabilityZoneName();
    }

    @Override
    public String dedicatedPlacementGroupId() {
        return this.inner().dedicatedPlacementGroupId();
    }

    @Override
    public String dedicatedPlacementGroupName() {
        return this.inner().dedicatedPlacementGroupName();
    }

    @Override
    public String id1() {
        return this.inner().id1();
    }

    @Override
    public String name1() {
        return this.inner().name1();
    }

    @Override
    public int nodesCount() {
        return this.inner().nodesCount();
    }

    @Override
    public String privateCloudId() {
        return this.inner().privateCloudId();
    }

    @Override
    public String privateCloudName() {
        return this.inner().privateCloudName();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public UUID purchaseId() {
        return this.inner().purchaseId();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public NodeStatus status() {
        return this.inner().status();
    }

    @Override
    public String vmwareClusterName() {
        return this.inner().vmwareClusterName();
    }

    @Override
    public DedicatedCloudNodeImpl withDedicatedAvailabilityZoneId(String dedicatedAvailabilityZoneId) {
        this.inner().withDedicatedAvailabilityZoneId(dedicatedAvailabilityZoneId);
        return this;
    }

    @Override
    public DedicatedCloudNodeImpl withDedicatedPlacementGroupId(String dedicatedPlacementGroupId) {
        this.inner().withDedicatedPlacementGroupId(dedicatedPlacementGroupId);
        return this;
    }

    @Override
    public DedicatedCloudNodeImpl withId1(String id1) {
        this.inner().withId1(id1);
        return this;
    }

    @Override
    public DedicatedCloudNodeImpl withName1(String name1) {
        this.inner().withName1(name1);
        return this;
    }

    @Override
    public DedicatedCloudNodeImpl withNodesCount(int nodesCount) {
        this.inner().withNodesCount(nodesCount);
        return this;
    }

    @Override
    public DedicatedCloudNodeImpl withPurchaseId(UUID purchaseId) {
        this.inner().withPurchaseId(purchaseId);
        return this;
    }

    @Override
    public DedicatedCloudNodeImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
