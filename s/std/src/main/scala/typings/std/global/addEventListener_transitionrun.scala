package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.transitionrun
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionrun extends js.Object {
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.TransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.TransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

