package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.duration
import typings.xrm.xrmStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
  * @see {@link Xrm.Attributes.IntegerAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.duration
  - typings.xrm.xrmStrings.none
*/
trait IntegerAttributeFormat extends js.Object

object IntegerAttributeFormat {
  @scala.inline
  def Duration: duration = "duration".asInstanceOf[duration]
  @scala.inline
  def None: none = "none".asInstanceOf[none]
}

