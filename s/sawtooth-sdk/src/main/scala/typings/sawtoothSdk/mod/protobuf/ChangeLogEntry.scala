package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.sawtoothSdk.protobufMod.IChangeLogEntry
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ChangeLogEntry")
@js.native
/**
  * Constructs a new ChangeLogEntry.
  * @param [properties] Properties to set
  */
class ChangeLogEntry ()
  extends typings.sawtoothSdk.protobufMod.ChangeLogEntry {
  def this(properties: IChangeLogEntry) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ChangeLogEntry")
@js.native
object ChangeLogEntry extends js.Object {
  /** Represents a Successor. */
  @js.native
  /**
    * Constructs a new Successor.
    * @param [properties] Properties to set
    */
  class Successor ()
    extends typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor {
    def this(properties: ISuccessor) = this()
  }
  
  /**
    * Creates a new ChangeLogEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ChangeLogEntry instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def create(properties: IChangeLogEntry): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Decodes a ChangeLogEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ChangeLogEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Encodes the specified ChangeLogEntry message. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IChangeLogEntry): Writer = js.native
  def encode(message: IChangeLogEntry, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ChangeLogEntry message, length delimited. Does not implicitly {@link ChangeLogEntry.verify|verify} messages.
    * @param message ChangeLogEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IChangeLogEntry): Writer = js.native
  def encodeDelimited(message: IChangeLogEntry, writer: Writer): Writer = js.native
  /**
    * Creates a ChangeLogEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ChangeLogEntry
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ChangeLogEntry = js.native
  /**
    * Creates a plain object from a ChangeLogEntry message. Also converts values to other types if specified.
    * @param message ChangeLogEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ChangeLogEntry): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ChangeLogEntry, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ChangeLogEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object Successor extends js.Object {
    /**
      * Creates a new Successor instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Successor instance
      */
    def create(): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    def create(properties: ISuccessor): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    /**
      * Decodes a Successor message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Successor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    /**
      * Decodes a Successor message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Successor
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    /**
      * Encodes the specified Successor message. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
      * @param message Successor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: ISuccessor): Writer = js.native
    def encode(message: ISuccessor, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Successor message, length delimited. Does not implicitly {@link ChangeLogEntry.Successor.verify|verify} messages.
      * @param message Successor message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: ISuccessor): Writer = js.native
    def encodeDelimited(message: ISuccessor, writer: Writer): Writer = js.native
    /**
      * Creates a Successor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Successor
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor = js.native
    /**
      * Creates a plain object from a Successor message. Also converts values to other types if specified.
      * @param message Successor
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor): StringDictionary[js.Any] = js.native
    def toObject(message: typings.sawtoothSdk.protobufMod.ChangeLogEntry.Successor, options: IConversionOptions): StringDictionary[js.Any] = js.native
    /**
      * Verifies a Successor message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

