package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("PIXI.spine.core.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait Fixed extends SpacingMode
  
  @js.native
  sealed trait Length extends SpacingMode
  
  @js.native
  sealed trait Percent extends SpacingMode
  
}

