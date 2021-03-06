package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentPathRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the document.
    */
  var DocumentId: IdType = js.native
  /**
    * A comma-separated list of values. Specify NAME to include the names of the parent folders.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.native
  /**
    * The maximum number of levels in the hierarchy to return.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * This value is not supported.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object GetDocumentPathRequest {
  @scala.inline
  def apply(
    DocumentId: IdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: PageMarkerType = null
  ): GetDocumentPathRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentPathRequest]
  }
}

