package typings.heremaps.global.H

import typings.heremaps.H.math.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** math *****/
@JSGlobal("H.math")
@js.native
object math extends js.Object {
  /**
    * Class represents a 2-dimensional point, defined by x and y coordinates.
    * @property x {number} - The point's coordinate on X-axis.
    * @property y {number} - The point's coordinate on Y-axis.
    */
  @js.native
  class Point protected ()
    extends typings.heremaps.H.math.Point {
    /**
      * Constructor
      * @param x {number} - The point's coordinate on X-axis.
      * @param y {number} - The point's coordinate on Y-axis.
      */
    def this(x: Double, y: Double) = this()
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
  }
  
  /**
    * Class defines a rectangle in 2-dimensional geometric space. It is used to represent the area in projected space.
    */
  @js.native
  class Rect protected ()
    extends typings.heremaps.H.math.Rect {
    /**
      * Constructor
      * @param left {number} - The rectangle's left edge x value
      * @param top {number} - The rectangle's top edge y value
      * @param right {number} - The rectangle's right edge x value
      * @param bottom {number} - The rectangle's bottom edge y value
      */
    def this(left: Double, top: Double, right: Double, bottom: Double) = this()
    /**
      * Method checks if provided coordinates lie within rectangle.
      * @param x {number} - x-coordinate to check
      * @param y {number} - y-coordinate to check
      * @returns {boolean} - returns true if coordinates lie within rectangle, if parameters are isNaN returns false
      */
    /* CompleteClass */
    override def containsXY(x: Double, y: Double): Boolean = js.native
    /**
      * To get the rectangle's bottom-right vertex
      * @returns {H.math.Point}
      */
    /* CompleteClass */
    override def getBottomRight(): typings.heremaps.H.math.Point = js.native
    /**
      * To get the rectangle's top-left vertex
      * @returns {H.math.Point}
      */
    /* CompleteClass */
    override def getTopLeft(): typings.heremaps.H.math.Point = js.native
    /**
      * To set all values of the rectangle's edges
      * @param left {number} - The rectangle's left edge x value
      * @param top {number} - The rectangle's top edge y value
      * @param right {number} - The rectangle's right edge x value
      * @param bottom {number} - The rectangle's bottom edge y value
      */
    /* CompleteClass */
    override def set(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  }
  
  /**
    * Class for representing sizes consisting of a width and height.
    * @property w {number} - The size's width value
    * @property h {number} - The size's height value
    */
  @js.native
  class Size protected ()
    extends typings.heremaps.H.math.Size {
    /**
      * Constructor
      * @param width {number} - Width.
      * @param height {number} - Height.
      */
    def this(width: Double, height: Double) = this()
    /* CompleteClass */
    override var h: Double = js.native
    /* CompleteClass */
    override var w: Double = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    /**
      * This method creates a Point instance from a given IPoint object.
      * @param iPoint {H.math.IPoint} - The IPoint object to use
      * @returns {H.math.Point} - the created Point instance
      */
    def fromIPoint(iPoint: IPoint): typings.heremaps.H.math.Point = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    /**
      * To create a rectangle from a top-left and bottom-right point pair.
      * @param topLeft {H.math.IPoint} - the top-left vertex of the rectanle
      * @param bottomRight {H.math.IPoint} - the bottom-right vertex of the rectanle
      * @returns {H.math.Rect} - returns the rectangular area defined by the top-left and bottom-right vertices
      */
    def fromPoints(topLeft: IPoint, bottomRight: IPoint): typings.heremaps.H.math.Rect = js.native
  }
  
}

