package typings.std.global

import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.vrdisplaypresentchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_vrdisplaypresentchange extends js.Object {
  def apply(`type`: vrdisplaypresentchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

