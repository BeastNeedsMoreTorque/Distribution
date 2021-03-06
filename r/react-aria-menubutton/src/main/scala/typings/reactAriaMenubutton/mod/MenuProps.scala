package typings.reactAriaMenubutton.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.reactAriaMenubutton.anon.IsOpen
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  @JSName("children")
  var children_MenuProps: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element])
  /**
    * The HTML tag for this element. Default: 'span'.
    */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ T](
    children: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element]),
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    tag: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any = null
  ): MenuProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps[T]]
  }
}

