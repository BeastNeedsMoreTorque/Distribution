package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  /** A hash of the XPI file, using sha256 or stronger. */
  var hash: js.UndefOr[String] = js.undefined
  /** URL pointing to the XPI file on addons.mozilla.org or similar. */
  var url: HttpURL
}

object Hash {
  @scala.inline
  def apply(url: HttpURL, hash: String = null): Hash = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

