package typings.blazy

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlazyOptions extends js.Object {
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function2[/* ele */ Element | HTMLElement, /* msg */ String, Unit]] = js.undefined
  var errorClass: js.UndefOr[String] = js.undefined
  var loadInvisible: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var saveViewportOffsetDelay: js.UndefOr[Double] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function1[/* ele */ Element | HTMLElement, Unit]] = js.undefined
  var successClass: js.UndefOr[String] = js.undefined
  var validateDelay: js.UndefOr[Double] = js.undefined
}

object BlazyOptions {
  @scala.inline
  def apply(
    breakpoints: js.Array[Breakpoint] = null,
    container: String = null,
    error: (/* ele */ Element | HTMLElement, /* msg */ String) => Unit = null,
    errorClass: String = null,
    loadInvisible: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    saveViewportOffsetDelay: js.UndefOr[Double] = js.undefined,
    selector: String = null,
    separator: String = null,
    src: String = null,
    success: /* ele */ Element | HTMLElement => Unit = null,
    successClass: String = null,
    validateDelay: js.UndefOr[Double] = js.undefined
  ): BlazyOptions = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass.asInstanceOf[js.Any])
    if (!js.isUndefined(loadInvisible)) __obj.updateDynamic("loadInvisible")(loadInvisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saveViewportOffsetDelay)) __obj.updateDynamic("saveViewportOffsetDelay")(saveViewportOffsetDelay.get.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (successClass != null) __obj.updateDynamic("successClass")(successClass.asInstanceOf[js.Any])
    if (!js.isUndefined(validateDelay)) __obj.updateDynamic("validateDelay")(validateDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlazyOptions]
  }
}

