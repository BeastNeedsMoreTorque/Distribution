package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradientRadialGradient extends js.Object {
  /** Defines the position of the outermost circle
    * @Default {0}
    */
  var cx: js.UndefOr[Double] = js.undefined
  /** Defines the outer most circle of the radial gradient
    * @Default {0}
    */
  var cy: js.UndefOr[Double] = js.undefined
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fx: js.UndefOr[Double] = js.undefined
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fy: js.UndefOr[Double] = js.undefined
  /** Defines the different colors and the region of color transitions.
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the type of gradient
    * @Default {radial}
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodesGradientRadialGradient {
  @scala.inline
  def apply(
    cx: js.UndefOr[Double] = js.undefined,
    cy: js.UndefOr[Double] = js.undefined,
    fx: js.UndefOr[Double] = js.undefined,
    fy: js.UndefOr[Double] = js.undefined,
    stops: js.Array[_] = null,
    `type`: String = null
  ): NodesGradientRadialGradient = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cx)) __obj.updateDynamic("cx")(cx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cy)) __obj.updateDynamic("cy")(cy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fx)) __obj.updateDynamic("fx")(fx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fy)) __obj.updateDynamic("fy")(fy.get.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesGradientRadialGradient]
  }
}

