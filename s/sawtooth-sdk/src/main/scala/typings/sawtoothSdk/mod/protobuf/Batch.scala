package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IBatch
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.Batch")
@js.native
/**
  * Constructs a new Batch.
  * @param [properties] Properties to set
  */
class Batch ()
  extends typings.sawtoothSdk.protobufMod.Batch {
  def this(properties: IBatch) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.Batch")
@js.native
object Batch extends js.Object {
  /**
    * Creates a new Batch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Batch instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Batch = js.native
  def create(properties: IBatch): typings.sawtoothSdk.protobufMod.Batch = js.native
  /**
    * Decodes a Batch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Batch = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Batch = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Batch = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Batch = js.native
  /**
    * Decodes a Batch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Batch = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Batch = js.native
  /**
    * Encodes the specified Batch message. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBatch): Writer = js.native
  def encode(message: IBatch, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Batch message, length delimited. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBatch): Writer = js.native
  def encodeDelimited(message: IBatch, writer: Writer): Writer = js.native
  /**
    * Creates a Batch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Batch
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Batch = js.native
  /**
    * Creates a plain object from a Batch message. Also converts values to other types if specified.
    * @param message Batch
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Batch): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Batch, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Batch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

