package typings.fhirKitClient.anon

import typings.fhir.fhir.ImmunizationRecommendation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyImmunizationRecommendation extends js.Object {
  var body: ImmunizationRecommendation
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation
}

object BodyImmunizationRecommendation {
  @scala.inline
  def apply(
    body: ImmunizationRecommendation,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyImmunizationRecommendation]
  }
}

