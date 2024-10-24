```hcl
# Configure the New Relic provider
provider "newrelic" {
  account_id = 12345
  api_key = 12345    # usually prefixed with 'NRAK'
  region = "US"                        # Valid regions are US and EU
}
