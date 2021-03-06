package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ICollisionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.SAT` module contains methods for detecting collisions using the Separating Axis Theorem.
  *
  * @class SAT
  */
@JSGlobal("MatterJS.SAT")
@js.native
class SAT ()
  extends typings.phaser.MatterJS.SAT

/* static members */
@JSGlobal("MatterJS.SAT")
@js.native
object SAT extends js.Object {
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = js.native
}

