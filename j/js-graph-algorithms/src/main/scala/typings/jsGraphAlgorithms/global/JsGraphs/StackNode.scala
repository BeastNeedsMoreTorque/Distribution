package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.StackNode")
@js.native
class StackNode[T] protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.StackNode[T] {
  def this(value: T) = this()
  /* CompleteClass */
  override var next: typings.jsGraphAlgorithms.JsGraphs.StackNode[T] | Null = js.native
  /* CompleteClass */
  override var value: T = js.native
}

