package typings.autoprefixer.mod

import typings.autoprefixer.anon.Browsers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedAPI extends js.Object {
  /** Autoprefixer data */
  var data: Browsers
  /** Autoprefixer default browsers */
  var defaults: js.Any
  /** Inspect with default Autoprefixer */
  def info(): Unit
}

object ExportedAPI {
  @scala.inline
  def apply(data: Browsers, defaults: js.Any, info: () => Unit): ExportedAPI = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], info = js.Any.fromFunction0(info))
    __obj.asInstanceOf[ExportedAPI]
  }
}

