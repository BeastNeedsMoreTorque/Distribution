package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyTrigger")
@js.native
class SurveyTrigger () extends Trigger {
  val isOnNextPage: Boolean = js.native
  val owner: ISurveyTriggerOwner = js.native
  var ownerValue: ISurveyTriggerOwner = js.native
  def setOwner(owner: ISurveyTriggerOwner): Unit = js.native
}

