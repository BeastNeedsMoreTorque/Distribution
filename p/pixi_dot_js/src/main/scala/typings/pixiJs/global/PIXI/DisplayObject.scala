package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all objects that are rendered on the screen.
  *
  * This is an abstract class and should not be used on its own; rather it should b e extended.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSGlobal("PIXI.DisplayObject")
@js.native
class DisplayObject ()
  extends typings.pixiJs.PIXI.DisplayObject

/* static members */
@JSGlobal("PIXI.DisplayObject")
@js.native
object DisplayObject extends js.Object {
  /**
    * Mixes all enumerable properties and methods from a source object to DisplayObject.
    *
    * @param {object} source - The source of properties and methods to mix in.
    */
  def mixin(source: js.Any): Unit = js.native
}

