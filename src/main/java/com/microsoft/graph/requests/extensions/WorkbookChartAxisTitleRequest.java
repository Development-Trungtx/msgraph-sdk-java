// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisTitle;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Title Request.
 */
public class WorkbookChartAxisTitleRequest extends BaseRequest implements IWorkbookChartAxisTitleRequest {
	
    /**
     * The request for the WorkbookChartAxisTitle
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisTitleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxisTitle.class);
    }

    /**
     * Gets the WorkbookChartAxisTitle from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartAxisTitle> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxisTitle from the service
     *
     * @return the WorkbookChartAxisTitle from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartAxisTitle> callback) {
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
     * Patches this WorkbookChartAxisTitle with a source
     *
     * @param sourceWorkbookChartAxisTitle the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartAxisTitle sourceWorkbookChartAxisTitle, final ICallback<? super WorkbookChartAxisTitle> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxisTitle);
    }

    /**
     * Patches this WorkbookChartAxisTitle with a source
     *
     * @param sourceWorkbookChartAxisTitle the source object with updates
     * @return the updated WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle patch(final WorkbookChartAxisTitle sourceWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartAxisTitle newWorkbookChartAxisTitle, final ICallback<? super WorkbookChartAxisTitle> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the new object to create
     * @return the created WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle post(final WorkbookChartAxisTitle newWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartAxisTitle newWorkbookChartAxisTitle, final ICallback<? super WorkbookChartAxisTitle> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the object to create/update
     * @return the created WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle put(final WorkbookChartAxisTitle newWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAxisTitle);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartAxisTitleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartAxisTitleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartAxisTitleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartAxisTitleRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookChartAxisTitleRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookChartAxisTitleRequest)this;
     }

}

