/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Operations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.OperationResult;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final DevTestLabsManager manager;

    OperationsImpl(DevTestLabsManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public DevTestLabsManager manager() {
        return this.manager;
    }

    private OperationResultImpl wrapModel(OperationResultInner inner) {
        return  new OperationResultImpl(inner, manager());
    }

    @Override
    public Observable<OperationResult> getAsync(String locationName, String name) {
        OperationsInner client = this.inner();
        return client.getAsync(locationName, name)
        .flatMap(new Func1<OperationResultInner, Observable<OperationResult>>() {
            @Override
            public Observable<OperationResult> call(OperationResultInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((OperationResult)wrapModel(inner));
                }
            }
       });
    }

}
