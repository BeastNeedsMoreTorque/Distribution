package typings.radium.mod.Radium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Radium 0.17 Test mode
/**
  * Used to control internal Radium state and behavior during tests. It is only available in non-production builds.
  */
trait RadiumTestMode extends js.Object {
  /**
    * Clears the global Radium state, currently only the cache of media query listeners.
    */
  def clearState(): Unit
  /**
    * Disables "test mode"
    */
  def disable(): Unit
  /**
    * Enables "test mode", which doesn’t throw or warn as much. Currently it just doesn’t throw when using addCSS without StyleRoot.
    */
  def enable(): Unit
}

object RadiumTestMode {
  @scala.inline
  def apply(clearState: () => Unit, disable: () => Unit, enable: () => Unit): RadiumTestMode = {
    val __obj = js.Dynamic.literal(clearState = js.Any.fromFunction0(clearState), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[RadiumTestMode]
  }
}

