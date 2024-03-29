// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorDowntimeEndRepeatArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorDowntimeEndRepeatArgs Empty = new MonitorDowntimeEndRepeatArgs();

    /**
     * The date on which the monitor downtime&#39;s repeat cycle would need to come to an end, a string in `DDDD-MM-YY` format.
     * 
     */
    @Import(name="onDate")
    private @Nullable Output<String> onDate;

    /**
     * @return The date on which the monitor downtime&#39;s repeat cycle would need to come to an end, a string in `DDDD-MM-YY` format.
     * 
     */
    public Optional<Output<String>> onDate() {
        return Optional.ofNullable(this.onDate);
    }

    /**
     * An integer that specifies the number of occurrences, after which the monitor downtime&#39;s repeat cycle would need to come to an end.
     * 
     * &gt; **NOTE:** `end_repeat` **can only be used with the modes** `DAILY`, `MONTHLY` and `WEEKLY` and **is an optional argument** when monitor downtimes of these modes are created. Additionally, **either** `on_date` or `on_repeat` **are required to be specified with** `end_repeat`, but not both, as `on_date` and `on_repeat` are mutually exclusive.
     * 
     */
    @Import(name="onRepeat")
    private @Nullable Output<Integer> onRepeat;

    /**
     * @return An integer that specifies the number of occurrences, after which the monitor downtime&#39;s repeat cycle would need to come to an end.
     * 
     * &gt; **NOTE:** `end_repeat` **can only be used with the modes** `DAILY`, `MONTHLY` and `WEEKLY` and **is an optional argument** when monitor downtimes of these modes are created. Additionally, **either** `on_date` or `on_repeat` **are required to be specified with** `end_repeat`, but not both, as `on_date` and `on_repeat` are mutually exclusive.
     * 
     */
    public Optional<Output<Integer>> onRepeat() {
        return Optional.ofNullable(this.onRepeat);
    }

    private MonitorDowntimeEndRepeatArgs() {}

    private MonitorDowntimeEndRepeatArgs(MonitorDowntimeEndRepeatArgs $) {
        this.onDate = $.onDate;
        this.onRepeat = $.onRepeat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorDowntimeEndRepeatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorDowntimeEndRepeatArgs $;

        public Builder() {
            $ = new MonitorDowntimeEndRepeatArgs();
        }

        public Builder(MonitorDowntimeEndRepeatArgs defaults) {
            $ = new MonitorDowntimeEndRepeatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onDate The date on which the monitor downtime&#39;s repeat cycle would need to come to an end, a string in `DDDD-MM-YY` format.
         * 
         * @return builder
         * 
         */
        public Builder onDate(@Nullable Output<String> onDate) {
            $.onDate = onDate;
            return this;
        }

        /**
         * @param onDate The date on which the monitor downtime&#39;s repeat cycle would need to come to an end, a string in `DDDD-MM-YY` format.
         * 
         * @return builder
         * 
         */
        public Builder onDate(String onDate) {
            return onDate(Output.of(onDate));
        }

        /**
         * @param onRepeat An integer that specifies the number of occurrences, after which the monitor downtime&#39;s repeat cycle would need to come to an end.
         * 
         * &gt; **NOTE:** `end_repeat` **can only be used with the modes** `DAILY`, `MONTHLY` and `WEEKLY` and **is an optional argument** when monitor downtimes of these modes are created. Additionally, **either** `on_date` or `on_repeat` **are required to be specified with** `end_repeat`, but not both, as `on_date` and `on_repeat` are mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder onRepeat(@Nullable Output<Integer> onRepeat) {
            $.onRepeat = onRepeat;
            return this;
        }

        /**
         * @param onRepeat An integer that specifies the number of occurrences, after which the monitor downtime&#39;s repeat cycle would need to come to an end.
         * 
         * &gt; **NOTE:** `end_repeat` **can only be used with the modes** `DAILY`, `MONTHLY` and `WEEKLY` and **is an optional argument** when monitor downtimes of these modes are created. Additionally, **either** `on_date` or `on_repeat` **are required to be specified with** `end_repeat`, but not both, as `on_date` and `on_repeat` are mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder onRepeat(Integer onRepeat) {
            return onRepeat(Output.of(onRepeat));
        }

        public MonitorDowntimeEndRepeatArgs build() {
            return $;
        }
    }

}
