package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ChildrenLabel
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
import typings.oracleOraclejet.anon.MoreMatchesFound
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojSelectOneSettableProperties<K, D>> */
trait ojSelectOneSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[ConverterHint] = js.undefined
  var help: js.UndefOr[Instruction] = js.undefined
  var helpHints: js.UndefOr[Definition] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var minimumResultsForSearch: js.UndefOr[Double] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* param0 */ OptionContext, Element]] = js.undefined
  var options: js.UndefOr[
    (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]) | (DataProvider[K, D])
  ] = js.undefined
  var optionsKeys: js.UndefOr[ChildrenLabel] = js.undefined
  var pickerAttributes: js.UndefOr[Class] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var renderMode: js.UndefOr[jet | native] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[MoreMatchesFound] = js.undefined
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var valueOption: js.UndefOr[LabelValue] = js.undefined
}

object ojSelectOneSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: ConverterHint = null,
    help: Instruction = null,
    helpHints: Definition = null,
    labelHint: String = null,
    messagesCustom: js.Array[^] = null,
    minimumResultsForSearch: js.UndefOr[Double] = js.undefined,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]) | (DataProvider[K, D]) = null,
    optionsKeys: ChildrenLabel = null,
    pickerAttributes: Class = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderMode: jet | native = null,
    required: js.UndefOr[Boolean] = js.undefined,
    translations: MoreMatchesFound = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    value: js.Any = null,
    valueOption: LabelValue = null
  ): ojSelectOneSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumResultsForSearch)) __obj.updateDynamic("minimumResultsForSearch")(minimumResultsForSearch.get.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    if (pickerAttributes != null) __obj.updateDynamic("pickerAttributes")(pickerAttributes.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueOption != null) __obj.updateDynamic("valueOption")(valueOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSelectOneSettablePropertiesLenient[K, D]]
  }
}

