package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for elements the Crosshair Cursor displays in the legend.
  */
@JSGlobal("ASPxClientCrosshairLegendElementBase")
@js.native
class ASPxClientCrosshairLegendElementBase ()
  extends typings.devexpressWeb.ASPxClientCrosshairLegendElementBase {
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    */
  /* CompleteClass */
  override var AxisLabelElement: typings.devexpressWeb.ASPxClientCrosshairAxisLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's line element to custom draw the crosshair.
    */
  /* CompleteClass */
  override var LineElement: typings.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  /* CompleteClass */
  override var Point: typings.devexpressWeb.ASPxClientSeriesPoint = js.native
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

