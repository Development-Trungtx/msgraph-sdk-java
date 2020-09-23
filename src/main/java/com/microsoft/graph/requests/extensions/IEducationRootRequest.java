// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationRoot;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Root Request.
 */
public interface IEducationRootRequest extends IHttpRequest {

    /**
     * Gets the EducationRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationRoot> callback);

    /**
     * Gets the EducationRoot from the service
     *
     * @return the EducationRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRoot get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationRoot> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationRoot with a source
     *
     * @param sourceEducationRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationRoot sourceEducationRoot, final ICallback<? super EducationRoot> callback);

    /**
     * Patches this EducationRoot with a source
     *
     * @param sourceEducationRoot the source object with updates
     * @return the updated EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRoot patch(final EducationRoot sourceEducationRoot) throws ClientException;

    /**
     * Posts a EducationRoot with a new object
     *
     * @param newEducationRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationRoot newEducationRoot, final ICallback<? super EducationRoot> callback);

    /**
     * Posts a EducationRoot with a new object
     *
     * @param newEducationRoot the new object to create
     * @return the created EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRoot post(final EducationRoot newEducationRoot) throws ClientException;

    /**
     * Posts a EducationRoot with a new object
     *
     * @param newEducationRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationRoot newEducationRoot, final ICallback<? super EducationRoot> callback);

    /**
     * Posts a EducationRoot with a new object
     *
     * @param newEducationRoot the object to create/update
     * @return the created EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRoot put(final EducationRoot newEducationRoot) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationRootRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationRootRequest expand(final String value);

}

