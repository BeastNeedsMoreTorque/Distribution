package typings.electron.mod

import typings.electron.Electron.ClientRequestConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "ClientRequest")
@js.native
class ClientRequest protected ()
  extends typings.electron.Electron.ClientRequest {
  def this(options: String) = this()
  /**
    * ClientRequest
    */
  def this(options: ClientRequestConstructorOptions) = this()
}

