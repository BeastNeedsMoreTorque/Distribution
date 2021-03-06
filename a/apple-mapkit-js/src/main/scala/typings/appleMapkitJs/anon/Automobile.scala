package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Automobile extends js.Object {
  /**
    * A constant identifying the mode of transportation as driving.
    */
  val Automobile: String
  /**
    * A constant identifying the mode of transportation as walking.
    */
  val Walking: String
}

object Automobile {
  @scala.inline
  def apply(Automobile: String, Walking: String): Automobile = {
    val __obj = js.Dynamic.literal(Automobile = Automobile.asInstanceOf[js.Any], Walking = Walking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automobile]
  }
}

