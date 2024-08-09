// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.AwsGovcloudIntegrationsArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsState;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsAlb;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsApiGateway;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsAutoScaling;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsAwsDirectConnect;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsAwsStates;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsCloudtrail;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsDynamoDb;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsEbs;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsEc2;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsElasticSearch;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsElb;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsEmr;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsIam;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsLambda;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsRds;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsRedShift;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsRoute53;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsS3;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsSns;
import com.pulumi.newrelic.cloud.outputs.AwsGovcloudIntegrationsSqs;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **IMPORTANT!** This resource is in alpha state, and could still contain issues and missing functionality. If you encounter any issue please create a ticket on Github with all the required information.
 * 
 * Use this resource to integrate an AWSGovCloud account to New Relic.
 * 
 * ## Prerequisite
 * 
 * Obtain the AwsGovCloud account designed to address the specific regulatory needs of United States (federal, state, and local agencies), education institutions, and the supporting ecosystem.
 * 
 * It is an isolated AWS region designed to host sensitive data and regulated workloads in the cloud, helping customers support their US government compliance requirements.
 * 
 * To pull data from AWSGovCloud, complete the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/connect/connect-aws-govcloud-new-relic).
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
 * import com.pulumi.newrelic.cloudAwsGovcloudLinkAccount;
 * import com.pulumi.newrelic.CloudAwsGovcloudLinkAccountArgs;
 * import com.pulumi.newrelic.cloud.AwsGovcloudIntegrations;
 * import com.pulumi.newrelic.cloud.AwsGovcloudIntegrationsArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAlbArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsApiGatewayArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAutoScalingArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAwsDirectConnectArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAwsStatesArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsCloudtrailArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsDynamoDbArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsEbsArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsEc2Args;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsElasticSearchArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsElbArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsEmrArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsIamArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsLambdaArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsRdsArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsRedShiftArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsRoute53Args;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsS3Args;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsSnsArgs;
 * import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsSqsArgs;
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
 *         var account = new CloudAwsGovcloudLinkAccount("account", CloudAwsGovcloudLinkAccountArgs.builder()
 *             .accessKeyId("%[1]s")
 *             .awsAccountId("%[2]s")
 *             .metricCollectionMode("PULL")
 *             .name("%[4]s")
 *             .secretAccessKey("%[3]s")
 *             .build());
 * 
 *         var foo = new AwsGovcloudIntegrations("foo", AwsGovcloudIntegrationsArgs.builder()
 *             .accountId(3806526)
 *             .linkedAccountId(account.id())
 *             .alb(AwsGovcloudIntegrationsAlbArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("us-east-1")
 *                 .fetchExtendedInventory(true)
 *                 .fetchTags(true)
 *                 .loadBalancerPrefixes("")
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .apiGateway(AwsGovcloudIntegrationsApiGatewayArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .stagePrefixes("")
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .autoScaling(AwsGovcloudIntegrationsAutoScalingArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .build())
 *             .awsDirectConnect(AwsGovcloudIntegrationsAwsDirectConnectArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .build())
 *             .awsStates(AwsGovcloudIntegrationsAwsStatesArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .build())
 *             .cloudtrail(AwsGovcloudIntegrationsCloudtrailArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .build())
 *             .dynamoDb(AwsGovcloudIntegrationsDynamoDbArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchExtendedInventory(true)
 *                 .fetchTags(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .ebs(AwsGovcloudIntegrationsEbsArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchExtendedInventory(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .ec2(AwsGovcloudIntegrationsEc2Args.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchIpAddresses(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .elasticSearch(AwsGovcloudIntegrationsElasticSearchArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchNodes(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .elb(AwsGovcloudIntegrationsElbArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchExtendedInventory(true)
 *                 .fetchTags(true)
 *                 .build())
 *             .emr(AwsGovcloudIntegrationsEmrArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchTags(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .iam(AwsGovcloudIntegrationsIamArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .lambda(AwsGovcloudIntegrationsLambdaArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchTags(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .rds(AwsGovcloudIntegrationsRdsArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchTags(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .redShift(AwsGovcloudIntegrationsRedShiftArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .route53(AwsGovcloudIntegrationsRoute53Args.builder()
 *                 .metricsPollingInterval(1000)
 *                 .fetchExtendedInventory(true)
 *                 .build())
 *             .s3(AwsGovcloudIntegrationsS3Args.builder()
 *                 .metricsPollingInterval(1000)
 *                 .fetchExtendedInventory(true)
 *                 .fetchTags(true)
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
 *             .sns(AwsGovcloudIntegrationsSnsArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchExtendedInventory(true)
 *                 .build())
 *             .sqs(AwsGovcloudIntegrationsSqsArgs.builder()
 *                 .metricsPollingInterval(1000)
 *                 .awsRegions("")
 *                 .fetchExtendedInventory(true)
 *                 .fetchTags(true)
 *                 .queuePrefixes("")
 *                 .tagKey("")
 *                 .tagValue("")
 *                 .build())
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
 * Integrate AWSGovCloud accounts can be imported using the `id`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations")
public class AwsGovcloudIntegrations extends com.pulumi.resources.CustomResource {
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
     * Application load balancer AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="alb", refs={AwsGovcloudIntegrationsAlb.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsAlb> alb;

    /**
     * @return Application load balancer AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsAlb>> alb() {
        return Codegen.optional(this.alb);
    }
    /**
     * Api Gateway AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="apiGateway", refs={AwsGovcloudIntegrationsApiGateway.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsApiGateway> apiGateway;

    /**
     * @return Api Gateway AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsApiGateway>> apiGateway() {
        return Codegen.optional(this.apiGateway);
    }
    /**
     * Autoscaling AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="autoScaling", refs={AwsGovcloudIntegrationsAutoScaling.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsAutoScaling> autoScaling;

    /**
     * @return Autoscaling AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsAutoScaling>> autoScaling() {
        return Codegen.optional(this.autoScaling);
    }
    /**
     * Aws Direct Connect AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="awsDirectConnect", refs={AwsGovcloudIntegrationsAwsDirectConnect.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsAwsDirectConnect> awsDirectConnect;

    /**
     * @return Aws Direct Connect AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsAwsDirectConnect>> awsDirectConnect() {
        return Codegen.optional(this.awsDirectConnect);
    }
    /**
     * Aws States AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="awsStates", refs={AwsGovcloudIntegrationsAwsStates.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsAwsStates> awsStates;

    /**
     * @return Aws States AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsAwsStates>> awsStates() {
        return Codegen.optional(this.awsStates);
    }
    /**
     * Cloudtrail AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="cloudtrail", refs={AwsGovcloudIntegrationsCloudtrail.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsCloudtrail> cloudtrail;

    /**
     * @return Cloudtrail AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsCloudtrail>> cloudtrail() {
        return Codegen.optional(this.cloudtrail);
    }
    /**
     * Dynamo DB AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="dynamoDb", refs={AwsGovcloudIntegrationsDynamoDb.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsDynamoDb> dynamoDb;

    /**
     * @return Dynamo DB AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsDynamoDb>> dynamoDb() {
        return Codegen.optional(this.dynamoDb);
    }
    /**
     * Elastic Beanstalk AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="ebs", refs={AwsGovcloudIntegrationsEbs.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsEbs> ebs;

    /**
     * @return Elastic Beanstalk AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsEbs>> ebs() {
        return Codegen.optional(this.ebs);
    }
    /**
     * EC2 AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="ec2", refs={AwsGovcloudIntegrationsEc2.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsEc2> ec2;

    /**
     * @return EC2 AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsEc2>> ec2() {
        return Codegen.optional(this.ec2);
    }
    /**
     * Elastic search AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="elasticSearch", refs={AwsGovcloudIntegrationsElasticSearch.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsElasticSearch> elasticSearch;

    /**
     * @return Elastic search AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsElasticSearch>> elasticSearch() {
        return Codegen.optional(this.elasticSearch);
    }
    /**
     * Elb AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="elb", refs={AwsGovcloudIntegrationsElb.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsElb> elb;

    /**
     * @return Elb AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsElb>> elb() {
        return Codegen.optional(this.elb);
    }
    /**
     * Emr AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="emr", refs={AwsGovcloudIntegrationsEmr.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsEmr> emr;

    /**
     * @return Emr AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsEmr>> emr() {
        return Codegen.optional(this.emr);
    }
    /**
     * IAM AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="iam", refs={AwsGovcloudIntegrationsIam.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsIam> iam;

    /**
     * @return IAM AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsIam>> iam() {
        return Codegen.optional(this.iam);
    }
    /**
     * Lambda AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="lambda", refs={AwsGovcloudIntegrationsLambda.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsLambda> lambda;

    /**
     * @return Lambda AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsLambda>> lambda() {
        return Codegen.optional(this.lambda);
    }
    /**
     * The access key of the AwsGovCloud.
     * 
     */
    @Export(name="linkedAccountId", refs={String.class}, tree="[0]")
    private Output<String> linkedAccountId;

    /**
     * @return The access key of the AwsGovCloud.
     * 
     */
    public Output<String> linkedAccountId() {
        return this.linkedAccountId;
    }
    /**
     * RDS AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="rds", refs={AwsGovcloudIntegrationsRds.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsRds> rds;

    /**
     * @return RDS AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsRds>> rds() {
        return Codegen.optional(this.rds);
    }
    /**
     * Redshift AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="redShift", refs={AwsGovcloudIntegrationsRedShift.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsRedShift> redShift;

    /**
     * @return Redshift AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsRedShift>> redShift() {
        return Codegen.optional(this.redShift);
    }
    /**
     * Route53 AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="route53", refs={AwsGovcloudIntegrationsRoute53.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsRoute53> route53;

    /**
     * @return Route53 AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsRoute53>> route53() {
        return Codegen.optional(this.route53);
    }
    /**
     * The s3 integration
     * 
     */
    @Export(name="s3", refs={AwsGovcloudIntegrationsS3.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsS3> s3;

    /**
     * @return The s3 integration
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsS3>> s3() {
        return Codegen.optional(this.s3);
    }
    /**
     * SNS AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="sns", refs={AwsGovcloudIntegrationsSns.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsSns> sns;

    /**
     * @return SNS AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsSns>> sns() {
        return Codegen.optional(this.sns);
    }
    /**
     * SQS AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Export(name="sqs", refs={AwsGovcloudIntegrationsSqs.class}, tree="[0]")
    private Output</* @Nullable */ AwsGovcloudIntegrationsSqs> sqs;

    /**
     * @return SQS AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Output<Optional<AwsGovcloudIntegrationsSqs>> sqs() {
        return Codegen.optional(this.sqs);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsGovcloudIntegrations(java.lang.String name) {
        this(name, AwsGovcloudIntegrationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsGovcloudIntegrations(java.lang.String name, AwsGovcloudIntegrationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsGovcloudIntegrations(java.lang.String name, AwsGovcloudIntegrationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AwsGovcloudIntegrations(java.lang.String name, Output<java.lang.String> id, @Nullable AwsGovcloudIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations", name, state, makeResourceOptions(options, id), false);
    }

    private static AwsGovcloudIntegrationsArgs makeArgs(AwsGovcloudIntegrationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AwsGovcloudIntegrationsArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static AwsGovcloudIntegrations get(java.lang.String name, Output<java.lang.String> id, @Nullable AwsGovcloudIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsGovcloudIntegrations(name, id, state, options);
    }
}
