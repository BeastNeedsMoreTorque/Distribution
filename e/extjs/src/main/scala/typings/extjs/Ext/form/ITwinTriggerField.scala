package typings.extjs.Ext.form

import typings.extjs.Ext.ICompositeElement
import typings.extjs.Ext.IElement
import typings.extjs.Ext.IEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITwinTriggerField
  extends typings.extjs.Ext.form.field.IText {
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Get the total width of the trigger button area
    * @returns Number The total trigger width
    */
  var getTriggerWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[IElement] = js.undefined
  /** [Method] The function that should handle the trigger s click event
    * @param e Ext.EventObject
    */
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the editable state of this field
    * @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
    */
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[ICompositeElement] = js.undefined
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[String] = js.undefined
}

object ITwinTriggerField {
  @scala.inline
  def apply(
    IText: typings.extjs.Ext.form.field.IText = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    getTriggerWidth: () => Double = null,
    hideTrigger: js.UndefOr[Boolean] = js.undefined,
    inputCell: IElement = null,
    onTriggerClick: /* e */ js.UndefOr[IEventObject] => Unit = null,
    repeatTriggerClick: js.UndefOr[Boolean] = js.undefined,
    setEditable: /* editable */ js.UndefOr[Boolean] => Unit = null,
    triggerBaseCls: String = null,
    triggerCls: String = null,
    triggerEl: ICompositeElement = null,
    triggerNoEditCls: String = null,
    triggerWrap: IElement = null,
    triggerWrapCls: String = null
  ): ITwinTriggerField = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (getTriggerWidth != null) __obj.updateDynamic("getTriggerWidth")(js.Any.fromFunction0(getTriggerWidth))
    if (!js.isUndefined(hideTrigger)) __obj.updateDynamic("hideTrigger")(hideTrigger.get.asInstanceOf[js.Any])
    if (inputCell != null) __obj.updateDynamic("inputCell")(inputCell.asInstanceOf[js.Any])
    if (onTriggerClick != null) __obj.updateDynamic("onTriggerClick")(js.Any.fromFunction1(onTriggerClick))
    if (!js.isUndefined(repeatTriggerClick)) __obj.updateDynamic("repeatTriggerClick")(repeatTriggerClick.get.asInstanceOf[js.Any])
    if (setEditable != null) __obj.updateDynamic("setEditable")(js.Any.fromFunction1(setEditable))
    if (triggerBaseCls != null) __obj.updateDynamic("triggerBaseCls")(triggerBaseCls.asInstanceOf[js.Any])
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls.asInstanceOf[js.Any])
    if (triggerEl != null) __obj.updateDynamic("triggerEl")(triggerEl.asInstanceOf[js.Any])
    if (triggerNoEditCls != null) __obj.updateDynamic("triggerNoEditCls")(triggerNoEditCls.asInstanceOf[js.Any])
    if (triggerWrap != null) __obj.updateDynamic("triggerWrap")(triggerWrap.asInstanceOf[js.Any])
    if (triggerWrapCls != null) __obj.updateDynamic("triggerWrapCls")(triggerWrapCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITwinTriggerField]
  }
}

