package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOrCopyRuleAction extends js.Object {
  val ActionType: OlRuleActionType
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Enabled: Boolean
  var Folder: typings.activexOutlook.Outlook.Folder
  @JSName("Outlook.MoveOrCopyRuleAction_typekey")
  var OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction
  val Parent: js.Any
  val Session: NameSpace
}

object MoveOrCopyRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Folder: Folder,
    OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): MoveOrCopyRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.MoveOrCopyRuleAction_typekey")(OutlookDotMoveOrCopyRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOrCopyRuleAction]
  }
}

