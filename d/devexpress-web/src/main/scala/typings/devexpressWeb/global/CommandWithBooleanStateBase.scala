package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with the Boolean state.
  */
@JSGlobal("CommandWithBooleanStateBase")
@js.native
abstract class CommandWithBooleanStateBase ()
  extends typings.devexpressWeb.CommandWithBooleanStateBase {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

