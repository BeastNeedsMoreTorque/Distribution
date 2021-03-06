package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.none
import typings.xrm.xrmStrings.recommended
import typings.xrm.xrmStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
  * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
  * @see {@link Xrm.Attributes.RequirementLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.none
  - typings.xrm.xrmStrings.recommended
  - typings.xrm.xrmStrings.required
*/
trait AttributeRequirementLevel extends js.Object

object AttributeRequirementLevel {
  @scala.inline
  def None: none = "none".asInstanceOf[none]
  @scala.inline
  def Recommended: recommended = "recommended".asInstanceOf[recommended]
  @scala.inline
  def Required: required = "required".asInstanceOf[required]
}

