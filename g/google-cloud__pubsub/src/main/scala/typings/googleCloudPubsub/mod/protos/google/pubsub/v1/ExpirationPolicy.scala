package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IExpirationPolicy
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ExpirationPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy")
@js.native
/**
  * Constructs a new ExpirationPolicy.
  * @param [properties] Properties to set
  */
class ExpirationPolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy {
  def this(properties: IExpirationPolicy) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy")
@js.native
object ExpirationPolicy extends js.Object {
  /**
    * Creates a new ExpirationPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExpirationPolicy instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  def create(properties: IExpirationPolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  /**
    * Decodes an ExpirationPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExpirationPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  /**
    * Decodes an ExpirationPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExpirationPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  /**
    * Encodes the specified ExpirationPolicy message. Does not implicitly {@link google.pubsub.v1.ExpirationPolicy.verify|verify} messages.
    * @param message ExpirationPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExpirationPolicy): Writer = js.native
  def encode(message: IExpirationPolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ExpirationPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.ExpirationPolicy.verify|verify} messages.
    * @param message ExpirationPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExpirationPolicy): Writer = js.native
  def encodeDelimited(message: IExpirationPolicy, writer: Writer): Writer = js.native
  /**
    * Creates an ExpirationPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExpirationPolicy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  /**
    * Creates a plain object from an ExpirationPolicy message. Also converts values to other types if specified.
    * @param message ExpirationPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an ExpirationPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

