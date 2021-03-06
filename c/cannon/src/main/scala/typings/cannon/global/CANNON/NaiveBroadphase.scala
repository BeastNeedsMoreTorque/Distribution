package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.NaiveBroadphase")
@js.native
class NaiveBroadphase ()
  extends typings.cannon.CANNON.BroadPhase {
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /* CompleteClass */
  override var useBoundingBoxes: Boolean = js.native
  /* CompleteClass */
  override var world: typings.cannon.CANNON.World = js.native
  /* CompleteClass */
  override def aabbQuery(
    world: typings.cannon.CANNON.World,
    aabb: typings.cannon.CANNON.AABB,
    result: js.Array[typings.cannon.CANNON.Body]
  ): js.Array[typings.cannon.CANNON.Body] = js.native
  /* CompleteClass */
  override def boundingSphereCheck(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body): Boolean = js.native
  /* CompleteClass */
  override def collisionPairs(
    world: typings.cannon.CANNON.World,
    p1: js.Array[typings.cannon.CANNON.Body],
    p2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def doBoundingBoxBroadphase(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    pairs1: js.Array[typings.cannon.CANNON.Body],
    pairs2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def doBoundingSphereBroadphase(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    pairs1: js.Array[typings.cannon.CANNON.Body],
    pairs2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def intersectionTest(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    pairs1: js.Array[typings.cannon.CANNON.Body],
    pairs2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def makePairsUnique(pairs1: js.Array[typings.cannon.CANNON.Body], pairs2: js.Array[typings.cannon.CANNON.Body]): Unit = js.native
  /* CompleteClass */
  override def needBroadphaseCollision(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body): Boolean = js.native
  /* CompleteClass */
  override def setWorld(world: typings.cannon.CANNON.World): Unit = js.native
}

