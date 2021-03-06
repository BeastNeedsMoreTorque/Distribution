package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetSubscriptionRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSubscriptionRequest")
@js.native
/**
  * Constructs a new GetSubscriptionRequest.
  * @param [properties] Properties to set
  */
class GetSubscriptionRequest () extends IGetSubscriptionRequest {
  def this(properties: IGetSubscriptionRequest) = this()
  /** GetSubscriptionRequest subscription. */
  @JSName("subscription")
  var subscription_GetSubscriptionRequest: String = js.native
  /**
    * Converts this GetSubscriptionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSubscriptionRequest")
@js.native
object GetSubscriptionRequest extends js.Object {
  /**
    * Creates a new GetSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSubscriptionRequest instance
    */
  def create(): GetSubscriptionRequest = js.native
  def create(properties: IGetSubscriptionRequest): GetSubscriptionRequest = js.native
  /**
    * Decodes a GetSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetSubscriptionRequest = js.native
  def decode(reader: Reader, length: Double): GetSubscriptionRequest = js.native
  def decode(reader: Uint8Array): GetSubscriptionRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetSubscriptionRequest = js.native
  /**
    * Decodes a GetSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetSubscriptionRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetSubscriptionRequest = js.native
  /**
    * Encodes the specified GetSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
    * @param message GetSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetSubscriptionRequest): Writer = js.native
  def encode(message: IGetSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
    * @param message GetSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetSubscriptionRequest): Writer = js.native
  def encodeDelimited(message: IGetSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSubscriptionRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetSubscriptionRequest = js.native
  /**
    * Creates a plain object from a GetSubscriptionRequest message. Also converts values to other types if specified.
    * @param message GetSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetSubscriptionRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetSubscriptionRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

