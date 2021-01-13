# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['ApiAccessKey']


class ApiAccessKey(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 ingest_type: Optional[pulumi.Input[str]] = None,
                 key_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Use this resource to programmatically create and manage the following types of keys:
        - [User API keys](https://docs.newrelic.co/docs/apis/get-started/intro-apis/types-new-relic-api-keys#user-api-key)
        - License (or ingest) keys, including:
            - General [license key](https://docs.newrelic.co/docs/accounts/install-new-relic/account-setup/license-key) used for APM
            - [Browser license key](https://docs.newrelic.co/docs/browser/new-relic-browser/configuration/copy-browser-monitoring-license-key-app-id)

        Please visit the New Relic article ['Use NerdGraph to manage license keys and User API keys'](https://docs.newrelic.com/docs/apis/nerdgraph/examples/use-nerdgraph-manage-license-keys-user-keys)
        for more information.

        > **IMPORTANT!**
        Please be very careful when updating existing `ApiAccessKey` resources as only `newrelic_api_access_key.name`
        and `newrelic_api_access_key.notes` are updatable. All other resource attributes will force a resource recreation which will
        invalidate the previous API key(s).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foobar = newrelic.ApiAccessKey("foobar",
            account_id=1234567,
            ingest_type="LICENSE",
            key_type="INGEST",
            notes="To be used with service X")
        ```

        ## Import

        Existing API access keys can be imported using a composite ID of `<api_access_key_id>:<key_type>`. `<key_type>` will be either `INGEST` or `USER`. For example

        ```sh
         $ pulumi import newrelic:index/apiAccessKey:ApiAccessKey foobar "1234567:INGEST"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The New Relic account ID of the account you wish to create the API access key.
        :param pulumi.Input[str] ingest_type: Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
        :param pulumi.Input[str] key_type: What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
        :param pulumi.Input[str] name: The name of the key.
        :param pulumi.Input[str] notes: Any notes about this ingest key.
        :param pulumi.Input[int] user_id: Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__['account_id'] = account_id
            __props__['ingest_type'] = ingest_type
            if key_type is None and not opts.urn:
                raise TypeError("Missing required property 'key_type'")
            __props__['key_type'] = key_type
            __props__['name'] = name
            __props__['notes'] = notes
            __props__['user_id'] = user_id
            __props__['key'] = None
        super(ApiAccessKey, __self__).__init__(
            'newrelic:index/apiAccessKey:ApiAccessKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            ingest_type: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            key_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notes: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[int]] = None) -> 'ApiAccessKey':
        """
        Get an existing ApiAccessKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The New Relic account ID of the account you wish to create the API access key.
        :param pulumi.Input[str] ingest_type: Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
        :param pulumi.Input[str] key: The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
        :param pulumi.Input[str] key_type: What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
        :param pulumi.Input[str] name: The name of the key.
        :param pulumi.Input[str] notes: Any notes about this ingest key.
        :param pulumi.Input[int] user_id: Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["account_id"] = account_id
        __props__["ingest_type"] = ingest_type
        __props__["key"] = key
        __props__["key_type"] = key_type
        __props__["name"] = name
        __props__["notes"] = notes
        __props__["user_id"] = user_id
        return ApiAccessKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The New Relic account ID of the account you wish to create the API access key.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="ingestType")
    def ingest_type(self) -> pulumi.Output[str]:
        """
        Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
        """
        return pulumi.get(self, "ingest_type")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Output[str]:
        """
        What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
        """
        return pulumi.get(self, "key_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the key.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notes(self) -> pulumi.Output[str]:
        """
        Any notes about this ingest key.
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[int]:
        """
        Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
        """
        return pulumi.get(self, "user_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

