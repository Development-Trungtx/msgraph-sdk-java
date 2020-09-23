// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Lifecycle Policy Request.
 */
public interface IGroupLifecyclePolicyRequest extends IHttpRequest {

    /**
     * Gets the GroupLifecyclePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupLifecyclePolicy> callback);

    /**
     * Gets the GroupLifecyclePolicy from the service
     *
     * @return the GroupLifecyclePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupLifecyclePolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupLifecyclePolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupLifecyclePolicy with a source
     *
     * @param sourceGroupLifecyclePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupLifecyclePolicy sourceGroupLifecyclePolicy, final ICallback<? super GroupLifecyclePolicy> callback);

    /**
     * Patches this GroupLifecyclePolicy with a source
     *
     * @param sourceGroupLifecyclePolicy the source object with updates
     * @return the updated GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupLifecyclePolicy patch(final GroupLifecyclePolicy sourceGroupLifecyclePolicy) throws ClientException;

    /**
     * Posts a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<? super GroupLifecyclePolicy> callback);

    /**
     * Posts a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the new object to create
     * @return the created GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupLifecyclePolicy post(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException;

    /**
     * Posts a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<? super GroupLifecyclePolicy> callback);

    /**
     * Posts a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the object to create/update
     * @return the created GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupLifecyclePolicy put(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupLifecyclePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupLifecyclePolicyRequest expand(final String value);

}

