package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImportedKeyMaterialRequest extends js.Object {
  /**
    * Identifies the CMK from which you are deleting imported key material. The Origin of the CMK must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
}

object DeleteImportedKeyMaterialRequest {
  @scala.inline
  def apply(KeyId: KeyIdType): DeleteImportedKeyMaterialRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImportedKeyMaterialRequest]
  }
}

