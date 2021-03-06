package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContextFieldInForm extends RenderContextForm {
  var CurrentFieldSchema: FieldSchemaInForm
  var CurrentFieldValue: js.Any
  var CurrentGroup: Group
  var CurrentGroupIdx: Double
  var CurrentItems: js.Array[Item]
}

object RenderContextFieldInForm {
  @scala.inline
  def apply(
    CurrentFieldSchema: FieldSchemaInForm,
    CurrentFieldValue: js.Any,
    CurrentGroup: Group,
    CurrentGroupIdx: Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm,
    BaseViewID: js.UndefOr[Double] = js.undefined,
    CSRCustomLayout: js.UndefOr[Boolean] = js.undefined,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: String = null,
    CurrentLanguage: js.UndefOr[Double] = js.undefined,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: String = null,
    ListTemplateType: js.UndefOr[Double] = js.undefined,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContextFieldInForm => String = null,
    RenderFieldByName: (RenderContextFieldInForm, /* fieldName */ String) => String = null,
    RenderFields: RenderContextFieldInForm => String = null,
    RenderFooter: RenderContextFieldInForm => String = null,
    RenderGroups: RenderContextFieldInForm => String = null,
    RenderHeader: RenderContextFieldInForm => String = null,
    RenderItems: RenderContextFieldInForm => String = null,
    RenderView: RenderContextFieldInForm => String = null,
    SiteClientTag: String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContextFieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], CurrentGroupIdx = CurrentGroupIdx.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItems = CurrentItems.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(BaseViewID)) __obj.updateDynamic("BaseViewID")(BaseViewID.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CSRCustomLayout)) __obj.updateDynamic("CSRCustomLayout")(CSRCustomLayout.get.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode.asInstanceOf[js.Any])
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentLanguage)) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.get.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems.asInstanceOf[js.Any])
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName.asInstanceOf[js.Any])
    if (!js.isUndefined(ListTemplateType)) __obj.updateDynamic("ListTemplateType")(ListTemplateType.get.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1(RenderBody))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2(RenderFieldByName))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1(RenderFields))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1(RenderFooter))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1(RenderGroups))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1(RenderHeader))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1(RenderItems))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1(RenderView))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag.asInstanceOf[js.Any])
    if (Templates != null) __obj.updateDynamic("Templates")(Templates.asInstanceOf[js.Any])
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInForm]
  }
}

