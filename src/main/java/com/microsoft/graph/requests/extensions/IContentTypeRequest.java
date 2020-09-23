// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ContentType;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Content Type Request.
 */
public interface IContentTypeRequest extends IHttpRequest {

    /**
     * Gets the ContentType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ContentType> callback);

    /**
     * Gets the ContentType from the service
     *
     * @return the ContentType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContentType get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ContentType> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ContentType with a source
     *
     * @param sourceContentType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ContentType sourceContentType, final ICallback<? super ContentType> callback);

    /**
     * Patches this ContentType with a source
     *
     * @param sourceContentType the source object with updates
     * @return the updated ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContentType patch(final ContentType sourceContentType) throws ClientException;

    /**
     * Posts a ContentType with a new object
     *
     * @param newContentType the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ContentType newContentType, final ICallback<? super ContentType> callback);

    /**
     * Posts a ContentType with a new object
     *
     * @param newContentType the new object to create
     * @return the created ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContentType post(final ContentType newContentType) throws ClientException;

    /**
     * Posts a ContentType with a new object
     *
     * @param newContentType the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ContentType newContentType, final ICallback<? super ContentType> callback);

    /**
     * Posts a ContentType with a new object
     *
     * @param newContentType the object to create/update
     * @return the created ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContentType put(final ContentType newContentType) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IContentTypeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IContentTypeRequest expand(final String value);

}

