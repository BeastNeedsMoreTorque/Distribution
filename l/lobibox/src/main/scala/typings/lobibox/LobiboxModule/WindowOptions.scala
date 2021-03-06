package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Cancel
import typings.lobibox.anon.Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends MessageBoxesOptions {
    // Override default option
  var autoload: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  @JSName("height")
  var height_WindowOptions: js.UndefOr[js.Any] = js.undefined
    // Auto load from given url when window is created
  var loadMethod: js.UndefOr[String] = js.undefined
    // Show window after content is loaded or show and then load content
  var params: js.UndefOr[js.Object] = js.undefined
    // Ajax method to load content
  var showAfterLoad: js.UndefOr[Boolean] = js.undefined
    // HTML Content of window
  var url: js.UndefOr[String] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    autoload: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Unit = null,
    bodyClass: String = null,
    buttons: Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Unit = null,
    content: js.Any = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: js.UndefOr[Double] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: () => String = null,
    height: js.Any = null,
    hide: () => WindowOptions = null,
    hideClass: String = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    loadMethod: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: Confirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Unit = null,
    params: js.Object = null,
    setHeight: /* height */ js.UndefOr[Double] => WindowOptions = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => WindowOptions = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => WindowOptions = null,
    setTitle: /* title */ js.UndefOr[String] => WindowOptions = null,
    setWidth: /* width */ js.UndefOr[Double] => WindowOptions = null,
    show: () => WindowOptions = null,
    showAfterLoad: js.UndefOr[Boolean] = js.undefined,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Unit = null,
    title: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload.get.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayToRemove)) __obj.updateDynamic("delayToRemove")(delayToRemove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (loadMethod != null) __obj.updateDynamic("loadMethod")(loadMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(showAfterLoad)) __obj.updateDynamic("showAfterLoad")(showAfterLoad.get.asInstanceOf[js.Any])
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

