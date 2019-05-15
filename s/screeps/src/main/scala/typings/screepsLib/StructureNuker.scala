package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Launches a nuke to another room dealing huge damage to the landing area.
  * Each launch has a cooldown and requires energy and ghodium resources. Launching
  * creates a Nuke object at the target room position which is visible to any player
  * until it is landed. Incoming nuke cannot be moved or cancelled. Nukes cannot
  * be launched from or to novice rooms.
  */
trait StructureNuker
  extends OwnedStructure[STRUCTURE_NUKER]
     with AnyOwnedStructure {
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: scala.Double
  /**
    * The amount of energy contained in this structure.
    */
  var energy: scala.Double
  /**
    * The total amount of energy this structure can contain.
    */
  var energyCapacity: scala.Double
  /**
    * The amount of energy contained in this structure.
    */
  var ghodium: scala.Double
  /**
    * The total amount of energy this structure can contain.
    */
  var ghodiumCapacity: scala.Double
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  def launchNuke(pos: RoomPosition): ScreepsReturnCode
}

@JSGlobal("StructureNuker")
@js.native
class StructureNukerCls protected () extends StructureNuker {
  def this(id: java.lang.String) = this()
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  /* CompleteClass */
  override var cooldown: scala.Double = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The amount of energy contained in this structure.
    */
  /* CompleteClass */
  override var energy: scala.Double = js.native
  /**
    * The total amount of energy this structure can contain.
    */
  /* CompleteClass */
  override var energyCapacity: scala.Double = js.native
  /**
    * The amount of energy contained in this structure.
    */
  /* CompleteClass */
  override var ghodium: scala.Double = js.native
  /**
    * The total amount of energy this structure can contain.
    */
  /* CompleteClass */
  override var ghodiumCapacity: scala.Double = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: scala.Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: scala.Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  override var my: scala.Boolean = js.native
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  /* CompleteClass */
  override var owner: Owner = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: STRUCTURE_NUKER = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): scala.Boolean = js.native
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  /* CompleteClass */
  override def launchNuke(pos: RoomPosition): ScreepsReturnCode = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode = js.native
}

object StructureNuker {
  @scala.inline
  def apply(
    cooldown: scala.Double,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    energy: scala.Double,
    energyCapacity: scala.Double,
    ghodium: scala.Double,
    ghodiumCapacity: scala.Double,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    launchNuke: RoomPosition => ScreepsReturnCode,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_NUKER
  ): StructureNuker = {
    val __obj = js.Dynamic.literal(cooldown = cooldown, destroy = js.Any.fromFunction0(destroy), effects = effects, energy = energy, energyCapacity = energyCapacity, ghodium = ghodium, ghodiumCapacity = ghodiumCapacity, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), launchNuke = js.Any.fromFunction1(launchNuke), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureNuker]
  }
}

