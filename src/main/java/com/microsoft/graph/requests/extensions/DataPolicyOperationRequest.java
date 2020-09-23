// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataPolicyOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Policy Operation Request.
 */
public class DataPolicyOperationRequest extends BaseRequest implements IDataPolicyOperationRequest {
	
    /**
     * The request for the DataPolicyOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataPolicyOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataPolicyOperation.class);
    }

    /**
     * Gets the DataPolicyOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DataPolicyOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DataPolicyOperation from the service
     *
     * @return the DataPolicyOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataPolicyOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DataPolicyOperation> callback) {
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
     * Patches this DataPolicyOperation with a source
     *
     * @param sourceDataPolicyOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DataPolicyOperation sourceDataPolicyOperation, final ICallback<? super DataPolicyOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceDataPolicyOperation);
    }

    /**
     * Patches this DataPolicyOperation with a source
     *
     * @param sourceDataPolicyOperation the source object with updates
     * @return the updated DataPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataPolicyOperation patch(final DataPolicyOperation sourceDataPolicyOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceDataPolicyOperation);
    }

    /**
     * Creates a DataPolicyOperation with a new object
     *
     * @param newDataPolicyOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DataPolicyOperation newDataPolicyOperation, final ICallback<? super DataPolicyOperation> callback) {
        send(HttpMethod.POST, callback, newDataPolicyOperation);
    }

    /**
     * Creates a DataPolicyOperation with a new object
     *
     * @param newDataPolicyOperation the new object to create
     * @return the created DataPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataPolicyOperation post(final DataPolicyOperation newDataPolicyOperation) throws ClientException {
        return send(HttpMethod.POST, newDataPolicyOperation);
    }

    /**
     * Creates a DataPolicyOperation with a new object
     *
     * @param newDataPolicyOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DataPolicyOperation newDataPolicyOperation, final ICallback<? super DataPolicyOperation> callback) {
        send(HttpMethod.PUT, callback, newDataPolicyOperation);
    }

    /**
     * Creates a DataPolicyOperation with a new object
     *
     * @param newDataPolicyOperation the object to create/update
     * @return the created DataPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataPolicyOperation put(final DataPolicyOperation newDataPolicyOperation) throws ClientException {
        return send(HttpMethod.PUT, newDataPolicyOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDataPolicyOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DataPolicyOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDataPolicyOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DataPolicyOperationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDataPolicyOperationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DataPolicyOperationRequest)this;
     }

}

