package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawBarPointersEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the value of the bar pointer.
    */
  var PointerValue: js.UndefOr[Double] = js.undefined
  /** returns the current Bar pointer element.
    */
  var barElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the bar pointer.
    */
  var barPointerIndex: js.UndefOr[Double] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the pointer
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the pointer style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object DrawBarPointersEventArgs {
  @scala.inline
  def apply(
    Model: js.Any = null,
    PointerValue: js.UndefOr[Double] = js.undefined,
    barElement: js.Any = null,
    barPointerIndex: js.UndefOr[Double] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: js.UndefOr[Double] = js.undefined,
    style: String = null,
    `type`: js.Any = null
  ): DrawBarPointersEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (!js.isUndefined(PointerValue)) __obj.updateDynamic("PointerValue")(PointerValue.get.asInstanceOf[js.Any])
    if (barElement != null) __obj.updateDynamic("barElement")(barElement.asInstanceOf[js.Any])
    if (!js.isUndefined(barPointerIndex)) __obj.updateDynamic("barPointerIndex")(barPointerIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleIndex)) __obj.updateDynamic("scaleIndex")(scaleIndex.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawBarPointersEventArgs]
  }
}

