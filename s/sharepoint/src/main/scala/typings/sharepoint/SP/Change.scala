package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends ClientObject {
  def get_changeToken(): ChangeToken = js.native
  def get_changeType(): ChangeType = js.native
  def get_siteId(): Guid = js.native
  def get_time(): Date = js.native
}

