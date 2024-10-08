```hcl
# Configure the New Relic provider
provider "newrelic" {
  account_id = <Your Account ID>
  api_key = <Your Personal API Key>    # usually prefixed with 'NRAK'
  region = "US"                        # Valid regions are US and EU
}
