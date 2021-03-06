package typings.jsBase64.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64_ extends js.Object {
  val VERSION: String = js.native
  def atob(base64: String): String = js.native
  def btoa(s: String): String = js.native
  def btou(s: String): String = js.native
  def decode(base64: String): String = js.native
  def encode(s: String): String = js.native
  def encode(s: String, uriSafe: Boolean): String = js.native
  def encodeURI(s: String): String = js.native
  def extendString(): Unit = js.native
  def fromBase64(base64: String): String = js.native
  def fromUint8Array(uint8Array: Uint8Array): String = js.native
  def noConflict(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Base64 */ js.Any = js.native
  def toBase64(s: String): String = js.native
  def toBase64(s: String, uriSafe: Boolean): String = js.native
  def toUint8Array(s: String): Uint8Array = js.native
  def utob(s: String): String = js.native
}

