package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassificationExportConfigurationResponse extends js.Object {
  /**
    * The location where data classification results are stored, and the encryption settings that are used when storing results in that location.
    */
  var configuration: js.UndefOr[ClassificationExportConfiguration] = js.native
}

object GetClassificationExportConfigurationResponse {
  @scala.inline
  def apply(configuration: ClassificationExportConfiguration = null): GetClassificationExportConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassificationExportConfigurationResponse]
  }
}

