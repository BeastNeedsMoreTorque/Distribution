package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.PolarChartSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizeSeriesNameField extends js.Object {
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, PolarChartSeries]] = js.undefined
  var nameField: js.UndefOr[String] = js.undefined
}

object CustomizeSeriesNameField {
  @scala.inline
  def apply(customizeSeries: /* seriesName */ js.Any => PolarChartSeries = null, nameField: String = null): CustomizeSeriesNameField = {
    val __obj = js.Dynamic.literal()
    if (customizeSeries != null) __obj.updateDynamic("customizeSeries")(js.Any.fromFunction1(customizeSeries))
    if (nameField != null) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizeSeriesNameField]
  }
}

