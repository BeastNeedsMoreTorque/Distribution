package typings.node.utilMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.Fatal
import typings.node.anon.Stream
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextDecoder")
@js.native
class TextDecoder () extends js.Object {
  def this(encoding: String) = this()
  def this(encoding: String, options: Fatal) = this()
  val encoding: String = js.native
  val fatal: Boolean = js.native
  val ignoreBOM: Boolean = js.native
  def decode(): String = js.native
  def decode(input: Null, options: Stream): String = js.native
  def decode(input: ArrayBufferView): String = js.native
  def decode(input: ArrayBufferView, options: Stream): String = js.native
  def decode(input: ArrayBuffer): String = js.native
  def decode(input: ArrayBuffer, options: Stream): String = js.native
}

