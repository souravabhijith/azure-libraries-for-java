/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.management.datalake.store.Locations;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.datalake.store.models.CapabilityInformation;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
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
 * in Locations.
 */
public class LocationsImpl implements Locations {
    /** The Retrofit service to perform REST calls. */
    private LocationsService service;
    /** The service client containing this operation class. */
    private DataLakeStoreAccountManagementClientImpl client;

    /**
     * Initializes an instance of LocationsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocationsImpl(Retrofit retrofit, DataLakeStoreAccountManagementClientImpl client) {
        this.service = retrofit.create(LocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Locations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datalake.store.Locations getCapability" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DataLakeStore/locations/{location}/capability")
        Observable<Response<ResponseBody>> getCapability(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by Resource location.
     *
     * @param location The Resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CapabilityInformation object if successful.
     */
    public CapabilityInformation getCapability(String location) {
        return getCapabilityWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by Resource location.
     *
     * @param location The Resource location without whitespace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CapabilityInformation> getCapabilityAsync(String location, final ServiceCallback<CapabilityInformation> serviceCallback) {
        return ServiceFuture.fromResponse(getCapabilityWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by Resource location.
     *
     * @param location The Resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CapabilityInformation object
     */
    public Observable<CapabilityInformation> getCapabilityAsync(String location) {
        return getCapabilityWithServiceResponseAsync(location).map(new Func1<ServiceResponse<CapabilityInformation>, CapabilityInformation>() {
            @Override
            public CapabilityInformation call(ServiceResponse<CapabilityInformation> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets subscription-level properties and limits for Data Lake Store specified by Resource location.
     *
     * @param location The Resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CapabilityInformation object
     */
    public Observable<ServiceResponse<CapabilityInformation>> getCapabilityWithServiceResponseAsync(String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getCapability(location, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CapabilityInformation>>>() {
                @Override
                public Observable<ServiceResponse<CapabilityInformation>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CapabilityInformation> clientResponse = getCapabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CapabilityInformation> getCapabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CapabilityInformation, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CapabilityInformation>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
