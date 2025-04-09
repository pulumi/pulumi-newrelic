# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetTestGrokPatternResult',
    'AwaitableGetTestGrokPatternResult',
    'get_test_grok_pattern',
    'get_test_grok_pattern_output',
]

@pulumi.output_type
class GetTestGrokPatternResult:
    """
    A collection of values returned by getTestGrokPattern.
    """
    def __init__(__self__, account_id=None, grok=None, id=None, log_lines=None, test_groks=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if grok and not isinstance(grok, str):
            raise TypeError("Expected argument 'grok' to be a str")
        pulumi.set(__self__, "grok", grok)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if log_lines and not isinstance(log_lines, list):
            raise TypeError("Expected argument 'log_lines' to be a list")
        pulumi.set(__self__, "log_lines", log_lines)
        if test_groks and not isinstance(test_groks, list):
            raise TypeError("Expected argument 'test_groks' to be a list")
        pulumi.set(__self__, "test_groks", test_groks)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def grok(self) -> builtins.str:
        return pulumi.get(self, "grok")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="logLines")
    def log_lines(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "log_lines")

    @property
    @pulumi.getter(name="testGroks")
    def test_groks(self) -> Sequence['outputs.GetTestGrokPatternTestGrokResult']:
        """
        Nested attribute containing information about the test of Grok pattern against a list of log lines.
        """
        return pulumi.get(self, "test_groks")


class AwaitableGetTestGrokPatternResult(GetTestGrokPatternResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTestGrokPatternResult(
            account_id=self.account_id,
            grok=self.grok,
            id=self.id,
            log_lines=self.log_lines,
            test_groks=self.test_groks)


def get_test_grok_pattern(account_id: Optional[builtins.str] = None,
                          grok: Optional[builtins.str] = None,
                          log_lines: Optional[Sequence[builtins.str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTestGrokPatternResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    # Data source
    foo = newrelic.get_test_grok_pattern(grok="%{IP:host_ip}",
        log_lines=[
            "host_ip: 43.3.120.2",
            "bytes_received: 2048",
        ])
    ```


    :param builtins.str account_id: The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
    :param builtins.str grok: The Grok pattern to test.
    :param Sequence[builtins.str] log_lines: The log lines to test the Grok pattern against.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['grok'] = grok
    __args__['logLines'] = log_lines
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getTestGrokPattern:getTestGrokPattern', __args__, opts=opts, typ=GetTestGrokPatternResult).value

    return AwaitableGetTestGrokPatternResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        grok=pulumi.get(__ret__, 'grok'),
        id=pulumi.get(__ret__, 'id'),
        log_lines=pulumi.get(__ret__, 'log_lines'),
        test_groks=pulumi.get(__ret__, 'test_groks'))
def get_test_grok_pattern_output(account_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 grok: Optional[pulumi.Input[builtins.str]] = None,
                                 log_lines: Optional[pulumi.Input[Sequence[builtins.str]]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTestGrokPatternResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    # Data source
    foo = newrelic.get_test_grok_pattern(grok="%{IP:host_ip}",
        log_lines=[
            "host_ip: 43.3.120.2",
            "bytes_received: 2048",
        ])
    ```


    :param builtins.str account_id: The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
    :param builtins.str grok: The Grok pattern to test.
    :param Sequence[builtins.str] log_lines: The log lines to test the Grok pattern against.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['grok'] = grok
    __args__['logLines'] = log_lines
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('newrelic:index/getTestGrokPattern:getTestGrokPattern', __args__, opts=opts, typ=GetTestGrokPatternResult)
    return __ret__.apply(lambda __response__: GetTestGrokPatternResult(
        account_id=pulumi.get(__response__, 'account_id'),
        grok=pulumi.get(__response__, 'grok'),
        id=pulumi.get(__response__, 'id'),
        log_lines=pulumi.get(__response__, 'log_lines'),
        test_groks=pulumi.get(__response__, 'test_groks')))
