// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Summary Request.
 */
public class ManagedDeviceMobileAppConfigurationDeviceSummaryRequest extends BaseRequest implements IManagedDeviceMobileAppConfigurationDeviceSummaryRequest {
	
    /**
     * The request for the ManagedDeviceMobileAppConfigurationDeviceSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationDeviceSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationDeviceSummary.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceSummary from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationDeviceSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceSummary> callback) {
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
     * Patches this ManagedDeviceMobileAppConfigurationDeviceSummary with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDeviceMobileAppConfigurationDeviceSummary sourceManagedDeviceMobileAppConfigurationDeviceSummary, final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationDeviceSummary);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationDeviceSummary with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceSummary the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceSummary patch(final ManagedDeviceMobileAppConfigurationDeviceSummary sourceManagedDeviceMobileAppConfigurationDeviceSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationDeviceSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDeviceMobileAppConfigurationDeviceSummary newManagedDeviceMobileAppConfigurationDeviceSummary, final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceSummary> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationDeviceSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceSummary the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceSummary post(final ManagedDeviceMobileAppConfigurationDeviceSummary newManagedDeviceMobileAppConfigurationDeviceSummary) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationDeviceSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedDeviceMobileAppConfigurationDeviceSummary newManagedDeviceMobileAppConfigurationDeviceSummary, final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceSummary> callback) {
        send(HttpMethod.PUT, callback, newManagedDeviceMobileAppConfigurationDeviceSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceSummary the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceSummary put(final ManagedDeviceMobileAppConfigurationDeviceSummary newManagedDeviceMobileAppConfigurationDeviceSummary) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationDeviceSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationDeviceSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedDeviceMobileAppConfigurationDeviceSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationDeviceSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedDeviceMobileAppConfigurationDeviceSummaryRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationDeviceSummaryRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ManagedDeviceMobileAppConfigurationDeviceSummaryRequest)this;
     }

}

