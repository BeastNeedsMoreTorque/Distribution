package typings.reactNativeSensorManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNear extends js.Object {
  var isNear: Boolean
  var maxRange: Double
  var value: Double
}

object IsNear {
  @scala.inline
  def apply(isNear: Boolean, maxRange: Double, value: Double): IsNear = {
    val __obj = js.Dynamic.literal(isNear = isNear.asInstanceOf[js.Any], maxRange = maxRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNear]
  }
}

