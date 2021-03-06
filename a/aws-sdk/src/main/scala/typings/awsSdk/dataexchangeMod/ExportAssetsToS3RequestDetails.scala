package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetsToS3RequestDetails extends js.Object {
  /**
    * The destination for the asset.
    */
  var AssetDestinations: ListOfAssetDestinationEntry = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * Encryption configuration for the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.native
  /**
    * The unique identifier for the revision associated with this export request.
    */
  var RevisionId: Id = js.native
}

object ExportAssetsToS3RequestDetails {
  @scala.inline
  def apply(
    AssetDestinations: ListOfAssetDestinationEntry,
    DataSetId: Id,
    RevisionId: Id,
    Encryption: ExportServerSideEncryption = null
  ): ExportAssetsToS3RequestDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetsToS3RequestDetails]
  }
}

