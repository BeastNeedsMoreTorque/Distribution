package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RegionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsCollection extends js.Object {
  // Retrieves a list of regions.
  def list(profileId: String): RegionsListResponse
}

object RegionsCollection {
  @scala.inline
  def apply(list: String => RegionsListResponse): RegionsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionsCollection]
  }
}

