// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowEnrichmentsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("nrqls", required: true)]
        private InputList<Inputs.WorkflowEnrichmentsNrqlGetArgs>? _nrqls;
        public InputList<Inputs.WorkflowEnrichmentsNrqlGetArgs> Nrqls
        {
            get => _nrqls ?? (_nrqls = new InputList<Inputs.WorkflowEnrichmentsNrqlGetArgs>());
            set => _nrqls = value;
        }

        public WorkflowEnrichmentsGetArgs()
        {
        }
        public static new WorkflowEnrichmentsGetArgs Empty => new WorkflowEnrichmentsGetArgs();
    }
}