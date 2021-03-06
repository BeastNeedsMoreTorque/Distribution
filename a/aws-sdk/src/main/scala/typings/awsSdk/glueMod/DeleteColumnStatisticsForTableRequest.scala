package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteColumnStatisticsForTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the column.
    */
  var ColumnName: NameString = js.native
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}

object DeleteColumnStatisticsForTableRequest {
  @scala.inline
  def apply(
    ColumnName: NameString,
    DatabaseName: NameString,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): DeleteColumnStatisticsForTableRequest = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteColumnStatisticsForTableRequest]
  }
}

