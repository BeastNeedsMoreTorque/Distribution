package typings.pusherChatkitClient.chatmanagerMod

import typings.pusherChatkitClient.hooksMod.RoomHook
import typings.pusherChatkitClient.hooksMod.RoomUserHook
import typings.pusherChatkitClient.hooksMod.UserPresenceHook
import typings.pusherChatkitClient.hooksMod.UserPresenceState
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHooks extends js.Object {
  @JSName("onAddedToRoom")
  var onAddedToRoom_Original: RoomHook = js.native
  @JSName("onNewReadCursor")
  var onNewReadCursor_Original: RoomUserHook = js.native
  @JSName("onPresenceChanged")
  var onPresenceChanged_Original: UserPresenceHook = js.native
  @JSName("onRemovedFromRoom")
  var onRemovedFromRoom_Original: RoomHook = js.native
  @JSName("onRoomDeleted")
  var onRoomDeleted_Original: RoomHook = js.native
  @JSName("onRoomUpdated")
  var onRoomUpdated_Original: RoomHook = js.native
  @JSName("onUserJoinedRoom")
  var onUserJoinedRoom_Original: RoomUserHook = js.native
  @JSName("onUserLeftRoom")
  var onUserLeftRoom_Original: RoomUserHook = js.native
  @JSName("onUserStartedTyping")
  var onUserStartedTyping_Original: RoomUserHook = js.native
  @JSName("onUserStoppedTyping")
  var onUserStoppedTyping_Original: RoomUserHook = js.native
  def onAddedToRoom(room: PusherRoom): Unit = js.native
  def onNewReadCursor(room: PusherRoom, user: PusherUser): Unit = js.native
  def onPresenceChanged(state: UserPresenceState, user: PusherUser): Unit = js.native
  def onRemovedFromRoom(room: PusherRoom): Unit = js.native
  def onRoomDeleted(room: PusherRoom): Unit = js.native
  def onRoomUpdated(room: PusherRoom): Unit = js.native
  def onUserJoinedRoom(room: PusherRoom, user: PusherUser): Unit = js.native
  def onUserLeftRoom(room: PusherRoom, user: PusherUser): Unit = js.native
  def onUserStartedTyping(room: PusherRoom, user: PusherUser): Unit = js.native
  def onUserStoppedTyping(room: PusherRoom, user: PusherUser): Unit = js.native
}

