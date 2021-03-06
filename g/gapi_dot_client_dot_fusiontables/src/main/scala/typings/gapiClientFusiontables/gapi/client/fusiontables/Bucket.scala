package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /** Color of line or the interior of a polygon in #RRGGBB format. */
  var color: js.UndefOr[String] = js.undefined
  /** Icon name used for a point. */
  var icon: js.UndefOr[String] = js.undefined
  /** Maximum value in the selected column for a row to be styled according to the bucket color, opacity, icon, or weight. */
  var max: js.UndefOr[Double] = js.undefined
  /** Minimum value in the selected column for a row to be styled according to the bucket color, opacity, icon, or weight. */
  var min: js.UndefOr[Double] = js.undefined
  /** Opacity of the color: 0.0 (transparent) to 1.0 (opaque). */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Width of a line (in pixels). */
  var weight: js.UndefOr[Double] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(
    color: String = null,
    icon: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): Bucket = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

