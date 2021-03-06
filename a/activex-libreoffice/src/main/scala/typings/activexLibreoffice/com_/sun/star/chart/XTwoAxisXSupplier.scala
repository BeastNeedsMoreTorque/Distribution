package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to both the primary and the secondary **x** -axis of a chart.
  * @see XDiagram
  */
trait XTwoAxisXSupplier extends XAxisXSupplier {
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryXAxis: XPropertySet
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryXAxis(): XPropertySet
}

object XTwoAxisXSupplier {
  @scala.inline
  def apply(
    SecondaryXAxis: XPropertySet,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryXAxis: () => XPropertySet,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTwoAxisXSupplier = {
    val __obj = js.Dynamic.literal(SecondaryXAxis = SecondaryXAxis.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondaryXAxis = js.Any.fromFunction0(getSecondaryXAxis), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTwoAxisXSupplier]
  }
}

