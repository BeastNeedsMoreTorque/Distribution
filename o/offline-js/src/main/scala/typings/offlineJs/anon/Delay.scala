package typings.offlineJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: Double
  var initialDelay: Double
}

object Delay {
  @scala.inline
  def apply(delay: Double, initialDelay: Double): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

