package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface can be used to arrange {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeArranger extends XInterface {
  /** applies the specified Arrangement to the specified collection of {@link Shapes} . */
  def arrange(xShapes: XShapes, eType: Arrangement): Unit
  /** moves the specified {@link Shapes} by a specified number of objects more to the front. */
  def bringToFront(xShapes: XShapes, nSteps: Double): Unit
  /** reverses the order of the specified collection of {@link Shapes} . */
  def reverseOrder(xShapes: XShapes): Unit
  /** moves the specified {@link Shapes}**nSteps** objects more to the back. */
  def sendToBack(xShapes: XShapes, nSteps: Double): Unit
  /** moves the specified collection of {@link Shapes} behind the specified single {@link Shape} . */
  def setBehindShape(xShapes: XShapes, xShape: XShape): Unit
  /** moves the specified collection of {@link Shapes} in front of the specified single {@link Shape} . */
  def setInFrontOf(xShapes: XShapes, xShape: XShape): Unit
}

object XShapeArranger {
  @scala.inline
  def apply(
    acquire: () => Unit,
    arrange: (XShapes, Arrangement) => Unit,
    bringToFront: (XShapes, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reverseOrder: XShapes => Unit,
    sendToBack: (XShapes, Double) => Unit,
    setBehindShape: (XShapes, XShape) => Unit,
    setInFrontOf: (XShapes, XShape) => Unit
  ): XShapeArranger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), arrange = js.Any.fromFunction2(arrange), bringToFront = js.Any.fromFunction2(bringToFront), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reverseOrder = js.Any.fromFunction1(reverseOrder), sendToBack = js.Any.fromFunction2(sendToBack), setBehindShape = js.Any.fromFunction2(setBehindShape), setInFrontOf = js.Any.fromFunction2(setInFrontOf))
    __obj.asInstanceOf[XShapeArranger]
  }
}

