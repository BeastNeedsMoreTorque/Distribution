package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import typings.googleGax.operationsClientMod.OperationsClient
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Reader
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longRunningCalls/longRunningDescriptor", JSImport.Namespace)
@js.native
object longRunningDescriptorMod extends js.Object {
  @js.native
  class LongRunningDescriptor protected () extends Descriptor {
    def this(operationsClient: OperationsClient, responseDecoder: AnyDecoder, metadataDecoder: AnyDecoder) = this()
    @JSName("metadataDecoder")
    var metadataDecoder_Original: AnyDecoder = js.native
    var operationsClient: OperationsClient = js.native
    @JSName("responseDecoder")
    var responseDecoder_Original: AnyDecoder = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
    def metadataDecoder(reader: Reader): Message[js.Object] = js.native
    def metadataDecoder(reader: Reader, length: Double): Message[js.Object] = js.native
    def metadataDecoder(reader: Uint8Array): Message[js.Object] = js.native
    def metadataDecoder(reader: Uint8Array, length: Double): Message[js.Object] = js.native
    def responseDecoder(reader: Reader): Message[js.Object] = js.native
    def responseDecoder(reader: Reader, length: Double): Message[js.Object] = js.native
    def responseDecoder(reader: Uint8Array): Message[js.Object] = js.native
    def responseDecoder(reader: Uint8Array, length: Double): Message[js.Object] = js.native
  }
  
  type AnyDecoder = js.Function2[
    /* reader */ Reader | Uint8Array, 
    /* length */ js.UndefOr[Double], 
    Message[js.Object]
  ]
}

