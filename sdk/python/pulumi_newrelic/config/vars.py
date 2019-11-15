# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

__config__ = pulumi.Config('newrelic')

api_key = __config__.get('apiKey') or utilities.get_env('NEWRELIC_API_KEY')

api_url = __config__.get('apiUrl') or (utilities.get_env('NEWRELIC_API_URL') or 'https://api.newrelic.com/v2')

cacert_file = __config__.get('cacertFile')

infra_api_url = __config__.get('infraApiUrl') or (utilities.get_env('NEWRELIC_INFRA_API_URL') or 'https://infra-api.newrelic.com/v2')

insecure_skip_verify = __config__.get('insecureSkipVerify')

