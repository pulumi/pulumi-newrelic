// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsApiManagementArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsAppGatewayArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsAppServiceArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsContainersArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsCosmosDbArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsCostManagementArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsDataFactoryArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsEventHubArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsExpressRouteArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsFirewallsArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsFrontDoorArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsFunctionsArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsKeyVaultArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsLoadBalancerArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsLogicAppsArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsMachineLearningArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsMariaDbArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsMysqlArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsPostgresqlArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsPowerBiDedicatedArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsRedisCacheArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsServiceBusArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsSqlArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsSqlManagedArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsStorageArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsVirtualMachineArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsVirtualNetworksArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsVmsArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsVpnGatewayArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureIntegrationsState extends com.pulumi.resources.ResourceArgs {

    public static final AzureIntegrationsState Empty = new AzureIntegrationsState();

    /**
     * The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Azure API Management. See Integration blocks below for details.
     * 
     */
    @Import(name="apiManagement")
    private @Nullable Output<AzureIntegrationsApiManagementArgs> apiManagement;

    /**
     * @return Azure API Management. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsApiManagementArgs>> apiManagement() {
        return Optional.ofNullable(this.apiManagement);
    }

    /**
     * Azure App Gateway. See Integration blocks below for details.
     * 
     */
    @Import(name="appGateway")
    private @Nullable Output<AzureIntegrationsAppGatewayArgs> appGateway;

    /**
     * @return Azure App Gateway. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsAppGatewayArgs>> appGateway() {
        return Optional.ofNullable(this.appGateway);
    }

    /**
     * Azure App Service. See Integration blocks below for details.
     * 
     */
    @Import(name="appService")
    private @Nullable Output<AzureIntegrationsAppServiceArgs> appService;

    /**
     * @return Azure App Service. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsAppServiceArgs>> appService() {
        return Optional.ofNullable(this.appService);
    }

    /**
     * Azure Containers. See Integration blocks below for details.
     * 
     */
    @Import(name="containers")
    private @Nullable Output<AzureIntegrationsContainersArgs> containers;

    /**
     * @return Azure Containers. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsContainersArgs>> containers() {
        return Optional.ofNullable(this.containers);
    }

    /**
     * Azure CosmosDB. See Integration blocks below for details.
     * 
     */
    @Import(name="cosmosDb")
    private @Nullable Output<AzureIntegrationsCosmosDbArgs> cosmosDb;

    /**
     * @return Azure CosmosDB. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsCosmosDbArgs>> cosmosDb() {
        return Optional.ofNullable(this.cosmosDb);
    }

    /**
     * Azure Cost Management. See Integration blocks below for details.
     * 
     */
    @Import(name="costManagement")
    private @Nullable Output<AzureIntegrationsCostManagementArgs> costManagement;

    /**
     * @return Azure Cost Management. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsCostManagementArgs>> costManagement() {
        return Optional.ofNullable(this.costManagement);
    }

    /**
     * for Azure Data Factory. See Integration blocks below for details.
     * 
     */
    @Import(name="dataFactory")
    private @Nullable Output<AzureIntegrationsDataFactoryArgs> dataFactory;

    /**
     * @return for Azure Data Factory. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsDataFactoryArgs>> dataFactory() {
        return Optional.ofNullable(this.dataFactory);
    }

    /**
     * for Azure Event Hub. See Integration blocks below for details.
     * 
     */
    @Import(name="eventHub")
    private @Nullable Output<AzureIntegrationsEventHubArgs> eventHub;

    /**
     * @return for Azure Event Hub. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsEventHubArgs>> eventHub() {
        return Optional.ofNullable(this.eventHub);
    }

    /**
     * for Azure Express Route. See Integration blocks below for details.
     * 
     */
    @Import(name="expressRoute")
    private @Nullable Output<AzureIntegrationsExpressRouteArgs> expressRoute;

    /**
     * @return for Azure Express Route. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsExpressRouteArgs>> expressRoute() {
        return Optional.ofNullable(this.expressRoute);
    }

    /**
     * for Azure Firewalls. See Integration blocks below for details.
     * 
     */
    @Import(name="firewalls")
    private @Nullable Output<AzureIntegrationsFirewallsArgs> firewalls;

    /**
     * @return for Azure Firewalls. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsFirewallsArgs>> firewalls() {
        return Optional.ofNullable(this.firewalls);
    }

    /**
     * for Azure Front Door. See Integration blocks below for details.
     * 
     */
    @Import(name="frontDoor")
    private @Nullable Output<AzureIntegrationsFrontDoorArgs> frontDoor;

    /**
     * @return for Azure Front Door. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsFrontDoorArgs>> frontDoor() {
        return Optional.ofNullable(this.frontDoor);
    }

    /**
     * for Azure Functions. See Integration blocks below for details.
     * 
     */
    @Import(name="functions")
    private @Nullable Output<AzureIntegrationsFunctionsArgs> functions;

    /**
     * @return for Azure Functions. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsFunctionsArgs>> functions() {
        return Optional.ofNullable(this.functions);
    }

    /**
     * for Azure Key Vault. See Integration blocks below for details.
     * 
     */
    @Import(name="keyVault")
    private @Nullable Output<AzureIntegrationsKeyVaultArgs> keyVault;

    /**
     * @return for Azure Key Vault. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsKeyVaultArgs>> keyVault() {
        return Optional.ofNullable(this.keyVault);
    }

    /**
     * The ID of the linked Azure account in New Relic.
     * 
     */
    @Import(name="linkedAccountId")
    private @Nullable Output<Integer> linkedAccountId;

    /**
     * @return The ID of the linked Azure account in New Relic.
     * 
     */
    public Optional<Output<Integer>> linkedAccountId() {
        return Optional.ofNullable(this.linkedAccountId);
    }

    /**
     * for Azure Load Balancer. See Integration blocks below for details.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<AzureIntegrationsLoadBalancerArgs> loadBalancer;

    /**
     * @return for Azure Load Balancer. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsLoadBalancerArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * for Azure Logic Apps. See Integration blocks below for details.
     * 
     */
    @Import(name="logicApps")
    private @Nullable Output<AzureIntegrationsLogicAppsArgs> logicApps;

    /**
     * @return for Azure Logic Apps. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsLogicAppsArgs>> logicApps() {
        return Optional.ofNullable(this.logicApps);
    }

    /**
     * for Azure Machine Learning. See Integration blocks below for details.
     * 
     */
    @Import(name="machineLearning")
    private @Nullable Output<AzureIntegrationsMachineLearningArgs> machineLearning;

    /**
     * @return for Azure Machine Learning. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsMachineLearningArgs>> machineLearning() {
        return Optional.ofNullable(this.machineLearning);
    }

    /**
     * for Azure MariaDB. See Integration blocks below for details.
     * 
     */
    @Import(name="mariaDb")
    private @Nullable Output<AzureIntegrationsMariaDbArgs> mariaDb;

    /**
     * @return for Azure MariaDB. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsMariaDbArgs>> mariaDb() {
        return Optional.ofNullable(this.mariaDb);
    }

    /**
     * for Azure MySQL. See Integration blocks below for details.
     * 
     */
    @Import(name="mysql")
    private @Nullable Output<AzureIntegrationsMysqlArgs> mysql;

    /**
     * @return for Azure MySQL. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsMysqlArgs>> mysql() {
        return Optional.ofNullable(this.mysql);
    }

    /**
     * for Azure PostgreSQL. See Integration blocks below for details.
     * 
     */
    @Import(name="postgresql")
    private @Nullable Output<AzureIntegrationsPostgresqlArgs> postgresql;

    /**
     * @return for Azure PostgreSQL. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsPostgresqlArgs>> postgresql() {
        return Optional.ofNullable(this.postgresql);
    }

    /**
     * for Azure Power BI Dedicated. See Integration blocks below for details.
     * 
     */
    @Import(name="powerBiDedicated")
    private @Nullable Output<AzureIntegrationsPowerBiDedicatedArgs> powerBiDedicated;

    /**
     * @return for Azure Power BI Dedicated. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsPowerBiDedicatedArgs>> powerBiDedicated() {
        return Optional.ofNullable(this.powerBiDedicated);
    }

    /**
     * for Azure Redis Cache. See Integration blocks below for details.
     * 
     */
    @Import(name="redisCache")
    private @Nullable Output<AzureIntegrationsRedisCacheArgs> redisCache;

    /**
     * @return for Azure Redis Cache. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsRedisCacheArgs>> redisCache() {
        return Optional.ofNullable(this.redisCache);
    }

    /**
     * for Azure Service Bus. See Integration blocks below for details.
     * 
     */
    @Import(name="serviceBus")
    private @Nullable Output<AzureIntegrationsServiceBusArgs> serviceBus;

    /**
     * @return for Azure Service Bus. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsServiceBusArgs>> serviceBus() {
        return Optional.ofNullable(this.serviceBus);
    }

    /**
     * for Azure SQL. See Integration blocks below for details.
     * 
     */
    @Import(name="sql")
    private @Nullable Output<AzureIntegrationsSqlArgs> sql;

    /**
     * @return for Azure SQL. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsSqlArgs>> sql() {
        return Optional.ofNullable(this.sql);
    }

    /**
     * for SQL Managed. See Integration blocks below for details.
     * 
     */
    @Import(name="sqlManaged")
    private @Nullable Output<AzureIntegrationsSqlManagedArgs> sqlManaged;

    /**
     * @return for SQL Managed. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsSqlManagedArgs>> sqlManaged() {
        return Optional.ofNullable(this.sqlManaged);
    }

    /**
     * for Azure Storage. See Integration blocks below for details.
     * 
     */
    @Import(name="storage")
    private @Nullable Output<AzureIntegrationsStorageArgs> storage;

    /**
     * @return for Azure Storage. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsStorageArgs>> storage() {
        return Optional.ofNullable(this.storage);
    }

    /**
     * for Azure Virtual machine. See Integration blocks below for details.
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<AzureIntegrationsVirtualMachineArgs> virtualMachine;

    /**
     * @return for Azure Virtual machine. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsVirtualMachineArgs>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    /**
     * for Azure Virtual networks. See Integration blocks below for details.
     * 
     */
    @Import(name="virtualNetworks")
    private @Nullable Output<AzureIntegrationsVirtualNetworksArgs> virtualNetworks;

    /**
     * @return for Azure Virtual networks. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsVirtualNetworksArgs>> virtualNetworks() {
        return Optional.ofNullable(this.virtualNetworks);
    }

    /**
     * for Azure VMs. See Integration blocks below for details.
     * 
     */
    @Import(name="vms")
    private @Nullable Output<AzureIntegrationsVmsArgs> vms;

    /**
     * @return for Azure VMs. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsVmsArgs>> vms() {
        return Optional.ofNullable(this.vms);
    }

    /**
     * for Azure VPN Gateway. See Integration blocks below for details.
     * 
     */
    @Import(name="vpnGateway")
    private @Nullable Output<AzureIntegrationsVpnGatewayArgs> vpnGateway;

    /**
     * @return for Azure VPN Gateway. See Integration blocks below for details.
     * 
     */
    public Optional<Output<AzureIntegrationsVpnGatewayArgs>> vpnGateway() {
        return Optional.ofNullable(this.vpnGateway);
    }

    private AzureIntegrationsState() {}

    private AzureIntegrationsState(AzureIntegrationsState $) {
        this.accountId = $.accountId;
        this.apiManagement = $.apiManagement;
        this.appGateway = $.appGateway;
        this.appService = $.appService;
        this.containers = $.containers;
        this.cosmosDb = $.cosmosDb;
        this.costManagement = $.costManagement;
        this.dataFactory = $.dataFactory;
        this.eventHub = $.eventHub;
        this.expressRoute = $.expressRoute;
        this.firewalls = $.firewalls;
        this.frontDoor = $.frontDoor;
        this.functions = $.functions;
        this.keyVault = $.keyVault;
        this.linkedAccountId = $.linkedAccountId;
        this.loadBalancer = $.loadBalancer;
        this.logicApps = $.logicApps;
        this.machineLearning = $.machineLearning;
        this.mariaDb = $.mariaDb;
        this.mysql = $.mysql;
        this.postgresql = $.postgresql;
        this.powerBiDedicated = $.powerBiDedicated;
        this.redisCache = $.redisCache;
        this.serviceBus = $.serviceBus;
        this.sql = $.sql;
        this.sqlManaged = $.sqlManaged;
        this.storage = $.storage;
        this.virtualMachine = $.virtualMachine;
        this.virtualNetworks = $.virtualNetworks;
        this.vms = $.vms;
        this.vpnGateway = $.vpnGateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureIntegrationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureIntegrationsState $;

        public Builder() {
            $ = new AzureIntegrationsState();
        }

        public Builder(AzureIntegrationsState defaults) {
            $ = new AzureIntegrationsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param apiManagement Azure API Management. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder apiManagement(@Nullable Output<AzureIntegrationsApiManagementArgs> apiManagement) {
            $.apiManagement = apiManagement;
            return this;
        }

        /**
         * @param apiManagement Azure API Management. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder apiManagement(AzureIntegrationsApiManagementArgs apiManagement) {
            return apiManagement(Output.of(apiManagement));
        }

        /**
         * @param appGateway Azure App Gateway. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder appGateway(@Nullable Output<AzureIntegrationsAppGatewayArgs> appGateway) {
            $.appGateway = appGateway;
            return this;
        }

        /**
         * @param appGateway Azure App Gateway. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder appGateway(AzureIntegrationsAppGatewayArgs appGateway) {
            return appGateway(Output.of(appGateway));
        }

        /**
         * @param appService Azure App Service. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder appService(@Nullable Output<AzureIntegrationsAppServiceArgs> appService) {
            $.appService = appService;
            return this;
        }

        /**
         * @param appService Azure App Service. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder appService(AzureIntegrationsAppServiceArgs appService) {
            return appService(Output.of(appService));
        }

        /**
         * @param containers Azure Containers. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder containers(@Nullable Output<AzureIntegrationsContainersArgs> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers Azure Containers. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder containers(AzureIntegrationsContainersArgs containers) {
            return containers(Output.of(containers));
        }

        /**
         * @param cosmosDb Azure CosmosDB. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder cosmosDb(@Nullable Output<AzureIntegrationsCosmosDbArgs> cosmosDb) {
            $.cosmosDb = cosmosDb;
            return this;
        }

        /**
         * @param cosmosDb Azure CosmosDB. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder cosmosDb(AzureIntegrationsCosmosDbArgs cosmosDb) {
            return cosmosDb(Output.of(cosmosDb));
        }

        /**
         * @param costManagement Azure Cost Management. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder costManagement(@Nullable Output<AzureIntegrationsCostManagementArgs> costManagement) {
            $.costManagement = costManagement;
            return this;
        }

        /**
         * @param costManagement Azure Cost Management. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder costManagement(AzureIntegrationsCostManagementArgs costManagement) {
            return costManagement(Output.of(costManagement));
        }

        /**
         * @param dataFactory for Azure Data Factory. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dataFactory(@Nullable Output<AzureIntegrationsDataFactoryArgs> dataFactory) {
            $.dataFactory = dataFactory;
            return this;
        }

        /**
         * @param dataFactory for Azure Data Factory. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dataFactory(AzureIntegrationsDataFactoryArgs dataFactory) {
            return dataFactory(Output.of(dataFactory));
        }

        /**
         * @param eventHub for Azure Event Hub. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder eventHub(@Nullable Output<AzureIntegrationsEventHubArgs> eventHub) {
            $.eventHub = eventHub;
            return this;
        }

        /**
         * @param eventHub for Azure Event Hub. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder eventHub(AzureIntegrationsEventHubArgs eventHub) {
            return eventHub(Output.of(eventHub));
        }

        /**
         * @param expressRoute for Azure Express Route. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder expressRoute(@Nullable Output<AzureIntegrationsExpressRouteArgs> expressRoute) {
            $.expressRoute = expressRoute;
            return this;
        }

        /**
         * @param expressRoute for Azure Express Route. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder expressRoute(AzureIntegrationsExpressRouteArgs expressRoute) {
            return expressRoute(Output.of(expressRoute));
        }

        /**
         * @param firewalls for Azure Firewalls. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder firewalls(@Nullable Output<AzureIntegrationsFirewallsArgs> firewalls) {
            $.firewalls = firewalls;
            return this;
        }

        /**
         * @param firewalls for Azure Firewalls. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder firewalls(AzureIntegrationsFirewallsArgs firewalls) {
            return firewalls(Output.of(firewalls));
        }

        /**
         * @param frontDoor for Azure Front Door. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder frontDoor(@Nullable Output<AzureIntegrationsFrontDoorArgs> frontDoor) {
            $.frontDoor = frontDoor;
            return this;
        }

        /**
         * @param frontDoor for Azure Front Door. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder frontDoor(AzureIntegrationsFrontDoorArgs frontDoor) {
            return frontDoor(Output.of(frontDoor));
        }

        /**
         * @param functions for Azure Functions. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder functions(@Nullable Output<AzureIntegrationsFunctionsArgs> functions) {
            $.functions = functions;
            return this;
        }

        /**
         * @param functions for Azure Functions. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder functions(AzureIntegrationsFunctionsArgs functions) {
            return functions(Output.of(functions));
        }

        /**
         * @param keyVault for Azure Key Vault. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder keyVault(@Nullable Output<AzureIntegrationsKeyVaultArgs> keyVault) {
            $.keyVault = keyVault;
            return this;
        }

        /**
         * @param keyVault for Azure Key Vault. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder keyVault(AzureIntegrationsKeyVaultArgs keyVault) {
            return keyVault(Output.of(keyVault));
        }

        /**
         * @param linkedAccountId The ID of the linked Azure account in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder linkedAccountId(@Nullable Output<Integer> linkedAccountId) {
            $.linkedAccountId = linkedAccountId;
            return this;
        }

        /**
         * @param linkedAccountId The ID of the linked Azure account in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder linkedAccountId(Integer linkedAccountId) {
            return linkedAccountId(Output.of(linkedAccountId));
        }

        /**
         * @param loadBalancer for Azure Load Balancer. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<AzureIntegrationsLoadBalancerArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer for Azure Load Balancer. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(AzureIntegrationsLoadBalancerArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param logicApps for Azure Logic Apps. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder logicApps(@Nullable Output<AzureIntegrationsLogicAppsArgs> logicApps) {
            $.logicApps = logicApps;
            return this;
        }

        /**
         * @param logicApps for Azure Logic Apps. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder logicApps(AzureIntegrationsLogicAppsArgs logicApps) {
            return logicApps(Output.of(logicApps));
        }

        /**
         * @param machineLearning for Azure Machine Learning. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder machineLearning(@Nullable Output<AzureIntegrationsMachineLearningArgs> machineLearning) {
            $.machineLearning = machineLearning;
            return this;
        }

        /**
         * @param machineLearning for Azure Machine Learning. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder machineLearning(AzureIntegrationsMachineLearningArgs machineLearning) {
            return machineLearning(Output.of(machineLearning));
        }

        /**
         * @param mariaDb for Azure MariaDB. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder mariaDb(@Nullable Output<AzureIntegrationsMariaDbArgs> mariaDb) {
            $.mariaDb = mariaDb;
            return this;
        }

        /**
         * @param mariaDb for Azure MariaDB. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder mariaDb(AzureIntegrationsMariaDbArgs mariaDb) {
            return mariaDb(Output.of(mariaDb));
        }

        /**
         * @param mysql for Azure MySQL. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder mysql(@Nullable Output<AzureIntegrationsMysqlArgs> mysql) {
            $.mysql = mysql;
            return this;
        }

        /**
         * @param mysql for Azure MySQL. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder mysql(AzureIntegrationsMysqlArgs mysql) {
            return mysql(Output.of(mysql));
        }

        /**
         * @param postgresql for Azure PostgreSQL. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder postgresql(@Nullable Output<AzureIntegrationsPostgresqlArgs> postgresql) {
            $.postgresql = postgresql;
            return this;
        }

        /**
         * @param postgresql for Azure PostgreSQL. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder postgresql(AzureIntegrationsPostgresqlArgs postgresql) {
            return postgresql(Output.of(postgresql));
        }

        /**
         * @param powerBiDedicated for Azure Power BI Dedicated. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder powerBiDedicated(@Nullable Output<AzureIntegrationsPowerBiDedicatedArgs> powerBiDedicated) {
            $.powerBiDedicated = powerBiDedicated;
            return this;
        }

        /**
         * @param powerBiDedicated for Azure Power BI Dedicated. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder powerBiDedicated(AzureIntegrationsPowerBiDedicatedArgs powerBiDedicated) {
            return powerBiDedicated(Output.of(powerBiDedicated));
        }

        /**
         * @param redisCache for Azure Redis Cache. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder redisCache(@Nullable Output<AzureIntegrationsRedisCacheArgs> redisCache) {
            $.redisCache = redisCache;
            return this;
        }

        /**
         * @param redisCache for Azure Redis Cache. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder redisCache(AzureIntegrationsRedisCacheArgs redisCache) {
            return redisCache(Output.of(redisCache));
        }

        /**
         * @param serviceBus for Azure Service Bus. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder serviceBus(@Nullable Output<AzureIntegrationsServiceBusArgs> serviceBus) {
            $.serviceBus = serviceBus;
            return this;
        }

        /**
         * @param serviceBus for Azure Service Bus. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder serviceBus(AzureIntegrationsServiceBusArgs serviceBus) {
            return serviceBus(Output.of(serviceBus));
        }

        /**
         * @param sql for Azure SQL. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder sql(@Nullable Output<AzureIntegrationsSqlArgs> sql) {
            $.sql = sql;
            return this;
        }

        /**
         * @param sql for Azure SQL. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder sql(AzureIntegrationsSqlArgs sql) {
            return sql(Output.of(sql));
        }

        /**
         * @param sqlManaged for SQL Managed. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqlManaged(@Nullable Output<AzureIntegrationsSqlManagedArgs> sqlManaged) {
            $.sqlManaged = sqlManaged;
            return this;
        }

        /**
         * @param sqlManaged for SQL Managed. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqlManaged(AzureIntegrationsSqlManagedArgs sqlManaged) {
            return sqlManaged(Output.of(sqlManaged));
        }

        /**
         * @param storage for Azure Storage. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<AzureIntegrationsStorageArgs> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage for Azure Storage. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder storage(AzureIntegrationsStorageArgs storage) {
            return storage(Output.of(storage));
        }

        /**
         * @param virtualMachine for Azure Virtual machine. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(@Nullable Output<AzureIntegrationsVirtualMachineArgs> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        /**
         * @param virtualMachine for Azure Virtual machine. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(AzureIntegrationsVirtualMachineArgs virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        /**
         * @param virtualNetworks for Azure Virtual networks. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(@Nullable Output<AzureIntegrationsVirtualNetworksArgs> virtualNetworks) {
            $.virtualNetworks = virtualNetworks;
            return this;
        }

        /**
         * @param virtualNetworks for Azure Virtual networks. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(AzureIntegrationsVirtualNetworksArgs virtualNetworks) {
            return virtualNetworks(Output.of(virtualNetworks));
        }

        /**
         * @param vms for Azure VMs. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder vms(@Nullable Output<AzureIntegrationsVmsArgs> vms) {
            $.vms = vms;
            return this;
        }

        /**
         * @param vms for Azure VMs. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder vms(AzureIntegrationsVmsArgs vms) {
            return vms(Output.of(vms));
        }

        /**
         * @param vpnGateway for Azure VPN Gateway. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder vpnGateway(@Nullable Output<AzureIntegrationsVpnGatewayArgs> vpnGateway) {
            $.vpnGateway = vpnGateway;
            return this;
        }

        /**
         * @param vpnGateway for Azure VPN Gateway. See Integration blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder vpnGateway(AzureIntegrationsVpnGatewayArgs vpnGateway) {
            return vpnGateway(Output.of(vpnGateway));
        }

        public AzureIntegrationsState build() {
            return $;
        }
    }

}