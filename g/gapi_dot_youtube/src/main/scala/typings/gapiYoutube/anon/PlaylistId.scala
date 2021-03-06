package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistId extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: String
  /**
    * The value that YouTube uses to uniquely identify the item in the playlist.
    */
  var playlistItemId: String
  /**
    *  The resourceId object contains information that identifies the resource that was added to the playlist.
    */
  var resourceId: Kind
}

object PlaylistId {
  @scala.inline
  def apply(playlistId: String, playlistItemId: String, resourceId: Kind): PlaylistId = {
    val __obj = js.Dynamic.literal(playlistId = playlistId.asInstanceOf[js.Any], playlistItemId = playlistItemId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistId]
  }
}

