// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";

export interface AlertChannelConfig {
    apiKey?: pulumi.Input<string>;
    authPassword?: pulumi.Input<string>;
    authType?: pulumi.Input<string>;
    authUsername?: pulumi.Input<string>;
    baseUrl?: pulumi.Input<string>;
    channel?: pulumi.Input<string>;
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    includeJsonAttachment?: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    payload?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    payloadType?: pulumi.Input<string>;
    recipients?: pulumi.Input<string>;
    region?: pulumi.Input<string>;
    routeKey?: pulumi.Input<string>;
    serviceKey?: pulumi.Input<string>;
    tags?: pulumi.Input<string>;
    teams?: pulumi.Input<string>;
    url?: pulumi.Input<string>;
    userId?: pulumi.Input<string>;
}

export interface AlertConditionTerm {
    duration: pulumi.Input<number>;
    operator?: pulumi.Input<string>;
    priority?: pulumi.Input<string>;
    threshold: pulumi.Input<number>;
    timeFunction: pulumi.Input<string>;
}

export interface DashboardFilter {
    attributes?: pulumi.Input<pulumi.Input<string>[]>;
    eventTypes: pulumi.Input<pulumi.Input<string>[]>;
}

export interface DashboardWidget {
    column: pulumi.Input<number>;
    compareWiths?: pulumi.Input<pulumi.Input<inputs.DashboardWidgetCompareWith>[]>;
    drilldownDashboardId?: pulumi.Input<number>;
    duration?: pulumi.Input<number>;
    endTime?: pulumi.Input<number>;
    entityIds?: pulumi.Input<pulumi.Input<number>[]>;
    facet?: pulumi.Input<string>;
    height?: pulumi.Input<number>;
    limit?: pulumi.Input<number>;
    metrics?: pulumi.Input<pulumi.Input<inputs.DashboardWidgetMetric>[]>;
    notes?: pulumi.Input<string>;
    nrql?: pulumi.Input<string>;
    orderBy?: pulumi.Input<string>;
    rawMetricName?: pulumi.Input<string>;
    row: pulumi.Input<number>;
    source?: pulumi.Input<string>;
    thresholdRed?: pulumi.Input<number>;
    thresholdYellow?: pulumi.Input<number>;
    /**
     * The title of the dashboard.
     */
    title: pulumi.Input<string>;
    visualization: pulumi.Input<string>;
    widgetId?: pulumi.Input<number>;
    width?: pulumi.Input<number>;
}

export interface DashboardWidgetCompareWith {
    offsetDuration: pulumi.Input<string>;
    presentation: pulumi.Input<inputs.DashboardWidgetCompareWithPresentation>;
}

export interface DashboardWidgetCompareWithPresentation {
    color: pulumi.Input<string>;
    name: pulumi.Input<string>;
}

export interface DashboardWidgetMetric {
    name: pulumi.Input<string>;
    scope?: pulumi.Input<string>;
    units?: pulumi.Input<string>;
    values?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface InfraAlertConditionCritical {
    duration: pulumi.Input<number>;
    timeFunction?: pulumi.Input<string>;
    value?: pulumi.Input<number>;
}

export interface InfraAlertConditionWarning {
    duration: pulumi.Input<number>;
    timeFunction?: pulumi.Input<string>;
    value?: pulumi.Input<number>;
}

export interface NrqlAlertConditionNrql {
    query: pulumi.Input<string>;
    sinceValue: pulumi.Input<string>;
}

export interface NrqlAlertConditionTerm {
    duration: pulumi.Input<number>;
    operator?: pulumi.Input<string>;
    priority?: pulumi.Input<string>;
    threshold: pulumi.Input<number>;
    timeFunction: pulumi.Input<string>;
}

export namespace insights {
    export interface EventEvent {
        attributes: pulumi.Input<pulumi.Input<inputs.insights.EventEventAttribute>[]>;
        timestamp?: pulumi.Input<number>;
        type: pulumi.Input<string>;
    }

    export interface EventEventAttribute {
        key: pulumi.Input<string>;
        type?: pulumi.Input<string>;
        value: pulumi.Input<string>;
    }
}

export namespace plugins {
    export interface AlertConditionTerm {
        duration: pulumi.Input<number>;
        operator?: pulumi.Input<string>;
        priority?: pulumi.Input<string>;
        threshold: pulumi.Input<number>;
        timeFunction: pulumi.Input<string>;
    }
}
