// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs Empty = new OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs();

    /**
     * Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
     * 
     */
    @Import(name="nullValue")
    private @Nullable Output<String> nullValue;

    /**
     * @return Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
     * 
     */
    public Optional<Output<String>> nullValue() {
        return Optional.ofNullable(this.nullValue);
    }

    /**
     * Series name
     * 
     */
    @Import(name="seriesName")
    private @Nullable Output<String> seriesName;

    /**
     * @return Series name
     * 
     */
    public Optional<Output<String>> seriesName() {
        return Optional.ofNullable(this.seriesName);
    }

    private OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs() {}

    private OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs(OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs $) {
        this.nullValue = $.nullValue;
        this.seriesName = $.seriesName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs();
        }

        public Builder(OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs defaults) {
            $ = new OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nullValue Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
         * 
         * @return builder
         * 
         */
        public Builder nullValue(@Nullable Output<String> nullValue) {
            $.nullValue = nullValue;
            return this;
        }

        /**
         * @param nullValue Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
         * 
         * @return builder
         * 
         */
        public Builder nullValue(String nullValue) {
            return nullValue(Output.of(nullValue));
        }

        /**
         * @param seriesName Series name
         * 
         * @return builder
         * 
         */
        public Builder seriesName(@Nullable Output<String> seriesName) {
            $.seriesName = seriesName;
            return this;
        }

        /**
         * @param seriesName Series name
         * 
         * @return builder
         * 
         */
        public Builder seriesName(String seriesName) {
            return seriesName(Output.of(seriesName));
        }

        public OneDashboardPageWidgetMarkdownNullValueSeriesOverrideArgs build() {
            return $;
        }
    }

}
