package typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest = js.native
  def deserializeBinaryFromReader(
    message: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest,
    reader: BinaryReader
  ): typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest = js.native
  def serializeBinaryToWriter(
    message: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest
  ): AsObject = js.native
}

