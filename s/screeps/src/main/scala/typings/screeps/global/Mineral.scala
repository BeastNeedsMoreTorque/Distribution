package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.MineralConstant
import typings.screeps.MineralConstructor
import typings.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mineral")
@js.native
class Mineral protected ()
  extends typings.screeps.Mineral[MineralConstant] {
  def this(id: Id[typings.screeps.Mineral[MineralConstant]]) = this()
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  /* CompleteClass */
  override var density: Double = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
  /**
    * The remaining amount of resources.
    */
  /* CompleteClass */
  override var mineralAmount: Double = js.native
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  /* CompleteClass */
  override var mineralType: MineralConstant = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typings.screeps.RoomPosition = js.native
  /**
    * The remaining time after which the deposit will be refilled.
    */
  /* CompleteClass */
  override var ticksToRegeneration: Double = js.native
}

@JSGlobal("Mineral")
@js.native
object Mineral extends TopLevel[MineralConstructor]

