package typings.blissfuljs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropertyName
  extends /* propertyName */ StringDictionary[js.Any] {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var constructor: js.UndefOr[js.Function] = js.undefined
  var `extends`: js.UndefOr[js.Function] = js.undefined
  var `lazy`: js.UndefOr[js.Object] = js.undefined
  var live: js.UndefOr[js.Object] = js.undefined
  var static: js.UndefOr[js.Object] = js.undefined
}

object DictpropertyName {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    constructor: js.Function = null,
    `extends`: js.Function = null,
    `lazy`: js.Object = null,
    live: js.Object = null,
    static: js.Object = null
  ): DictpropertyName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.get.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(constructor.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (live != null) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropertyName]
  }
}

