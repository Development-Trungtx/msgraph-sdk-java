// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Partner Collection Request.
 */
public class DeviceManagementPartnerCollectionRequest extends BaseCollectionRequest<DeviceManagementPartnerCollectionResponse, IDeviceManagementPartnerCollectionPage> implements IDeviceManagementPartnerCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementPartnerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementPartnerCollectionResponse.class, IDeviceManagementPartnerCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceManagementPartnerCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementPartnerCollectionPage get() throws ClientException {
        final DeviceManagementPartnerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementPartner newDeviceManagementPartner, final ICallback<? super DeviceManagementPartner> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementPartner, callback);
    }

    public DeviceManagementPartner post(final DeviceManagementPartner newDeviceManagementPartner) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementPartner);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementPartnerCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementPartnerCollectionRequest)this;
    }
    public IDeviceManagementPartnerCollectionPage buildFromResponse(final DeviceManagementPartnerCollectionResponse response) {
        final IDeviceManagementPartnerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementPartnerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementPartnerCollectionPage page = new DeviceManagementPartnerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
