package typings.phaser.Phaser.GameObjects.Components

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the depth of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
trait Depth extends js.Object {
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  var depth: Double
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  def setDepth(value: integer): this.type
}

object Depth {
  @scala.inline
  def apply(depth: Double, setDepth: integer => Depth): Depth = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], setDepth = js.Any.fromFunction1(setDepth))
    __obj.asInstanceOf[Depth]
  }
}

