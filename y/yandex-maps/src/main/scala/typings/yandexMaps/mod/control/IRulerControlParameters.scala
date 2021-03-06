package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRulerControlParameters extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[Position] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object IRulerControlParameters {
  @scala.inline
  def apply(data: js.Object = null, options: Position = null, state: js.Object = null): IRulerControlParameters = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRulerControlParameters]
  }
}

