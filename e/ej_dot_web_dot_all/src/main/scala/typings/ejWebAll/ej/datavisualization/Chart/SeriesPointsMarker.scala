package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsMarker extends js.Object {
  /** Options for customizing the border of the marker shape.
    */
  var border: js.UndefOr[SeriesPointsMarkerBorder] = js.undefined
  /** Options for displaying and customizing data label.
    */
  var dataLabel: js.UndefOr[SeriesPointsMarkerDataLabel] = js.undefined
  /** Color of the marker shape.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** The URL for the Image that is to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Opacity of the marker.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the shape of the marker.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.undefined
  /** Options for customizing the size of the marker shape.
    */
  var size: js.UndefOr[SeriesPointsMarkerSize] = js.undefined
  /** Controls the visibility of the marker shape.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SeriesPointsMarker {
  @scala.inline
  def apply(
    border: SeriesPointsMarkerBorder = null,
    dataLabel: SeriesPointsMarkerDataLabel = null,
    fill: String = null,
    imageUrl: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    shape: Shape | String = null,
    size: SeriesPointsMarkerSize = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SeriesPointsMarker = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsMarker]
  }
}

