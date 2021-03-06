package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rxLiteAggregates.Rx.Observable
import typings.std.Element
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.keyup")
@js.native
object keyup extends js.Object {
  def apply(element: Element): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
}

