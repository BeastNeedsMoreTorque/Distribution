package typings.babylonjs.legacyMod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "KeyboardInfoPre")
@js.native
class KeyboardInfoPre protected ()
  extends typings.babylonjs.indexMod.KeyboardInfoPre {
  /**
    * Instantiates a new keyboard pre info.
    * This class is used to store keyboard related info for the onPreKeyboardObservable event.
    * @param type Defines the type of event (KeyboardEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (KeyboardEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: KeyboardEvent
  ) = this()
}

