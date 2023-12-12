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
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Integrate AWSGovCloud accounts can be imported using the `id`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations")
public class AwsGovcloudIntegrations extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Output<Integer> accountId() {
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
    @Export(name="linkedAccountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linkedAccountId;

    /**
     * @return The access key of the AwsGovCloud.
     * 
     */
    public Output<Integer> linkedAccountId() {
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
    public AwsGovcloudIntegrations(String name) {
        this(name, AwsGovcloudIntegrationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsGovcloudIntegrations(String name, AwsGovcloudIntegrationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsGovcloudIntegrations(String name, AwsGovcloudIntegrationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations", name, args == null ? AwsGovcloudIntegrationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AwsGovcloudIntegrations(String name, Output<String> id, @Nullable AwsGovcloudIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations", name, state, makeResourceOptions(options, id));
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
    public static AwsGovcloudIntegrations get(String name, Output<String> id, @Nullable AwsGovcloudIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsGovcloudIntegrations(name, id, state, options);
    }
}
