package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagram class.
  */
trait ASPxClientXYDiagram extends ASPxClientXYDiagram2D {
  /**
    * Gets a value indicating whether the diagram is rotated.
    */
  var rotated: Boolean
}

object ASPxClientXYDiagram {
  @scala.inline
  def apply(
    DiagramToPoint: (js.Any, js.Any, ASPxClientAxis2D, ASPxClientAxis2D, ASPxClientXYDiagramPane) => ASPxClientControlCoordinates,
    PointToDiagram: (Double, Double) => ASPxClientDiagramCoordinates,
    ShowCrosshair: (Double, Double) => Unit,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart,
    defaultPane: ASPxClientXYDiagramPane,
    panes: js.Array[ASPxClientXYDiagramPane],
    rotated: Boolean,
    secondaryAxesX: js.Array[ASPxClientAxis],
    secondaryAxesY: js.Array[ASPxClientAxis]
  ): ASPxClientXYDiagram = {
    val __obj = js.Dynamic.literal(DiagramToPoint = js.Any.fromFunction5(DiagramToPoint), PointToDiagram = js.Any.fromFunction2(PointToDiagram), ShowCrosshair = js.Any.fromFunction2(ShowCrosshair), axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], defaultPane = defaultPane.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], rotated = rotated.asInstanceOf[js.Any], secondaryAxesX = secondaryAxesX.asInstanceOf[js.Any], secondaryAxesY = secondaryAxesY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagram]
  }
}

