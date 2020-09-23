// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10EnterpriseModernAppManagementConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Enterprise Modern App Management Configuration Request.
 */
public class Windows10EnterpriseModernAppManagementConfigurationRequest extends BaseRequest implements IWindows10EnterpriseModernAppManagementConfigurationRequest {
	
    /**
     * The request for the Windows10EnterpriseModernAppManagementConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EnterpriseModernAppManagementConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EnterpriseModernAppManagementConfiguration.class);
    }

    /**
     * Gets the Windows10EnterpriseModernAppManagementConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Windows10EnterpriseModernAppManagementConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10EnterpriseModernAppManagementConfiguration from the service
     *
     * @return the Windows10EnterpriseModernAppManagementConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnterpriseModernAppManagementConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Windows10EnterpriseModernAppManagementConfiguration> callback) {
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
     * Patches this Windows10EnterpriseModernAppManagementConfiguration with a source
     *
     * @param sourceWindows10EnterpriseModernAppManagementConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10EnterpriseModernAppManagementConfiguration sourceWindows10EnterpriseModernAppManagementConfiguration, final ICallback<? super Windows10EnterpriseModernAppManagementConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10EnterpriseModernAppManagementConfiguration);
    }

    /**
     * Patches this Windows10EnterpriseModernAppManagementConfiguration with a source
     *
     * @param sourceWindows10EnterpriseModernAppManagementConfiguration the source object with updates
     * @return the updated Windows10EnterpriseModernAppManagementConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnterpriseModernAppManagementConfiguration patch(final Windows10EnterpriseModernAppManagementConfiguration sourceWindows10EnterpriseModernAppManagementConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10EnterpriseModernAppManagementConfiguration);
    }

    /**
     * Creates a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration, final ICallback<? super Windows10EnterpriseModernAppManagementConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10EnterpriseModernAppManagementConfiguration);
    }

    /**
     * Creates a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the new object to create
     * @return the created Windows10EnterpriseModernAppManagementConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnterpriseModernAppManagementConfiguration post(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10EnterpriseModernAppManagementConfiguration);
    }

    /**
     * Creates a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration, final ICallback<? super Windows10EnterpriseModernAppManagementConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows10EnterpriseModernAppManagementConfiguration);
    }

    /**
     * Creates a Windows10EnterpriseModernAppManagementConfiguration with a new object
     *
     * @param newWindows10EnterpriseModernAppManagementConfiguration the object to create/update
     * @return the created Windows10EnterpriseModernAppManagementConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnterpriseModernAppManagementConfiguration put(final Windows10EnterpriseModernAppManagementConfiguration newWindows10EnterpriseModernAppManagementConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10EnterpriseModernAppManagementConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10EnterpriseModernAppManagementConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10EnterpriseModernAppManagementConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10EnterpriseModernAppManagementConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10EnterpriseModernAppManagementConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindows10EnterpriseModernAppManagementConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (Windows10EnterpriseModernAppManagementConfigurationRequest)this;
     }

}

