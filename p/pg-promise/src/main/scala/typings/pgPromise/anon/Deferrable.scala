package typings.pgPromise.anon

import typings.pgPromise.mod.isolationLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferrable extends js.Object {
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var tiLevel: js.UndefOr[isolationLevel] = js.undefined
}

object Deferrable {
  @scala.inline
  def apply(
    deferrable: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    tiLevel: isolationLevel = null
  ): Deferrable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (tiLevel != null) __obj.updateDynamic("tiLevel")(tiLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferrable]
  }
}

