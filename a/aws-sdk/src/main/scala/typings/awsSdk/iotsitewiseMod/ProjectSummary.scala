package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSummary extends js.Object {
  /**
    * The date the project was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The project's description.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The ID of the project.
    */
  var id: ID = js.native
  /**
    * The date the project was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the project.
    */
  var name: Name = js.native
}

object ProjectSummary {
  @scala.inline
  def apply(
    id: ID,
    name: Name,
    creationDate: Timestamp = null,
    description: Description = null,
    lastUpdateDate: Timestamp = null
  ): ProjectSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
}

