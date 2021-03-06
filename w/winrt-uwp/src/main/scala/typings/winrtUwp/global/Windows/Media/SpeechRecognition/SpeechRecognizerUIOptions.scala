package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the UI settings for the SpeechRecognizer.RecognizeWithUIAsync method. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions")
@js.native
abstract class SpeechRecognizerUIOptions ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions {
  /** Gets or sets the heading text that is displayed on the Listening screen. The default is "Listening...". */
  /* CompleteClass */
  override var audiblePrompt: String = js.native
  /** Gets or sets the example text shown on the Listening screen. */
  /* CompleteClass */
  override var exampleText: String = js.native
  /** Gets or sets whether the recognized text is spoken back to the user on the Heard you say screen. */
  /* CompleteClass */
  override var isReadBackEnabled: Boolean = js.native
  /** Gets or sets whether a Heard you say screen is shown to the user after speech recognition is completed. */
  /* CompleteClass */
  override var showConfirmation: Boolean = js.native
}

