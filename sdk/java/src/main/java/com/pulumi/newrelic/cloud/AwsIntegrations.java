// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.AwsIntegrationsArgs;
import com.pulumi.newrelic.cloud.inputs.AwsIntegrationsState;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAlb;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsApiGateway;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAutoScaling;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsAppSync;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsAthena;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsAutoDiscovery;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsCognito;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsConnect;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsDirectConnect;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsFsx;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsGlue;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsKinesisAnalytics;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsMediaConvert;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsMediaPackageVod;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsMq;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsMsk;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsNeptune;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsQldb;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsRoute53resolver;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsStates;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsTransitGateway;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsWaf;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsAwsWafv2;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsBilling;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsCloudfront;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsCloudtrail;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsDocDb;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsDynamodb;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsEbs;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsEc2;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsEcs;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsEfs;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsElasticache;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsElasticbeanstalk;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsElasticsearch;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsElb;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsEmr;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsHealth;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsIam;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsIot;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsKinesis;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsKinesisFirehose;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsLambda;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsRds;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsRedshift;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsRoute53;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsS3;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsSes;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsSns;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsSqs;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsTrustedAdvisor;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsVpc;
import com.pulumi.newrelic.cloud.outputs.AwsIntegrationsXRay;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Linked AWS account integrations can be imported using the `id`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:cloud/awsIntegrations:AwsIntegrations foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/awsIntegrations:AwsIntegrations")
public class AwsIntegrations extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * ALB integration
     * 
     */
    @Export(name="alb", refs={AwsIntegrationsAlb.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAlb> alb;

    /**
     * @return ALB integration
     * 
     */
    public Output<Optional<AwsIntegrationsAlb>> alb() {
        return Codegen.optional(this.alb);
    }
    /**
     * API Gateway integration
     * 
     */
    @Export(name="apiGateway", refs={AwsIntegrationsApiGateway.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsApiGateway> apiGateway;

    /**
     * @return API Gateway integration
     * 
     */
    public Output<Optional<AwsIntegrationsApiGateway>> apiGateway() {
        return Codegen.optional(this.apiGateway);
    }
    /**
     * AutoScaling integration
     * 
     */
    @Export(name="autoScaling", refs={AwsIntegrationsAutoScaling.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAutoScaling> autoScaling;

    /**
     * @return AutoScaling integration
     * 
     */
    public Output<Optional<AwsIntegrationsAutoScaling>> autoScaling() {
        return Codegen.optional(this.autoScaling);
    }
    /**
     * Aws Appsync integration
     * 
     */
    @Export(name="awsAppSync", refs={AwsIntegrationsAwsAppSync.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsAppSync> awsAppSync;

    /**
     * @return Aws Appsync integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsAppSync>> awsAppSync() {
        return Codegen.optional(this.awsAppSync);
    }
    /**
     * Aws Athena integration
     * 
     */
    @Export(name="awsAthena", refs={AwsIntegrationsAwsAthena.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsAthena> awsAthena;

    /**
     * @return Aws Athena integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsAthena>> awsAthena() {
        return Codegen.optional(this.awsAthena);
    }
    /**
     * Aws Auto Discovery Integration
     * 
     */
    @Export(name="awsAutoDiscovery", refs={AwsIntegrationsAwsAutoDiscovery.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsAutoDiscovery> awsAutoDiscovery;

    /**
     * @return Aws Auto Discovery Integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsAutoDiscovery>> awsAutoDiscovery() {
        return Codegen.optional(this.awsAutoDiscovery);
    }
    /**
     * Aws Cognito integration
     * 
     */
    @Export(name="awsCognito", refs={AwsIntegrationsAwsCognito.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsCognito> awsCognito;

    /**
     * @return Aws Cognito integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsCognito>> awsCognito() {
        return Codegen.optional(this.awsCognito);
    }
    /**
     * Aws Connect integration
     * 
     */
    @Export(name="awsConnect", refs={AwsIntegrationsAwsConnect.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsConnect> awsConnect;

    /**
     * @return Aws Connect integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsConnect>> awsConnect() {
        return Codegen.optional(this.awsConnect);
    }
    /**
     * Aws Direct Connect integration
     * 
     */
    @Export(name="awsDirectConnect", refs={AwsIntegrationsAwsDirectConnect.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsDirectConnect> awsDirectConnect;

    /**
     * @return Aws Direct Connect integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsDirectConnect>> awsDirectConnect() {
        return Codegen.optional(this.awsDirectConnect);
    }
    /**
     * Aws Fsx integration
     * 
     */
    @Export(name="awsFsx", refs={AwsIntegrationsAwsFsx.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsFsx> awsFsx;

    /**
     * @return Aws Fsx integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsFsx>> awsFsx() {
        return Codegen.optional(this.awsFsx);
    }
    /**
     * Aws Glue integration
     * 
     */
    @Export(name="awsGlue", refs={AwsIntegrationsAwsGlue.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsGlue> awsGlue;

    /**
     * @return Aws Glue integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsGlue>> awsGlue() {
        return Codegen.optional(this.awsGlue);
    }
    /**
     * Aws Kinesis Analytics integration
     * 
     */
    @Export(name="awsKinesisAnalytics", refs={AwsIntegrationsAwsKinesisAnalytics.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsKinesisAnalytics> awsKinesisAnalytics;

    /**
     * @return Aws Kinesis Analytics integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsKinesisAnalytics>> awsKinesisAnalytics() {
        return Codegen.optional(this.awsKinesisAnalytics);
    }
    /**
     * Aws Media Convert integration
     * 
     */
    @Export(name="awsMediaConvert", refs={AwsIntegrationsAwsMediaConvert.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsMediaConvert> awsMediaConvert;

    /**
     * @return Aws Media Convert integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsMediaConvert>> awsMediaConvert() {
        return Codegen.optional(this.awsMediaConvert);
    }
    /**
     * Aws Media PackageVod integration
     * 
     */
    @Export(name="awsMediaPackageVod", refs={AwsIntegrationsAwsMediaPackageVod.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsMediaPackageVod> awsMediaPackageVod;

    /**
     * @return Aws Media PackageVod integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsMediaPackageVod>> awsMediaPackageVod() {
        return Codegen.optional(this.awsMediaPackageVod);
    }
    /**
     * Aws Mq integration
     * 
     */
    @Export(name="awsMq", refs={AwsIntegrationsAwsMq.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsMq> awsMq;

    /**
     * @return Aws Mq integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsMq>> awsMq() {
        return Codegen.optional(this.awsMq);
    }
    /**
     * Aws Msk integration
     * 
     */
    @Export(name="awsMsk", refs={AwsIntegrationsAwsMsk.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsMsk> awsMsk;

    /**
     * @return Aws Msk integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsMsk>> awsMsk() {
        return Codegen.optional(this.awsMsk);
    }
    /**
     * Aws Neptune integration
     * 
     */
    @Export(name="awsNeptune", refs={AwsIntegrationsAwsNeptune.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsNeptune> awsNeptune;

    /**
     * @return Aws Neptune integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsNeptune>> awsNeptune() {
        return Codegen.optional(this.awsNeptune);
    }
    /**
     * Aws Qldb integration
     * 
     */
    @Export(name="awsQldb", refs={AwsIntegrationsAwsQldb.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsQldb> awsQldb;

    /**
     * @return Aws Qldb integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsQldb>> awsQldb() {
        return Codegen.optional(this.awsQldb);
    }
    /**
     * Aws Route53resolver integration
     * 
     */
    @Export(name="awsRoute53resolver", refs={AwsIntegrationsAwsRoute53resolver.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsRoute53resolver> awsRoute53resolver;

    /**
     * @return Aws Route53resolver integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsRoute53resolver>> awsRoute53resolver() {
        return Codegen.optional(this.awsRoute53resolver);
    }
    /**
     * Aws states integration
     * 
     */
    @Export(name="awsStates", refs={AwsIntegrationsAwsStates.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsStates> awsStates;

    /**
     * @return Aws states integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsStates>> awsStates() {
        return Codegen.optional(this.awsStates);
    }
    /**
     * Aws Transit Gateway integration
     * 
     */
    @Export(name="awsTransitGateway", refs={AwsIntegrationsAwsTransitGateway.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsTransitGateway> awsTransitGateway;

    /**
     * @return Aws Transit Gateway integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsTransitGateway>> awsTransitGateway() {
        return Codegen.optional(this.awsTransitGateway);
    }
    /**
     * Aws Waf integration
     * 
     */
    @Export(name="awsWaf", refs={AwsIntegrationsAwsWaf.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsWaf> awsWaf;

    /**
     * @return Aws Waf integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsWaf>> awsWaf() {
        return Codegen.optional(this.awsWaf);
    }
    /**
     * Aws Wafv2 integration
     * 
     */
    @Export(name="awsWafv2", refs={AwsIntegrationsAwsWafv2.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsAwsWafv2> awsWafv2;

    /**
     * @return Aws Wafv2 integration
     * 
     */
    public Output<Optional<AwsIntegrationsAwsWafv2>> awsWafv2() {
        return Codegen.optional(this.awsWafv2);
    }
    /**
     * Billing integration
     * 
     */
    @Export(name="billing", refs={AwsIntegrationsBilling.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsBilling> billing;

    /**
     * @return Billing integration
     * 
     */
    public Output<Optional<AwsIntegrationsBilling>> billing() {
        return Codegen.optional(this.billing);
    }
    /**
     * Cloudfront integration
     * 
     */
    @Export(name="cloudfront", refs={AwsIntegrationsCloudfront.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsCloudfront> cloudfront;

    /**
     * @return Cloudfront integration
     * 
     */
    public Output<Optional<AwsIntegrationsCloudfront>> cloudfront() {
        return Codegen.optional(this.cloudfront);
    }
    /**
     * CloudTrail integration
     * 
     */
    @Export(name="cloudtrail", refs={AwsIntegrationsCloudtrail.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsCloudtrail> cloudtrail;

    /**
     * @return CloudTrail integration
     * 
     */
    public Output<Optional<AwsIntegrationsCloudtrail>> cloudtrail() {
        return Codegen.optional(this.cloudtrail);
    }
    /**
     * Doc DB integration
     * 
     */
    @Export(name="docDb", refs={AwsIntegrationsDocDb.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsDocDb> docDb;

    /**
     * @return Doc DB integration
     * 
     */
    public Output<Optional<AwsIntegrationsDocDb>> docDb() {
        return Codegen.optional(this.docDb);
    }
    /**
     * Dynamo DB integration
     * 
     */
    @Export(name="dynamodb", refs={AwsIntegrationsDynamodb.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsDynamodb> dynamodb;

    /**
     * @return Dynamo DB integration
     * 
     */
    public Output<Optional<AwsIntegrationsDynamodb>> dynamodb() {
        return Codegen.optional(this.dynamodb);
    }
    /**
     * EBS integration
     * 
     */
    @Export(name="ebs", refs={AwsIntegrationsEbs.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsEbs> ebs;

    /**
     * @return EBS integration
     * 
     */
    public Output<Optional<AwsIntegrationsEbs>> ebs() {
        return Codegen.optional(this.ebs);
    }
    /**
     * Ec2 integration
     * 
     */
    @Export(name="ec2", refs={AwsIntegrationsEc2.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsEc2> ec2;

    /**
     * @return Ec2 integration
     * 
     */
    public Output<Optional<AwsIntegrationsEc2>> ec2() {
        return Codegen.optional(this.ec2);
    }
    /**
     * Ecs integration
     * 
     */
    @Export(name="ecs", refs={AwsIntegrationsEcs.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsEcs> ecs;

    /**
     * @return Ecs integration
     * 
     */
    public Output<Optional<AwsIntegrationsEcs>> ecs() {
        return Codegen.optional(this.ecs);
    }
    /**
     * Efs integration
     * 
     */
    @Export(name="efs", refs={AwsIntegrationsEfs.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsEfs> efs;

    /**
     * @return Efs integration
     * 
     */
    public Output<Optional<AwsIntegrationsEfs>> efs() {
        return Codegen.optional(this.efs);
    }
    /**
     * Elasticache integration
     * 
     */
    @Export(name="elasticache", refs={AwsIntegrationsElasticache.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsElasticache> elasticache;

    /**
     * @return Elasticache integration
     * 
     */
    public Output<Optional<AwsIntegrationsElasticache>> elasticache() {
        return Codegen.optional(this.elasticache);
    }
    /**
     * Elastic Bean Stalk integration
     * 
     */
    @Export(name="elasticbeanstalk", refs={AwsIntegrationsElasticbeanstalk.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsElasticbeanstalk> elasticbeanstalk;

    /**
     * @return Elastic Bean Stalk integration
     * 
     */
    public Output<Optional<AwsIntegrationsElasticbeanstalk>> elasticbeanstalk() {
        return Codegen.optional(this.elasticbeanstalk);
    }
    /**
     * Elastic Search integration
     * 
     */
    @Export(name="elasticsearch", refs={AwsIntegrationsElasticsearch.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsElasticsearch> elasticsearch;

    /**
     * @return Elastic Search integration
     * 
     */
    public Output<Optional<AwsIntegrationsElasticsearch>> elasticsearch() {
        return Codegen.optional(this.elasticsearch);
    }
    /**
     * Elb integration
     * 
     */
    @Export(name="elb", refs={AwsIntegrationsElb.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsElb> elb;

    /**
     * @return Elb integration
     * 
     */
    public Output<Optional<AwsIntegrationsElb>> elb() {
        return Codegen.optional(this.elb);
    }
    /**
     * Emr integration
     * 
     */
    @Export(name="emr", refs={AwsIntegrationsEmr.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsEmr> emr;

    /**
     * @return Emr integration
     * 
     */
    public Output<Optional<AwsIntegrationsEmr>> emr() {
        return Codegen.optional(this.emr);
    }
    /**
     * Health integration
     * 
     */
    @Export(name="health", refs={AwsIntegrationsHealth.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsHealth> health;

    /**
     * @return Health integration
     * 
     */
    public Output<Optional<AwsIntegrationsHealth>> health() {
        return Codegen.optional(this.health);
    }
    /**
     * Iam integration
     * 
     */
    @Export(name="iam", refs={AwsIntegrationsIam.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsIam> iam;

    /**
     * @return Iam integration
     * 
     */
    public Output<Optional<AwsIntegrationsIam>> iam() {
        return Codegen.optional(this.iam);
    }
    /**
     * Iot integration
     * 
     */
    @Export(name="iot", refs={AwsIntegrationsIot.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsIot> iot;

    /**
     * @return Iot integration
     * 
     */
    public Output<Optional<AwsIntegrationsIot>> iot() {
        return Codegen.optional(this.iot);
    }
    /**
     * Kinesis integration
     * 
     */
    @Export(name="kinesis", refs={AwsIntegrationsKinesis.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsKinesis> kinesis;

    /**
     * @return Kinesis integration
     * 
     */
    public Output<Optional<AwsIntegrationsKinesis>> kinesis() {
        return Codegen.optional(this.kinesis);
    }
    /**
     * Kinesis Firehose integration
     * 
     */
    @Export(name="kinesisFirehose", refs={AwsIntegrationsKinesisFirehose.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsKinesisFirehose> kinesisFirehose;

    /**
     * @return Kinesis Firehose integration
     * 
     */
    public Output<Optional<AwsIntegrationsKinesisFirehose>> kinesisFirehose() {
        return Codegen.optional(this.kinesisFirehose);
    }
    /**
     * Lambda integration
     * 
     */
    @Export(name="lambda", refs={AwsIntegrationsLambda.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsLambda> lambda;

    /**
     * @return Lambda integration
     * 
     */
    public Output<Optional<AwsIntegrationsLambda>> lambda() {
        return Codegen.optional(this.lambda);
    }
    /**
     * The ID of the linked AWS account in New Relic.
     * 
     */
    @Export(name="linkedAccountId", refs={String.class}, tree="[0]")
    private Output<String> linkedAccountId;

    /**
     * @return The ID of the linked AWS account in New Relic.
     * 
     */
    public Output<String> linkedAccountId() {
        return this.linkedAccountId;
    }
    /**
     * Rds integration
     * 
     */
    @Export(name="rds", refs={AwsIntegrationsRds.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsRds> rds;

    /**
     * @return Rds integration
     * 
     */
    public Output<Optional<AwsIntegrationsRds>> rds() {
        return Codegen.optional(this.rds);
    }
    /**
     * Redshift integration
     * 
     */
    @Export(name="redshift", refs={AwsIntegrationsRedshift.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsRedshift> redshift;

    /**
     * @return Redshift integration
     * 
     */
    public Output<Optional<AwsIntegrationsRedshift>> redshift() {
        return Codegen.optional(this.redshift);
    }
    /**
     * Route53 integration
     * 
     */
    @Export(name="route53", refs={AwsIntegrationsRoute53.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsRoute53> route53;

    /**
     * @return Route53 integration
     * 
     */
    public Output<Optional<AwsIntegrationsRoute53>> route53() {
        return Codegen.optional(this.route53);
    }
    /**
     * S3 integration
     * 
     */
    @Export(name="s3", refs={AwsIntegrationsS3.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsS3> s3;

    /**
     * @return S3 integration
     * 
     */
    public Output<Optional<AwsIntegrationsS3>> s3() {
        return Codegen.optional(this.s3);
    }
    /**
     * Ses integration
     * 
     */
    @Export(name="ses", refs={AwsIntegrationsSes.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsSes> ses;

    /**
     * @return Ses integration
     * 
     */
    public Output<Optional<AwsIntegrationsSes>> ses() {
        return Codegen.optional(this.ses);
    }
    /**
     * Sns integration
     * 
     */
    @Export(name="sns", refs={AwsIntegrationsSns.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsSns> sns;

    /**
     * @return Sns integration
     * 
     */
    public Output<Optional<AwsIntegrationsSns>> sns() {
        return Codegen.optional(this.sns);
    }
    /**
     * SQS integration
     * 
     */
    @Export(name="sqs", refs={AwsIntegrationsSqs.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsSqs> sqs;

    /**
     * @return SQS integration
     * 
     */
    public Output<Optional<AwsIntegrationsSqs>> sqs() {
        return Codegen.optional(this.sqs);
    }
    /**
     * Trusted Advisor integration
     * 
     */
    @Export(name="trustedAdvisor", refs={AwsIntegrationsTrustedAdvisor.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsTrustedAdvisor> trustedAdvisor;

    /**
     * @return Trusted Advisor integration
     * 
     */
    public Output<Optional<AwsIntegrationsTrustedAdvisor>> trustedAdvisor() {
        return Codegen.optional(this.trustedAdvisor);
    }
    /**
     * VPC integration
     * 
     */
    @Export(name="vpc", refs={AwsIntegrationsVpc.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsVpc> vpc;

    /**
     * @return VPC integration
     * 
     */
    public Output<Optional<AwsIntegrationsVpc>> vpc() {
        return Codegen.optional(this.vpc);
    }
    /**
     * X-Ray integration
     * 
     */
    @Export(name="xRay", refs={AwsIntegrationsXRay.class}, tree="[0]")
    private Output</* @Nullable */ AwsIntegrationsXRay> xRay;

    /**
     * @return X-Ray integration
     * 
     */
    public Output<Optional<AwsIntegrationsXRay>> xRay() {
        return Codegen.optional(this.xRay);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsIntegrations(java.lang.String name) {
        this(name, AwsIntegrationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsIntegrations(java.lang.String name, AwsIntegrationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsIntegrations(java.lang.String name, AwsIntegrationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsIntegrations:AwsIntegrations", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AwsIntegrations(java.lang.String name, Output<java.lang.String> id, @Nullable AwsIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/awsIntegrations:AwsIntegrations", name, state, makeResourceOptions(options, id), false);
    }

    private static AwsIntegrationsArgs makeArgs(AwsIntegrationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AwsIntegrationsArgs.Empty : args;
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
    public static AwsIntegrations get(java.lang.String name, Output<java.lang.String> id, @Nullable AwsIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsIntegrations(name, id, state, options);
    }
}
