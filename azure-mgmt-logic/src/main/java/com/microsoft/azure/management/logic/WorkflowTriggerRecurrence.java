/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow trigger recurrence.
 */
public class WorkflowTriggerRecurrence {
    /**
     * The frequency. Possible values include: 'NotSpecified', 'Second',
     * 'Minute', 'Hour', 'Day', 'Week', 'Month', 'Year'.
     */
    @JsonProperty(value = "frequency")
    private RecurrenceFrequency frequency;

    /**
     * The interval.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /**
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The time zone.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * The recurrence schedule.
     */
    @JsonProperty(value = "schedule")
    private RecurrenceSchedule schedule;

    /**
     * Get the frequency value.
     *
     * @return the frequency value
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency value.
     *
     * @param frequency the frequency value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval value.
     *
     * @return the interval value
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval value.
     *
     * @param interval the interval value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeZone value.
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone value.
     *
     * @param timeZone the timeZone value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the schedule value.
     *
     * @return the schedule value
     */
    public RecurrenceSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule value.
     *
     * @param schedule the schedule value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withSchedule(RecurrenceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

}
