# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AlertPolicyArgs', 'AlertPolicy']

@pulumi.input_type
class AlertPolicyArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 channel_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 incident_preference: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AlertPolicy resource.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] channel_ids: An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        :param pulumi.Input[str] incident_preference: The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        :param pulumi.Input[str] name: The name of the policy.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if channel_ids is not None:
            warnings.warn("""The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""", DeprecationWarning)
            pulumi.log.warn("""channel_ids is deprecated: The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""")
        if channel_ids is not None:
            pulumi.set(__self__, "channel_ids", channel_ids)
        if incident_preference is not None:
            pulumi.set(__self__, "incident_preference", incident_preference)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="channelIds")
    def channel_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        """
        warnings.warn("""The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""", DeprecationWarning)
        pulumi.log.warn("""channel_ids is deprecated: The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""")

        return pulumi.get(self, "channel_ids")

    @channel_ids.setter
    def channel_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "channel_ids", value)

    @property
    @pulumi.getter(name="incidentPreference")
    def incident_preference(self) -> Optional[pulumi.Input[str]]:
        """
        The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        """
        return pulumi.get(self, "incident_preference")

    @incident_preference.setter
    def incident_preference(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "incident_preference", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AlertPolicyState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 channel_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 incident_preference: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertPolicy resources.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] channel_ids: An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        :param pulumi.Input[str] incident_preference: The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        :param pulumi.Input[str] name: The name of the policy.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if channel_ids is not None:
            warnings.warn("""The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""", DeprecationWarning)
            pulumi.log.warn("""channel_ids is deprecated: The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""")
        if channel_ids is not None:
            pulumi.set(__self__, "channel_ids", channel_ids)
        if incident_preference is not None:
            pulumi.set(__self__, "incident_preference", incident_preference)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="channelIds")
    def channel_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        """
        warnings.warn("""The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""", DeprecationWarning)
        pulumi.log.warn("""channel_ids is deprecated: The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""")

        return pulumi.get(self, "channel_ids")

    @channel_ids.setter
    def channel_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "channel_ids", value)

    @property
    @pulumi.getter(name="incidentPreference")
    def incident_preference(self) -> Optional[pulumi.Input[str]]:
        """
        The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        """
        return pulumi.get(self, "incident_preference")

    @incident_preference.setter
    def incident_preference(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "incident_preference", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class AlertPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 channel_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 incident_preference: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create and manage New Relic alert policies.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertPolicy("foo", incident_preference="PER_POLICY")
        ```
        ### Provision multiple notification channels and add those channels to a policy

        The following arguments are supported:

          * `name` - (Required) The name of the policy.
          * `incident_preference` - (Optional) The rollup strategy for the policy, which can have one of the following values (the default value is `PER_POLICY`):
            * `PER_POLICY` - This sets the incident grouping preference of the policy to **One issue per policy**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-policy) for more details on this incident grouping preference.
            * `PER_CONDITION` - This sets the incident grouping preference of the policy to **One issue per condition**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-condition) for more details on this incident grouping preference.
            * `PER_CONDITION_AND_TARGET` - This sets the incident grouping preference of the policy to **One issue per condition and signal**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-signal) for more details on this incident grouping preference.
          * `channel_ids` - (Optional) **DEPRECATED** The `channel_ids` argument is deprecated and will be removed in the next major release of the provider. An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported via `pulumi import` (see Import for info).
          * `account_id` - (Optional) The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        ## Additional Examples

        ##### Provision multiple notification channels and add those channels to a policy
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        # Provision a Slack notification channel.
        slack_channel = newrelic.AlertChannel("slackChannel",
            type="slack",
            config=newrelic.AlertChannelConfigArgs(
                url="https://hooks.slack.com/services/xxxxxxx/yyyyyyyy",
                channel="example-alerts-channel",
            ))
        # Provision an email notification channel.
        email_channel = newrelic.AlertChannel("emailChannel",
            type="email",
            config=newrelic.AlertChannelConfigArgs(
                recipients="example@testing.com",
                include_json_attachment="1",
            ))
        # Provision the alert policy.
        policy_with_channels = newrelic.AlertPolicy("policyWithChannels",
            incident_preference="PER_CONDITION",
            channel_ids=[
                slack_channel.id,
                email_channel.id,
            ])
        ```

        ### Reference existing notification channels and add those channel to a policy
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        slack_channel = newrelic.get_alert_channel(name="slack-channel-notification")
        email_channel = newrelic.get_alert_channel(name="test@example.com")
        # Provision the alert policy.
        policy_with_channels = newrelic.AlertPolicy("policyWithChannels",
            incident_preference="PER_CONDITION",
            channel_ids=[
                slack_channel.id,
                email_channel.id,
            ])
        ```

        ## Import

        Alert policies can be imported using a composite ID of `<id>:<account_id>`, where `account_id` is the account number scoped to the alert policy resource.

        Example import:

        ```sh
         $ pulumi import newrelic:index/alertPolicy:AlertPolicy foo 23423556:4593020
        ```
         Please note that channel IDs (`channel_ids`) _cannot_ be imported due channels being a separate resource. However, to add channels to an imported alert policy, you can import the policy, add the `channel_ids` attribute with the associated channel IDs, then run `pulumi up`. This will result in the original alert policy being destroyed and a new alert policy being created along with the channels being added to the policy.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] channel_ids: An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        :param pulumi.Input[str] incident_preference: The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        :param pulumi.Input[str] name: The name of the policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AlertPolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create and manage New Relic alert policies.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertPolicy("foo", incident_preference="PER_POLICY")
        ```
        ### Provision multiple notification channels and add those channels to a policy

        The following arguments are supported:

          * `name` - (Required) The name of the policy.
          * `incident_preference` - (Optional) The rollup strategy for the policy, which can have one of the following values (the default value is `PER_POLICY`):
            * `PER_POLICY` - This sets the incident grouping preference of the policy to **One issue per policy**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-policy) for more details on this incident grouping preference.
            * `PER_CONDITION` - This sets the incident grouping preference of the policy to **One issue per condition**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-condition) for more details on this incident grouping preference.
            * `PER_CONDITION_AND_TARGET` - This sets the incident grouping preference of the policy to **One issue per condition and signal**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-signal) for more details on this incident grouping preference.
          * `channel_ids` - (Optional) **DEPRECATED** The `channel_ids` argument is deprecated and will be removed in the next major release of the provider. An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported via `pulumi import` (see Import for info).
          * `account_id` - (Optional) The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        ## Additional Examples

        ##### Provision multiple notification channels and add those channels to a policy
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        # Provision a Slack notification channel.
        slack_channel = newrelic.AlertChannel("slackChannel",
            type="slack",
            config=newrelic.AlertChannelConfigArgs(
                url="https://hooks.slack.com/services/xxxxxxx/yyyyyyyy",
                channel="example-alerts-channel",
            ))
        # Provision an email notification channel.
        email_channel = newrelic.AlertChannel("emailChannel",
            type="email",
            config=newrelic.AlertChannelConfigArgs(
                recipients="example@testing.com",
                include_json_attachment="1",
            ))
        # Provision the alert policy.
        policy_with_channels = newrelic.AlertPolicy("policyWithChannels",
            incident_preference="PER_CONDITION",
            channel_ids=[
                slack_channel.id,
                email_channel.id,
            ])
        ```

        ### Reference existing notification channels and add those channel to a policy
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        slack_channel = newrelic.get_alert_channel(name="slack-channel-notification")
        email_channel = newrelic.get_alert_channel(name="test@example.com")
        # Provision the alert policy.
        policy_with_channels = newrelic.AlertPolicy("policyWithChannels",
            incident_preference="PER_CONDITION",
            channel_ids=[
                slack_channel.id,
                email_channel.id,
            ])
        ```

        ## Import

        Alert policies can be imported using a composite ID of `<id>:<account_id>`, where `account_id` is the account number scoped to the alert policy resource.

        Example import:

        ```sh
         $ pulumi import newrelic:index/alertPolicy:AlertPolicy foo 23423556:4593020
        ```
         Please note that channel IDs (`channel_ids`) _cannot_ be imported due channels being a separate resource. However, to add channels to an imported alert policy, you can import the policy, add the `channel_ids` attribute with the associated channel IDs, then run `pulumi up`. This will result in the original alert policy being destroyed and a new alert policy being created along with the channels being added to the policy.

        :param str resource_name: The name of the resource.
        :param AlertPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 channel_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 incident_preference: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertPolicyArgs.__new__(AlertPolicyArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["channel_ids"] = channel_ids
            __props__.__dict__["incident_preference"] = incident_preference
            __props__.__dict__["name"] = name
        super(AlertPolicy, __self__).__init__(
            'newrelic:index/alertPolicy:AlertPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            channel_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            incident_preference: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'AlertPolicy':
        """
        Get an existing AlertPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] channel_ids: An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        :param pulumi.Input[str] incident_preference: The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        :param pulumi.Input[str] name: The name of the policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertPolicyState.__new__(_AlertPolicyState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["channel_ids"] = channel_ids
        __props__.__dict__["incident_preference"] = incident_preference
        __props__.__dict__["name"] = name
        return AlertPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="channelIds")
    def channel_ids(self) -> pulumi.Output[Optional[Sequence[int]]]:
        """
        An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        """
        warnings.warn("""The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""", DeprecationWarning)
        pulumi.log.warn("""channel_ids is deprecated: The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.""")

        return pulumi.get(self, "channel_ids")

    @property
    @pulumi.getter(name="incidentPreference")
    def incident_preference(self) -> pulumi.Output[Optional[str]]:
        """
        The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        """
        return pulumi.get(self, "incident_preference")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "name")

