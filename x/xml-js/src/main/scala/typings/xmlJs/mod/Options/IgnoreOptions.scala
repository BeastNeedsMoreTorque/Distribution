package typings.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreOptions extends js.Object {
  var ignoreAttributes: js.UndefOr[Boolean] = js.undefined
  var ignoreCdata: js.UndefOr[Boolean] = js.undefined
  var ignoreComment: js.UndefOr[Boolean] = js.undefined
  var ignoreDeclaration: js.UndefOr[Boolean] = js.undefined
  var ignoreDoctype: js.UndefOr[Boolean] = js.undefined
  var ignoreInstruction: js.UndefOr[Boolean] = js.undefined
  var ignoreText: js.UndefOr[Boolean] = js.undefined
}

object IgnoreOptions {
  @scala.inline
  def apply(
    ignoreAttributes: js.UndefOr[Boolean] = js.undefined,
    ignoreCdata: js.UndefOr[Boolean] = js.undefined,
    ignoreComment: js.UndefOr[Boolean] = js.undefined,
    ignoreDeclaration: js.UndefOr[Boolean] = js.undefined,
    ignoreDoctype: js.UndefOr[Boolean] = js.undefined,
    ignoreInstruction: js.UndefOr[Boolean] = js.undefined,
    ignoreText: js.UndefOr[Boolean] = js.undefined
  ): IgnoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreOptions]
  }
}

