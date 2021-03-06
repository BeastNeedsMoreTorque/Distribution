package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordQueryProperties extends ClientObject {
  def getQueryPropertyValue(name: String, value: QueryPropertyValue): Unit = js.native
  def get_item(key: String): js.Any = js.native
  def setQueryPropertyValue(name: String): QueryPropertyValue = js.native
  def set_item(key: String, value: js.Any): Unit = js.native
}

