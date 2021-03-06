package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionConfigurationProperty extends js.Object {
  /**
    * The description of the action configuration property that is displayed to users.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Whether the configuration property is a key.
    */
  var key: Boolean = js.native
  /**
    * The name of the action configuration property.
    */
  var name: ActionConfigurationKey = js.native
  /**
    * Indicates that the property is used with PollForJobs. When creating a custom action, an action can have up to one queryable property. If it has one, that property must be both required and not secret. If you create a pipeline with a custom action type, and that custom action contains a queryable property, the value for that configuration property is subject to other restrictions. The value must be less than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
    */
  var queryable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the configuration property is a required value.
    */
  var required: Boolean = js.native
  /**
    * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails, GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs. When updating a pipeline, passing * * * * * without changing any other values of the action preserves the previous value of the secret.
    */
  var secret: Boolean = js.native
  /**
    * The type of the configuration property.
    */
  var `type`: js.UndefOr[ActionConfigurationPropertyType] = js.native
}

object ActionConfigurationProperty {
  @scala.inline
  def apply(
    key: Boolean,
    name: ActionConfigurationKey,
    required: Boolean,
    secret: Boolean,
    description: Description = null,
    queryable: js.UndefOr[Boolean] = js.undefined,
    `type`: ActionConfigurationPropertyType = null
  ): ActionConfigurationProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(queryable)) __obj.updateDynamic("queryable")(queryable.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfigurationProperty]
  }
}

