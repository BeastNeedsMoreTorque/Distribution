package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
trait OpacityAnimation extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control1: Point
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control2: Point
  /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double
  /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
  var duration: Double
  /** Gets the object's final opacity. */
  var finalOpacity: Double
  /** Gets the object's initial opacity. */
  var initialOpacity: Double
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType
}

object OpacityAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): OpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalOpacity = finalOpacity.asInstanceOf[js.Any], initialOpacity = initialOpacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityAnimation]
  }
}

