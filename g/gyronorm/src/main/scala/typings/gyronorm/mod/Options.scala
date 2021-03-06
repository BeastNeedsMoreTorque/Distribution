package typings.gyronorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * How many digits after the decimal point will there be in the return values
    */
  var decimalCount: js.UndefOr[Double] = js.undefined
  /**
    * How often GyroNorm returns data (in milliseconds)
    */
  var frequency: js.UndefOr[Double] = js.undefined
  /**
    * If the gravity related values to be normalized
    */
  var gravityNormalized: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to be called to log messages from gyronorm.js
    */
  var logger: js.UndefOr[LogListener] = js.undefined
  /**
    * Can be GyroNorm.GAME or GyroNorm.WORLD. gn.GAME returns
    * orientation values with respect to the head direction of the device.
    * gn.WORLD returns the orientation values with respect to the actual
    * north direction of the world.
    */
  var orientationBase: js.UndefOr[String] = js.undefined
  /**
    * If set to true it will return screen adjusted values
    */
  var screenAdjusted: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    decimalCount: js.UndefOr[Double] = js.undefined,
    frequency: js.UndefOr[Double] = js.undefined,
    gravityNormalized: js.UndefOr[Boolean] = js.undefined,
    logger: /* data */ LoggerData => Unit = null,
    orientationBase: String = null,
    screenAdjusted: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimalCount)) __obj.updateDynamic("decimalCount")(decimalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravityNormalized)) __obj.updateDynamic("gravityNormalized")(gravityNormalized.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    if (orientationBase != null) __obj.updateDynamic("orientationBase")(orientationBase.asInstanceOf[js.Any])
    if (!js.isUndefined(screenAdjusted)) __obj.updateDynamic("screenAdjusted")(screenAdjusted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

