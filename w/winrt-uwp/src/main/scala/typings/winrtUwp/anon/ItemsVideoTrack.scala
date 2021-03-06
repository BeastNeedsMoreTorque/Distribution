package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.VideoTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsVideoTrack extends js.Object {
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack
  /** The number of video tracks retrieved. */ var returnValue: Double
}

object ItemsVideoTrack {
  @scala.inline
  def apply(items: VideoTrack, returnValue: Double): ItemsVideoTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsVideoTrack]
  }
}

