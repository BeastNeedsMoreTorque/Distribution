package typings.node.streamMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(opts: TransformOptions) = this()
  def _flush(callback: TransformCallback): Unit = js.native
  def _transform(chunk: js.Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
}

