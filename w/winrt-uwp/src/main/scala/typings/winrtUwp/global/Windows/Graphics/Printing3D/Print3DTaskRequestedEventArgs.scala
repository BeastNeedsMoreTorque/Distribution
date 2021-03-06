package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TaskRequested event. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs")
@js.native
abstract class Print3DTaskRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs {
  /** Gets the 3D print job request associated with the Print3DManager . */
  /* CompleteClass */
  override var request: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskRequest = js.native
}

