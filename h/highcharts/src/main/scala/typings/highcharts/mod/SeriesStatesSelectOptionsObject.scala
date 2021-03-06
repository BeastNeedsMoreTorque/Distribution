package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesStatesSelectOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highmaps) The border color of the point in this state.
    */
  var borderColor: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The color of the shape in this state.
    */
  var color: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Options for the halo appearing around the hovered
    * point in line-type series as well as outside the hovered slice in pie
    * charts. By default the halo is filled by the current point or series
    * color with an opacity of 0.25\. The halo can be disabled by setting the
    * `halo` option to `null`.
    *
    * In styled mode, the halo is styled with the `.highcharts-halo` class,
    * with colors inherited from `.highcharts-color-{n}`.
    */
  var halo: js.UndefOr[SeriesStatesHoverHaloOptionsObject | Null] = js.undefined
  /**
    * (Highcharts, Highstock) Pixel width of the graph line. By default this
    * property is undefined, and the `lineWidthPlus` property dictates how much
    * to increase the linewidth from normal state.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The additional line width for the graph of a
    * hovered series.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined
}

object SeriesStatesSelectOptionsObject {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    borderColor: String | ColorString | GradientColorObject | PatternObject = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String | ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    halo: js.UndefOr[Null | SeriesStatesHoverHaloOptionsObject] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    lineWidthPlus: js.UndefOr[Double] = js.undefined
  ): SeriesStatesSelectOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(halo)) __obj.updateDynamic("halo")(halo.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidthPlus)) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesStatesSelectOptionsObject]
  }
}

