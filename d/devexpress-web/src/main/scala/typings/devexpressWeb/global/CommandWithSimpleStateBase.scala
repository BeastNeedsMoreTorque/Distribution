package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with a simple common command state.
  */
@JSGlobal("CommandWithSimpleStateBase")
@js.native
abstract class CommandWithSimpleStateBase ()
  extends typings.devexpressWeb.CommandWithSimpleStateBase {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

