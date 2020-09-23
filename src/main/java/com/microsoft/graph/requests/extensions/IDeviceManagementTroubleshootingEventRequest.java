// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Troubleshooting Event Request.
 */
public interface IDeviceManagementTroubleshootingEventRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementTroubleshootingEvent> callback);

    /**
     * Gets the DeviceManagementTroubleshootingEvent from the service
     *
     * @return the DeviceManagementTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTroubleshootingEvent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementTroubleshootingEvent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementTroubleshootingEvent with a source
     *
     * @param sourceDeviceManagementTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementTroubleshootingEvent sourceDeviceManagementTroubleshootingEvent, final ICallback<? super DeviceManagementTroubleshootingEvent> callback);

    /**
     * Patches this DeviceManagementTroubleshootingEvent with a source
     *
     * @param sourceDeviceManagementTroubleshootingEvent the source object with updates
     * @return the updated DeviceManagementTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTroubleshootingEvent patch(final DeviceManagementTroubleshootingEvent sourceDeviceManagementTroubleshootingEvent) throws ClientException;

    /**
     * Posts a DeviceManagementTroubleshootingEvent with a new object
     *
     * @param newDeviceManagementTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent, final ICallback<? super DeviceManagementTroubleshootingEvent> callback);

    /**
     * Posts a DeviceManagementTroubleshootingEvent with a new object
     *
     * @param newDeviceManagementTroubleshootingEvent the new object to create
     * @return the created DeviceManagementTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTroubleshootingEvent post(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent) throws ClientException;

    /**
     * Posts a DeviceManagementTroubleshootingEvent with a new object
     *
     * @param newDeviceManagementTroubleshootingEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent, final ICallback<? super DeviceManagementTroubleshootingEvent> callback);

    /**
     * Posts a DeviceManagementTroubleshootingEvent with a new object
     *
     * @param newDeviceManagementTroubleshootingEvent the object to create/update
     * @return the created DeviceManagementTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTroubleshootingEvent put(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementTroubleshootingEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementTroubleshootingEventRequest expand(final String value);

}

