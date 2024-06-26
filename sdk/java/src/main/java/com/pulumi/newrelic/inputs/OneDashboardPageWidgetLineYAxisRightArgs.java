// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetLineYAxisRightArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetLineYAxisRightArgs Empty = new OneDashboardPageWidgetLineYAxisRightArgs();

    /**
     * Minimum value of the range to be specified with the Y-Axis on the right of the line widget.
     * 
     */
    @Import(name="yAxisRightMax")
    private @Nullable Output<Double> yAxisRightMax;

    /**
     * @return Minimum value of the range to be specified with the Y-Axis on the right of the line widget.
     * 
     */
    public Optional<Output<Double>> yAxisRightMax() {
        return Optional.ofNullable(this.yAxisRightMax);
    }

    /**
     * , `y_axis_right_max` - (Optional) Attributes which help specify a range of minimum and maximum values, which adjust the right Y axis to display the data within the specified minimum and maximum value for the axis.
     * 
     */
    @Import(name="yAxisRightMin")
    private @Nullable Output<Double> yAxisRightMin;

    /**
     * @return , `y_axis_right_max` - (Optional) Attributes which help specify a range of minimum and maximum values, which adjust the right Y axis to display the data within the specified minimum and maximum value for the axis.
     * 
     */
    public Optional<Output<Double>> yAxisRightMin() {
        return Optional.ofNullable(this.yAxisRightMin);
    }

    /**
     * (Optional) An attribute which takes a list of strings, specifying a selection of series&#39; displayed in the line chart to be adjusted against the values of the right Y-axis.
     * 
     */
    @Import(name="yAxisRightSeries")
    private @Nullable Output<List<String>> yAxisRightSeries;

    /**
     * @return (Optional) An attribute which takes a list of strings, specifying a selection of series&#39; displayed in the line chart to be adjusted against the values of the right Y-axis.
     * 
     */
    public Optional<Output<List<String>>> yAxisRightSeries() {
        return Optional.ofNullable(this.yAxisRightSeries);
    }

    /**
     * (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_right_min` (or 0 if it is not defined) to `y_axis_right_max`. Use `y_axis_right_zero = true` with a combination of `y_axis_right_min` and `y_axis_right_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_right_zero = false` to fit the graph to scale.
     * 
     */
    @Import(name="yAxisRightZero")
    private @Nullable Output<Boolean> yAxisRightZero;

    /**
     * @return (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_right_min` (or 0 if it is not defined) to `y_axis_right_max`. Use `y_axis_right_zero = true` with a combination of `y_axis_right_min` and `y_axis_right_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_right_zero = false` to fit the graph to scale.
     * 
     */
    public Optional<Output<Boolean>> yAxisRightZero() {
        return Optional.ofNullable(this.yAxisRightZero);
    }

    private OneDashboardPageWidgetLineYAxisRightArgs() {}

    private OneDashboardPageWidgetLineYAxisRightArgs(OneDashboardPageWidgetLineYAxisRightArgs $) {
        this.yAxisRightMax = $.yAxisRightMax;
        this.yAxisRightMin = $.yAxisRightMin;
        this.yAxisRightSeries = $.yAxisRightSeries;
        this.yAxisRightZero = $.yAxisRightZero;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetLineYAxisRightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetLineYAxisRightArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetLineYAxisRightArgs();
        }

        public Builder(OneDashboardPageWidgetLineYAxisRightArgs defaults) {
            $ = new OneDashboardPageWidgetLineYAxisRightArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param yAxisRightMax Minimum value of the range to be specified with the Y-Axis on the right of the line widget.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightMax(@Nullable Output<Double> yAxisRightMax) {
            $.yAxisRightMax = yAxisRightMax;
            return this;
        }

        /**
         * @param yAxisRightMax Minimum value of the range to be specified with the Y-Axis on the right of the line widget.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightMax(Double yAxisRightMax) {
            return yAxisRightMax(Output.of(yAxisRightMax));
        }

        /**
         * @param yAxisRightMin , `y_axis_right_max` - (Optional) Attributes which help specify a range of minimum and maximum values, which adjust the right Y axis to display the data within the specified minimum and maximum value for the axis.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightMin(@Nullable Output<Double> yAxisRightMin) {
            $.yAxisRightMin = yAxisRightMin;
            return this;
        }

        /**
         * @param yAxisRightMin , `y_axis_right_max` - (Optional) Attributes which help specify a range of minimum and maximum values, which adjust the right Y axis to display the data within the specified minimum and maximum value for the axis.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightMin(Double yAxisRightMin) {
            return yAxisRightMin(Output.of(yAxisRightMin));
        }

        /**
         * @param yAxisRightSeries (Optional) An attribute which takes a list of strings, specifying a selection of series&#39; displayed in the line chart to be adjusted against the values of the right Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightSeries(@Nullable Output<List<String>> yAxisRightSeries) {
            $.yAxisRightSeries = yAxisRightSeries;
            return this;
        }

        /**
         * @param yAxisRightSeries (Optional) An attribute which takes a list of strings, specifying a selection of series&#39; displayed in the line chart to be adjusted against the values of the right Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightSeries(List<String> yAxisRightSeries) {
            return yAxisRightSeries(Output.of(yAxisRightSeries));
        }

        /**
         * @param yAxisRightSeries (Optional) An attribute which takes a list of strings, specifying a selection of series&#39; displayed in the line chart to be adjusted against the values of the right Y-axis.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightSeries(String... yAxisRightSeries) {
            return yAxisRightSeries(List.of(yAxisRightSeries));
        }

        /**
         * @param yAxisRightZero (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_right_min` (or 0 if it is not defined) to `y_axis_right_max`. Use `y_axis_right_zero = true` with a combination of `y_axis_right_min` and `y_axis_right_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_right_zero = false` to fit the graph to scale.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightZero(@Nullable Output<Boolean> yAxisRightZero) {
            $.yAxisRightZero = yAxisRightZero;
            return this;
        }

        /**
         * @param yAxisRightZero (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_right_min` (or 0 if it is not defined) to `y_axis_right_max`. Use `y_axis_right_zero = true` with a combination of `y_axis_right_min` and `y_axis_right_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_right_zero = false` to fit the graph to scale.
         * 
         * @return builder
         * 
         */
        public Builder yAxisRightZero(Boolean yAxisRightZero) {
            return yAxisRightZero(Output.of(yAxisRightZero));
        }

        public OneDashboardPageWidgetLineYAxisRightArgs build() {
            return $;
        }
    }

}
