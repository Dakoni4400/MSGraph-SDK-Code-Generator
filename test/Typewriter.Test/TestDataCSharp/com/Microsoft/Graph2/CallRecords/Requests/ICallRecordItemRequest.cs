// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\IMethodRequest.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Net.Http;
    using System.Threading;

    /// <summary>
    /// The interface ICallRecordItemRequest.
    /// </summary>
    public partial interface ICallRecordItemRequest : Microsoft.Graph.IBaseRequest
    {


        /// <summary>
        /// Issues the GET request.
        /// </summary>
        System.Threading.Tasks.Task<CallRecord> GetAsync();

        /// <summary>
        /// Issues the GET request.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await for async call.</returns>
        System.Threading.Tasks.Task<CallRecord> GetAsync(
            CancellationToken cancellationToken);



        /// <summary>
        /// Issues the PATCH request.
        /// </summary>
        /// <param name="callrecord">The CallRecord object set with the properties to update.</param>
        /// <returns>The task to await for async call.</returns>
        System.Threading.Tasks.Task<CallRecord> PatchAsync(CallRecord callrecord);

        /// <summary>
        /// Issues the PATCH request.
        /// </summary>
        /// <param name="callrecord">The CallRecord object set with the properties to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await for async call.</returns>
        System.Threading.Tasks.Task<CallRecord> PatchAsync(CallRecord callrecord, 
            CancellationToken cancellationToken);


        /// <summary>
        /// Issues the PUT request.
        /// </summary>
        /// <param name="callrecord">The CallRecord object to update.</param>
        /// <returns>The task to await for async call.</returns>
        System.Threading.Tasks.Task<CallRecord> PutAsync(CallRecord callrecord);

        /// <summary>
        /// Issues the PUT request.
        /// </summary>
        /// <param name="callrecord">The CallRecord object to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await for async call.</returns>
        System.Threading.Tasks.Task<CallRecord> PutAsync(CallRecord callrecord, 
            CancellationToken cancellationToken);




        /// <summary>
        /// Adds the specified expand value to the request.
        /// </summary>
        /// <param name="value">The expand value.</param>
        /// <returns>The request object to send.</returns>
        ICallRecordItemRequest Expand(string value);

        /// <summary>
        /// Adds the specified select value to the request.
        /// </summary>
        /// <param name="value">The select value.</param>
        /// <returns>The request object to send.</returns>
        ICallRecordItemRequest Select(string value);
    }
}