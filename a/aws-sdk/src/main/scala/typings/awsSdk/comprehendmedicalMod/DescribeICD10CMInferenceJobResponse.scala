package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeICD10CMInferenceJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.native
}

object DescribeICD10CMInferenceJobResponse {
  @scala.inline
  def apply(ComprehendMedicalAsyncJobProperties: ComprehendMedicalAsyncJobProperties = null): DescribeICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ComprehendMedicalAsyncJobProperties != null) __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(ComprehendMedicalAsyncJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeICD10CMInferenceJobResponse]
  }
}

