package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data that is returned by a server response. */
@JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
@js.native
abstract class ResponseInformation ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation {
  /** Gets the URI that contains the requested data. */
  /* CompleteClass */
  override var actualUri: Uri = js.native
  /** Gets all response headers sent by the server. */
  /* CompleteClass */
  override var headers: IMapView[String, String] = js.native
  /** Gets a value that specifies whether the download is resumable. */
  /* CompleteClass */
  override var isResumable: Boolean = js.native
  /** Gets the status code returned by the server. */
  /* CompleteClass */
  override var statusCode: Double = js.native
}

