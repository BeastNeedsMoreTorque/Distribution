package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolygonOptions extends IPolylineOptions {
  /** CSS string or Color object as the polygon's filling color. */
  var fillColor: js.UndefOr[String | Color] = js.undefined
}

object IPolygonOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    fillColor: String | Color = null,
    generalizable: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String | Color = null,
    strokeDashArray: js.Array[Double] | String = null,
    strokeThickness: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IPolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(generalizable)) __obj.updateDynamic("generalizable")(generalizable.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDashArray != null) __obj.updateDynamic("strokeDashArray")(strokeDashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeThickness)) __obj.updateDynamic("strokeThickness")(strokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolygonOptions]
  }
}

