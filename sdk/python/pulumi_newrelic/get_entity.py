# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetEntityResult',
    'AwaitableGetEntityResult',
    'get_entity',
    'get_entity_output',
]

@pulumi.output_type
class GetEntityResult:
    """
    A collection of values returned by getEntity.
    """
    def __init__(__self__, account_id=None, application_id=None, domain=None, guid=None, id=None, ignore_case=None, ignore_not_found=None, name=None, serving_apm_application_id=None, tags=None, type=None):
        if account_id and not isinstance(account_id, int):
            raise TypeError("Expected argument 'account_id' to be a int")
        pulumi.set(__self__, "account_id", account_id)
        if application_id and not isinstance(application_id, int):
            raise TypeError("Expected argument 'application_id' to be a int")
        pulumi.set(__self__, "application_id", application_id)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if guid and not isinstance(guid, str):
            raise TypeError("Expected argument 'guid' to be a str")
        pulumi.set(__self__, "guid", guid)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ignore_case and not isinstance(ignore_case, bool):
            raise TypeError("Expected argument 'ignore_case' to be a bool")
        pulumi.set(__self__, "ignore_case", ignore_case)
        if ignore_not_found and not isinstance(ignore_not_found, bool):
            raise TypeError("Expected argument 'ignore_not_found' to be a bool")
        pulumi.set(__self__, "ignore_not_found", ignore_not_found)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if serving_apm_application_id and not isinstance(serving_apm_application_id, int):
            raise TypeError("Expected argument 'serving_apm_application_id' to be a int")
        pulumi.set(__self__, "serving_apm_application_id", serving_apm_application_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> int:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> int:
        """
        The domain-specific application ID of the entity. Only returned for APM and Browser applications.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def guid(self) -> str:
        """
        The unique GUID of the entity.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ignoreCase")
    def ignore_case(self) -> Optional[bool]:
        return pulumi.get(self, "ignore_case")

    @property
    @pulumi.getter(name="ignoreNotFound")
    def ignore_not_found(self) -> Optional[bool]:
        return pulumi.get(self, "ignore_not_found")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="servingApmApplicationId")
    def serving_apm_application_id(self) -> int:
        """
        The browser-specific ID of the backing APM entity. Only returned for Browser applications.
        """
        return pulumi.get(self, "serving_apm_application_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Sequence['outputs.GetEntityTagResult']]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetEntityResult(GetEntityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEntityResult(
            account_id=self.account_id,
            application_id=self.application_id,
            domain=self.domain,
            guid=self.guid,
            id=self.id,
            ignore_case=self.ignore_case,
            ignore_not_found=self.ignore_not_found,
            name=self.name,
            serving_apm_application_id=self.serving_apm_application_id,
            tags=self.tags,
            type=self.type)


def get_entity(account_id: Optional[int] = None,
               domain: Optional[str] = None,
               ignore_case: Optional[bool] = None,
               ignore_not_found: Optional[bool] = None,
               name: Optional[str] = None,
               tags: Optional[Sequence[pulumi.InputType['GetEntityTagArgs']]] = None,
               type: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEntityResult:
    """
    Use this data source to get information about a specific entity in New Relic One that already exists.

    ### Example: Filter By Account ID

    The default behaviour of this data source is to retrieve entities matching the specified parameters (such as `name`, `domain`, `type`) from NerdGraph with the credentials specified in the configuration of the provider (account ID and API Key), filter them by the account ID specified in the configuration of the provider, and return the first match.

    This would mean, if no entity with the specified search parameters is found associated with the account ID in the configuration of the provider, i.e. `NEW_RELIC_ACCOUNT_ID`, an error is thrown, stating that no matching entity has been found.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    # The entity returned by this configuration would have to 
    # belong to the account_id specified in the provider 
    # configuration, i.e. NEW_RELIC_ACCOUNT_ID.
    app = newrelic.get_entity(name="my-app",
        domain="APM",
        type="APPLICATION")
    ```
    <!--End PulumiCodeChooser -->
    However, in order to cater to scenarios in which it could be necessary to retrieve an entity belonging to a subaccount using the account ID and API Key of the parent account (for instance, when entities with identical names are present in both the parent account and subaccounts, since matching entities from subaccounts too are returned by NerdGraph), the `account_id` attribute of this data source may be availed. This ensures that the account ID in the configuration of the provider, used to filter entities returned by the API is now overridden by the `account_id` specified in the configuration; i.e., in the below example, the data source would now return an entity matching the specified `name`, belonging to the account with the ID `account_id`.
    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    # The entity returned by this configuration, unlike in 
    # the above example, would have to belong to the account_id 
    # specified in the configuration below, i.e. 654321.
    app = newrelic.get_entity(name="my-app",
        account_id=654321,
        domain="APM",
        type="APPLICATION")
    ```
    <!--End PulumiCodeChooser -->
    The following example explains a use case along the lines of the aforementioned; using the `account_id` argument in the data source to allow the filtering criteria to be the `account_id` specified (of the subaccount), and not the account ID in the provider configuration.

    In simpler terms, when entities are queried from the parent account, entities with matching names are returned from subaccounts too, hence, specifying the `account_id` of the subaccount in the configuration allows the entity returned to belong to the subaccount with `account_id`.
    ### Query for an OTEL entity

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    app = newrelic.get_entity(name="my-otel-app",
        domain="EXT",
        type="SERVICE",
        tags=[newrelic.GetEntityTagArgs(
            key="accountID",
            value="12345",
        )])
    ```
    <!--End PulumiCodeChooser -->

    ### Query for an entity by type (AWS Lambda entity in this example)

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    app = newrelic.get_entity(name="my_lambda_trace",
        type="AWSLAMBDAFUNCTION")
    ```
    <!--End PulumiCodeChooser -->


    :param int account_id: The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
    :param str domain: The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
    :param bool ignore_case: Ignore case of the `name` when searching for the entity. Defaults to false.
    :param bool ignore_not_found: A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
           
           > **WARNING:** Setting the `ignore_not_found` argument to `true` will display an 'entity not found' warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
    :param str name: The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
    :param Sequence[pulumi.InputType['GetEntityTagArgs']] tags: A tag applied to the entity. See Nested tag blocks below for details.
    :param str type: The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['domain'] = domain
    __args__['ignoreCase'] = ignore_case
    __args__['ignoreNotFound'] = ignore_not_found
    __args__['name'] = name
    __args__['tags'] = tags
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getEntity:getEntity', __args__, opts=opts, typ=GetEntityResult).value

    return AwaitableGetEntityResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        application_id=pulumi.get(__ret__, 'application_id'),
        domain=pulumi.get(__ret__, 'domain'),
        guid=pulumi.get(__ret__, 'guid'),
        id=pulumi.get(__ret__, 'id'),
        ignore_case=pulumi.get(__ret__, 'ignore_case'),
        ignore_not_found=pulumi.get(__ret__, 'ignore_not_found'),
        name=pulumi.get(__ret__, 'name'),
        serving_apm_application_id=pulumi.get(__ret__, 'serving_apm_application_id'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_entity)
def get_entity_output(account_id: Optional[pulumi.Input[Optional[int]]] = None,
                      domain: Optional[pulumi.Input[Optional[str]]] = None,
                      ignore_case: Optional[pulumi.Input[Optional[bool]]] = None,
                      ignore_not_found: Optional[pulumi.Input[Optional[bool]]] = None,
                      name: Optional[pulumi.Input[str]] = None,
                      tags: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetEntityTagArgs']]]]] = None,
                      type: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEntityResult]:
    """
    Use this data source to get information about a specific entity in New Relic One that already exists.

    ### Example: Filter By Account ID

    The default behaviour of this data source is to retrieve entities matching the specified parameters (such as `name`, `domain`, `type`) from NerdGraph with the credentials specified in the configuration of the provider (account ID and API Key), filter them by the account ID specified in the configuration of the provider, and return the first match.

    This would mean, if no entity with the specified search parameters is found associated with the account ID in the configuration of the provider, i.e. `NEW_RELIC_ACCOUNT_ID`, an error is thrown, stating that no matching entity has been found.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    # The entity returned by this configuration would have to 
    # belong to the account_id specified in the provider 
    # configuration, i.e. NEW_RELIC_ACCOUNT_ID.
    app = newrelic.get_entity(name="my-app",
        domain="APM",
        type="APPLICATION")
    ```
    <!--End PulumiCodeChooser -->
    However, in order to cater to scenarios in which it could be necessary to retrieve an entity belonging to a subaccount using the account ID and API Key of the parent account (for instance, when entities with identical names are present in both the parent account and subaccounts, since matching entities from subaccounts too are returned by NerdGraph), the `account_id` attribute of this data source may be availed. This ensures that the account ID in the configuration of the provider, used to filter entities returned by the API is now overridden by the `account_id` specified in the configuration; i.e., in the below example, the data source would now return an entity matching the specified `name`, belonging to the account with the ID `account_id`.
    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    # The entity returned by this configuration, unlike in 
    # the above example, would have to belong to the account_id 
    # specified in the configuration below, i.e. 654321.
    app = newrelic.get_entity(name="my-app",
        account_id=654321,
        domain="APM",
        type="APPLICATION")
    ```
    <!--End PulumiCodeChooser -->
    The following example explains a use case along the lines of the aforementioned; using the `account_id` argument in the data source to allow the filtering criteria to be the `account_id` specified (of the subaccount), and not the account ID in the provider configuration.

    In simpler terms, when entities are queried from the parent account, entities with matching names are returned from subaccounts too, hence, specifying the `account_id` of the subaccount in the configuration allows the entity returned to belong to the subaccount with `account_id`.
    ### Query for an OTEL entity

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    app = newrelic.get_entity(name="my-otel-app",
        domain="EXT",
        type="SERVICE",
        tags=[newrelic.GetEntityTagArgs(
            key="accountID",
            value="12345",
        )])
    ```
    <!--End PulumiCodeChooser -->

    ### Query for an entity by type (AWS Lambda entity in this example)

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    app = newrelic.get_entity(name="my_lambda_trace",
        type="AWSLAMBDAFUNCTION")
    ```
    <!--End PulumiCodeChooser -->


    :param int account_id: The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
    :param str domain: The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
    :param bool ignore_case: Ignore case of the `name` when searching for the entity. Defaults to false.
    :param bool ignore_not_found: A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
           
           > **WARNING:** Setting the `ignore_not_found` argument to `true` will display an 'entity not found' warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
    :param str name: The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
    :param Sequence[pulumi.InputType['GetEntityTagArgs']] tags: A tag applied to the entity. See Nested tag blocks below for details.
    :param str type: The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
    """
    ...
