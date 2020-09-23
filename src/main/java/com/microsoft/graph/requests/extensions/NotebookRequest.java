// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.CopyNotebookModel;
import com.microsoft.graph.models.extensions.RecentNotebook;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Request.
 */
public class NotebookRequest extends BaseRequest implements INotebookRequest {
	
    /**
     * The request for the Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotebookRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Notebook.class);
    }

    /**
     * Gets the Notebook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Notebook> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Notebook from the service
     *
     * @return the Notebook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Notebook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Notebook> callback) {
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
     * Patches this Notebook with a source
     *
     * @param sourceNotebook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Notebook sourceNotebook, final ICallback<? super Notebook> callback) {
        send(HttpMethod.PATCH, callback, sourceNotebook);
    }

    /**
     * Patches this Notebook with a source
     *
     * @param sourceNotebook the source object with updates
     * @return the updated Notebook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Notebook patch(final Notebook sourceNotebook) throws ClientException {
        return send(HttpMethod.PATCH, sourceNotebook);
    }

    /**
     * Creates a Notebook with a new object
     *
     * @param newNotebook the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Notebook newNotebook, final ICallback<? super Notebook> callback) {
        send(HttpMethod.POST, callback, newNotebook);
    }

    /**
     * Creates a Notebook with a new object
     *
     * @param newNotebook the new object to create
     * @return the created Notebook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Notebook post(final Notebook newNotebook) throws ClientException {
        return send(HttpMethod.POST, newNotebook);
    }

    /**
     * Creates a Notebook with a new object
     *
     * @param newNotebook the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Notebook newNotebook, final ICallback<? super Notebook> callback) {
        send(HttpMethod.PUT, callback, newNotebook);
    }

    /**
     * Creates a Notebook with a new object
     *
     * @param newNotebook the object to create/update
     * @return the created Notebook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Notebook put(final Notebook newNotebook) throws ClientException {
        return send(HttpMethod.PUT, newNotebook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INotebookRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NotebookRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INotebookRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NotebookRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public INotebookRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (NotebookRequest)this;
     }

}

