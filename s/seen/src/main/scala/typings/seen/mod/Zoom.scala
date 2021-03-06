package typings.seen.mod

import typings.seen.anon.Smooth
import typings.seen.anon.SmoothBoolean
import typings.seen.mod.Events.Dispatcher
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Zoom")
@js.native
class Zoom protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: SmoothBoolean) = this()
  def this(elementOrId: HTMLElement, options: SmoothBoolean) = this()
  var defaults: Smooth = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var speed: Double = js.native
}

