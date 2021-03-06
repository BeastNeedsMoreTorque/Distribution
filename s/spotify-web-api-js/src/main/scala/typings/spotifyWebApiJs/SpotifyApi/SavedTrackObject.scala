package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-track-object)
  */
trait SavedTrackObject extends js.Object {
  var added_at: String
  var track: TrackObjectFull
}

object SavedTrackObject {
  @scala.inline
  def apply(added_at: String, track: TrackObjectFull): SavedTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedTrackObject]
  }
}

