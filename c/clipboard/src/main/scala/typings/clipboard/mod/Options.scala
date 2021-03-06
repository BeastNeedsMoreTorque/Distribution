package typings.clipboard.mod

import typings.clipboard.clipboardStrings.copy
import typings.clipboard.clipboardStrings.cut
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Overwrites default command ('cut' or 'copy').
    * @param elem Current element
    */
  var action: js.UndefOr[js.Function1[/* elem */ Element, cut | copy]] = js.undefined
  /**
    * For use in Bootstrap Modals or with any
    * other library that changes the focus
    * you'll want to set the focused element
    * as the container value.
    */
  var container: js.UndefOr[Element] = js.undefined
  /**
    * Overwrites default target input element.
    * @param elem Current element
    * @returns <input> element to use.
    */
  var target: js.UndefOr[js.Function1[/* elem */ Element, Element]] = js.undefined
  /**
    * Returns the explicit text to copy.
    * @param elem Current element
    * @returns Text to be copied.
    */
  var text: js.UndefOr[js.Function1[/* elem */ Element, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    action: /* elem */ Element => cut | copy = null,
    container: Element = null,
    target: /* elem */ Element => Element = null,
    text: /* elem */ Element => String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction1(target))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction1(text))
    __obj.asInstanceOf[Options]
  }
}

