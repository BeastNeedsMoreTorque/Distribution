package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypeBackgroundOptions extends js.Object {
  /**
    * (Highstock) The color of the rectangle.
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The color of border.
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The width of border.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object AnnotationsMeasureTypeBackgroundOptions {
  @scala.inline
  def apply(fill: String = null, stroke: String = null, strokeWidth: js.UndefOr[Double] = js.undefined): AnnotationsMeasureTypeBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypeBackgroundOptions]
  }
}

