package typings.awsSdkClientDynamodbNode.typesListGlobalTablesOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesGlobalTableMod.UnmarshalledGlobalTable
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGlobalTablesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>List of global table names.</p>
    */
  var GlobalTables: js.UndefOr[js.Array[UnmarshalledGlobalTable]] = js.undefined
  /**
    * <p>Last evaluated global table name.</p>
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.undefined
}

object ListGlobalTablesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    GlobalTables: js.Array[UnmarshalledGlobalTable] = null,
    LastEvaluatedGlobalTableName: String = null
  ): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (GlobalTables != null) __obj.updateDynamic("GlobalTables")(GlobalTables.asInstanceOf[js.Any])
    if (LastEvaluatedGlobalTableName != null) __obj.updateDynamic("LastEvaluatedGlobalTableName")(LastEvaluatedGlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
}

