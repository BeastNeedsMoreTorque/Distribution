package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusPreset extends js.Object

/** Defines the values for the possible focus presets. */
@JSGlobal("Windows.Media.Devices.FocusPreset")
@js.native
object FocusPreset extends js.Object {
  /** Indicates that focus is automatically set by the capture. */
  @js.native
  sealed trait auto extends FocusPreset
  
  /** Indicates that the capture device uses a hyperfocal autofocus range. */
  @js.native
  sealed trait autoHyperfocal extends FocusPreset
  
  /** Indicates that the capture device uses an infinite autofocus range. */
  @js.native
  sealed trait autoInfinity extends FocusPreset
  
  /** Indicates that the capture device uses a close autofocus range. */
  @js.native
  sealed trait autoMacro extends FocusPreset
  
  /** Indicates that the capture device uses a normal autofocus range. */
  @js.native
  sealed trait autoNormal extends FocusPreset
  
  /** Indicates that focus is manually set. */
  @js.native
  sealed trait manual extends FocusPreset
  
}

