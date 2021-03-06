package typings.nodegit.statusFileOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.statusEntryMod.StatusEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusFileOptions
  extends /* key */ StringDictionary[js.Any] {
  var entry: js.UndefOr[StatusEntry] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object StatusFileOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    entry: StatusEntry = null,
    path: String = null,
    status: js.UndefOr[Double] = js.undefined
  ): StatusFileOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusFileOptions]
  }
}

