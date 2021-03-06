package typings.kendoUi.kendo.dataviz

import typings.kendoUi.kendo.Observable
import typings.kendoUi.kendo.drawing.Group
import typings.kendoUi.kendo.drawing.MultiPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPlotArea extends Observable {
  var backgroundVisual: MultiPath = js.native
  var options: ChartPlotAreaOptions = js.native
  var visual: Group = js.native
}

