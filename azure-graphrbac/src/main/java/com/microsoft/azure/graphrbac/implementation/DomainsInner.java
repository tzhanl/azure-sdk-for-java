/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Domains.
 */
public class DomainsInner {
    /** The Retrofit service to perform REST calls. */
    private DomainsService service;
    /** The service client containing this operation class. */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of DomainsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DomainsInner(Retrofit retrofit, GraphRbacManagementClientImpl client) {
        this.service = retrofit.create(DomainsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Domains to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DomainsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.Domains list" })
        @GET("{tenantID}/domains")
        Observable<Response<ResponseBody>> list(@Path("tenantID") String tenantID, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.Domains get" })
        @GET("{tenantID}/domains/{domainName}")
        Observable<Response<ResponseBody>> get(@Path("domainName") String domainName, @Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DomainInner&gt; object if successful.
     */
    public List<DomainInner> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DomainInner>> listAsync(final ServiceCallback<List<DomainInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DomainInner&gt; object
     */
    public Observable<List<DomainInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<DomainInner>>, List<DomainInner>>() {
            @Override
            public List<DomainInner> call(ServiceResponse<List<DomainInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DomainInner&gt; object
     */
    public Observable<ServiceResponse<List<DomainInner>>> listWithServiceResponseAsync() {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DomainInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<DomainInner>> result = listDelegate(response);
                        List<DomainInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DomainInner>> clientResponse = new ServiceResponse<List<DomainInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DomainInner&gt; object if successful.
     */
    public List<DomainInner> list(String filter) {
        return listWithServiceResponseAsync(filter).toBlocking().single().body();
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DomainInner>> listAsync(String filter, final ServiceCallback<List<DomainInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(filter), serviceCallback);
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DomainInner&gt; object
     */
    public Observable<List<DomainInner>> listAsync(String filter) {
        return listWithServiceResponseAsync(filter).map(new Func1<ServiceResponse<List<DomainInner>>, List<DomainInner>>() {
            @Override
            public List<DomainInner> call(ServiceResponse<List<DomainInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DomainInner&gt; object
     */
    public Observable<ServiceResponse<List<DomainInner>>> listWithServiceResponseAsync(String filter) {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DomainInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<DomainInner>> result = listDelegate(response);
                        List<DomainInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DomainInner>> clientResponse = new ServiceResponse<List<DomainInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<DomainInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<DomainInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<DomainInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DomainInner object if successful.
     */
    public DomainInner get(String domainName) {
        return getWithServiceResponseAsync(domainName).toBlocking().single().body();
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DomainInner> getAsync(String domainName, final ServiceCallback<DomainInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(domainName), serviceCallback);
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DomainInner object
     */
    public Observable<DomainInner> getAsync(String domainName) {
        return getWithServiceResponseAsync(domainName).map(new Func1<ServiceResponse<DomainInner>, DomainInner>() {
            @Override
            public DomainInner call(ServiceResponse<DomainInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DomainInner object
     */
    public Observable<ServiceResponse<DomainInner>> getWithServiceResponseAsync(String domainName) {
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(domainName, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DomainInner>>>() {
                @Override
                public Observable<ServiceResponse<DomainInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DomainInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DomainInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DomainInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DomainInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
