package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Windows.Media.Ocr namespace provides classes for optical character recognition (OCR) that enable Windows Runtime apps to read and interpret text from images. */
@JSGlobal("Windows.Media.Ocr")
@js.native
object Ocr extends js.Object {
  /** Provides optical character recognition (OCR) functionality. */
  @js.native
  abstract class OcrEngine ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrEngine {
    /** Gets the language being used for text recognition. */
    /* CompleteClass */
    override var recognizerLanguage: Language = js.native
    /**
      * Scans the specified image for text in the language specified by the RecognizerLanguage property.
      * @param bitmap Represents an uncompressed bitmap.
      * @return The result of the OCR that was initiated by the OcrEngine object.
      */
    /* CompleteClass */
    override def recognizeAsync(bitmap: SoftwareBitmap): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Ocr.OcrResult] = js.native
  }
  
  /** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
  @js.native
  abstract class OcrLine ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrLine {
    /** Gets the text of the recognized line. */
    /* CompleteClass */
    override var text: String = js.native
    /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
    /* CompleteClass */
    override var words: IVectorView[typings.winrtUwp.Windows.Media.Ocr.OcrWord] = js.native
  }
  
  /** Contains the results of Optical Character Recognition (OCR). */
  @js.native
  abstract class OcrResult ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrResult {
    /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
    /* CompleteClass */
    override var lines: IVectorView[typings.winrtUwp.Windows.Media.Ocr.OcrLine] = js.native
    /** Gets the recognized text. */
    /* CompleteClass */
    override var text: String = js.native
    /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
    /* CompleteClass */
    override var textAngle: Double = js.native
  }
  
  /** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
  @js.native
  abstract class OcrWord ()
    extends typings.winrtUwp.Windows.Media.Ocr.OcrWord {
    /** Gets the position and size in pixels of the recognized word from the top left corner of image when the value of TextAngle property is 0 (zero). */
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /** Gets the text of the recognized word. */
    /* CompleteClass */
    override var text: String = js.native
  }
  
  /* static members */
  @js.native
  object OcrEngine extends js.Object {
    /** Returns a collection of all available OCR languages on the device. */
    var availableRecognizerLanguages: IVectorView[Language] = js.native
    /** Gets the maximum image pixel dimensions supported by the OCR engine. */
    var maxImageDimension: Double = js.native
    /**
      * Returns true if a specified language can be resolved to any of the available OCR languages. See language matching for a further explanation of language resolving.
      * @param language The language being used for text recognition.
      * @return TRUE, if the specified language can be resolved to any of the available OCR languages; otherwise, FALSE.
      */
    def isLanguageSupported(language: Language): Boolean = js.native
    /**
      * Creates a new instance of the OcrEngine class.
      * @param language The language being used for text recognition.
      * @return If the specified language can be resolved to any of the OCR languages available on the device, returns new instance of OcrEngine class, otherwise returns null. See language matching for a further explanation of language resolving.
      */
    def tryCreateFromLanguage(language: Language): typings.winrtUwp.Windows.Media.Ocr.OcrEngine = js.native
    /**
      * Creates a new instance of the OcrEngine class.
      * @return If any language from GlobalizationPreferences.Languages can be resolved to any of the available OCR languages returns new instance of OcrEngine class, otherwise returns null.
      */
    def tryCreateFromUserProfileLanguages(): typings.winrtUwp.Windows.Media.Ocr.OcrEngine = js.native
  }
  
}

