package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageItemTypes extends js.Object

@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  @js.native
  sealed trait file extends StorageItemTypes
  
  @js.native
  sealed trait folder extends StorageItemTypes
  
  @js.native
  sealed trait none extends StorageItemTypes
  
}

