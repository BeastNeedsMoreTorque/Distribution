package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new infinite ray starting at a given origin and pointing in a given direction.
  * @example
  * // Create a new ray starting at the position of this entity and pointing down
  // the entity's negative Z axis
  var ray = new pc.Ray(this.entity.getPosition(), this.entity.forward);
  * @property origin - The starting point of the ray.
  * @property direction - The direction of the ray.
  * @param [origin] - The starting point of the ray. The constructor takes a reference of this parameter.
  Defaults to the origin (0, 0, 0).
  * @param [direction] - The direction of the ray. The constructor takes a reference of this parameter.
  Defaults to a direction down the world negative Z axis (0, 0, -1).
  */
@JSGlobal("pc.Ray")
@js.native
class Ray ()
  extends typings.playcanvas.pc.Ray {
  def this(origin: typings.playcanvas.pc.Vec3) = this()
  def this(origin: typings.playcanvas.pc.Vec3, direction: typings.playcanvas.pc.Vec3) = this()
  /**
    * The direction of the ray.
    */
  /* CompleteClass */
  override var direction: typings.playcanvas.pc.Vec3 = js.native
  /**
    * The starting point of the ray.
    */
  /* CompleteClass */
  override var origin: typings.playcanvas.pc.Vec3 = js.native
  /**
    * Sets origin and direction to the supplied vector values.
    * @param origin - The starting point of the ray.
    * @param direction - The direction of the ray.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def set(origin: typings.playcanvas.pc.Vec3, direction: typings.playcanvas.pc.Vec3): typings.playcanvas.pc.Ray = js.native
}

