package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the resize element value.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Returns the default appointment resizing range .
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: js.Any = null,
    interval: js.UndefOr[Double] = js.undefined,
    model: Model = null,
    `type`: String = null
  ): ResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEventArgs]
  }
}

