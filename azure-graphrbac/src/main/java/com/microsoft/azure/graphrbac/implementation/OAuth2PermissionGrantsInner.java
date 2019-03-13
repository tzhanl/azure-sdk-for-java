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
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.graphrbac.GraphErrorException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in OAuth2PermissionGrants.
 */
public class OAuth2PermissionGrantsInner {
    /** The Retrofit service to perform REST calls. */
    private OAuth2PermissionGrantsService service;
    /** The service client containing this operation class. */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of OAuth2PermissionGrantsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OAuth2PermissionGrantsInner(Retrofit retrofit, GraphRbacManagementClientImpl client) {
        this.service = retrofit.create(OAuth2PermissionGrantsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for OAuth2PermissionGrants to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OAuth2PermissionGrantsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.OAuth2PermissionGrants list" })
        @GET("{tenantID}/oauth2PermissionGrants")
        Observable<Response<ResponseBody>> list(@Path("tenantID") String tenantID, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.OAuth2PermissionGrants create" })
        @POST("{tenantID}/oauth2PermissionGrants")
        Observable<Response<ResponseBody>> create(@Path("tenantID") String tenantID, @Body OAuth2PermissionGrantInner body, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.OAuth2PermissionGrants delete" })
        @HTTP(path = "{tenantID}/oauth2PermissionGrants/{objectId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("objectId") String objectId, @Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.graphrbac.OAuth2PermissionGrants listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OAuth2PermissionGrantInner&gt; object if successful.
     */
    public PagedList<OAuth2PermissionGrantInner> list() {
        ServiceResponse<Page<OAuth2PermissionGrantInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<OAuth2PermissionGrantInner>(response.body()) {
            @Override
            public Page<OAuth2PermissionGrantInner> nextPage(String nextLink) {
                return listNextSinglePageAsync(nextLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OAuth2PermissionGrantInner>> listAsync(final ListOperationCallback<OAuth2PermissionGrantInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(String nextLink) {
                    return listNextSinglePageAsync(nextLink);
                }
            },
            serviceCallback);
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OAuth2PermissionGrantInner&gt; object
     */
    public Observable<Page<OAuth2PermissionGrantInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OAuth2PermissionGrantInner>>, Page<OAuth2PermissionGrantInner>>() {
                @Override
                public Page<OAuth2PermissionGrantInner> call(ServiceResponse<Page<OAuth2PermissionGrantInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OAuth2PermissionGrantInner&gt; object
     */
    public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OAuth2PermissionGrantInner>>, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(ServiceResponse<Page<OAuth2PermissionGrantInner>> page) {
                    String nextLink = page.body().nextPageLink();
                    if (nextLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextLink));
                }
            });
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OAuth2PermissionGrantInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> listSinglePageAsync() {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OAuth2PermissionGrantInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OAuth2PermissionGrantInner&gt; object if successful.
     */
    public PagedList<OAuth2PermissionGrantInner> list(final String filter) {
        ServiceResponse<Page<OAuth2PermissionGrantInner>> response = listSinglePageAsync(filter).toBlocking().single();
        return new PagedList<OAuth2PermissionGrantInner>(response.body()) {
            @Override
            public Page<OAuth2PermissionGrantInner> nextPage(String nextLink) {
                return listNextSinglePageAsync(nextLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OAuth2PermissionGrantInner>> listAsync(final String filter, final ListOperationCallback<OAuth2PermissionGrantInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(filter),
            new Func1<String, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(String nextLink) {
                    return listNextSinglePageAsync(nextLink);
                }
            },
            serviceCallback);
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OAuth2PermissionGrantInner&gt; object
     */
    public Observable<Page<OAuth2PermissionGrantInner>> listAsync(final String filter) {
        return listWithServiceResponseAsync(filter)
            .map(new Func1<ServiceResponse<Page<OAuth2PermissionGrantInner>>, Page<OAuth2PermissionGrantInner>>() {
                @Override
                public Page<OAuth2PermissionGrantInner> call(ServiceResponse<Page<OAuth2PermissionGrantInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OAuth2PermissionGrantInner&gt; object
     */
    public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> listWithServiceResponseAsync(final String filter) {
        return listSinglePageAsync(filter)
            .concatMap(new Func1<ServiceResponse<Page<OAuth2PermissionGrantInner>>, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(ServiceResponse<Page<OAuth2PermissionGrantInner>> page) {
                    String nextLink = page.body().nextPageLink();
                    if (nextLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextLink));
                }
            });
    }

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
    ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> * @param filter This is the Service Principal ObjectId associated with the app
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OAuth2PermissionGrantInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> listSinglePageAsync(final String filter) {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OAuth2PermissionGrantInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OAuth2PermissionGrantInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OAuth2PermissionGrantInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OAuth2PermissionGrantInner object if successful.
     */
    public OAuth2PermissionGrantInner create() {
        return createWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OAuth2PermissionGrantInner> createAsync(final ServiceCallback<OAuth2PermissionGrantInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OAuth2PermissionGrantInner object
     */
    public Observable<OAuth2PermissionGrantInner> createAsync() {
        return createWithServiceResponseAsync().map(new Func1<ServiceResponse<OAuth2PermissionGrantInner>, OAuth2PermissionGrantInner>() {
            @Override
            public OAuth2PermissionGrantInner call(ServiceResponse<OAuth2PermissionGrantInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OAuth2PermissionGrantInner object
     */
    public Observable<ServiceResponse<OAuth2PermissionGrantInner>> createWithServiceResponseAsync() {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final OAuth2PermissionGrantInner body = null;
        return service.create(this.client.tenantID(), body, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OAuth2PermissionGrantInner>>>() {
                @Override
                public Observable<ServiceResponse<OAuth2PermissionGrantInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OAuth2PermissionGrantInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OAuth2PermissionGrantInner object if successful.
     */
    public OAuth2PermissionGrantInner create(OAuth2PermissionGrantInner body) {
        return createWithServiceResponseAsync(body).toBlocking().single().body();
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OAuth2PermissionGrantInner> createAsync(OAuth2PermissionGrantInner body, final ServiceCallback<OAuth2PermissionGrantInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(body), serviceCallback);
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OAuth2PermissionGrantInner object
     */
    public Observable<OAuth2PermissionGrantInner> createAsync(OAuth2PermissionGrantInner body) {
        return createWithServiceResponseAsync(body).map(new Func1<ServiceResponse<OAuth2PermissionGrantInner>, OAuth2PermissionGrantInner>() {
            @Override
            public OAuth2PermissionGrantInner call(ServiceResponse<OAuth2PermissionGrantInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OAuth2PermissionGrantInner object
     */
    public Observable<ServiceResponse<OAuth2PermissionGrantInner>> createWithServiceResponseAsync(OAuth2PermissionGrantInner body) {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(body);
        return service.create(this.client.tenantID(), body, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OAuth2PermissionGrantInner>>>() {
                @Override
                public Observable<ServiceResponse<OAuth2PermissionGrantInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OAuth2PermissionGrantInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OAuth2PermissionGrantInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OAuth2PermissionGrantInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<OAuth2PermissionGrantInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String objectId) {
        deleteWithServiceResponseAsync(objectId).toBlocking().single().body();
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String objectId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(objectId), serviceCallback);
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String objectId) {
        return deleteWithServiceResponseAsync(objectId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String objectId) {
        if (objectId == null) {
            throw new IllegalArgumentException("Parameter objectId is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(objectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

    /**
     * Gets the next page of OAuth2 permission grants.
     *
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws GraphErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OAuth2PermissionGrantInner&gt; object if successful.
     */
    public PagedList<OAuth2PermissionGrantInner> listNext(final String nextLink) {
        ServiceResponse<Page<OAuth2PermissionGrantInner>> response = listNextSinglePageAsync(nextLink).toBlocking().single();
        return new PagedList<OAuth2PermissionGrantInner>(response.body()) {
            @Override
            public Page<OAuth2PermissionGrantInner> nextPage(String nextLink) {
                return listNextSinglePageAsync(nextLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the next page of OAuth2 permission grants.
     *
     * @param nextLink Next link for the list operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OAuth2PermissionGrantInner>> listNextAsync(final String nextLink, final ServiceFuture<List<OAuth2PermissionGrantInner>> serviceFuture, final ListOperationCallback<OAuth2PermissionGrantInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextLink),
            new Func1<String, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(String nextLink) {
                    return listNextSinglePageAsync(nextLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the next page of OAuth2 permission grants.
     *
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OAuth2PermissionGrantInner&gt; object
     */
    public Observable<Page<OAuth2PermissionGrantInner>> listNextAsync(final String nextLink) {
        return listNextWithServiceResponseAsync(nextLink)
            .map(new Func1<ServiceResponse<Page<OAuth2PermissionGrantInner>>, Page<OAuth2PermissionGrantInner>>() {
                @Override
                public Page<OAuth2PermissionGrantInner> call(ServiceResponse<Page<OAuth2PermissionGrantInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the next page of OAuth2 permission grants.
     *
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OAuth2PermissionGrantInner&gt; object
     */
    public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> listNextWithServiceResponseAsync(final String nextLink) {
        return listNextSinglePageAsync(nextLink)
            .concatMap(new Func1<ServiceResponse<Page<OAuth2PermissionGrantInner>>, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(ServiceResponse<Page<OAuth2PermissionGrantInner>> page) {
                    String nextLink = page.body().nextPageLink();
                    if (nextLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextLink));
                }
            });
    }

    /**
     * Gets the next page of OAuth2 permission grants.
     *
    ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OAuth2PermissionGrantInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> listNextSinglePageAsync(final String nextLink) {
        if (nextLink == null) {
            throw new IllegalArgumentException("Parameter nextLink is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        String nextUrl = String.format("%s/%s", this.client.tenantID(), nextLink);
        return service.listNext(nextUrl, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OAuth2PermissionGrantInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OAuth2PermissionGrantInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OAuth2PermissionGrantInner>> listNextDelegate(Response<ResponseBody> response) throws GraphErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OAuth2PermissionGrantInner>, GraphErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OAuth2PermissionGrantInner>>() { }.getType())
                .registerError(GraphErrorException.class)
                .build(response);
    }

}
