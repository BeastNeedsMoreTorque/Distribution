package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
@JSGlobal("Windows.Media.Core.MediaSourceOpenOperationCompletedEventArgs")
@js.native
abstract class MediaSourceOpenOperationCompletedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Core.MediaSourceOpenOperationCompletedEventArgs {
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  /* CompleteClass */
  override var error: typings.winrtUwp.Windows.Media.Core.MediaSourceError = js.native
}

