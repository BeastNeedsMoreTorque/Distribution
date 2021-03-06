package typings.chromecastCafSender.global.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.SessionStateEventData")
@js.native
class SessionStateEventData protected ()
  extends typings.chromecastCafSender.cast.framework.SessionStateEventData {
  def this(
    session: typings.chromecastCafSender.cast.framework.CastSession,
    sessionState: typings.chromecastCafSender.cast.framework.SessionState,
    opt_errorCode: ErrorCode
  ) = this()
  /* CompleteClass */
  override var errorCode: ErrorCode = js.native
  /* CompleteClass */
  override var session: typings.chromecastCafSender.cast.framework.CastSession = js.native
  /* CompleteClass */
  override var sessionState: typings.chromecastCafSender.cast.framework.SessionState = js.native
  /* CompleteClass */
  override var `type`: String = js.native
}

