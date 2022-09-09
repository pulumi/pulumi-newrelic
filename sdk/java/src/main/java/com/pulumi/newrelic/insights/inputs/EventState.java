// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.insights.inputs.EventEventArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventState extends com.pulumi.resources.ResourceArgs {

    public static final EventState Empty = new EventState();

    /**
     * An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     * 
     */
    @Import(name="events")
    private @Nullable Output<List<EventEventArgs>> events;

    /**
     * @return An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     * 
     */
    public Optional<Output<List<EventEventArgs>>> events() {
        return Optional.ofNullable(this.events);
    }

    private EventState() {}

    private EventState(EventState $) {
        this.events = $.events;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventState $;

        public Builder() {
            $ = new EventState();
        }

        public Builder(EventState defaults) {
            $ = new EventState(Objects.requireNonNull(defaults));
        }

        /**
         * @param events An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<List<EventEventArgs>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
         * 
         * @return builder
         * 
         */
        public Builder events(List<EventEventArgs> events) {
            return events(Output.of(events));
        }

        /**
         * @param events An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
         * 
         * @return builder
         * 
         */
        public Builder events(EventEventArgs... events) {
            return events(List.of(events));
        }

        public EventState build() {
            return $;
        }
    }

}