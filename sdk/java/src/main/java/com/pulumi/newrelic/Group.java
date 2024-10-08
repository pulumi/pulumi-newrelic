// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.GroupArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.GroupState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The `newrelic.Group` resource facilitates creating, updating, and deleting groups in New Relic, while also enabling the addition and removal of users from these groups.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NewrelicFunctions;
 * import com.pulumi.newrelic.inputs.GetAuthenticationDomainArgs;
 * import com.pulumi.newrelic.Group;
 * import com.pulumi.newrelic.GroupArgs;
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
 *         final var foo = NewrelicFunctions.getAuthenticationDomain(GetAuthenticationDomainArgs.builder()
 *             .name("Test Authentication Domain")
 *             .build());
 * 
 *         var fooGroup = new Group("fooGroup", GroupArgs.builder()
 *             .name("Test Group")
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .userIds(            
 *                 "0001112222",
 *                 "2221110000")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Additional Examples
 * 
 * ### Addition of New Users to a New Group
 * 
 * The following example illustrates the creation of a group using the `newrelic.Group` resource, to which users created using the `newrelic.User` resource are added.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NewrelicFunctions;
 * import com.pulumi.newrelic.inputs.GetAuthenticationDomainArgs;
 * import com.pulumi.newrelic.User;
 * import com.pulumi.newrelic.UserArgs;
 * import com.pulumi.newrelic.Group;
 * import com.pulumi.newrelic.GroupArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var foo = NewrelicFunctions.getAuthenticationDomain(GetAuthenticationDomainArgs.builder()
 *             .name("Test Authentication Domain")
 *             .build());
 * 
 *         var fooUser = new User("fooUser", UserArgs.builder()
 *             .name("Test User One")
 *             .emailId("test_user_one}{@literal @}{@code test.com")
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .userType("CORE_USER_TIER")
 *             .build());
 * 
 *         var bar = new User("bar", UserArgs.builder()
 *             .name("Test User Two")
 *             .emailId("test_user_two}{@literal @}{@code test.com")
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .userType("BASIC_USER_TIER")
 *             .build());
 * 
 *         var fooGroup = new Group("fooGroup", GroupArgs.builder()
 *             .name("Test Group")
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .userIds(            
 *                 fooUser.id(),
 *                 bar.id())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Addition of Existing Users to a New Group
 * 
 * The following example demonstrates the usage of the `newrelic.Group` resource to create a group, wherein the `newrelic.User` data source is employed to associate existing users with the newly formed group.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NewrelicFunctions;
 * import com.pulumi.newrelic.inputs.GetAuthenticationDomainArgs;
 * import com.pulumi.newrelic.inputs.GetUserArgs;
 * import com.pulumi.newrelic.Group;
 * import com.pulumi.newrelic.GroupArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var foo = NewrelicFunctions.getAuthenticationDomain(GetAuthenticationDomainArgs.builder()
 *             .name("Test Authentication Domain")
 *             .build());
 * 
 *         final var fooGetUser = NewrelicFunctions.getUser(GetUserArgs.builder()
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .emailId("test_user_one}{@literal @}{@code test.com")
 *             .build());
 * 
 *         final var bar = NewrelicFunctions.getUser(GetUserArgs.builder()
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .name("Test User Two")
 *             .build());
 * 
 *         var fooGroup = new Group("fooGroup", GroupArgs.builder()
 *             .name("Test Group")
 *             .authenticationDomainId(foo.applyValue(getAuthenticationDomainResult -> getAuthenticationDomainResult.id()))
 *             .userIds(            
 *                 fooGetUser.applyValue(getUserResult -> getUserResult.id()),
 *                 bar.applyValue(getUserResult -> getUserResult.id()))
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **NOTE** Please note that the addition of users to groups is only possible when both the group and the users to be added to it belong to the _same authentication domain_. If the group being created and the users being added to it belong to different authentication domains, an error indicating `user not found` or an equivalent error will be thrown.
 * 
 * ## Import
 * 
 * A group can be imported using its ID. Example:
 * 
 * ```sh
 * $ pulumi import newrelic:index/group:Group foo &lt;group_id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/group:Group")
public class Group extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the authentication domain to which the group to be created would belong.
     * 
     */
    @Export(name="authenticationDomainId", refs={String.class}, tree="[0]")
    private Output<String> authenticationDomainId;

    /**
     * @return The ID of the authentication domain to which the group to be created would belong.
     * 
     */
    public Output<String> authenticationDomainId() {
        return this.authenticationDomainId;
    }
    /**
     * The name of the group to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the group to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of IDs of users to be included in the group to be created.
     * 
     * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     * 
     * &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing group is not supported.
     * 
     */
    @Export(name="userIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return A list of IDs of users to be included in the group to be created.
     * 
     * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     * 
     * &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing group is not supported.
     * 
     */
    public Output<Optional<List<String>>> userIds() {
        return Codegen.optional(this.userIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(java.lang.String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(java.lang.String name, GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(java.lang.String name, GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/group:Group", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Group(java.lang.String name, Output<java.lang.String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/group:Group", name, state, makeResourceOptions(options, id), false);
    }

    private static GroupArgs makeArgs(GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Group get(java.lang.String name, Output<java.lang.String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}
