// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Model\EntityType.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Text.Json.Serialization;

    /// <summary>
    /// The type Singleton Entity2.
    /// </summary>
    
    public partial class SingletonEntity2 : Entity
    {
    
		///<summary>
		/// The SingletonEntity2 constructor
		///</summary>
        public SingletonEntity2()
        {
            this.ODataType = "microsoft.graph.singletonEntity2";
        }
	
        /// <summary>
        /// Gets or sets test single nav2.
        /// </summary>
        [JsonPropertyName("testSingleNav2")]
        [Obsolete("entityType3 is deprecated. Please use singletonEntity1.")]
        public EntityType3 TestSingleNav2 { get; set; }
    
    }
}

