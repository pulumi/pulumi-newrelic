// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("newrelic");

export declare const accountId: string | undefined;
Object.defineProperty(exports, "accountId", {
    get() {
        return __config.get("accountId") ?? utilities.getEnv("NEW_RELIC_ACCOUNT_ID");
    },
    enumerable: true,
});

export declare const adminApiKey: string | undefined;
Object.defineProperty(exports, "adminApiKey", {
    get() {
        return __config.get("adminApiKey");
    },
    enumerable: true,
});

export declare const apiKey: string | undefined;
Object.defineProperty(exports, "apiKey", {
    get() {
        return __config.get("apiKey");
    },
    enumerable: true,
});

export declare const apiUrl: string | undefined;
Object.defineProperty(exports, "apiUrl", {
    get() {
        return __config.get("apiUrl");
    },
    enumerable: true,
});

export declare const cacertFile: string | undefined;
Object.defineProperty(exports, "cacertFile", {
    get() {
        return __config.get("cacertFile");
    },
    enumerable: true,
});

export declare const infrastructureApiUrl: string | undefined;
Object.defineProperty(exports, "infrastructureApiUrl", {
    get() {
        return __config.get("infrastructureApiUrl");
    },
    enumerable: true,
});

export declare const insecureSkipVerify: boolean | undefined;
Object.defineProperty(exports, "insecureSkipVerify", {
    get() {
        return __config.getObject<boolean>("insecureSkipVerify");
    },
    enumerable: true,
});

export declare const insightsInsertKey: string | undefined;
Object.defineProperty(exports, "insightsInsertKey", {
    get() {
        return __config.get("insightsInsertKey");
    },
    enumerable: true,
});

export declare const insightsInsertUrl: string | undefined;
Object.defineProperty(exports, "insightsInsertUrl", {
    get() {
        return __config.get("insightsInsertUrl");
    },
    enumerable: true,
});

export declare const insightsQueryUrl: string | undefined;
Object.defineProperty(exports, "insightsQueryUrl", {
    get() {
        return __config.get("insightsQueryUrl");
    },
    enumerable: true,
});

export declare const nerdgraphApiUrl: string | undefined;
Object.defineProperty(exports, "nerdgraphApiUrl", {
    get() {
        return __config.get("nerdgraphApiUrl");
    },
    enumerable: true,
});

/**
 * The data center for which your New Relic account is configured. Only one region per provider block is permitted.
 */
export declare const region: string;
Object.defineProperty(exports, "region", {
    get() {
        return __config.get("region") ?? (utilities.getEnv("NEW_RELIC_REGION") || "US");
    },
    enumerable: true,
});

export declare const syntheticsApiUrl: string | undefined;
Object.defineProperty(exports, "syntheticsApiUrl", {
    get() {
        return __config.get("syntheticsApiUrl");
    },
    enumerable: true,
});

