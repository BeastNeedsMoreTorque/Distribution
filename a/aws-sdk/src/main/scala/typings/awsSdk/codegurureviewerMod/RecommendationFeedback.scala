package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationFeedback extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.native
  /**
    *  The time at which the feedback was created. 
    */
  var CreatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  /**
    *  The time at which the feedback was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. 
    */
  var Reactions: js.UndefOr[typings.awsSdk.codegurureviewerMod.Reactions] = js.native
  /**
    *  The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. 
    */
  var RecommendationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationId] = js.native
  /**
    *  The ID of the user that made the API call.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserId: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserId] = js.native
}

object RecommendationFeedback {
  @scala.inline
  def apply(
    CodeReviewArn: Arn = null,
    CreatedTimeStamp: TimeStamp = null,
    LastUpdatedTimeStamp: TimeStamp = null,
    Reactions: Reactions = null,
    RecommendationId: RecommendationId = null,
    UserId: UserId = null
  ): RecommendationFeedback = {
    val __obj = js.Dynamic.literal()
    if (CodeReviewArn != null) __obj.updateDynamic("CodeReviewArn")(CodeReviewArn.asInstanceOf[js.Any])
    if (CreatedTimeStamp != null) __obj.updateDynamic("CreatedTimeStamp")(CreatedTimeStamp.asInstanceOf[js.Any])
    if (LastUpdatedTimeStamp != null) __obj.updateDynamic("LastUpdatedTimeStamp")(LastUpdatedTimeStamp.asInstanceOf[js.Any])
    if (Reactions != null) __obj.updateDynamic("Reactions")(Reactions.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationFeedback]
  }
}

