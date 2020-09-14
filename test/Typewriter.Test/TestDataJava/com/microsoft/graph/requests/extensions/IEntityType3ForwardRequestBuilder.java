// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEntityType3ForwardRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entity Type3Forward Request Builder.
 */
public interface IEntityType3ForwardRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEntityType3ForwardRequest
     *
     * @return the IEntityType3ForwardRequest instance
     */
    IEntityType3ForwardRequest buildRequest();

    /**
     * Creates the IEntityType3ForwardRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEntityType3ForwardRequest instance
     */
    IEntityType3ForwardRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
