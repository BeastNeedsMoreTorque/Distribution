package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSettings extends js.Object {
  //width: number;
  //height: number;
  //aspectRatio: number;
  //frameRate: number;
  //facingMode: string;
  //volume: number;
  //sampleRate: number;
  //sampleSize: number;
  //echoCancellation: boolean;
  var latency: js.UndefOr[Double] = js.undefined
}

object MediaTrackSettings {
  @scala.inline
  def apply(latency: js.UndefOr[Double] = js.undefined): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

