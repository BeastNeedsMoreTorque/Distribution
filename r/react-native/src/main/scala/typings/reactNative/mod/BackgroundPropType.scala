package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.RippleAndroid
import typings.reactNative.reactNativeStrings.ThemeAttrAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.RippleBackgroundPropType
  - typings.reactNative.mod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends js.Object

object BackgroundPropType {
  @scala.inline
  def RippleBackgroundPropType(
    `type`: RippleAndroid,
    borderless: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Double] = js.undefined
  ): BackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPropType]
  }
  @scala.inline
  def ThemeAttributeBackgroundPropType(attribute: String, `type`: ThemeAttrAndroid): BackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPropType]
  }
}

