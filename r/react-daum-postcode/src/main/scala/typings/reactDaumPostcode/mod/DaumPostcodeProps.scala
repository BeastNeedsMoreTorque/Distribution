package typings.reactDaumPostcode.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaumPostcodeProps extends js.Object {
  var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[Boolean] = js.undefined
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var autoMapping: js.UndefOr[Boolean] = js.undefined
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var defaultQuery: js.UndefOr[String] = js.undefined
  var errorMessage: js.UndefOr[ReactElement] = js.undefined
  var focusContent: js.UndefOr[Boolean] = js.undefined
  var focusInput: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hideEngBtn: js.UndefOr[Boolean] = js.undefined
  var hideMapBtn: js.UndefOr[Boolean] = js.undefined
  var maxSuggestItems: js.UndefOr[Double] = js.undefined
  var pleaseReadGuide: js.UndefOr[Double] = js.undefined
  var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
  var scriptUrl: js.UndefOr[String] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var showMoreHName: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var submitMode: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[js.Object] = js.undefined
  var useSuggest: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zonecodeOnly: js.UndefOr[Boolean] = js.undefined
  def onComplete(data: AddressData): Unit
}

object DaumPostcodeProps {
  @scala.inline
  def apply(
    onComplete: AddressData => Unit,
    alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoMapping: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    defaultQuery: String = null,
    errorMessage: ReactElement = null,
    focusContent: js.UndefOr[Boolean] = js.undefined,
    focusInput: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    hideEngBtn: js.UndefOr[Boolean] = js.undefined,
    hideMapBtn: js.UndefOr[Boolean] = js.undefined,
    maxSuggestItems: js.UndefOr[Double] = js.undefined,
    pleaseReadGuide: js.UndefOr[Double] = js.undefined,
    pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined,
    scriptUrl: String = null,
    shorthand: js.UndefOr[Boolean] = js.undefined,
    showMoreHName: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    submitMode: js.UndefOr[Boolean] = js.undefined,
    theme: js.Object = null,
    useSuggest: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    zonecodeOnly: js.UndefOr[Boolean] = js.undefined
  ): DaumPostcodeProps = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(alwaysShowEngAddr)) __obj.updateDynamic("alwaysShowEngAddr")(alwaysShowEngAddr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMapping)) __obj.updateDynamic("autoMapping")(autoMapping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.get.asInstanceOf[js.Any])
    if (defaultQuery != null) __obj.updateDynamic("defaultQuery")(defaultQuery.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(focusContent)) __obj.updateDynamic("focusContent")(focusContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInput)) __obj.updateDynamic("focusInput")(focusInput.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEngBtn)) __obj.updateDynamic("hideEngBtn")(hideEngBtn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMapBtn)) __obj.updateDynamic("hideMapBtn")(hideMapBtn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSuggestItems)) __obj.updateDynamic("maxSuggestItems")(maxSuggestItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pleaseReadGuide)) __obj.updateDynamic("pleaseReadGuide")(pleaseReadGuide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pleaseReadGuideTimer)) __obj.updateDynamic("pleaseReadGuideTimer")(pleaseReadGuideTimer.get.asInstanceOf[js.Any])
    if (scriptUrl != null) __obj.updateDynamic("scriptUrl")(scriptUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMoreHName)) __obj.updateDynamic("showMoreHName")(showMoreHName.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(submitMode)) __obj.updateDynamic("submitMode")(submitMode.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useSuggest)) __obj.updateDynamic("useSuggest")(useSuggest.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zonecodeOnly)) __obj.updateDynamic("zonecodeOnly")(zonecodeOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaumPostcodeProps]
  }
}

