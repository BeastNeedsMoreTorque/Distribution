package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringAnimationConfig extends AnimationConfig {
  var bounciness: js.UndefOr[Double] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var overshootClamping: js.UndefOr[Boolean] = js.undefined
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var tension: js.UndefOr[Double] = js.undefined
  var toValue: Double | AnimatedValue | X | AnimatedValueXY
  var velocity: js.UndefOr[Double | X] = js.undefined
}

object SpringAnimationConfig {
  @scala.inline
  def apply(
    toValue: Double | AnimatedValue | X | AnimatedValueXY,
    useNativeDriver: Boolean,
    bounciness: js.UndefOr[Double] = js.undefined,
    damping: js.UndefOr[Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    overshootClamping: js.UndefOr[Boolean] = js.undefined,
    restDisplacementThreshold: js.UndefOr[Double] = js.undefined,
    restSpeedThreshold: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    tension: js.UndefOr[Double] = js.undefined,
    velocity: Double | X = null
  ): SpringAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(bounciness)) __obj.updateDynamic("bounciness")(bounciness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootClamping)) __obj.updateDynamic("overshootClamping")(overshootClamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDisplacementThreshold)) __obj.updateDynamic("restDisplacementThreshold")(restDisplacementThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restSpeedThreshold)) __obj.updateDynamic("restSpeedThreshold")(restSpeedThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tension)) __obj.updateDynamic("tension")(tension.get.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringAnimationConfig]
  }
}

