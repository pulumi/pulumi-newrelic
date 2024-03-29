// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.ServiceLevelEventsArgs;
import com.pulumi.newrelic.inputs.ServiceLevelObjectiveArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLevelState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelState Empty = new ServiceLevelState();

    /**
     * The description of the SLI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the SLI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     * 
     */
    @Import(name="events")
    private @Nullable Output<ServiceLevelEventsArgs> events;

    /**
     * @return The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     * 
     */
    public Optional<Output<ServiceLevelEventsArgs>> events() {
        return Optional.ofNullable(this.events);
    }

    /**
     * The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * A short name for the SLI that will help anyone understand what it is about.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A short name for the SLI that will help anyone understand what it is about.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The objective of the SLI, only one can be defined.
     * See Objective below for details.
     * 
     */
    @Import(name="objective")
    private @Nullable Output<ServiceLevelObjectiveArgs> objective;

    /**
     * @return The objective of the SLI, only one can be defined.
     * See Objective below for details.
     * 
     */
    public Optional<Output<ServiceLevelObjectiveArgs>> objective() {
        return Optional.ofNullable(this.objective);
    }

    /**
     * The unique entity identifier of the Service Level Indicator in New Relic.
     * 
     */
    @Import(name="sliGuid")
    private @Nullable Output<String> sliGuid;

    /**
     * @return The unique entity identifier of the Service Level Indicator in New Relic.
     * 
     */
    public Optional<Output<String>> sliGuid() {
        return Optional.ofNullable(this.sliGuid);
    }

    /**
     * The unique entity identifier of the Service Level Indicator.
     * 
     */
    @Import(name="sliId")
    private @Nullable Output<String> sliId;

    /**
     * @return The unique entity identifier of the Service Level Indicator.
     * 
     */
    public Optional<Output<String>> sliId() {
        return Optional.ofNullable(this.sliId);
    }

    private ServiceLevelState() {}

    private ServiceLevelState(ServiceLevelState $) {
        this.description = $.description;
        this.events = $.events;
        this.guid = $.guid;
        this.name = $.name;
        this.objective = $.objective;
        this.sliGuid = $.sliGuid;
        this.sliId = $.sliId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelState $;

        public Builder() {
            $ = new ServiceLevelState();
        }

        public Builder(ServiceLevelState defaults) {
            $ = new ServiceLevelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the SLI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the SLI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param events The events that define the NRDB data for the SLI/SLO calculations.
         * See Events below for details.
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<ServiceLevelEventsArgs> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events The events that define the NRDB data for the SLI/SLO calculations.
         * See Events below for details.
         * 
         * @return builder
         * 
         */
        public Builder events(ServiceLevelEventsArgs events) {
            return events(Output.of(events));
        }

        /**
         * @param guid The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param name A short name for the SLI that will help anyone understand what it is about.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A short name for the SLI that will help anyone understand what it is about.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objective The objective of the SLI, only one can be defined.
         * See Objective below for details.
         * 
         * @return builder
         * 
         */
        public Builder objective(@Nullable Output<ServiceLevelObjectiveArgs> objective) {
            $.objective = objective;
            return this;
        }

        /**
         * @param objective The objective of the SLI, only one can be defined.
         * See Objective below for details.
         * 
         * @return builder
         * 
         */
        public Builder objective(ServiceLevelObjectiveArgs objective) {
            return objective(Output.of(objective));
        }

        /**
         * @param sliGuid The unique entity identifier of the Service Level Indicator in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder sliGuid(@Nullable Output<String> sliGuid) {
            $.sliGuid = sliGuid;
            return this;
        }

        /**
         * @param sliGuid The unique entity identifier of the Service Level Indicator in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder sliGuid(String sliGuid) {
            return sliGuid(Output.of(sliGuid));
        }

        /**
         * @param sliId The unique entity identifier of the Service Level Indicator.
         * 
         * @return builder
         * 
         */
        public Builder sliId(@Nullable Output<String> sliId) {
            $.sliId = sliId;
            return this;
        }

        /**
         * @param sliId The unique entity identifier of the Service Level Indicator.
         * 
         * @return builder
         * 
         */
        public Builder sliId(String sliId) {
            return sliId(Output.of(sliId));
        }

        public ServiceLevelState build() {
            return $;
        }
    }

}
