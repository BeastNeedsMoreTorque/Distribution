package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specifies the URL of an image to be displayed as background of the Digital gauge.
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  /** Specifies the inner width for the frame, when the background image has been set for the Digital gauge..
    * @Default {6}
    */
  var innerWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the outer width of the frame, when the background image has been set for the Digital gauge.
    * @Default {10}
    */
  var outerWidth: js.UndefOr[Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    backgroundImageUrl: String = null,
    innerWidth: js.UndefOr[Double] = js.undefined,
    outerWidth: js.UndefOr[Double] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerWidth)) __obj.updateDynamic("outerWidth")(outerWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

