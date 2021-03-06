package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.artist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Artist Object
  * [artist object (full)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectFull extends ArtistObjectSimplified {
  /**
    * Information about the followers of the artist.
    */
  var followers: FollowersObject
  /**
    * A list of the genres the artist is associated with.
    * For example: `"Prog Rock"` , `"Post-Grunge"`.
    * (If not yet classified, the array is empty.)
    */
  var genres: js.Array[String]
  /**
    * Images of the artist in various sizes, widest first.
    */
  var images: js.Array[ImageObject]
  /**
    * The popularity of the artist. The value will be between `0` and `100`, with `100` being the most popular.
    * The artist’s popularity is calculated from the popularity of all the artist’s tracks.
    */
  var popularity: Double
}

object ArtistObjectFull {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    popularity: Double,
    `type`: artist,
    uri: String
  ): ArtistObjectFull = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistObjectFull]
  }
}

