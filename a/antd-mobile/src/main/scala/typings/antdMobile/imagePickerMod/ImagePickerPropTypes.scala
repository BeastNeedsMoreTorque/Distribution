package typings.antdMobile.imagePickerMod

import typings.antdMobile.imagePickerPropsTypeMod.ImageFile
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes
  extends typings.antdMobile.imagePickerPropsTypeMod.ImagePickerPropTypes {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    accept: String = null,
    capture: js.Any = null,
    className: String = null,
    disableDelete: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[ImageFile] = null,
    length: Double | String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onAddImageClick: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onChange: (/* files */ js.Array[ImageFile], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]]) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDelete)) __obj.updateDynamic("disableDelete")(disableDelete.get.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction1(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

