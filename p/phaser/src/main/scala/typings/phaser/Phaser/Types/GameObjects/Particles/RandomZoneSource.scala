package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomZoneSource extends js.Object {
  /**
    * A function modifying its point argument.
    */
  @JSName("getRandomPoint")
  var getRandomPoint_Original: RandomZoneSourceCallback = js.native
  /**
    * A function modifying its point argument.
    */
  def getRandomPoint(point: Vector2): Unit = js.native
}

