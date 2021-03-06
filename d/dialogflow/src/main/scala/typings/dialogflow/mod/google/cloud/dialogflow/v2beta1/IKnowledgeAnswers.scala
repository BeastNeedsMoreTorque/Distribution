package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeAnswers. */
trait IKnowledgeAnswers extends js.Object {
  /** KnowledgeAnswers answers */
  var answers: js.UndefOr[js.Array[IAnswer] | Null] = js.undefined
}

object IKnowledgeAnswers {
  @scala.inline
  def apply(answers: js.UndefOr[Null | js.Array[IAnswer]] = js.undefined): IKnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(answers)) __obj.updateDynamic("answers")(answers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnowledgeAnswers]
  }
}

