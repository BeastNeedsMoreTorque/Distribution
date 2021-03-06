package typings.highcharts.highchartsGanttMod

import typings.highcharts.mod.Dictionary
import typings.highcharts.mod.EventCallbackFunction
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highcharts-gantt", "fireEvent")
@js.native
object fireEvent extends js.Object {
  def apply[T](el: T, `type`: String): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
}

