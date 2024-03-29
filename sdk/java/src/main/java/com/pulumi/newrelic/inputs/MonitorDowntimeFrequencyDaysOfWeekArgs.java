// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MonitorDowntimeFrequencyDaysOfWeekArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorDowntimeFrequencyDaysOfWeekArgs Empty = new MonitorDowntimeFrequencyDaysOfWeekArgs();

    /**
     * The occurrence of `week_day` in a month (one of `&#34;FIRST&#34;`, `&#34;SECOND&#34;`, `&#34;THIRD&#34;`, `&#34;FOURTH&#34;`, `&#34;LAST&#34;`).
     * 
     * &gt; **NOTE:** `frequency` **can only be used with the mode** `MONTHLY`, and **is a required argument** with monthly monitor downtimes (if the `mode` is `MONTHLY`). Additionally, **either** `days_of_month` or `days_of_week` **are required to be specified with** `frequency`, but not both, as `days_of_month` and `days_of_week` are mutually exclusive. If `days_of_week` is specified, values of **both** of its nested arguments, `week_day` and `ordinal_day_of_month` **would need to be specified** too.
     * 
     */
    @Import(name="ordinalDayOfMonth", required=true)
    private Output<String> ordinalDayOfMonth;

    /**
     * @return The occurrence of `week_day` in a month (one of `&#34;FIRST&#34;`, `&#34;SECOND&#34;`, `&#34;THIRD&#34;`, `&#34;FOURTH&#34;`, `&#34;LAST&#34;`).
     * 
     * &gt; **NOTE:** `frequency` **can only be used with the mode** `MONTHLY`, and **is a required argument** with monthly monitor downtimes (if the `mode` is `MONTHLY`). Additionally, **either** `days_of_month` or `days_of_week` **are required to be specified with** `frequency`, but not both, as `days_of_month` and `days_of_week` are mutually exclusive. If `days_of_week` is specified, values of **both** of its nested arguments, `week_day` and `ordinal_day_of_month` **would need to be specified** too.
     * 
     */
    public Output<String> ordinalDayOfMonth() {
        return this.ordinalDayOfMonth;
    }

    /**
     * A day of the week (one of `&#34;SUNDAY&#34;`, `&#34;MONDAY&#34;`, `&#34;TUESDAY&#34;`, `&#34;WEDNESDAY&#34;`, `&#34;THURSDAY&#34;`, `&#34;FRIDAY&#34;` or `&#34;SATURDAY&#34;`).
     * 
     */
    @Import(name="weekDay", required=true)
    private Output<String> weekDay;

    /**
     * @return A day of the week (one of `&#34;SUNDAY&#34;`, `&#34;MONDAY&#34;`, `&#34;TUESDAY&#34;`, `&#34;WEDNESDAY&#34;`, `&#34;THURSDAY&#34;`, `&#34;FRIDAY&#34;` or `&#34;SATURDAY&#34;`).
     * 
     */
    public Output<String> weekDay() {
        return this.weekDay;
    }

    private MonitorDowntimeFrequencyDaysOfWeekArgs() {}

    private MonitorDowntimeFrequencyDaysOfWeekArgs(MonitorDowntimeFrequencyDaysOfWeekArgs $) {
        this.ordinalDayOfMonth = $.ordinalDayOfMonth;
        this.weekDay = $.weekDay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorDowntimeFrequencyDaysOfWeekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorDowntimeFrequencyDaysOfWeekArgs $;

        public Builder() {
            $ = new MonitorDowntimeFrequencyDaysOfWeekArgs();
        }

        public Builder(MonitorDowntimeFrequencyDaysOfWeekArgs defaults) {
            $ = new MonitorDowntimeFrequencyDaysOfWeekArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ordinalDayOfMonth The occurrence of `week_day` in a month (one of `&#34;FIRST&#34;`, `&#34;SECOND&#34;`, `&#34;THIRD&#34;`, `&#34;FOURTH&#34;`, `&#34;LAST&#34;`).
         * 
         * &gt; **NOTE:** `frequency` **can only be used with the mode** `MONTHLY`, and **is a required argument** with monthly monitor downtimes (if the `mode` is `MONTHLY`). Additionally, **either** `days_of_month` or `days_of_week` **are required to be specified with** `frequency`, but not both, as `days_of_month` and `days_of_week` are mutually exclusive. If `days_of_week` is specified, values of **both** of its nested arguments, `week_day` and `ordinal_day_of_month` **would need to be specified** too.
         * 
         * @return builder
         * 
         */
        public Builder ordinalDayOfMonth(Output<String> ordinalDayOfMonth) {
            $.ordinalDayOfMonth = ordinalDayOfMonth;
            return this;
        }

        /**
         * @param ordinalDayOfMonth The occurrence of `week_day` in a month (one of `&#34;FIRST&#34;`, `&#34;SECOND&#34;`, `&#34;THIRD&#34;`, `&#34;FOURTH&#34;`, `&#34;LAST&#34;`).
         * 
         * &gt; **NOTE:** `frequency` **can only be used with the mode** `MONTHLY`, and **is a required argument** with monthly monitor downtimes (if the `mode` is `MONTHLY`). Additionally, **either** `days_of_month` or `days_of_week` **are required to be specified with** `frequency`, but not both, as `days_of_month` and `days_of_week` are mutually exclusive. If `days_of_week` is specified, values of **both** of its nested arguments, `week_day` and `ordinal_day_of_month` **would need to be specified** too.
         * 
         * @return builder
         * 
         */
        public Builder ordinalDayOfMonth(String ordinalDayOfMonth) {
            return ordinalDayOfMonth(Output.of(ordinalDayOfMonth));
        }

        /**
         * @param weekDay A day of the week (one of `&#34;SUNDAY&#34;`, `&#34;MONDAY&#34;`, `&#34;TUESDAY&#34;`, `&#34;WEDNESDAY&#34;`, `&#34;THURSDAY&#34;`, `&#34;FRIDAY&#34;` or `&#34;SATURDAY&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder weekDay(Output<String> weekDay) {
            $.weekDay = weekDay;
            return this;
        }

        /**
         * @param weekDay A day of the week (one of `&#34;SUNDAY&#34;`, `&#34;MONDAY&#34;`, `&#34;TUESDAY&#34;`, `&#34;WEDNESDAY&#34;`, `&#34;THURSDAY&#34;`, `&#34;FRIDAY&#34;` or `&#34;SATURDAY&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder weekDay(String weekDay) {
            return weekDay(Output.of(weekDay));
        }

        public MonitorDowntimeFrequencyDaysOfWeekArgs build() {
            if ($.ordinalDayOfMonth == null) {
                throw new MissingRequiredPropertyException("MonitorDowntimeFrequencyDaysOfWeekArgs", "ordinalDayOfMonth");
            }
            if ($.weekDay == null) {
                throw new MissingRequiredPropertyException("MonitorDowntimeFrequencyDaysOfWeekArgs", "weekDay");
            }
            return $;
        }
    }

}
