package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlImportance
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ImportanceRuleCondition")
@js.native
class ImportanceRuleCondition protected ()
  extends typings.activexOutlook.Outlook.ImportanceRuleCondition {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var Importance: OlImportance = js.native
  /* CompleteClass */
  @JSName("Outlook.ImportanceRuleCondition_typekey")
  override var OutlookDotImportanceRuleCondition_typekey: typings.activexOutlook.Outlook.ImportanceRuleCondition = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

