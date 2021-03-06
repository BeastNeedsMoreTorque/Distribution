package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlDateTime extends js.Object {
  /**
    * Returns the date and time in XML Schema time format.
    */
  def get(): String
  /**
    * Set the date.  Accepts only XML Schema time (see XML Schema Part 2: Datatypes Second Edition).
    * The value can be expressed as yyyy-mm-ddThh:mm:sszzzzzz, where T is the separator between the date and the time,
    * and the time zone is either Z(for UTC) or zzzzzz, which represents +/-hh:mm in relation to UTC.
    * Additionally, the value can be expressed as a date only.
    */
  def set(date: String): Unit
}

object KmlDateTime {
  @scala.inline
  def apply(get: () => String, set: String => Unit): KmlDateTime = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[KmlDateTime]
  }
}

