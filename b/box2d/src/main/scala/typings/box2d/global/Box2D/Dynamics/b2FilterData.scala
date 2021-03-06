package typings.box2d.global.Box2D.Dynamics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2FilterData")
@js.native
class b2FilterData ()
  extends typings.box2d.Box2D.Dynamics.b2FilterData {
  /**
    * The collision category bits. Normally you would just set one bit.
    **/
  /* CompleteClass */
  override var categoryBits: Double = js.native
  /**
    * Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no collision group. Non-zero group filtering always wins against the mask bits.
    **/
  /* CompleteClass */
  override var groupIndex: Double = js.native
  /**
    * The collision mask bits. This states the categories that this shape would accept for collision.
    **/
  /* CompleteClass */
  override var maskBits: Double = js.native
  /**
    * Creates a copy of the filter data.
    * @return Copy of this filter data.
    **/
  /* CompleteClass */
  override def Copy(): typings.box2d.Box2D.Dynamics.b2FilterData = js.native
}

