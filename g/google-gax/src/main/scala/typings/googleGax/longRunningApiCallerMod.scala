package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.callMod.OngoingCallPromise
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longRunningCalls/longRunningApiCaller", JSImport.Namespace)
@js.native
object longRunningApiCallerMod extends js.Object {
  @js.native
  class LongrunningApiCaller protected () extends APICaller {
    /**
      * Creates an API caller that performs polling on a long running operation.
      *
      * @private
      * @constructor
      * @param {LongRunningDescriptor} longrunningDescriptor - Holds the
      * decoders used for unpacking responses and the operationsClient
      * used for polling the operation.
      */
    def this(longrunningDescriptor: LongRunningDescriptor) = this()
    var _wrapOperation: js.Any = js.native
    var longrunningDescriptor: LongRunningDescriptor = js.native
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallOptions,
      canceller: OngoingCallPromise
    ): Unit = js.native
  }
  
}

