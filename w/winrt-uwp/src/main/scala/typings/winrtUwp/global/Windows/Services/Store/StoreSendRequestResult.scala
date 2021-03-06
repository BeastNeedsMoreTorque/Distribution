package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.Web.Http.HttpStatusCode
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that is sent to the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreSendRequestResult")
@js.native
abstract class StoreSendRequestResult ()
  extends typings.winrtUwp.Windows.Services.Store.StoreSendRequestResult {
  /** Gets the error code for the request, if the operation encountered an error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
  /** Gets the HTTP status code for the request. */
  /* CompleteClass */
  override var httpStatusCode: HttpStatusCode = js.native
  /** Gets the response data for the request. */
  /* CompleteClass */
  override var response: String = js.native
}

