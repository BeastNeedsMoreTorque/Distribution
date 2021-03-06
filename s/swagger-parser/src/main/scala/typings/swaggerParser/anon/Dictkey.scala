package typings.swaggerParser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
  var json: js.UndefOr[ParserOptions | Boolean] = js.undefined
  var text: js.UndefOr[ParserOptionsencodingstri | Boolean] = js.undefined
  var yaml: js.UndefOr[ParserOptions | Boolean] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] = null,
    json: ParserOptions | Boolean = null,
    text: ParserOptionsencodingstri | Boolean = null,
    yaml: ParserOptions | Boolean = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (yaml != null) __obj.updateDynamic("yaml")(yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

