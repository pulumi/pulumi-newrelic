# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from .. import utilities, tables

__config__ = pulumi.Config('newrelic')

api_key = utilities.require_with_default(lambda: __config__.require('apiKey'), utilities.get_env('NEWRELIC_API_KEY'))

api_url = __config__.get('apiUrl') or (utilities.get_env('NEWRELIC_API_URL') or 'https://api.newrelic.com/v2')

infra_api_url = __config__.get('infraApiUrl') or (utilities.get_env('NEWRELIC_INFRA_API_URL') or 'https://infra-api.newrelic.com/v2')

