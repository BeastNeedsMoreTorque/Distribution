package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base class for a collection of objects on a remote client. */
@JSGlobal("SP.ClientObjectCollection")
@js.native
class ClientObjectCollection[T] ()
  extends typings.sharepoint.SP.ClientObjectCollection[T] {
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
}

