// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.NotificationChannelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.NotificationChannelState;
import com.pulumi.newrelic.outputs.NotificationChannelProperty;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic notification channels. Details regarding supported products and permissions can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/notifications/destinations).
 * 
 * A channel is an entity that is used to configure notifications. It is also called a message template. It is a separate entity from workflows, but a channel is required in order to create a workflow.
 * 
 * ## Example Usage
 * 
 * ##### [Webhook](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#webhook)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("webhook-example")
 *             .type("WEBHOOK")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key("payload")
 *                 .value("name: {{ foo }}")
 *                 .label("Payload Template")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * See additional examples.
 * 
 * ## Additional Examples
 * 
 * &gt; **NOTE:** We support all properties. The mentioned properties are just an example.
 * 
 * ##### [ServiceNow](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#servicenow)
 * To see the properties’ keys for your account, check ServiceNow incidents table.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("servicenow-incident-example")
 *             .type("SERVICENOW_INCIDENTS")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("description")
 *                     .value("General description")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("short_description")
 *                     .value("Short description")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ##### [ServiceNowApp](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#servicenowapp)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("servicenow-app-example")
 *             .type("SERVICE_NOW_APP")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ##### [Email](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#email)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("email-example")
 *             .type("EMAIL")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("subject")
 *                     .value("New Subject Title")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("customDetailsEmail")
 *                     .value("issue id - {{issueId}}")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ##### [Jira Classic](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#jira)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("jira-example")
 *             .type("JIRA_CLASSIC")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("ERROR_TRACKING")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("project")
 *                     .value("10000")
 *                     .label("Project-Name")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("issuetype")
 *                     .value("10004")
 *                     .label("Bug")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("description")
 *                     .value("Issue ID: {{ issueId }}")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("summary")
 *                     .value("{{ annotations.title.[0] }}")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ##### [PagerDuty with account integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("pagerduty-account-example")
 *             .type("PAGERDUTY_ACCOUNT_INTEGRATION")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("summary")
 *                     .value("General summary")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("service")
 *                     .label("Service Name")
 *                     .value("PTQK3FM")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("email")
 *                     .value("example}{@literal @}{@code email.com")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("customDetails")
 *                     .value("""
 * }{{@code
 * "id":}{{{@code json issueId}}}{@code ,
 * "IssueURL":}{{{@code json issuePageUrl}}}{@code ,
 * "NewRelic priority":}{{{@code json priority}}}{@code ,
 * "Total Incidents":}{{{@code json totalIncidents}}}{@code ,
 * "Impacted Entities":"}{{{@code #each entitiesData.names}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Runbook":"}{{{@code #each accumulations.runbookUrl}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Description":"}{{{@code #each annotations.description}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "isCorrelated":}{{{@code json isCorrelated}}}{@code ,
 * "Alert Policy Names":"}{{{@code #each accumulations.policyName}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Alert Condition Names":"}{{{@code #each accumulations.conditionName}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Workflow Name":}{{{@code json workflowName}}}{@code
 * }}{@code
 *                     """)
 *                     .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ##### [PagerDuty with service integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("pagerduty-account-example")
 *             .type("PAGERDUTY_SERVICE_INTEGRATION")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("summary")
 *                     .value("General summary")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("customDetails")
 *                     .value("""
 * }{{@code
 * "id":}{{{@code json issueId}}}{@code ,
 * "IssueURL":}{{{@code json issuePageUrl}}}{@code ,
 * "NewRelic priority":}{{{@code json priority}}}{@code ,
 * "Total Incidents":}{{{@code json totalIncidents}}}{@code ,
 * "Impacted Entities":"}{{{@code #each entitiesData.names}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Runbook":"}{{{@code #each accumulations.runbookUrl}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Description":"}{{{@code #each annotations.description}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "isCorrelated":}{{{@code json isCorrelated}}}{@code ,
 * "Alert Policy Names":"}{{{@code #each accumulations.policyName}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Alert Condition Names":"}{{{@code #each accumulations.conditionName}}}{{{@code this}}}{{{@code #unless }{@literal @}{@code last}}}{@code , }{{{@code /unless}}}{{{@code /each}}}{@code ",
 * "Workflow Name":}{{{@code json workflowName}}}{@code
 * }}{@code
 *                     """)
 *                     .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * #### Mobile Push
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("mobile-push-example")
 *             .type("MOBILE_PUSH")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * #### [AWS Event Bridge](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#eventBridge)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("event-bridge-example")
 *             .type("EVENT_BRIDGE")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("eventSource")
 *                     .value("aws.partner/mydomain/myaccountid/name")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("eventContent")
 *                     .value("{ id: {{ json issueId }} }")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * #### [SLACK](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#slack)
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel("foo", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("slack-example")
 *             .type("SLACK")
 *             .destinationId("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8")
 *             .product("IINT")
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("channelId")
 *                     .value("123456")
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key("customDetailsSlack")
 *                     .value("issue id - {{issueId}}")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
 * 
 * ## Full Scenario Example
 * 
 * Create a destination resource and reference that destination to the channel resource:
 * 
 * ### Create a destination
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationDestination;
 * import com.pulumi.newrelic.NotificationDestinationArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationPropertyArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationAuthBasicArgs;
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
 *         var webhook_destination = new NotificationDestination("webhook-destination", NotificationDestinationArgs.builder()
 *             .accountId(12345678)
 *             .name("destination-webhook")
 *             .type("WEBHOOK")
 *             .properties(NotificationDestinationPropertyArgs.builder()
 *                 .key("url")
 *                 .value("https://webhook.mywebhook.com")
 *                 .build())
 *             .authBasic(NotificationDestinationAuthBasicArgs.builder()
 *                 .user("username")
 *                 .password("password")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a channel
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var webhook_channel = new NotificationChannel("webhook-channel", NotificationChannelArgs.builder()
 *             .accountId(12345678)
 *             .name("channel-webhook")
 *             .type("WEBHOOK")
 *             .destinationId(webhook_destination.id())
 *             .product("IINT")
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key("payload")
 *                 .value("{name: foo}")
 *                 .label("Payload Template")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Additional Information
 * 
 * More details about the channels API can be found [here](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels).
 * ### Moving from Legacy Alert Channels to Notification Channels
 * As described in the documentation of this resource, channels can be created and managed using `newrelic.NotificationDestination` and `newrelic.NotificationChannel`. A combination of these resources is an alternative to the legacy resource `newrelic.AlertChannel`, which is **deprecated** and will be **removed in a future major release**, as stated in the documentation of the resource.
 * 
 * If you&#39;re currently using `newrelic.AlertChannel` to manage channels, we **strongly recommend** migrating to these notifications-based resources at the earliest.
 * 
 * Please refer to the examples in this page, or this example for illustrations on setting up channels with these resources.
 * 
 * ## Import
 * 
 * Channels can only be used by a single workflow, therefore importing them is not particularly useful, because in the UI channels are created upon workflow creation.
 * 
 * Additionally, the channel id isn&#39;t available via the UI, and you&#39;d need to look it up with the `channels` query in the NerdGraph API.
 * 
 * That being said, importing is possible using -
 * 
 * ```sh
 * $ pulumi import newrelic:index/notificationChannel:NotificationChannel foo &lt;destination_id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/notificationChannel:NotificationChannel")
public class NotificationChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Indicates whether the channel is active.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Indicates whether the channel is active.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * The id of the destination.
     * 
     */
    @Export(name="destinationId", refs={String.class}, tree="[0]")
    private Output<String> destinationId;

    /**
     * @return The id of the destination.
     * 
     */
    public Output<String> destinationId() {
        return this.destinationId;
    }
    /**
     * The name of the channel.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the channel.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    @Export(name="product", refs={String.class}, tree="[0]")
    private Output<String> product;

    /**
     * @return The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    public Output<String> product() {
        return this.product;
    }
    /**
     * A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    @Export(name="properties", refs={List.class,NotificationChannelProperty.class}, tree="[0,1]")
    private Output<List<NotificationChannelProperty>> properties;

    /**
     * @return A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    public Output<List<NotificationChannelProperty>> properties() {
        return this.properties;
    }
    /**
     * The status of the channel.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the channel.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `SERVICE_NOW_APP`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `SERVICE_NOW_APP`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationChannel(java.lang.String name) {
        this(name, NotificationChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationChannel(java.lang.String name, NotificationChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationChannel(java.lang.String name, NotificationChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NotificationChannel(java.lang.String name, Output<java.lang.String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, state, makeResourceOptions(options, id), false);
    }

    private static NotificationChannelArgs makeArgs(NotificationChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NotificationChannelArgs.Empty : args;
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
    public static NotificationChannel get(java.lang.String name, Output<java.lang.String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationChannel(name, id, state, options);
    }
}
