package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Point object represents a location in a two-dimensional coordinate system, where x represents
  * the horizontal axis and y represents the vertical axis.
  *
  * An ObservablePoint is a point that triggers a callback when the point's position is changed.
  *
  * @class
  * @memberof PIXI
  * @implements IPoint
  */
@JSGlobal("PIXI.ObservablePoint")
@js.native
class ObservablePoint protected ()
  extends typings.pixiJs.PIXI.ObservablePoint {
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any) = this()
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any, x: Double) = this()
  def this(cb: js.Function1[/* repeated */ js.Any, _], scope: js.Any, x: Double, y: Double) = this()
  /**
    * X coord
    * @memberof PIXI.IPointData#
    * @member {number} x
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * Y coord
    * @memberof PIXI.IPointData#
    * @member {number} y
    */
  /* CompleteClass */
  override var y: Double = js.native
}

