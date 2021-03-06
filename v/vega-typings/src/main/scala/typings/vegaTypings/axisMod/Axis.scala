package typings.vegaTypings.axisMod

import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.NumberValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends BaseAxis {
  /**
    * Mark definitions for custom axis encoding.
    */
  var encode: js.UndefOr[AxisEncode] = js.undefined
  /**
    * The format specifier pattern for axis labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
    */
  var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.undefined
  /**
    * The format type for axis labels (number, time, or utc).
    */
  var formatType: js.UndefOr[FormatType | SignalRef] = js.undefined
  /**
    * The name of the scale to use for including grid lines. By default grid lines are driven by the same scale as the ticks and labels.
    */
  var gridScale: js.UndefOr[String] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the axis from its position along the edge of the chart.
    */
  var offset: js.UndefOr[NumberValue] = js.undefined
  /**
    * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
    *
    * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
    */
  var orient: AxisOrient | SignalRef
  /**
    * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
    *
    * __Default value__: `0`
    */
  var position: js.UndefOr[NumberValue] = js.undefined
  /**
    * The name of the scale backing the axis component.
    */
  var scale: String
  /**
    * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of `2`, `5`, `10`) and lie within the underlying scale's range.
    *
    * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and "year". Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
    *
    * @minimum 0
    */
  var tickCount: js.UndefOr[TickCount] = js.undefined
  /**
    * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * A title for the axis (none by default).
    */
  var title: js.UndefOr[Text | SignalRef] = js.undefined
  /**
    * Explicitly set the visible axis tick and label values.
    */
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.undefined
}

