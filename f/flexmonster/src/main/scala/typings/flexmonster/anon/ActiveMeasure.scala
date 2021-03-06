package typings.flexmonster.anon

import typings.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveMeasure extends js.Object {
  var activeMeasure: js.UndefOr[MeasureObject] = js.undefined
  var activeTupleIndex: js.UndefOr[Double] = js.undefined
  var autoRange: js.UndefOr[Boolean] = js.undefined
  var axisShortNumberFormat: js.UndefOr[Boolean] = js.undefined
  var labelsHierarchy: js.UndefOr[String] = js.undefined
  var multipleMeasures: js.UndefOr[Boolean] = js.undefined
  var oneLevel: js.UndefOr[Boolean] = js.undefined
  var pieDataIndex: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var reversedAxes: js.UndefOr[Boolean] = js.undefined
  var showAllLabels: js.UndefOr[Boolean] = js.undefined
  var showDataLabels: js.UndefOr[Boolean] = js.undefined
  var showFilter: js.UndefOr[Boolean] = js.undefined
  var showLegend: js.UndefOr[Boolean] = js.undefined
  var showLegendButton: js.UndefOr[Boolean] = js.undefined
  var showMeasures: js.UndefOr[Boolean] = js.undefined
  var showOneMeasureSelection: js.UndefOr[Boolean] = js.undefined
  var showWarning: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ActiveMeasure {
  @scala.inline
  def apply(
    activeMeasure: MeasureObject = null,
    activeTupleIndex: js.UndefOr[Double] = js.undefined,
    autoRange: js.UndefOr[Boolean] = js.undefined,
    axisShortNumberFormat: js.UndefOr[Boolean] = js.undefined,
    labelsHierarchy: String = null,
    multipleMeasures: js.UndefOr[Boolean] = js.undefined,
    oneLevel: js.UndefOr[Boolean] = js.undefined,
    pieDataIndex: String = null,
    position: String = null,
    reversedAxes: js.UndefOr[Boolean] = js.undefined,
    showAllLabels: js.UndefOr[Boolean] = js.undefined,
    showDataLabels: js.UndefOr[Boolean] = js.undefined,
    showFilter: js.UndefOr[Boolean] = js.undefined,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    showLegendButton: js.UndefOr[Boolean] = js.undefined,
    showMeasures: js.UndefOr[Boolean] = js.undefined,
    showOneMeasureSelection: js.UndefOr[Boolean] = js.undefined,
    showWarning: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): ActiveMeasure = {
    val __obj = js.Dynamic.literal()
    if (activeMeasure != null) __obj.updateDynamic("activeMeasure")(activeMeasure.asInstanceOf[js.Any])
    if (!js.isUndefined(activeTupleIndex)) __obj.updateDynamic("activeTupleIndex")(activeTupleIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRange)) __obj.updateDynamic("autoRange")(autoRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisShortNumberFormat)) __obj.updateDynamic("axisShortNumberFormat")(axisShortNumberFormat.get.asInstanceOf[js.Any])
    if (labelsHierarchy != null) __obj.updateDynamic("labelsHierarchy")(labelsHierarchy.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleMeasures)) __obj.updateDynamic("multipleMeasures")(multipleMeasures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oneLevel)) __obj.updateDynamic("oneLevel")(oneLevel.get.asInstanceOf[js.Any])
    if (pieDataIndex != null) __obj.updateDynamic("pieDataIndex")(pieDataIndex.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedAxes)) __obj.updateDynamic("reversedAxes")(reversedAxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllLabels)) __obj.updateDynamic("showAllLabels")(showAllLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataLabels)) __obj.updateDynamic("showDataLabels")(showDataLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegendButton)) __obj.updateDynamic("showLegendButton")(showLegendButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeasures)) __obj.updateDynamic("showMeasures")(showMeasures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOneMeasureSelection)) __obj.updateDynamic("showOneMeasureSelection")(showOneMeasureSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWarning)) __obj.updateDynamic("showWarning")(showWarning.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveMeasure]
  }
}

