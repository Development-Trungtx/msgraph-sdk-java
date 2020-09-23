// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemActivityStat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity Stat Request.
 */
public interface IItemActivityStatRequest extends IHttpRequest {

    /**
     * Gets the ItemActivityStat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ItemActivityStat> callback);

    /**
     * Gets the ItemActivityStat from the service
     *
     * @return the ItemActivityStat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityStat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ItemActivityStat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemActivityStat with a source
     *
     * @param sourceItemActivityStat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemActivityStat sourceItemActivityStat, final ICallback<? super ItemActivityStat> callback);

    /**
     * Patches this ItemActivityStat with a source
     *
     * @param sourceItemActivityStat the source object with updates
     * @return the updated ItemActivityStat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityStat patch(final ItemActivityStat sourceItemActivityStat) throws ClientException;

    /**
     * Posts a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemActivityStat newItemActivityStat, final ICallback<? super ItemActivityStat> callback);

    /**
     * Posts a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the new object to create
     * @return the created ItemActivityStat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityStat post(final ItemActivityStat newItemActivityStat) throws ClientException;

    /**
     * Posts a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemActivityStat newItemActivityStat, final ICallback<? super ItemActivityStat> callback);

    /**
     * Posts a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the object to create/update
     * @return the created ItemActivityStat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityStat put(final ItemActivityStat newItemActivityStat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemActivityStatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemActivityStatRequest expand(final String value);

}

