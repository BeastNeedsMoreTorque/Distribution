package typings.reactDatagrid.anon

import typings.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledStyle extends js.Object {
  var disabledStyle: SVGAttributes[js.Object]
  var overStyle: SVGAttributes[js.Object]
  var style: SVGAttributes[js.Object]
}

object DisabledStyle {
  @scala.inline
  def apply(
    disabledStyle: SVGAttributes[js.Object],
    overStyle: SVGAttributes[js.Object],
    style: SVGAttributes[js.Object]
  ): DisabledStyle = {
    val __obj = js.Dynamic.literal(disabledStyle = disabledStyle.asInstanceOf[js.Any], overStyle = overStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledStyle]
  }
}

