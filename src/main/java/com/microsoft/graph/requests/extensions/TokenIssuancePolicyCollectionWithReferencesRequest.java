// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection With References Request.
 */
public class TokenIssuancePolicyCollectionWithReferencesRequest extends BaseCollectionRequest<TokenIssuancePolicyCollectionResponse, ITokenIssuancePolicyCollectionPage> implements ITokenIssuancePolicyCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicyCollectionResponse.class, ITokenIssuancePolicyCollectionPage.class);
    }

    public void get(final ICallback<? super ITokenIssuancePolicyCollectionWithReferencesPage> callback) {
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

    public ITokenIssuancePolicyCollectionWithReferencesPage get() throws ClientException {
        final TokenIssuancePolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public ITokenIssuancePolicyCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TokenIssuancePolicyCollectionWithReferencesRequest)this;
    }

    public ITokenIssuancePolicyCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TokenIssuancePolicyCollectionWithReferencesRequest)this;
    }

    public ITokenIssuancePolicyCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TokenIssuancePolicyCollectionWithReferencesRequest)this;
    }

    public ITokenIssuancePolicyCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TokenIssuancePolicyCollectionWithReferencesRequest)this;
    }

    public ITokenIssuancePolicyCollectionWithReferencesPage buildFromResponse(final TokenIssuancePolicyCollectionResponse response) {
        final ITokenIssuancePolicyCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TokenIssuancePolicyCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TokenIssuancePolicyCollectionWithReferencesPage page = new TokenIssuancePolicyCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
