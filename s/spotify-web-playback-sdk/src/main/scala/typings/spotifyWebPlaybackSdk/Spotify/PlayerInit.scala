package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerInit extends js.Object {
  var name: String
  var volume: js.UndefOr[Double] = js.undefined
  def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit
}

object PlayerInit {
  @scala.inline
  def apply(
    getOAuthToken: js.Function1[/* token */ String, Unit] => Unit,
    name: String,
    volume: js.UndefOr[Double] = js.undefined
  ): PlayerInit = {
    val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
}

