package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionStateType extends js.Object

/** An enumeration listing the different states that a connection can have. */
@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends js.Object {
  /** The connection is connected to the contact. */
  @js.native
  sealed trait CONNECTED extends ConnectionStateType
  
  /** The connection is being initialized. */
  @js.native
  sealed trait CONNECTING extends ConnectionStateType
  
  /** The connection is no longer connected to the contact. */
  @js.native
  sealed trait DISCONNECTED extends ConnectionStateType
  
  /** The connection is connected but on hold. */
  @js.native
  sealed trait HOLD extends ConnectionStateType
  
  /** The connection has not yet been initialized. */
  @js.native
  sealed trait INIT extends ConnectionStateType
  
}

