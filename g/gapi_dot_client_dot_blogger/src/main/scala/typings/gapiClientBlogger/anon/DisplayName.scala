package typings.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  /** The display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The identifier of the Post creator. */
  var id: js.UndefOr[String] = js.undefined
  /** The Post author's avatar. */
  var image: js.UndefOr[Url] = js.undefined
  /** The URL of the Post creator's Profile page. */
  var url: js.UndefOr[String] = js.undefined
}

object DisplayName {
  @scala.inline
  def apply(displayName: String = null, id: String = null, image: Url = null, url: String = null): DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

