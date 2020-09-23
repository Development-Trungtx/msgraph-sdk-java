// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Reference Request.
 */
public class CertificateBasedAuthConfigurationReferenceRequest extends BaseRequest implements ICertificateBasedAuthConfigurationReferenceRequest {

    /**
     * The request for the CertificateBasedAuthConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CertificateBasedAuthConfiguration.class);
    }

    public void delete(final ICallback<? super CertificateBasedAuthConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public CertificateBasedAuthConfiguration delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICertificateBasedAuthConfigurationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CertificateBasedAuthConfigurationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICertificateBasedAuthConfigurationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CertificateBasedAuthConfigurationReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICertificateBasedAuthConfigurationReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (CertificateBasedAuthConfigurationReferenceRequest)this;
    }
    /**
     * Puts the CertificateBasedAuthConfiguration
     *
     * @param srcCertificateBasedAuthConfiguration the CertificateBasedAuthConfiguration reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(CertificateBasedAuthConfiguration srcCertificateBasedAuthConfiguration, final ICallback<? super CertificateBasedAuthConfiguration> callback) {
        send(HttpMethod.PUT, callback, srcCertificateBasedAuthConfiguration);
    }

    /**
     * Puts the CertificateBasedAuthConfiguration
     *
     * @param srcCertificateBasedAuthConfiguration the CertificateBasedAuthConfiguration reference to PUT
     * @return the CertificateBasedAuthConfiguration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public CertificateBasedAuthConfiguration put(CertificateBasedAuthConfiguration srcCertificateBasedAuthConfiguration) throws ClientException {
        return send(HttpMethod.PUT, srcCertificateBasedAuthConfiguration);
    }
}
