// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAlbArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsApiGatewayArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAutoScalingArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAwsDirectConnectArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsAwsStatesArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsCloudtrailArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsDynamoDbArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsEbsArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsEc2Args;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsElasticSearchArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsElbArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsEmrArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsIamArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsLambdaArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsRdsArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsRedShiftArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsRoute53Args;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsS3Args;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsSnsArgs;
import com.pulumi.newrelic.cloud.inputs.AwsGovcloudIntegrationsSqsArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsGovcloudIntegrationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsGovcloudIntegrationsArgs Empty = new AwsGovcloudIntegrationsArgs();

    /**
     * The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The alb integration
     * 
     */
    @Import(name="alb")
    private @Nullable Output<AwsGovcloudIntegrationsAlbArgs> alb;

    /**
     * @return The alb integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsAlbArgs>> alb() {
        return Optional.ofNullable(this.alb);
    }

    /**
     * Api Gateway AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="apiGateway")
    private @Nullable Output<AwsGovcloudIntegrationsApiGatewayArgs> apiGateway;

    /**
     * @return Api Gateway AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsApiGatewayArgs>> apiGateway() {
        return Optional.ofNullable(this.apiGateway);
    }

    /**
     * Autoscaling AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="autoScaling")
    private @Nullable Output<AwsGovcloudIntegrationsAutoScalingArgs> autoScaling;

    /**
     * @return Autoscaling AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsAutoScalingArgs>> autoScaling() {
        return Optional.ofNullable(this.autoScaling);
    }

    /**
     * Aws Direct Connect AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="awsDirectConnect")
    private @Nullable Output<AwsGovcloudIntegrationsAwsDirectConnectArgs> awsDirectConnect;

    /**
     * @return Aws Direct Connect AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsAwsDirectConnectArgs>> awsDirectConnect() {
        return Optional.ofNullable(this.awsDirectConnect);
    }

    /**
     * Aws States AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="awsStates")
    private @Nullable Output<AwsGovcloudIntegrationsAwsStatesArgs> awsStates;

    /**
     * @return Aws States AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsAwsStatesArgs>> awsStates() {
        return Optional.ofNullable(this.awsStates);
    }

    /**
     * The cloudtrail integration
     * 
     */
    @Import(name="cloudtrail")
    private @Nullable Output<AwsGovcloudIntegrationsCloudtrailArgs> cloudtrail;

    /**
     * @return The cloudtrail integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsCloudtrailArgs>> cloudtrail() {
        return Optional.ofNullable(this.cloudtrail);
    }

    /**
     * Dynamo DB AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="dynamoDb")
    private @Nullable Output<AwsGovcloudIntegrationsDynamoDbArgs> dynamoDb;

    /**
     * @return Dynamo DB AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsDynamoDbArgs>> dynamoDb() {
        return Optional.ofNullable(this.dynamoDb);
    }

    /**
     * The ebs integration
     * 
     */
    @Import(name="ebs")
    private @Nullable Output<AwsGovcloudIntegrationsEbsArgs> ebs;

    /**
     * @return The ebs integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsEbsArgs>> ebs() {
        return Optional.ofNullable(this.ebs);
    }

    /**
     * The ec2 integration
     * 
     */
    @Import(name="ec2")
    private @Nullable Output<AwsGovcloudIntegrationsEc2Args> ec2;

    /**
     * @return The ec2 integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsEc2Args>> ec2() {
        return Optional.ofNullable(this.ec2);
    }

    /**
     * Elastic search AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="elasticSearch")
    private @Nullable Output<AwsGovcloudIntegrationsElasticSearchArgs> elasticSearch;

    /**
     * @return Elastic search AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsElasticSearchArgs>> elasticSearch() {
        return Optional.ofNullable(this.elasticSearch);
    }

    /**
     * The elb integration
     * 
     */
    @Import(name="elb")
    private @Nullable Output<AwsGovcloudIntegrationsElbArgs> elb;

    /**
     * @return The elb integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsElbArgs>> elb() {
        return Optional.ofNullable(this.elb);
    }

    /**
     * The emr integration
     * 
     */
    @Import(name="emr")
    private @Nullable Output<AwsGovcloudIntegrationsEmrArgs> emr;

    /**
     * @return The emr integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsEmrArgs>> emr() {
        return Optional.ofNullable(this.emr);
    }

    /**
     * The iam integration
     * 
     */
    @Import(name="iam")
    private @Nullable Output<AwsGovcloudIntegrationsIamArgs> iam;

    /**
     * @return The iam integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsIamArgs>> iam() {
        return Optional.ofNullable(this.iam);
    }

    /**
     * The lambda integration
     * 
     */
    @Import(name="lambda")
    private @Nullable Output<AwsGovcloudIntegrationsLambdaArgs> lambda;

    /**
     * @return The lambda integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsLambdaArgs>> lambda() {
        return Optional.ofNullable(this.lambda);
    }

    /**
     * The access key of the AwsGovCloud.
     * 
     */
    @Import(name="linkedAccountId", required=true)
    private Output<Integer> linkedAccountId;

    /**
     * @return The access key of the AwsGovCloud.
     * 
     */
    public Output<Integer> linkedAccountId() {
        return this.linkedAccountId;
    }

    /**
     * The rds integration
     * 
     */
    @Import(name="rds")
    private @Nullable Output<AwsGovcloudIntegrationsRdsArgs> rds;

    /**
     * @return The rds integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsRdsArgs>> rds() {
        return Optional.ofNullable(this.rds);
    }

    /**
     * Redshift AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    @Import(name="redShift")
    private @Nullable Output<AwsGovcloudIntegrationsRedShiftArgs> redShift;

    /**
     * @return Redshift AwsGovCloud integration.See Integration blocks below for details.
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsRedShiftArgs>> redShift() {
        return Optional.ofNullable(this.redShift);
    }

    /**
     * The route53 integration
     * 
     */
    @Import(name="route53")
    private @Nullable Output<AwsGovcloudIntegrationsRoute53Args> route53;

    /**
     * @return The route53 integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsRoute53Args>> route53() {
        return Optional.ofNullable(this.route53);
    }

    /**
     * The s3 integration
     * 
     */
    @Import(name="s3")
    private @Nullable Output<AwsGovcloudIntegrationsS3Args> s3;

    /**
     * @return The s3 integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    /**
     * The sns integration
     * 
     */
    @Import(name="sns")
    private @Nullable Output<AwsGovcloudIntegrationsSnsArgs> sns;

    /**
     * @return The sns integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsSnsArgs>> sns() {
        return Optional.ofNullable(this.sns);
    }

    /**
     * The sqs integration
     * 
     */
    @Import(name="sqs")
    private @Nullable Output<AwsGovcloudIntegrationsSqsArgs> sqs;

    /**
     * @return The sqs integration
     * 
     */
    public Optional<Output<AwsGovcloudIntegrationsSqsArgs>> sqs() {
        return Optional.ofNullable(this.sqs);
    }

    private AwsGovcloudIntegrationsArgs() {}

    private AwsGovcloudIntegrationsArgs(AwsGovcloudIntegrationsArgs $) {
        this.accountId = $.accountId;
        this.alb = $.alb;
        this.apiGateway = $.apiGateway;
        this.autoScaling = $.autoScaling;
        this.awsDirectConnect = $.awsDirectConnect;
        this.awsStates = $.awsStates;
        this.cloudtrail = $.cloudtrail;
        this.dynamoDb = $.dynamoDb;
        this.ebs = $.ebs;
        this.ec2 = $.ec2;
        this.elasticSearch = $.elasticSearch;
        this.elb = $.elb;
        this.emr = $.emr;
        this.iam = $.iam;
        this.lambda = $.lambda;
        this.linkedAccountId = $.linkedAccountId;
        this.rds = $.rds;
        this.redShift = $.redShift;
        this.route53 = $.route53;
        this.s3 = $.s3;
        this.sns = $.sns;
        this.sqs = $.sqs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsGovcloudIntegrationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsGovcloudIntegrationsArgs $;

        public Builder() {
            $ = new AwsGovcloudIntegrationsArgs();
        }

        public Builder(AwsGovcloudIntegrationsArgs defaults) {
            $ = new AwsGovcloudIntegrationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param alb The alb integration
         * 
         * @return builder
         * 
         */
        public Builder alb(@Nullable Output<AwsGovcloudIntegrationsAlbArgs> alb) {
            $.alb = alb;
            return this;
        }

        /**
         * @param alb The alb integration
         * 
         * @return builder
         * 
         */
        public Builder alb(AwsGovcloudIntegrationsAlbArgs alb) {
            return alb(Output.of(alb));
        }

        /**
         * @param apiGateway Api Gateway AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder apiGateway(@Nullable Output<AwsGovcloudIntegrationsApiGatewayArgs> apiGateway) {
            $.apiGateway = apiGateway;
            return this;
        }

        /**
         * @param apiGateway Api Gateway AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder apiGateway(AwsGovcloudIntegrationsApiGatewayArgs apiGateway) {
            return apiGateway(Output.of(apiGateway));
        }

        /**
         * @param autoScaling Autoscaling AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder autoScaling(@Nullable Output<AwsGovcloudIntegrationsAutoScalingArgs> autoScaling) {
            $.autoScaling = autoScaling;
            return this;
        }

        /**
         * @param autoScaling Autoscaling AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder autoScaling(AwsGovcloudIntegrationsAutoScalingArgs autoScaling) {
            return autoScaling(Output.of(autoScaling));
        }

        /**
         * @param awsDirectConnect Aws Direct Connect AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder awsDirectConnect(@Nullable Output<AwsGovcloudIntegrationsAwsDirectConnectArgs> awsDirectConnect) {
            $.awsDirectConnect = awsDirectConnect;
            return this;
        }

        /**
         * @param awsDirectConnect Aws Direct Connect AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder awsDirectConnect(AwsGovcloudIntegrationsAwsDirectConnectArgs awsDirectConnect) {
            return awsDirectConnect(Output.of(awsDirectConnect));
        }

        /**
         * @param awsStates Aws States AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder awsStates(@Nullable Output<AwsGovcloudIntegrationsAwsStatesArgs> awsStates) {
            $.awsStates = awsStates;
            return this;
        }

        /**
         * @param awsStates Aws States AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder awsStates(AwsGovcloudIntegrationsAwsStatesArgs awsStates) {
            return awsStates(Output.of(awsStates));
        }

        /**
         * @param cloudtrail The cloudtrail integration
         * 
         * @return builder
         * 
         */
        public Builder cloudtrail(@Nullable Output<AwsGovcloudIntegrationsCloudtrailArgs> cloudtrail) {
            $.cloudtrail = cloudtrail;
            return this;
        }

        /**
         * @param cloudtrail The cloudtrail integration
         * 
         * @return builder
         * 
         */
        public Builder cloudtrail(AwsGovcloudIntegrationsCloudtrailArgs cloudtrail) {
            return cloudtrail(Output.of(cloudtrail));
        }

        /**
         * @param dynamoDb Dynamo DB AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dynamoDb(@Nullable Output<AwsGovcloudIntegrationsDynamoDbArgs> dynamoDb) {
            $.dynamoDb = dynamoDb;
            return this;
        }

        /**
         * @param dynamoDb Dynamo DB AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dynamoDb(AwsGovcloudIntegrationsDynamoDbArgs dynamoDb) {
            return dynamoDb(Output.of(dynamoDb));
        }

        /**
         * @param ebs The ebs integration
         * 
         * @return builder
         * 
         */
        public Builder ebs(@Nullable Output<AwsGovcloudIntegrationsEbsArgs> ebs) {
            $.ebs = ebs;
            return this;
        }

        /**
         * @param ebs The ebs integration
         * 
         * @return builder
         * 
         */
        public Builder ebs(AwsGovcloudIntegrationsEbsArgs ebs) {
            return ebs(Output.of(ebs));
        }

        /**
         * @param ec2 The ec2 integration
         * 
         * @return builder
         * 
         */
        public Builder ec2(@Nullable Output<AwsGovcloudIntegrationsEc2Args> ec2) {
            $.ec2 = ec2;
            return this;
        }

        /**
         * @param ec2 The ec2 integration
         * 
         * @return builder
         * 
         */
        public Builder ec2(AwsGovcloudIntegrationsEc2Args ec2) {
            return ec2(Output.of(ec2));
        }

        /**
         * @param elasticSearch Elastic search AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder elasticSearch(@Nullable Output<AwsGovcloudIntegrationsElasticSearchArgs> elasticSearch) {
            $.elasticSearch = elasticSearch;
            return this;
        }

        /**
         * @param elasticSearch Elastic search AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder elasticSearch(AwsGovcloudIntegrationsElasticSearchArgs elasticSearch) {
            return elasticSearch(Output.of(elasticSearch));
        }

        /**
         * @param elb The elb integration
         * 
         * @return builder
         * 
         */
        public Builder elb(@Nullable Output<AwsGovcloudIntegrationsElbArgs> elb) {
            $.elb = elb;
            return this;
        }

        /**
         * @param elb The elb integration
         * 
         * @return builder
         * 
         */
        public Builder elb(AwsGovcloudIntegrationsElbArgs elb) {
            return elb(Output.of(elb));
        }

        /**
         * @param emr The emr integration
         * 
         * @return builder
         * 
         */
        public Builder emr(@Nullable Output<AwsGovcloudIntegrationsEmrArgs> emr) {
            $.emr = emr;
            return this;
        }

        /**
         * @param emr The emr integration
         * 
         * @return builder
         * 
         */
        public Builder emr(AwsGovcloudIntegrationsEmrArgs emr) {
            return emr(Output.of(emr));
        }

        /**
         * @param iam The iam integration
         * 
         * @return builder
         * 
         */
        public Builder iam(@Nullable Output<AwsGovcloudIntegrationsIamArgs> iam) {
            $.iam = iam;
            return this;
        }

        /**
         * @param iam The iam integration
         * 
         * @return builder
         * 
         */
        public Builder iam(AwsGovcloudIntegrationsIamArgs iam) {
            return iam(Output.of(iam));
        }

        /**
         * @param lambda The lambda integration
         * 
         * @return builder
         * 
         */
        public Builder lambda(@Nullable Output<AwsGovcloudIntegrationsLambdaArgs> lambda) {
            $.lambda = lambda;
            return this;
        }

        /**
         * @param lambda The lambda integration
         * 
         * @return builder
         * 
         */
        public Builder lambda(AwsGovcloudIntegrationsLambdaArgs lambda) {
            return lambda(Output.of(lambda));
        }

        /**
         * @param linkedAccountId The access key of the AwsGovCloud.
         * 
         * @return builder
         * 
         */
        public Builder linkedAccountId(Output<Integer> linkedAccountId) {
            $.linkedAccountId = linkedAccountId;
            return this;
        }

        /**
         * @param linkedAccountId The access key of the AwsGovCloud.
         * 
         * @return builder
         * 
         */
        public Builder linkedAccountId(Integer linkedAccountId) {
            return linkedAccountId(Output.of(linkedAccountId));
        }

        /**
         * @param rds The rds integration
         * 
         * @return builder
         * 
         */
        public Builder rds(@Nullable Output<AwsGovcloudIntegrationsRdsArgs> rds) {
            $.rds = rds;
            return this;
        }

        /**
         * @param rds The rds integration
         * 
         * @return builder
         * 
         */
        public Builder rds(AwsGovcloudIntegrationsRdsArgs rds) {
            return rds(Output.of(rds));
        }

        /**
         * @param redShift Redshift AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder redShift(@Nullable Output<AwsGovcloudIntegrationsRedShiftArgs> redShift) {
            $.redShift = redShift;
            return this;
        }

        /**
         * @param redShift Redshift AwsGovCloud integration.See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder redShift(AwsGovcloudIntegrationsRedShiftArgs redShift) {
            return redShift(Output.of(redShift));
        }

        /**
         * @param route53 The route53 integration
         * 
         * @return builder
         * 
         */
        public Builder route53(@Nullable Output<AwsGovcloudIntegrationsRoute53Args> route53) {
            $.route53 = route53;
            return this;
        }

        /**
         * @param route53 The route53 integration
         * 
         * @return builder
         * 
         */
        public Builder route53(AwsGovcloudIntegrationsRoute53Args route53) {
            return route53(Output.of(route53));
        }

        /**
         * @param s3 The s3 integration
         * 
         * @return builder
         * 
         */
        public Builder s3(@Nullable Output<AwsGovcloudIntegrationsS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        /**
         * @param s3 The s3 integration
         * 
         * @return builder
         * 
         */
        public Builder s3(AwsGovcloudIntegrationsS3Args s3) {
            return s3(Output.of(s3));
        }

        /**
         * @param sns The sns integration
         * 
         * @return builder
         * 
         */
        public Builder sns(@Nullable Output<AwsGovcloudIntegrationsSnsArgs> sns) {
            $.sns = sns;
            return this;
        }

        /**
         * @param sns The sns integration
         * 
         * @return builder
         * 
         */
        public Builder sns(AwsGovcloudIntegrationsSnsArgs sns) {
            return sns(Output.of(sns));
        }

        /**
         * @param sqs The sqs integration
         * 
         * @return builder
         * 
         */
        public Builder sqs(@Nullable Output<AwsGovcloudIntegrationsSqsArgs> sqs) {
            $.sqs = sqs;
            return this;
        }

        /**
         * @param sqs The sqs integration
         * 
         * @return builder
         * 
         */
        public Builder sqs(AwsGovcloudIntegrationsSqsArgs sqs) {
            return sqs(Output.of(sqs));
        }

        public AwsGovcloudIntegrationsArgs build() {
            $.linkedAccountId = Objects.requireNonNull($.linkedAccountId, "expected parameter 'linkedAccountId' to be non-null");
            return $;
        }
    }

}
