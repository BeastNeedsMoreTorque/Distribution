package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestOnErrorOccurredEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object WebRequestOnErrorOccurredEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, RequestFilter) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebRequestOnErrorOccurredEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebRequestOnErrorOccurredEvent[TCallback]]
  }
}

