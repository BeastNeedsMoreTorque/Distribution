package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProfileMediaType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
@js.native
object ProfileMediaType extends js.Object {
  @js.native
  sealed trait wlan extends ProfileMediaType
  
  @js.native
  sealed trait wwan extends ProfileMediaType
  
}

