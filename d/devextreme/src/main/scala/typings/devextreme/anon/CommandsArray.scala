package typings.devextreme.anon

import typings.devextreme.devextremeStrings.autoZoom
import typings.devextreme.devextremeStrings.gridSize
import typings.devextreme.devextremeStrings.pageColor
import typings.devextreme.devextremeStrings.pageOrientation
import typings.devextreme.devextremeStrings.pageSize
import typings.devextreme.devextremeStrings.showGrid
import typings.devextreme.devextremeStrings.snapToGrid
import typings.devextreme.devextremeStrings.units
import typings.devextreme.devextremeStrings.zoomLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandsArray extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ]
  ] = js.undefined
}

object CommandsArray {
  @scala.inline
  def apply(
    commands: js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ] = null
  ): CommandsArray = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsArray]
  }
}

