package typings.storybookAddonInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: js.Any
  var description: String
  var propType: js.Object | String
  var property: String
   // TODO: info about what this object is...
  var required: Boolean
}

object DefaultValue {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    description: String,
    propType: js.Object | String,
    property: String,
    required: Boolean
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

