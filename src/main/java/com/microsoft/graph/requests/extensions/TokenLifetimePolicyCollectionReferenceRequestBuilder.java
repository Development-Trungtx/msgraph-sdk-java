// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Collection Reference Request Builder.
 */
public class TokenLifetimePolicyCollectionReferenceRequestBuilder extends BaseRequestBuilder implements ITokenLifetimePolicyCollectionReferenceRequestBuilder {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenLifetimePolicyCollectionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITokenLifetimePolicyCollectionReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITokenLifetimePolicyCollectionReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TokenLifetimePolicyCollectionReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}