// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosStoreApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Store App Request.
 */
public class IosStoreAppRequest extends BaseRequest implements IIosStoreAppRequest {
	
    /**
     * The request for the IosStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosStoreAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosStoreApp.class);
    }

    /**
     * Gets the IosStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosStoreApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosStoreApp from the service
     *
     * @return the IosStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosStoreApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosStoreApp with a source
     *
     * @param sourceIosStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosStoreApp sourceIosStoreApp, final ICallback<? super IosStoreApp> callback) {
        send(HttpMethod.PATCH, callback, sourceIosStoreApp);
    }

    /**
     * Patches this IosStoreApp with a source
     *
     * @param sourceIosStoreApp the source object with updates
     * @return the updated IosStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp patch(final IosStoreApp sourceIosStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosStoreApp);
    }

    /**
     * Creates a IosStoreApp with a new object
     *
     * @param newIosStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosStoreApp newIosStoreApp, final ICallback<? super IosStoreApp> callback) {
        send(HttpMethod.POST, callback, newIosStoreApp);
    }

    /**
     * Creates a IosStoreApp with a new object
     *
     * @param newIosStoreApp the new object to create
     * @return the created IosStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp post(final IosStoreApp newIosStoreApp) throws ClientException {
        return send(HttpMethod.POST, newIosStoreApp);
    }

    /**
     * Creates a IosStoreApp with a new object
     *
     * @param newIosStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosStoreApp newIosStoreApp, final ICallback<? super IosStoreApp> callback) {
        send(HttpMethod.PUT, callback, newIosStoreApp);
    }

    /**
     * Creates a IosStoreApp with a new object
     *
     * @param newIosStoreApp the object to create/update
     * @return the created IosStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp put(final IosStoreApp newIosStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newIosStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosStoreAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosStoreAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosStoreAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosStoreAppRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IIosStoreAppRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (IosStoreAppRequest)this;
     }

}

