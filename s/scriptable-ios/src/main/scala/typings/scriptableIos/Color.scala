package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Stores color data including opacity._
  *
  * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
  * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
  * @see https://docs.scriptable.app/color/#-new-color
  */
trait Color extends js.Object {
  /**
    * _Alpha of the color._
    * @see https://docs.scriptable.app/color/#alpha
    */
  var alpha: Double
  /**
    * _Amount of blue in the color._
    * @see https://docs.scriptable.app/color/#blue
    */
  var blue: Double
  /**
    * _Amount of green in the color._
    * @see https://docs.scriptable.app/color/#green
    */
  var green: Double
  /**
    * _HEX representation._
    * @see https://docs.scriptable.app/color/#hex
    */
  var hex: String
  /**
    * _Amount of red in the color._
    * @see https://docs.scriptable.app/color/#red
    */
  var red: Double
}

object Color {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, hex: String, red: Double): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

