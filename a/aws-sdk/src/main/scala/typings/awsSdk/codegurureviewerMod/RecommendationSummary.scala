package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationSummary extends js.Object {
  /**
    *  A description of the recommendation generated by CodeGuru Reviewer for the lines of code between the start line and the end line. 
    */
  var Description: js.UndefOr[Text] = js.native
  /**
    *  Last line where the recommendation is applicable in the source commit or source branch. For a single line comment the start line and end line values are the same. 
    */
  var EndLine: js.UndefOr[LineNumber] = js.native
  /**
    * Name of the file on which a recommendation is provided.
    */
  var FilePath: js.UndefOr[typings.awsSdk.codegurureviewerMod.FilePath] = js.native
  /**
    *  The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. 
    */
  var RecommendationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationId] = js.native
  /**
    *  Start line from where the recommendation is applicable in the source commit or source branch. 
    */
  var StartLine: js.UndefOr[LineNumber] = js.native
}

object RecommendationSummary {
  @scala.inline
  def apply(
    Description: Text = null,
    EndLine: js.UndefOr[LineNumber] = js.undefined,
    FilePath: FilePath = null,
    RecommendationId: RecommendationId = null,
    StartLine: js.UndefOr[LineNumber] = js.undefined
  ): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(EndLine)) __obj.updateDynamic("EndLine")(EndLine.get.asInstanceOf[js.Any])
    if (FilePath != null) __obj.updateDynamic("FilePath")(FilePath.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    if (!js.isUndefined(StartLine)) __obj.updateDynamic("StartLine")(StartLine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationSummary]
  }
}

