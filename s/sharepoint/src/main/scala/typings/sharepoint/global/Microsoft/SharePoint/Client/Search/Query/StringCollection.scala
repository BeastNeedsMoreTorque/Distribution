package typings.sharepoint.global.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.IEnumerator
import typings.sharepoint.SP.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.StringCollection")
@js.native
class StringCollection protected ()
  extends typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.StringCollection {
  def this(context: ClientContext) = this()
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[String] = js.native
}

