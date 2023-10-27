// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.ApiAccessKeyArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.ApiAccessKeyState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Use this resource to programmatically create and manage the following types of keys:
 * - [User API keys](https://docs.newrelic.com/docs/apis/get-started/intro-apis/types-new-relic-api-keys#user-api-key)
 * - License (or ingest) keys, including:
 *     - General [license key](https://docs.newrelic.com/docs/accounts/install-new-relic/account-setup/license-key) used for APM
 *     - [Browser license key](https://docs.newrelic.com/docs/browser/new-relic-browser/configuration/copy-browser-monitoring-license-key-app-id)
 * 
 * Please visit the New Relic article [&#39;Use NerdGraph to manage license keys and User API keys&#39;](https://docs.newrelic.com/docs/apis/nerdgraph/examples/use-nerdgraph-manage-license-keys-user-keys)
 * for more information.
 * 
 * &gt; **IMPORTANT!**
 * Please be very careful when updating existing `newrelic.ApiAccessKey` resources as only `newrelic_api_access_key.name`
 * and `newrelic_api_access_key.notes` are updatable. All other resource attributes will force a resource recreation which will
 * invalidate the previous API key(s).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.ApiAccessKey;
 * import com.pulumi.newrelic.ApiAccessKeyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foobar = new ApiAccessKey(&#34;foobar&#34;, ApiAccessKeyArgs.builder()        
 *             .accountId(1234567)
 *             .ingestType(&#34;LICENSE&#34;)
 *             .keyType(&#34;INGEST&#34;)
 *             .notes(&#34;To be used with service X&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **WARNING:** Creating &#39;Ingest - License&#39; and &#39;Ingest - Browser&#39; keys using this resource is restricted to &#39;core&#39; or &#39;full platform&#39; New Relic user accounts. If you&#39;ve signed up as a &#39;basic&#39; user with New Relic, or have been added as a &#39;basic&#39; user to your organization on New Relic, you would not be able to use your account to create &#39;Ingest&#39; keys. If you see the message `&#34;You do not have permission to create this key&#34;` in the response of the API called by this resource, it could be owing to the aforementioned. For more insights into user account types on New Relic and associated privileges, please check out this [page](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/user-type/#api-access).
 * 
 * ## Import
 * 
 * Existing API access keys can be imported using a composite ID of `&lt;api_access_key_id&gt;:&lt;key_type&gt;`. `&lt;key_type&gt;` will be either `INGEST` or `USER`.
 * 
 * For example:
 * 
 * ```sh
 *  $ pulumi import newrelic:index/apiAccessKey:ApiAccessKey foobar &#34;1234567:INGEST&#34;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/apiAccessKey:ApiAccessKey")
public class ApiAccessKey extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID of the account you wish to create the API access key.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID of the account you wish to create the API access key.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     * 
     */
    @Export(name="ingestType", refs={String.class}, tree="[0]")
    private Output<String> ingestType;

    /**
     * @return Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     * 
     */
    public Output<String> ingestType() {
        return this.ingestType;
    }
    /**
     * The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     * 
     */
    @Export(name="keyType", refs={String.class}, tree="[0]")
    private Output<String> keyType;

    /**
     * @return What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     * 
     */
    public Output<String> keyType() {
        return this.keyType;
    }
    /**
     * The name of the key.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Any notes about this ingest key.
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output<String> notes;

    /**
     * @return Any notes about this ingest key.
     * 
     */
    public Output<String> notes() {
        return this.notes;
    }
    /**
     * Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     * 
     */
    @Export(name="userId", refs={Integer.class}, tree="[0]")
    private Output<Integer> userId;

    /**
     * @return Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     * 
     */
    public Output<Integer> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiAccessKey(String name) {
        this(name, ApiAccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiAccessKey(String name, ApiAccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiAccessKey(String name, ApiAccessKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/apiAccessKey:ApiAccessKey", name, args == null ? ApiAccessKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiAccessKey(String name, Output<String> id, @Nullable ApiAccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/apiAccessKey:ApiAccessKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "key"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiAccessKey get(String name, Output<String> id, @Nullable ApiAccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiAccessKey(name, id, state, options);
    }
}
