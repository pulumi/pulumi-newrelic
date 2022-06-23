# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GcpLinkAccountArgs', 'GcpLinkAccount']

@pulumi.input_type
class GcpLinkAccountArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GcpLinkAccount resource.
        :param pulumi.Input[str] project_id: - Project ID of the GCP account.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic account.
        :param pulumi.Input[str] name: - The name of the GCP account in New Relic.
        """
        pulumi.set(__self__, "project_id", project_id)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        - Project ID of the GCP account.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        - Account ID of the New Relic account.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        - The name of the GCP account in New Relic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GcpLinkAccountState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GcpLinkAccount resources.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic account.
        :param pulumi.Input[str] name: - The name of the GCP account in New Relic.
        :param pulumi.Input[str] project_id: - Project ID of the GCP account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        - Account ID of the New Relic account.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        - The name of the GCP account in New Relic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        - Project ID of the GCP account.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


class GcpLinkAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Linked GCP accounts can be imported using `id`, you can find the `id` of an existing GCP linked accounts in GCP dashboard under Infrastructure in Newrelic Console. bash

        ```sh
         $ pulumi import newrelic:cloud/gcpLinkAccount:GcpLinkAccount newrelic_cloud_gcp_link_account.foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic account.
        :param pulumi.Input[str] name: - The name of the GCP account in New Relic.
        :param pulumi.Input[str] project_id: - Project ID of the GCP account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GcpLinkAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Linked GCP accounts can be imported using `id`, you can find the `id` of an existing GCP linked accounts in GCP dashboard under Infrastructure in Newrelic Console. bash

        ```sh
         $ pulumi import newrelic:cloud/gcpLinkAccount:GcpLinkAccount newrelic_cloud_gcp_link_account.foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param GcpLinkAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GcpLinkAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GcpLinkAccountArgs.__new__(GcpLinkAccountArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["name"] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
        super(GcpLinkAccount, __self__).__init__(
            'newrelic:cloud/gcpLinkAccount:GcpLinkAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'GcpLinkAccount':
        """
        Get an existing GcpLinkAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic account.
        :param pulumi.Input[str] name: - The name of the GCP account in New Relic.
        :param pulumi.Input[str] project_id: - Project ID of the GCP account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GcpLinkAccountState.__new__(_GcpLinkAccountState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["name"] = name
        __props__.__dict__["project_id"] = project_id
        return GcpLinkAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        - Account ID of the New Relic account.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        - The name of the GCP account in New Relic.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        - Project ID of the GCP account.
        """
        return pulumi.get(self, "project_id")

