package typings.winrtUwp.global.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Devices.AllJoyn.IAllJoynAcceptSessionJoiner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs")
@js.native
class AllJoynAcceptSessionJoinerEventArgs protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs {
  /**
    * Generates an object containing information about the connection being accepted to the session and the method that completes the session join.
    * @param uniqueName The unique bus name.
    * @param sessionPort The session port used for the connection.
    * @param trafficType The type of traffic provided over the connection.
    * @param proximity Indicates network proximity.
    * @param acceptSessionJoiner The IAllJoynAcceptSessionJoiner object used to complete the session join.
    */
  def this(
    uniqueName: String,
    sessionPort: Double,
    trafficType: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType,
    proximity: Double,
    acceptSessionJoiner: IAllJoynAcceptSessionJoiner
  ) = this()
  /** Indicates if the app joining the session is on the same network. */
  /* CompleteClass */
  override var sameNetwork: Boolean = js.native
  /** The app joining the session is on the same physical node. */
  /* CompleteClass */
  override var samePhysicalNode: Boolean = js.native
  /** The session port being used to connect to the session. */
  /* CompleteClass */
  override var sessionPort: Double = js.native
  /** The traffic type supported during the session. */
  /* CompleteClass */
  override var trafficType: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType = js.native
  /** The unique bus name of the app requesting a session connection. */
  /* CompleteClass */
  override var uniqueName: String = js.native
  /** Called to accept the session connection. */
  /* CompleteClass */
  override def accept(): Unit = js.native
}

