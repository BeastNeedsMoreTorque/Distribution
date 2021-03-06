package typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyRotationStatusOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A Boolean value that specifies whether key rotation is enabled.</p>
    */
  var KeyRotationEnabled: js.UndefOr[Boolean] = js.undefined
}

object GetKeyRotationStatusOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyRotationEnabled: js.UndefOr[Boolean] = js.undefined): GetKeyRotationStatusOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(KeyRotationEnabled)) __obj.updateDynamic("KeyRotationEnabled")(KeyRotationEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyRotationStatusOutput]
  }
}

