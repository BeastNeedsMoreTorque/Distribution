package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIDResponse extends js.Object {
  /**
    * Cluster on which the user is assigned
    */
  var clusterName: String
  /**
    * Data size used by the user.
    */
  var dataSize: Double
  /**
    * Number of records belonging to the user.
    */
  var nbRecords: Double
  /**
    * userID of the user.
    */
  var userID: String
}

object UserIDResponse {
  @scala.inline
  def apply(clusterName: String, dataSize: Double, nbRecords: Double, userID: String): UserIDResponse = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIDResponse]
  }
}

