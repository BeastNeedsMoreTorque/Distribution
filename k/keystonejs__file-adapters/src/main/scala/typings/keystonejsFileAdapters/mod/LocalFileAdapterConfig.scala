package typings.keystonejsFileAdapters.mod

import typings.keystonejsFileAdapters.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalFileAdapterConfig extends js.Object {
  var getFilename: js.UndefOr[js.Function1[/* options */ Id, String]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var src: String
}

object LocalFileAdapterConfig {
  @scala.inline
  def apply(src: String, getFilename: /* options */ Id => String = null, path: String = null): LocalFileAdapterConfig = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (getFilename != null) __obj.updateDynamic("getFilename")(js.Any.fromFunction1(getFilename))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalFileAdapterConfig]
  }
}

