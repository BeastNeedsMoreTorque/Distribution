package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bing extends js.Object {
  var bing: js.UndefOr[String] = js.undefined
  var google: js.UndefOr[String] = js.undefined
  var googleStatic: js.UndefOr[String] = js.undefined
}

object Bing {
  @scala.inline
  def apply(bing: String = null, google: String = null, googleStatic: String = null): Bing = {
    val __obj = js.Dynamic.literal()
    if (bing != null) __obj.updateDynamic("bing")(bing.asInstanceOf[js.Any])
    if (google != null) __obj.updateDynamic("google")(google.asInstanceOf[js.Any])
    if (googleStatic != null) __obj.updateDynamic("googleStatic")(googleStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bing]
  }
}

