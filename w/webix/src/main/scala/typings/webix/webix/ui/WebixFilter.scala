package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebixFilter extends js.Object {
  def getValue(node: HTMLElement): js.Any
  def refresh(master: baseview, node: HTMLElement, value: js.Any): Unit
  def render(master: baseview, config: StringDictionary[js.Any]): String
  def setValue(node: HTMLElement, value: js.Any): js.Any
}

object WebixFilter {
  @scala.inline
  def apply(
    getValue: HTMLElement => js.Any,
    refresh: (baseview, HTMLElement, js.Any) => Unit,
    render: (baseview, StringDictionary[js.Any]) => String,
    setValue: (HTMLElement, js.Any) => js.Any
  ): WebixFilter = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[WebixFilter]
  }
}

