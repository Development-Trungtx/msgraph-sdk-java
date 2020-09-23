// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Trending;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Trending Request.
 */
public interface ITrendingRequest extends IHttpRequest {

    /**
     * Gets the Trending from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Trending> callback);

    /**
     * Gets the Trending from the service
     *
     * @return the Trending from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Trending get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Trending> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Trending with a source
     *
     * @param sourceTrending the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Trending sourceTrending, final ICallback<? super Trending> callback);

    /**
     * Patches this Trending with a source
     *
     * @param sourceTrending the source object with updates
     * @return the updated Trending
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Trending patch(final Trending sourceTrending) throws ClientException;

    /**
     * Posts a Trending with a new object
     *
     * @param newTrending the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Trending newTrending, final ICallback<? super Trending> callback);

    /**
     * Posts a Trending with a new object
     *
     * @param newTrending the new object to create
     * @return the created Trending
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Trending post(final Trending newTrending) throws ClientException;

    /**
     * Posts a Trending with a new object
     *
     * @param newTrending the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Trending newTrending, final ICallback<? super Trending> callback);

    /**
     * Posts a Trending with a new object
     *
     * @param newTrending the object to create/update
     * @return the created Trending
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Trending put(final Trending newTrending) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITrendingRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITrendingRequest expand(final String value);

}

