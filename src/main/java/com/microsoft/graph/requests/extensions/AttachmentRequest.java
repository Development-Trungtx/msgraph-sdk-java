// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.AttachmentItem;
import com.microsoft.graph.models.extensions.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Request.
 */
public class AttachmentRequest extends BaseRequest implements IAttachmentRequest {
	
    /**
     * The request for the Attachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AttachmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Attachment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Attachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttachmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Attachment.class);
    }

    /**
     * Gets the Attachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Attachment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Attachment from the service
     *
     * @return the Attachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Attachment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Attachment> callback) {
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
     * Patches this Attachment with a source
     *
     * @param sourceAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Attachment sourceAttachment, final ICallback<? super Attachment> callback) {
        send(HttpMethod.PATCH, callback, sourceAttachment);
    }

    /**
     * Patches this Attachment with a source
     *
     * @param sourceAttachment the source object with updates
     * @return the updated Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Attachment patch(final Attachment sourceAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Attachment newAttachment, final ICallback<? super Attachment> callback) {
        send(HttpMethod.POST, callback, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the new object to create
     * @return the created Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Attachment post(final Attachment newAttachment) throws ClientException {
        return send(HttpMethod.POST, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Attachment newAttachment, final ICallback<? super Attachment> callback) {
        send(HttpMethod.PUT, callback, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the object to create/update
     * @return the created Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Attachment put(final Attachment newAttachment) throws ClientException {
        return send(HttpMethod.PUT, newAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAttachmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AttachmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAttachmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AttachmentRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IAttachmentRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (AttachmentRequest)this;
     }

}

