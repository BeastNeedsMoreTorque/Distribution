package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider
  extends typings.senchaTouch.Ext.field.IField {
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of increment
    * @returns Number
    */
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience method
    * @returns Object
    */
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[typings.senchaTouch.Ext.field.IField]] = js.undefined
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of increment
    * @param increment Number The new value.
    */
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Object The new value.
    */
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Convenience method
    * @param value Object
    */
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IField: typings.senchaTouch.Ext.field.IField = null,
    getCls: () => String = null,
    getIncrement: () => Double = null,
    getMaxValue: () => Double = null,
    getMinValue: () => Double = null,
    getReadOnly: () => Boolean = null,
    getValues: () => _ = null,
    increment: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reset: () => typings.senchaTouch.Ext.field.IField = null,
    setCls: /* cls */ js.UndefOr[String] => Unit = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Unit = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Unit = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Unit = null,
    setTabIndex: /* tabIndex */ js.UndefOr[js.Any] => Unit = null,
    setValues: /* value */ js.UndefOr[js.Any] => Unit = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    if (IField != null) js.Dynamic.global.Object.assign(__obj, IField)
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(js.Any.fromFunction0(getMaxValue))
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(js.Any.fromFunction0(getMinValue))
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(js.Any.fromFunction0(getReadOnly))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1(setTabIndex))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1(setValues))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

