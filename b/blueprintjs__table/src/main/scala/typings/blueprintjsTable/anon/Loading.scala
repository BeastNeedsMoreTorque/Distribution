package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loading extends js.Object {
  var loading: Boolean
  var renderMode: typings.blueprintjsTable.renderModeMod.RenderMode
}

object Loading {
  @scala.inline
  def apply(loading: Boolean, renderMode: typings.blueprintjsTable.renderModeMod.RenderMode): Loading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
}

