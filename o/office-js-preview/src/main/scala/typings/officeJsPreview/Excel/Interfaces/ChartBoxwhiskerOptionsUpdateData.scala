package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartBoxQuartileCalculation
import typings.officeJsPreview.officeJsPreviewStrings.Exclusive
import typings.officeJsPreview.officeJsPreviewStrings.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBoxwhiskerOptions object, for use in `chartBoxwhiskerOptions.set({ ... })`. */
trait ChartBoxwhiskerOptionsUpdateData extends js.Object {
  /**
    *
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.undefined
  /**
    *
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.undefined
}

object ChartBoxwhiskerOptionsUpdateData {
  @scala.inline
  def apply(
    quartileCalculation: ChartBoxQuartileCalculation | Inclusive | Exclusive = null,
    showInnerPoints: js.UndefOr[Boolean] = js.undefined,
    showMeanLine: js.UndefOr[Boolean] = js.undefined,
    showMeanMarker: js.UndefOr[Boolean] = js.undefined,
    showOutlierPoints: js.UndefOr[Boolean] = js.undefined
  ): ChartBoxwhiskerOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (quartileCalculation != null) __obj.updateDynamic("quartileCalculation")(quartileCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBoxwhiskerOptionsUpdateData]
  }
}

