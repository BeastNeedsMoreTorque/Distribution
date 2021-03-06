package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies information about a single property failed to be set.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
trait SetPropertyTolerantFailed extends js.Object {
  /** specifies the name of the property. */
  var Name: String
  /**
    * specifies the success or error code for setting the properties value.
    *
    * Since the property was not successful set the result will never be {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    * @see com.sun.star.beans.TolerantPropertySetResultType
    */
  var Result: Double
}

object SetPropertyTolerantFailed {
  @scala.inline
  def apply(Name: String, Result: Double): SetPropertyTolerantFailed = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPropertyTolerantFailed]
  }
}

