package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeExportSVGOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
}

object LinearGaugeExportSVGOptions {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined): LinearGaugeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeExportSVGOptions]
  }
}

