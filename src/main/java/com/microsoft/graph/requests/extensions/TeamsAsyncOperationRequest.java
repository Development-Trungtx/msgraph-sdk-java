// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAsyncOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Async Operation Request.
 */
public class TeamsAsyncOperationRequest extends BaseRequest implements ITeamsAsyncOperationRequest {
	
    /**
     * The request for the TeamsAsyncOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAsyncOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAsyncOperation.class);
    }

    /**
     * Gets the TeamsAsyncOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsAsyncOperation from the service
     *
     * @return the TeamsAsyncOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAsyncOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TeamsAsyncOperation> callback) {
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
     * Patches this TeamsAsyncOperation with a source
     *
     * @param sourceTeamsAsyncOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsAsyncOperation sourceTeamsAsyncOperation, final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsAsyncOperation);
    }

    /**
     * Patches this TeamsAsyncOperation with a source
     *
     * @param sourceTeamsAsyncOperation the source object with updates
     * @return the updated TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAsyncOperation patch(final TeamsAsyncOperation sourceTeamsAsyncOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsAsyncOperation newTeamsAsyncOperation, final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.POST, callback, newTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the new object to create
     * @return the created TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAsyncOperation post(final TeamsAsyncOperation newTeamsAsyncOperation) throws ClientException {
        return send(HttpMethod.POST, newTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TeamsAsyncOperation newTeamsAsyncOperation, final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.PUT, callback, newTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the object to create/update
     * @return the created TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAsyncOperation put(final TeamsAsyncOperation newTeamsAsyncOperation) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAsyncOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsAsyncOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsAsyncOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsAsyncOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsAsyncOperationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ITeamsAsyncOperationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (TeamsAsyncOperationRequest)this;
     }

}

