// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyTransactionArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyTransactionArgs Empty = new KeyTransactionArgs();

    /**
     * A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
     * 
     */
    @Import(name="apdexIndex", required=true)
    private Output<Double> apdexIndex;

    /**
     * @return A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
     * 
     */
    public Output<Double> apdexIndex() {
        return this.apdexIndex;
    }

    /**
     * The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
     * 
     */
    @Import(name="applicationGuid", required=true)
    private Output<String> applicationGuid;

    /**
     * @return The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
     * 
     */
    public Output<String> applicationGuid() {
        return this.applicationGuid;
    }

    /**
     * A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
     * 
     * &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
     * 
     */
    @Import(name="browserApdexTarget", required=true)
    private Output<Double> browserApdexTarget;

    /**
     * @return A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
     * 
     * &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
     * 
     */
    public Output<Double> browserApdexTarget() {
        return this.browserApdexTarget;
    }

    /**
     * The name of the underlying metric monitored by the key transaction to be created.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return The name of the underlying metric monitored by the key transaction to be created.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The name of the key transaction.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the key transaction.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private KeyTransactionArgs() {}

    private KeyTransactionArgs(KeyTransactionArgs $) {
        this.apdexIndex = $.apdexIndex;
        this.applicationGuid = $.applicationGuid;
        this.browserApdexTarget = $.browserApdexTarget;
        this.metricName = $.metricName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyTransactionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyTransactionArgs $;

        public Builder() {
            $ = new KeyTransactionArgs();
        }

        public Builder(KeyTransactionArgs defaults) {
            $ = new KeyTransactionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apdexIndex A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
         * 
         * @return builder
         * 
         */
        public Builder apdexIndex(Output<Double> apdexIndex) {
            $.apdexIndex = apdexIndex;
            return this;
        }

        /**
         * @param apdexIndex A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
         * 
         * @return builder
         * 
         */
        public Builder apdexIndex(Double apdexIndex) {
            return apdexIndex(Output.of(apdexIndex));
        }

        /**
         * @param applicationGuid The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
         * 
         * @return builder
         * 
         */
        public Builder applicationGuid(Output<String> applicationGuid) {
            $.applicationGuid = applicationGuid;
            return this;
        }

        /**
         * @param applicationGuid The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
         * 
         * @return builder
         * 
         */
        public Builder applicationGuid(String applicationGuid) {
            return applicationGuid(Output.of(applicationGuid));
        }

        /**
         * @param browserApdexTarget A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
         * 
         * &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder browserApdexTarget(Output<Double> browserApdexTarget) {
            $.browserApdexTarget = browserApdexTarget;
            return this;
        }

        /**
         * @param browserApdexTarget A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
         * 
         * &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder browserApdexTarget(Double browserApdexTarget) {
            return browserApdexTarget(Output.of(browserApdexTarget));
        }

        /**
         * @param metricName The name of the underlying metric monitored by the key transaction to be created.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The name of the underlying metric monitored by the key transaction to be created.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param name The name of the key transaction.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the key transaction.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public KeyTransactionArgs build() {
            if ($.apdexIndex == null) {
                throw new MissingRequiredPropertyException("KeyTransactionArgs", "apdexIndex");
            }
            if ($.applicationGuid == null) {
                throw new MissingRequiredPropertyException("KeyTransactionArgs", "applicationGuid");
            }
            if ($.browserApdexTarget == null) {
                throw new MissingRequiredPropertyException("KeyTransactionArgs", "browserApdexTarget");
            }
            if ($.metricName == null) {
                throw new MissingRequiredPropertyException("KeyTransactionArgs", "metricName");
            }
            return $;
        }
    }

}
