package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker extends Widget {
  @JSName("options")
  var options_DatePicker: DatePickerOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def max(): Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  def min(): Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  def open(): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def value(): Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
}

