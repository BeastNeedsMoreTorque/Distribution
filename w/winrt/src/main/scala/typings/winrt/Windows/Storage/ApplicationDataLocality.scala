package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataLocality extends js.Object

@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends js.Object {
  @js.native
  sealed trait local extends ApplicationDataLocality
  
  @js.native
  sealed trait roaming extends ApplicationDataLocality
  
  @js.native
  sealed trait temporary extends ApplicationDataLocality
  
}

