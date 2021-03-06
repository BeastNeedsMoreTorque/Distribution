package typings.rbx.modalPortalMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Document
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPortalModifierProps extends js.Object {
  var as: js.UndefOr[ReactType[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var document: Document
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ModalPortalModifierProps {
  @scala.inline
  def apply(
    document: Document,
    as: ReactType[_] = null,
    className: String = null,
    clipped: js.UndefOr[Boolean] = js.undefined,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    innerRef: js.UndefOr[Null | (Ref[HTMLElement | SVGElement | ComponentType[js.Object]])] = js.undefined,
    onClose: () => Unit = null
  ): ModalPortalModifierProps = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ModalPortalModifierProps]
  }
}

