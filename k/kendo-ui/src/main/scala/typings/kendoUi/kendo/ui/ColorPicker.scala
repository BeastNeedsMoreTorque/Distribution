package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPicker extends Widget {
  @JSName("options")
  var options_ColorPicker: ColorPickerOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def color(): Unit = js.native
  def color(color: Color): Unit = js.native
  @JSName("color")
  def color_Color(): Color = js.native
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def open(): Unit = js.native
  def toggle(): Unit = js.native
  def value(): String = js.native
  def value(color: String): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
}

