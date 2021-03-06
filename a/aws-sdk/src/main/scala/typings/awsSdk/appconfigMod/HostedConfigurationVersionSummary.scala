package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedConfigurationVersionSummary extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.native
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.native
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The configuration version.
    */
  var VersionNumber: js.UndefOr[Integer] = js.native
}

object HostedConfigurationVersionSummary {
  @scala.inline
  def apply(
    ApplicationId: Id = null,
    ConfigurationProfileId: Id = null,
    ContentType: StringWithLengthBetween1And255 = null,
    Description: Description = null,
    VersionNumber: js.UndefOr[Integer] = js.undefined
  ): HostedConfigurationVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (ConfigurationProfileId != null) __obj.updateDynamic("ConfigurationProfileId")(ConfigurationProfileId.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedConfigurationVersionSummary]
  }
}

