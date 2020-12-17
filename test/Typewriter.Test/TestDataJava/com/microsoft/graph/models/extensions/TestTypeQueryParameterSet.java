// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DerivedComplexTypeRequest;
import com.microsoft.graph.models.extensions.ResponseObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type Query Parameter Set.
 */
public class TestTypeQueryParameterSet {
    /**
     * The requests.
     * 
     */
    @SerializedName(value = "requests", alternate = {"Requests"})
    @Expose
	@Nullable
    public java.util.List<DerivedComplexTypeRequest> requests;


    /**
     * Instiaciates a new TestTypeQueryParameterSet
     */
    public TestTypeQueryParameterSet() {}
    /**
     * Instiaciates a new TestTypeQueryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TestTypeQueryParameterSet(@Nonnull final TestTypeQueryParameterSetBuilder builder) {
        this.requests = builder.requests;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TestTypeQueryParameterSetBuilder newBuilder() {
        return new TestTypeQueryParameterSetBuilder();
    }
    /**
     * Fluent builder for the TestTypeQueryParameterSet
     */
    public static final class TestTypeQueryParameterSetBuilder {
        /**
         * The requests parameter value
         */
        @Nullable
        protected java.util.List<DerivedComplexTypeRequest> requests;
        /**
         * Sets the Requests
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TestTypeQueryParameterSetBuilder withRequests(@Nullable final java.util.List<DerivedComplexTypeRequest> val) {
            this.requests = val;
            return this;
        }
        @Nullable
        protected TestTypeQueryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TestTypeQueryParameterSet build() {
            return new TestTypeQueryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.requests != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("requests", requests));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
