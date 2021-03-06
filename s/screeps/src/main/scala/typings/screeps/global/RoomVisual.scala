package typings.screeps.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RoomVisual")
@js.native
/**
  * You can create new RoomVisual object using its constructor.
  * @param roomName The room name. If undefined, visuals will be posted to all rooms simultaneously.
  */
class RoomVisual ()
  extends typings.screeps.RoomVisual {
  def this(roomName: String) = this()
}

