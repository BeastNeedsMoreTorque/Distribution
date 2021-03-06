package typings.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  var barBracketStyle: js.UndefOr[CTerminal] = js.undefined
  var barChar: js.UndefOr[String] = js.undefined
  var barHeadChar: js.UndefOr[String] = js.undefined
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  var eta: js.UndefOr[Boolean] = js.undefined
  var etaStyle: js.UndefOr[CTerminal] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var itemSize: js.UndefOr[Double] = js.undefined
  var itemStyle: js.UndefOr[CTerminal] = js.undefined
  var items: js.UndefOr[Double] = js.undefined
  var maxRefreshTime: js.UndefOr[Double] = js.undefined
  var minRefreshTime: js.UndefOr[Double] = js.undefined
  var percent: js.UndefOr[Boolean] = js.undefined
  var percentStyle: js.UndefOr[CTerminal] = js.undefined
  var syncMode: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleSize: js.UndefOr[Double] = js.undefined
  var titleStyle: js.UndefOr[CTerminal] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    barBracketStyle: CTerminal = null,
    barChar: String = null,
    barHeadChar: String = null,
    barStyle: CTerminal = null,
    eta: js.UndefOr[Boolean] = js.undefined,
    etaStyle: CTerminal = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    itemSize: js.UndefOr[Double] = js.undefined,
    itemStyle: CTerminal = null,
    items: js.UndefOr[Double] = js.undefined,
    maxRefreshTime: js.UndefOr[Double] = js.undefined,
    minRefreshTime: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Boolean] = js.undefined,
    percentStyle: CTerminal = null,
    syncMode: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleSize: js.UndefOr[Double] = js.undefined,
    titleStyle: CTerminal = null,
    width: js.UndefOr[Double] = js.undefined
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    if (barBracketStyle != null) __obj.updateDynamic("barBracketStyle")(barBracketStyle.asInstanceOf[js.Any])
    if (barChar != null) __obj.updateDynamic("barChar")(barChar.asInstanceOf[js.Any])
    if (barHeadChar != null) __obj.updateDynamic("barHeadChar")(barHeadChar.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(eta)) __obj.updateDynamic("eta")(eta.get.asInstanceOf[js.Any])
    if (etaStyle != null) __obj.updateDynamic("etaStyle")(etaStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemSize)) __obj.updateDynamic("itemSize")(itemSize.get.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRefreshTime)) __obj.updateDynamic("maxRefreshTime")(maxRefreshTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRefreshTime)) __obj.updateDynamic("minRefreshTime")(minRefreshTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (percentStyle != null) __obj.updateDynamic("percentStyle")(percentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(syncMode)) __obj.updateDynamic("syncMode")(syncMode.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleSize)) __obj.updateDynamic("titleSize")(titleSize.get.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

