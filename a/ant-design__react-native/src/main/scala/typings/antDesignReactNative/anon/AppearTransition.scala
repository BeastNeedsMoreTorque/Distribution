package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearTransition extends js.Object {
  var appearTransition: Boolean
  var percent: Double
  var position: String
  var unfilled: Boolean
}

object AppearTransition {
  @scala.inline
  def apply(appearTransition: Boolean, percent: Double, position: String, unfilled: Boolean): AppearTransition = {
    val __obj = js.Dynamic.literal(appearTransition = appearTransition.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], unfilled = unfilled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearTransition]
  }
}

