/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.appservice.ResourceMetricName;
import java.util.List;
import com.microsoft.azure.management.appservice.ResourceMetricAvailability;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.ProxyOnlyResource;

/**
 * Metadata for the metrics.
 */
@JsonFlatten
public class ResourceMetricDefinitionInner extends ProxyOnlyResource {
    /**
     * Name of the metric.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceMetricName resourceMetricDefinitionName;

    /**
     * Unit of the metric.
     */
    @JsonProperty(value = "properties.unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Primary aggregation type.
     */
    @JsonProperty(value = "properties.primaryAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAggregationType;

    /**
     * List of time grains supported for the metric together with retention
     * period.
     */
    @JsonProperty(value = "properties.metricAvailabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricAvailability> metricAvailabilities;

    /**
     * Resource URI.
     */
    @JsonProperty(value = "properties.resourceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceUri;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceMetricDefinitionId;

    /**
     * Resource metric definition properties.
     */
    @JsonProperty(value = "properties.properties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> properties;

    /**
     * Get the resourceMetricDefinitionName value.
     *
     * @return the resourceMetricDefinitionName value
     */
    public ResourceMetricName resourceMetricDefinitionName() {
        return this.resourceMetricDefinitionName;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the primaryAggregationType value.
     *
     * @return the primaryAggregationType value
     */
    public String primaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get the metricAvailabilities value.
     *
     * @return the metricAvailabilities value
     */
    public List<ResourceMetricAvailability> metricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Get the resourceUri value.
     *
     * @return the resourceUri value
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Get the resourceMetricDefinitionId value.
     *
     * @return the resourceMetricDefinitionId value
     */
    public String resourceMetricDefinitionId() {
        return this.resourceMetricDefinitionId;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Map<String, String> properties() {
        return this.properties;
    }

}
