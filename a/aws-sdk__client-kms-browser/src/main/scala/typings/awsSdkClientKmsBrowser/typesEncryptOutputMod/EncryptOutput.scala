package typings.awsSdkClientKmsBrowser.typesEncryptOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var CiphertextBlob: js.UndefOr[Uint8Array] = js.undefined
  /**
    * <p>The ID of the key used during encryption.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}

object EncryptOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CiphertextBlob: Uint8Array = null, KeyId: String = null): EncryptOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOutput]
  }
}

