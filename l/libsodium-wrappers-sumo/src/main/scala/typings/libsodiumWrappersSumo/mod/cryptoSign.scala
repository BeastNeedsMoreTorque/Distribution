package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_sign")
@js.native
object cryptoSign extends js.Object {
  def apply(message: String, privateKey: Uint8Array): Uint8Array = js.native
  def apply(message: String, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(message: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def apply(message: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

