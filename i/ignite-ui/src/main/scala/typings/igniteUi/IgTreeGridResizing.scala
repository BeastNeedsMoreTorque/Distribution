package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridResizing
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Resize the column to the size of the longest currently visible cell value.
    *
    */
  var allowDoubleClickToResize: js.UndefOr[Boolean] = js.undefined
  /**
    * Event fired after the resizing has been executed and results are rendered
    */
  var columnResized: js.UndefOr[ColumnResizedEvent] = js.undefined
  /**
    * Event fired before a resizing operation is executed.
    */
  var columnResizing: js.UndefOr[ColumnResizingEvent] = js.undefined
  /**
    * Event fired(only when columnFixing is enabled) when trying to resize column in fixed area so total width of unfixed area to be less than minimalVisibleAreaWidth(option defined in columnFixing)
    */
  var columnResizingRefused: js.UndefOr[ColumnResizingRefusedEvent] = js.undefined
  /**
    * A list of column settings that specifies resizing options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridResizingColumnSetting]] = js.undefined
  /**
    * Specifies whether the resizing should be deferred until the user finishes resizing or applied immediately.
    *
    */
  var deferredResizing: js.UndefOr[Boolean] = js.undefined
  /**
    * The width in pixels of the resizing handle which is position at the right side of each resizeable column header.
    *
    */
  var handleThreshold: js.UndefOr[Double] = js.undefined
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object IgTreeGridResizing {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowDoubleClickToResize: js.UndefOr[Boolean] = js.undefined,
    columnResized: (/* event */ Event, /* ui */ ColumnResizedEventUIParam) => Unit = null,
    columnResizing: (/* event */ Event, /* ui */ ColumnResizingEventUIParam) => Unit = null,
    columnResizingRefused: (/* event */ Event, /* ui */ ColumnResizingRefusedEventUIParam) => Unit = null,
    columnSettings: js.Array[IgGridResizingColumnSetting] = null,
    deferredResizing: js.UndefOr[Boolean] = js.undefined,
    handleThreshold: js.UndefOr[Double] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined
  ): IgTreeGridResizing = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowDoubleClickToResize)) __obj.updateDynamic("allowDoubleClickToResize")(allowDoubleClickToResize.get.asInstanceOf[js.Any])
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction2(columnResized))
    if (columnResizing != null) __obj.updateDynamic("columnResizing")(js.Any.fromFunction2(columnResizing))
    if (columnResizingRefused != null) __obj.updateDynamic("columnResizingRefused")(js.Any.fromFunction2(columnResizingRefused))
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(deferredResizing)) __obj.updateDynamic("deferredResizing")(deferredResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleThreshold)) __obj.updateDynamic("handleThreshold")(handleThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridResizing]
  }
}

