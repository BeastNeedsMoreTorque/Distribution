package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientContext extends ClientRuntimeContext {
  def get_serverVersion(): String = js.native
  def get_site(): Site = js.native
  def get_web(): Web = js.native
}

