package typings.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ChangeMonth
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.CurrentText
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Disabled
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatetimepicker.ojInputDateSettableProperties> */
trait ojInputDateSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[String]]] = js.undefined
  var autocomplete: js.UndefOr[on | off | String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var converter: js.UndefOr[Converter[String] | RegisteredConverter] = js.undefined
  var datePicker: js.UndefOr[ChangeMonth] = js.undefined
  var dayFormatter: js.UndefOr[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]] = js.undefined
  var dayMetaData: js.UndefOr[StringDictionary[StringDictionary[StringDictionary[Disabled]]]] = js.undefined
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[ConverterHint] = js.undefined
  var help: js.UndefOr[Instruction] = js.undefined
  var helpHints: js.UndefOr[Definition] = js.undefined
  var keyboardEdit: js.UndefOr[enabled | disabled] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var pickerAttributes: js.UndefOr[Class] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rawValue: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var renderMode: js.UndefOr[jet | native] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[CurrentText] = js.undefined
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var validators: js.UndefOr[js.Array[Validator[String] | RegisteredValidator]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ojInputDateSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    asyncValidators: js.Array[AsyncValidator[String]] = null,
    autocomplete: on | off | String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    converter: Converter[String] | RegisteredConverter = null,
    datePicker: ChangeMonth = null,
    dayFormatter: /* param */ DayFormatterInput => Null | all | DayFormatterOutput = null,
    dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]] = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: ConverterHint = null,
    help: Instruction = null,
    helpHints: Definition = null,
    keyboardEdit: enabled | disabled = null,
    labelHint: String = null,
    max: String = null,
    messagesCustom: js.Array[^] = null,
    min: String = null,
    pickerAttributes: Class = null,
    placeholder: String = null,
    rawValue: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    renderMode: jet | native = null,
    required: js.UndefOr[Boolean] = js.undefined,
    translations: CurrentText = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    validators: js.Array[Validator[String] | RegisteredValidator] = null,
    value: String = null
  ): ojInputDateSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.get.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (datePicker != null) __obj.updateDynamic("datePicker")(datePicker.asInstanceOf[js.Any])
    if (dayFormatter != null) __obj.updateDynamic("dayFormatter")(js.Any.fromFunction1(dayFormatter))
    if (dayMetaData != null) __obj.updateDynamic("dayMetaData")(dayMetaData.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (keyboardEdit != null) __obj.updateDynamic("keyboardEdit")(keyboardEdit.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pickerAttributes != null) __obj.updateDynamic("pickerAttributes")(pickerAttributes.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputDateSettablePropertiesLenient]
  }
}

