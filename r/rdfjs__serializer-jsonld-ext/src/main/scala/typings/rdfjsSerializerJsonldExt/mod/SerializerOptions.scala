package typings.rdfjsSerializerJsonldExt.mod

import typings.jsonld.jsonldSpecMod.Context
import typings.rdfjsSerializerJsonldExt.rdfjsSerializerJsonldExtStrings.`object`
import typings.rdfjsSerializerJsonldExt.rdfjsSerializerJsonldExtStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var encoding: js.UndefOr[string | `object`] = js.undefined
  var flatten: js.UndefOr[Boolean] = js.undefined
  var frame: js.UndefOr[Boolean] = js.undefined
  var skipContext: js.UndefOr[Boolean] = js.undefined
  var skipGraphProperty: js.UndefOr[Boolean] = js.undefined
}

object SerializerOptions {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    encoding: string | `object` = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    skipContext: js.UndefOr[Boolean] = js.undefined,
    skipGraphProperty: js.UndefOr[Boolean] = js.undefined
  ): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipContext)) __obj.updateDynamic("skipContext")(skipContext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipGraphProperty)) __obj.updateDynamic("skipGraphProperty")(skipGraphProperty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerOptions]
  }
}

