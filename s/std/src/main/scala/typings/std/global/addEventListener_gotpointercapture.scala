package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.gotpointercapture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_gotpointercapture extends js.Object {
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PointerEvent, _]
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

