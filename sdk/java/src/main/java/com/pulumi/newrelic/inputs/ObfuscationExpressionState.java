// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObfuscationExpressionState extends com.pulumi.resources.ResourceArgs {

    public static final ObfuscationExpressionState Empty = new ObfuscationExpressionState();

    /**
     * The account id associated with the obfuscation expression.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account id associated with the obfuscation expression.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Description of expression.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of expression.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of expression.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of expression.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private ObfuscationExpressionState() {}

    private ObfuscationExpressionState(ObfuscationExpressionState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.name = $.name;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObfuscationExpressionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObfuscationExpressionState $;

        public Builder() {
            $ = new ObfuscationExpressionState();
        }

        public Builder(ObfuscationExpressionState defaults) {
            $ = new ObfuscationExpressionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id associated with the obfuscation expression.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id associated with the obfuscation expression.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description Description of expression.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of expression.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of expression.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of expression.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regex Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        public ObfuscationExpressionState build() {
            return $;
        }
    }

}
