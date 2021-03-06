package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verification extends js.Object {
  var clientSpecificActorInfo: js.UndefOr[YoutubeActorInfo] = js.native
  var displayName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[Url] = js.native
  var url: js.UndefOr[String] = js.native
  var verification: js.UndefOr[AdHocVerified] = js.native
}

object Verification {
  @scala.inline
  def apply(
    clientSpecificActorInfo: YoutubeActorInfo = null,
    displayName: String = null,
    id: String = null,
    image: Url = null,
    url: String = null,
    verification: AdHocVerified = null
  ): Verification = {
    val __obj = js.Dynamic.literal()
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
}

