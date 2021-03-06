package typings.reactTextareaAutosize.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.react.mod.RefObject
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaAutosizeProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement] {
  /**
    * Allows an owner to retrieve the DOM node.
    */
  var inputRef: js.UndefOr[
    (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | RefObject[HTMLTextAreaElement]
  ] = js.undefined
  /**
    * Maximum number of rows to show.
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  /**
    * Alias for `rows`.
    */
  var minRows: js.UndefOr[Double] = js.undefined
  /**
    * Callback on value change
    * @param event
    */
  @JSName("onChange")
  var onChange_TextareaAutosizeProps: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]] = js.undefined
  /**
    * Callback on height change
    * @param height
    */
  var onHeightChange: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
  /**
    * Try to cache DOM measurements performed by component so that we don't
    * touch DOM when it's not needed.
    *
    * This optimization doesn't work if we dynamically style `<textarea />`
    * component.
    * @default false
    */
  var useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.undefined
  /**
    * Current textarea value
    */
  @JSName("value")
  var value_TextareaAutosizeProps: js.UndefOr[String] = js.undefined
}

object TextareaAutosizeProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLTextAreaElement] = null,
    ClassAttributes: ClassAttributes[HTMLTextAreaElement] = null,
    inputRef: (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | RefObject[HTMLTextAreaElement] = null,
    maxRows: js.UndefOr[Double] = js.undefined,
    minRows: js.UndefOr[Double] = js.undefined,
    onChange: /* event */ ChangeEvent[HTMLTextAreaElement] => Unit = null,
    onHeightChange: /* height */ Double => Unit = null,
    useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): TextareaAutosizeProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRows)) __obj.updateDynamic("maxRows")(maxRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRows)) __obj.updateDynamic("minRows")(minRows.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onHeightChange != null) __obj.updateDynamic("onHeightChange")(js.Any.fromFunction1(onHeightChange))
    if (!js.isUndefined(useCacheForDOMMeasurements)) __obj.updateDynamic("useCacheForDOMMeasurements")(useCacheForDOMMeasurements.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaAutosizeProps]
  }
}

