package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
import typings.amapJsApiLineSearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, SearchResult]
  var error: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

