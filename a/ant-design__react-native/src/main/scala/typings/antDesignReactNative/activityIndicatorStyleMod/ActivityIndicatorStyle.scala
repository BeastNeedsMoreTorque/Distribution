package typings.antDesignReactNative.activityIndicatorStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorStyle extends js.Object {
  var container: ViewStyle
  var innerContainer: ViewStyle
  var spinner: ViewStyle
  var tip: TextStyle
  var toast: TextStyle
  var wrapper: ViewStyle
}

object ActivityIndicatorStyle {
  @scala.inline
  def apply(
    container: ViewStyle,
    innerContainer: ViewStyle,
    spinner: ViewStyle,
    tip: TextStyle,
    toast: TextStyle,
    wrapper: ViewStyle
  ): ActivityIndicatorStyle = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorStyle]
  }
}

