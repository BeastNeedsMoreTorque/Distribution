package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterTooltipDisplayTooltipLabel extends js.Object {
  var converter: js.UndefOr[typings.oracleOraclejet.ojvalidationBaseMod.Converter[Double]] = js.undefined
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  var tooltipLabel: js.UndefOr[String] = js.undefined
}

object ConverterTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(
    converter: typings.oracleOraclejet.ojvalidationBaseMod.Converter[Double] = null,
    tooltipDisplay: off | auto = null,
    tooltipLabel: String = null
  ): ConverterTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterTooltipDisplayTooltipLabel]
  }
}

