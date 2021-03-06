package typings.braftEditor.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomText extends js.Object {
  var bottomText: js.UndefOr[ReactNode] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  var closeOnCancel: js.UndefOr[Boolean] = js.undefined
  var closeOnConfirm: js.UndefOr[Boolean] = js.undefined
  var confirmText: js.UndefOr[String] = js.undefined
  var confirmable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: String
  var onBlur: js.UndefOr[js.Function] = js.undefined
  var onCancel: js.UndefOr[js.Function] = js.undefined
  var onClose: js.UndefOr[js.Function] = js.undefined
  var onConfirm: js.UndefOr[js.Function] = js.undefined
  var showCancel: js.UndefOr[Boolean] = js.undefined
  var showClose: js.UndefOr[Boolean] = js.undefined
  var showConfirm: js.UndefOr[Boolean] = js.undefined
  var showFooter: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BottomText {
  @scala.inline
  def apply(
    id: String,
    bottomText: ReactNode = null,
    cancelText: String = null,
    children: ReactNode = null,
    className: String = null,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnCancel: js.UndefOr[Boolean] = js.undefined,
    closeOnConfirm: js.UndefOr[Boolean] = js.undefined,
    confirmText: String = null,
    confirmable: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    onBlur: js.Function = null,
    onCancel: js.Function = null,
    onClose: js.Function = null,
    onConfirm: js.Function = null,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    showConfirm: js.UndefOr[Boolean] = js.undefined,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): BottomText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (bottomText != null) __obj.updateDynamic("bottomText")(bottomText.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnCancel)) __obj.updateDynamic("closeOnCancel")(closeOnCancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnConfirm)) __obj.updateDynamic("closeOnConfirm")(closeOnConfirm.get.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmable)) __obj.updateDynamic("confirmable")(confirmable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(onConfirm.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirm)) __obj.updateDynamic("showConfirm")(showConfirm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomText]
  }
}

