package typings.adone.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyToOptions extends js.Object {
  /**
    * Base direcotry for paths
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Do not replace existing files
    */
  var ignoreExisting: js.UndefOr[Boolean] = js.undefined
}

object CopyToOptions {
  @scala.inline
  def apply(cwd: String = null, ignoreExisting: js.UndefOr[Boolean] = js.undefined): CopyToOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(ignoreExisting)) __obj.updateDynamic("ignoreExisting")(ignoreExisting)
    __obj.asInstanceOf[CopyToOptions]
  }
}

