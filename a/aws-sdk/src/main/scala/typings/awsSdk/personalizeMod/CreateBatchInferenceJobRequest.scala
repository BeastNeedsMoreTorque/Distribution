package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBatchInferenceJobRequest extends js.Object {
  /**
    * The ARN of the filter to apply to the batch inference job. For more information on using filters, see Using Filters with Amazon Personalize.
    */
  var filterArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in JSON format.
    */
  var jobInput: BatchInferenceJobInput = js.native
  /**
    * The name of the batch inference job to create.
    */
  var jobName: Name = js.native
  /**
    * The path to the Amazon S3 bucket where the job's output will be stored.
    */
  var jobOutput: BatchInferenceJobOutput = js.native
  /**
    * The number of recommendations to retreive.
    */
  var numResults: js.UndefOr[NumBatchResults] = js.native
  /**
    * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input and out Amazon S3 buckets respectively.
    */
  var roleArn: RoleArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference recommendations.
    */
  var solutionVersionArn: Arn = js.native
}

object CreateBatchInferenceJobRequest {
  @scala.inline
  def apply(
    jobInput: BatchInferenceJobInput,
    jobName: Name,
    jobOutput: BatchInferenceJobOutput,
    roleArn: RoleArn,
    solutionVersionArn: Arn,
    filterArn: Arn = null,
    numResults: js.UndefOr[NumBatchResults] = js.undefined
  ): CreateBatchInferenceJobRequest = {
    val __obj = js.Dynamic.literal(jobInput = jobInput.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobOutput = jobOutput.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    if (filterArn != null) __obj.updateDynamic("filterArn")(filterArn.asInstanceOf[js.Any])
    if (!js.isUndefined(numResults)) __obj.updateDynamic("numResults")(numResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchInferenceJobRequest]
  }
}

