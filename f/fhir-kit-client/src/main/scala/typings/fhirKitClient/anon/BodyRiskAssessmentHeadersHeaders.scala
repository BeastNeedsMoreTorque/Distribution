package typings.fhirKitClient.anon

import typings.fhir.fhir.RiskAssessment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyRiskAssessmentHeadersHeaders extends js.Object {
  var body: RiskAssessment
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.RiskAssessment
}

object BodyRiskAssessmentHeadersHeaders {
  @scala.inline
  def apply(
    body: RiskAssessment,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.RiskAssessment,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyRiskAssessmentHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRiskAssessmentHeadersHeaders]
  }
}

