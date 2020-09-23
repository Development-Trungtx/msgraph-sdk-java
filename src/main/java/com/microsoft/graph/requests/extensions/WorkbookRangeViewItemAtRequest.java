// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.requests.extensions.IWorkbookRangeViewItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewItemAtRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Item At Request.
 */
public class WorkbookRangeViewItemAtRequest extends BaseRequest implements IWorkbookRangeViewItemAtRequest {

    /**
     * The request for this WorkbookRangeViewItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeViewItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeView.class);
    }

    /**
     * Patches the WorkbookRangeViewItemAt
     * @param srcWorkbookRangeView the WorkbookRangeView with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookRangeView srcWorkbookRangeView, final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRangeView);
    }

    /**
     * Patches the WorkbookRangeViewItemAt
     *
     * @param srcWorkbookRangeView the WorkbookRangeView with which to PATCH
     * @return the WorkbookRangeView
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRangeView patch(WorkbookRangeView srcWorkbookRangeView) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRangeView);
    }

    /**
     * Puts the WorkbookRangeViewItemAt
     *
     * @param srcWorkbookRangeView the WorkbookRangeView to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookRangeView srcWorkbookRangeView, final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRangeView);
    }

    /**
     * Puts the WorkbookRangeViewItemAt
     *
     * @param srcWorkbookRangeView the WorkbookRangeView to PUT
     * @return the WorkbookRangeView
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRangeView put(WorkbookRangeView srcWorkbookRangeView) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRangeView);
    }
    /**
     * Gets the WorkbookRangeView
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeView
     *
     * @return the WorkbookRangeView
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookRangeView get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookRangeViewItemAtRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookRangeViewItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookRangeViewItemAtRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookRangeViewItemAtRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkbookRangeViewItemAtRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkbookRangeViewItemAtRequest)this;
    }

}
