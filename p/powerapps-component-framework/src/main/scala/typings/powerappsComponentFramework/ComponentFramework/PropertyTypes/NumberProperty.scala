package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.NumberMetadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None|FP|Decimal
  */
trait NumberProperty extends Property {
  @JSName("attributes")
  var attributes_NumberProperty: js.UndefOr[NumberMetadata] = js.undefined
  @JSName("raw")
  var raw_NumberProperty: Double | Null
}

object NumberProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attributes: NumberMetadata = null,
    formatted: String = null,
    raw: Double = null.asInstanceOf[Double],
    security: SecurityValues = null
  ): NumberProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberProperty]
  }
}

