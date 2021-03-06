package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides optical character recognition (OCR) functionality. */
trait OcrEngine extends js.Object {
  /** Gets the language being used for text recognition. */
  var recognizerLanguage: Language
  /**
    * Scans the specified image for text in the language specified by the RecognizerLanguage property.
    * @param bitmap Represents an uncompressed bitmap.
    * @return The result of the OCR that was initiated by the OcrEngine object.
    */
  def recognizeAsync(bitmap: SoftwareBitmap): IPromiseWithIAsyncOperation[OcrResult]
}

object OcrEngine {
  @scala.inline
  def apply(
    recognizeAsync: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult],
    recognizerLanguage: Language
  ): OcrEngine = {
    val __obj = js.Dynamic.literal(recognizeAsync = js.Any.fromFunction1(recognizeAsync), recognizerLanguage = recognizerLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrEngine]
  }
}

