package typings.antvScale.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  field  :string,   values  :std.Array<any>,   min  :any,   max  :any,   alias  :string,   range  :std.Array<number>,   base  :number,   exponent  :number,   nice  :boolean,   ticks  :std.Array<any>,   tickInterval  :number,   minTickInterval  :number,   tickCount  :number,   maxTickCount  :number, formatter (v : any, k ? : number): any,   tickMethod  :string | @antv/scale.@antv/scale/lib/types.TickMethod,   mask ? :string}> */
trait ScaleConfig extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var base: js.UndefOr[Double] = js.undefined
  var exponent: js.UndefOr[Double] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function2[/* v */ js.Any, /* k */ js.UndefOr[Double], _]] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxTickCount: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minTickInterval: js.UndefOr[Double] = js.undefined
  var nice: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var tickCount: js.UndefOr[Double] = js.undefined
  var tickInterval: js.UndefOr[Double] = js.undefined
  var tickMethod: js.UndefOr[String | TickMethod] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object ScaleConfig {
  @scala.inline
  def apply(
    alias: String = null,
    base: js.UndefOr[Double] = js.undefined,
    exponent: js.UndefOr[Double] = js.undefined,
    field: String = null,
    formatter: (/* v */ js.Any, /* k */ js.UndefOr[Double]) => _ = null,
    mask: String = null,
    max: js.Any = null,
    maxTickCount: js.UndefOr[Double] = js.undefined,
    min: js.Any = null,
    minTickInterval: js.UndefOr[Double] = js.undefined,
    nice: js.UndefOr[Boolean] = js.undefined,
    range: js.Array[Double] = null,
    tickCount: js.UndefOr[Double] = js.undefined,
    tickInterval: js.UndefOr[Double] = js.undefined,
    tickMethod: String | TickMethod = null,
    ticks: js.Array[_] = null,
    values: js.Array[_] = null
  ): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exponent)) __obj.updateDynamic("exponent")(exponent.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2(formatter))
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTickCount)) __obj.updateDynamic("maxTickCount")(maxTickCount.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minTickInterval)) __obj.updateDynamic("minTickInterval")(minTickInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nice)) __obj.updateDynamic("nice")(nice.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(tickCount)) __obj.updateDynamic("tickCount")(tickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    if (tickMethod != null) __obj.updateDynamic("tickMethod")(tickMethod.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleConfig]
  }
}

