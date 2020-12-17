// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.EntityType3ForwardRequest;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.EntityType3ForwardParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Forward Request Builder.
 */
public class EntityType3ForwardRequestBuilder extends BaseActionRequestBuilder<EntityType3> {

    private EntityType3ForwardParameterSet body;
    /**
     * The request builder for this EntityType3Forward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public EntityType3ForwardRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final EntityType3ForwardParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the EntityType3ForwardRequest
     *
     * @param requestOptions the options for the request
     * @return the EntityType3ForwardRequest instance
     */
    @Nonnull
    public EntityType3ForwardRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EntityType3ForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EntityType3ForwardRequest instance
     */
    @Nonnull
    public EntityType3ForwardRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EntityType3ForwardRequest request = new EntityType3ForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
