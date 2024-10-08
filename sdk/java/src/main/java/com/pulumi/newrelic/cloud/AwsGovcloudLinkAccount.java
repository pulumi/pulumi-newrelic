// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.AwsGovcloudLinkAccountArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudLinkAccountState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **IMPORTANT!** This resource is in alpha state, and could still contain issues and missing functionality. If you encounter any issue please create a ticket on Github with all the required information.
 * 
 * Use this resource to link an AWSGovCloud account to New Relic.
 * 
 * ## Prerequisite
 * 
 * Obtain the AwsGovCloud account designed to address the specific regulatory needs of United States (federal, state, and local agencies), education institutions, and the supporting ecosystem.
 * 
 * It is an isolated AWS region designed to host sensitive data and regulated workloads in the cloud, helping customers support their US government compliance requirements.
 * 
 * To pull data from AWSGovCloud, complete the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/get-started/connect-aws-govcloud-new-relic).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.cloud.AwsGovcloudLinkAccount;
 * import com.pulumi.newrelic.cloud.AwsGovcloudLinkAccountArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new AwsGovcloudLinkAccount("foo", AwsGovcloudLinkAccountArgs.builder()
 *             .accountId("The New Relic account ID where you want to link the AWS GovCloud account")
 *             .accessKeyId("access-key-id of aws govcloud account")
 *             .awsAccountId("aws govcloud account id")
 *             .metricCollectionMode("PULL")
 *             .name("account name")
 *             .secretAccessKey("secret access key of the aws govcloud account")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Linked AWSGovCloud accounts can be imported using the `id`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount")
public class AwsGovcloudLinkAccount extends com.pulumi.resources.CustomResource {
    /**
     * The access key of the AwsGovCloud.
     * 
     */
    @Export(name="accessKeyId", refs={String.class}, tree="[0]")
    private Output<String> accessKeyId;

    /**
     * @return The access key of the AwsGovCloud.
     * 
     */
    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The AwsGovCloud account ID.
     * 
     */
    @Export(name="awsAccountId", refs={String.class}, tree="[0]")
    private Output<String> awsAccountId;

    /**
     * @return The AwsGovCloud account ID.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     * 
     */
    @Export(name="metricCollectionMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metricCollectionMode;

    /**
     * @return How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     * 
     */
    public Output<Optional<String>> metricCollectionMode() {
        return Codegen.optional(this.metricCollectionMode);
    }
    /**
     * The linked account name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The linked account name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The secret key of the AwsGovCloud.
     * 
     */
    @Export(name="secretAccessKey", refs={String.class}, tree="[0]")
    private Output<String> secretAccessKey;

    /**
     * @return The secret key of the AwsGovCloud.
     * 
     */
    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsGovcloudLinkAccount(java.lang.String name) {
        this(name, AwsGovcloudLinkAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsGovcloudLinkAccount(java.lang.String name, AwsGovcloudLinkAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsGovcloudLinkAccount(java.lang.String name, AwsGovcloudLinkAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AwsGovcloudLinkAccount(java.lang.String name, Output<java.lang.String> id, @Nullable AwsGovcloudLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount", name, state, makeResourceOptions(options, id), false);
    }

    private static AwsGovcloudLinkAccountArgs makeArgs(AwsGovcloudLinkAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AwsGovcloudLinkAccountArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accessKeyId",
                "secretAccessKey"
            ))
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
    public static AwsGovcloudLinkAccount get(java.lang.String name, Output<java.lang.String> id, @Nullable AwsGovcloudLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsGovcloudLinkAccount(name, id, state, options);
    }
}
