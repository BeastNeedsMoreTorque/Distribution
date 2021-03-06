package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected language for a structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage extends js.Object {
  /**
    * Confidence of detected language. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage {
  @scala.inline
  def apply(confidence: js.UndefOr[Double] = js.undefined, languageCode: String = null): SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]
  }
}

