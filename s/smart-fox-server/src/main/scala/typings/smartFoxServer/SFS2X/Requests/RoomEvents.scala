package typings.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomEvents extends js.Object {
  /** @type {boolean} Sets whether or not the userCountChange event should be dispatched whenever the users (or players+spectators) count changes in the Room. */
  var allowUserCountChance: Boolean
  /** @type {boolean} Sets whether the userEnterRoom event should be dispatched whenever a user joins the Room or not. */
  var allowUserEnter: Boolean
  /** @type {boolean} Sets whether the userExitRoom event should be dispatched whenever a user leaves the Room or not. */
  var allowUserExit: Boolean
  /** @type {boolean} Sets whether or not the userVariablesUpdate event should be dispatched whenever a user in the Room updates their User Variables */
  var allowUserVariablesUpdate: Boolean
}

object RoomEvents {
  @scala.inline
  def apply(
    allowUserCountChance: Boolean,
    allowUserEnter: Boolean,
    allowUserExit: Boolean,
    allowUserVariablesUpdate: Boolean
  ): RoomEvents = {
    val __obj = js.Dynamic.literal(allowUserCountChance = allowUserCountChance.asInstanceOf[js.Any], allowUserEnter = allowUserEnter.asInstanceOf[js.Any], allowUserExit = allowUserExit.asInstanceOf[js.Any], allowUserVariablesUpdate = allowUserVariablesUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomEvents]
  }
}

