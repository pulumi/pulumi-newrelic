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
    def __init__(__self__, account_id=None, application_id=None, domain=None, entity_tags=None, guid=None, id=None, ignore_case=None, ignore_not_found=None, name=None, serving_apm_application_id=None, tags=None, type=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if application_id and not isinstance(application_id, str):
            raise TypeError("Expected argument 'application_id' to be a str")
        pulumi.set(__self__, "application_id", application_id)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if entity_tags and not isinstance(entity_tags, str):
            raise TypeError("Expected argument 'entity_tags' to be a str")
        pulumi.set(__self__, "entity_tags", entity_tags)
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
        if serving_apm_application_id and not isinstance(serving_apm_application_id, str):
            raise TypeError("Expected argument 'serving_apm_application_id' to be a str")
        pulumi.set(__self__, "serving_apm_application_id", serving_apm_application_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> str:
        """
        The domain-specific application ID of the entity. Only returned for APM and Browser applications.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="entityTags")
    def entity_tags(self) -> str:
        """
        A JSON-encoded string, comprising tags associated with the entity fetched.
        * See the **Additional Examples** section below, for an illustration depicting the usage of `jsondecode` with the attribute `entity_tags`, to get the tags associated with the entity fetched.
        """
        return pulumi.get(self, "entity_tags")

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
    def serving_apm_application_id(self) -> str:
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
            entity_tags=self.entity_tags,
            guid=self.guid,
            id=self.id,
            ignore_case=self.ignore_case,
            ignore_not_found=self.ignore_not_found,
            name=self.name,
            serving_apm_application_id=self.serving_apm_application_id,
            tags=self.tags,
            type=self.type)


def get_entity(account_id: Optional[str] = None,
               domain: Optional[str] = None,
               entity_tags: Optional[str] = None,
               ignore_case: Optional[bool] = None,
               ignore_not_found: Optional[bool] = None,
               name: Optional[str] = None,
               tags: Optional[Sequence[Union['GetEntityTagArgs', 'GetEntityTagArgsDict']]] = None,
               type: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEntityResult:
    """
    Use this data source to access information about an existing resource.

    :param str account_id: The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
    :param str domain: The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
    :param str entity_tags: A JSON-encoded string, comprising tags associated with the entity fetched.
           * See the **Additional Examples** section below, for an illustration depicting the usage of `jsondecode` with the attribute `entity_tags`, to get the tags associated with the entity fetched.
    :param bool ignore_case: Ignore case of the `name` when searching for the entity. Defaults to false.
    :param bool ignore_not_found: A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
           
           > **WARNING:** Setting the `ignore_not_found` argument to `true` will display an 'entity not found' warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
    :param str name: The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
    :param Sequence[Union['GetEntityTagArgs', 'GetEntityTagArgsDict']] tags: A tag applied to the entity. See Nested tag blocks below for details.
    :param str type: The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['domain'] = domain
    __args__['entityTags'] = entity_tags
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
        entity_tags=pulumi.get(__ret__, 'entity_tags'),
        guid=pulumi.get(__ret__, 'guid'),
        id=pulumi.get(__ret__, 'id'),
        ignore_case=pulumi.get(__ret__, 'ignore_case'),
        ignore_not_found=pulumi.get(__ret__, 'ignore_not_found'),
        name=pulumi.get(__ret__, 'name'),
        serving_apm_application_id=pulumi.get(__ret__, 'serving_apm_application_id'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_entity)
def get_entity_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                      domain: Optional[pulumi.Input[Optional[str]]] = None,
                      entity_tags: Optional[pulumi.Input[Optional[str]]] = None,
                      ignore_case: Optional[pulumi.Input[Optional[bool]]] = None,
                      ignore_not_found: Optional[pulumi.Input[Optional[bool]]] = None,
                      name: Optional[pulumi.Input[str]] = None,
                      tags: Optional[pulumi.Input[Optional[Sequence[Union['GetEntityTagArgs', 'GetEntityTagArgsDict']]]]] = None,
                      type: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEntityResult]:
    """
    Use this data source to access information about an existing resource.

    :param str account_id: The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
    :param str domain: The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
    :param str entity_tags: A JSON-encoded string, comprising tags associated with the entity fetched.
           * See the **Additional Examples** section below, for an illustration depicting the usage of `jsondecode` with the attribute `entity_tags`, to get the tags associated with the entity fetched.
    :param bool ignore_case: Ignore case of the `name` when searching for the entity. Defaults to false.
    :param bool ignore_not_found: A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
           
           > **WARNING:** Setting the `ignore_not_found` argument to `true` will display an 'entity not found' warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
    :param str name: The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
    :param Sequence[Union['GetEntityTagArgs', 'GetEntityTagArgsDict']] tags: A tag applied to the entity. See Nested tag blocks below for details.
    :param str type: The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
    """
    ...
