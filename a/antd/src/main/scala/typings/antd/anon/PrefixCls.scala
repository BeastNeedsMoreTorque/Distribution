package typings.antd.anon

import typings.antd.sliderMod.HandleGeneratorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixCls extends js.Object {
  var info: HandleGeneratorInfo
  var prefixCls: js.UndefOr[String] = js.undefined
  var tooltipPrefixCls: js.UndefOr[String] = js.undefined
}

object PrefixCls {
  @scala.inline
  def apply(info: HandleGeneratorInfo, prefixCls: String = null, tooltipPrefixCls: String = null): PrefixCls = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixCls]
  }
}

