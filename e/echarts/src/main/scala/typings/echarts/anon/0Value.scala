package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0Value` extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.0
    */
  var `0`: js.UndefOr[Value] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1
    */
  var `1`: js.UndefOr[Value] = js.undefined
}

object `0Value` {
  @scala.inline
  def apply(`0`: Value = null, `1`: Value = null): `0Value` = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Value`]
  }
}

