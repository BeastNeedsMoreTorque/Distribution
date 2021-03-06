package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common methods/properties for IPv4 and IPv6 classes.
trait IP extends js.Object {
  def prefixLengthFromSubnetMask(): Double | Null
  def toByteArray(): js.Array[Double]
  def toNormalizedString(): String
}

object IP {
  @scala.inline
  def apply(
    prefixLengthFromSubnetMask: () => Double | Null,
    toByteArray: () => js.Array[Double],
    toNormalizedString: () => String
  ): IP = {
    val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = js.Any.fromFunction0(prefixLengthFromSubnetMask), toByteArray = js.Any.fromFunction0(toByteArray), toNormalizedString = js.Any.fromFunction0(toNormalizedString))
    __obj.asInstanceOf[IP]
  }
}

