package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the transport protocol that the proximity detection process uses. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDProximityDetectionType")
@js.native
object NDProximityDetectionType extends js.Object {
  /* 1 */ val tcp: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.tcp with Double = js.native
  /* 2 */ val transportAgnostic: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.transportAgnostic with Double = js.native
  /* 0 */ val udp: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.udp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType with Double
  ] = js.native
}

