// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.AwsLinkAccountArgs;
import com.pulumi.newrelic.cloud.inputs.AwsLinkAccountState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Linked AWS accounts can be imported using the `id`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:cloud/awsLinkAccount:AwsLinkAccount foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/awsLinkAccount:AwsLinkAccount")
public class AwsLinkAccount extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     * 
     */
    @Export(name="metricCollectionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> metricCollectionMode;

    /**
     * @return How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     * 
     */
    public Output<Optional<String>> metricCollectionMode() {
        return Codegen.optional(this.metricCollectionMode);
    }
    /**
     * - The linked account name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return - The linked account name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsLinkAccount(String name) {
        this(name, AwsLinkAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsLinkAccount(String name, AwsLinkAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsLinkAccount(String name, AwsLinkAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsLinkAccount:AwsLinkAccount", name, args == null ? AwsLinkAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AwsLinkAccount(String name, Output<String> id, @Nullable AwsLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsLinkAccount:AwsLinkAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AwsLinkAccount get(String name, Output<String> id, @Nullable AwsLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsLinkAccount(name, id, state, options);
    }
}
