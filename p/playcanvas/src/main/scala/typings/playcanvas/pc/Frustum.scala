package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new frustum shape.
  * @example
  * // Create a new frustum equivalent to one held by a camera component
  var projectionMatrix = entity.camera.projectionMatrix;
  var viewMatrix = entity.camera.viewMatrix;
  var frustum = new pc.Frustum(projectionMatrix, viewMatrix);
  * @param projectionMatrix - The projection matrix describing the shape of the frustum.
  * @param viewMatrix - The inverse of the world transformation matrix for the frustum.
  */
trait Frustum extends js.Object {
  /**
    * Tests whether a point is inside the frustum. Note that points lying in a frustum plane are
    considered to be outside the frustum.
    * @param point - The point to test.
    * @returns True if the point is inside the frustum, false otherwise.
    */
  def containsPoint(point: Vec3): Boolean
  /**
    * Tests whether a bounding sphere intersects the frustum. If the sphere is outside the frustum,
    zero is returned. If the sphere intersects the frustum, 1 is returned. If the sphere is completely inside
    the frustum, 2 is returned. Note that a sphere touching a frustum plane from the outside is considered to
    be outside the frustum.
    * @param sphere - The sphere to test.
    * @returns 0 if the bounding sphere is outside the frustum, 1 if it intersects the frustum and 2 if
    it is contained by the frustum.
    */
  def containsSphere(sphere: BoundingSphere): Double
  /**
    * Updates the frustum shape based on a view matrix and a projection matrix.
    * @param projectionMatrix - The projection matrix describing the shape of the frustum.
    * @param viewMatrix - The inverse of the world transformation matrix for the frustum.
    */
  def update(projectionMatrix: Mat4, viewMatrix: Mat4): Unit
}

object Frustum {
  @scala.inline
  def apply(
    containsPoint: Vec3 => Boolean,
    containsSphere: BoundingSphere => Double,
    update: (Mat4, Mat4) => Unit
  ): Frustum = {
    val __obj = js.Dynamic.literal(containsPoint = js.Any.fromFunction1(containsPoint), containsSphere = js.Any.fromFunction1(containsSphere), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Frustum]
  }
}

