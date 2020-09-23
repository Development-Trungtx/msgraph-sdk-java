// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OpenTypeExtension;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Type Extension Request.
 */
public class OpenTypeExtensionRequest extends BaseRequest implements IOpenTypeExtensionRequest {
	
    /**
     * The request for the OpenTypeExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OpenTypeExtensionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OpenTypeExtension.class);
    }

    /**
     * Gets the OpenTypeExtension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OpenTypeExtension> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OpenTypeExtension from the service
     *
     * @return the OpenTypeExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OpenTypeExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OpenTypeExtension> callback) {
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
     * Patches this OpenTypeExtension with a source
     *
     * @param sourceOpenTypeExtension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OpenTypeExtension sourceOpenTypeExtension, final ICallback<? super OpenTypeExtension> callback) {
        send(HttpMethod.PATCH, callback, sourceOpenTypeExtension);
    }

    /**
     * Patches this OpenTypeExtension with a source
     *
     * @param sourceOpenTypeExtension the source object with updates
     * @return the updated OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OpenTypeExtension patch(final OpenTypeExtension sourceOpenTypeExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OpenTypeExtension newOpenTypeExtension, final ICallback<? super OpenTypeExtension> callback) {
        send(HttpMethod.POST, callback, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the new object to create
     * @return the created OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OpenTypeExtension post(final OpenTypeExtension newOpenTypeExtension) throws ClientException {
        return send(HttpMethod.POST, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OpenTypeExtension newOpenTypeExtension, final ICallback<? super OpenTypeExtension> callback) {
        send(HttpMethod.PUT, callback, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the object to create/update
     * @return the created OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OpenTypeExtension put(final OpenTypeExtension newOpenTypeExtension) throws ClientException {
        return send(HttpMethod.PUT, newOpenTypeExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOpenTypeExtensionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OpenTypeExtensionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOpenTypeExtensionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OpenTypeExtensionRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IOpenTypeExtensionRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (OpenTypeExtensionRequest)this;
     }

}

