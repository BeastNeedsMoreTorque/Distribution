package typings.intercomClient.userMod

import typings.intercomClient.intercomClientStrings.avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var image_url: String | Null
  var `type`: avatar
}

object Avatar {
  @scala.inline
  def apply(`type`: avatar, image_url: String = null): Avatar = {
    val __obj = js.Dynamic.literal(image_url = image_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
}

