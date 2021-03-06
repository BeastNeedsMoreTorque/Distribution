package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertRequest
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchInsertResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateRequest
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConversionsBatchUpdateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsCollection extends js.Object {
  // Inserts conversions.
  def batchinsert(resource: ConversionsBatchInsertRequest, profileId: String): ConversionsBatchInsertResponse
  // Updates existing conversions.
  def batchupdate(resource: ConversionsBatchUpdateRequest, profileId: String): ConversionsBatchUpdateResponse
}

object ConversionsCollection {
  @scala.inline
  def apply(
    batchinsert: (ConversionsBatchInsertRequest, String) => ConversionsBatchInsertResponse,
    batchupdate: (ConversionsBatchUpdateRequest, String) => ConversionsBatchUpdateResponse
  ): ConversionsCollection = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction2(batchinsert), batchupdate = js.Any.fromFunction2(batchupdate))
    __obj.asInstanceOf[ConversionsCollection]
  }
}

