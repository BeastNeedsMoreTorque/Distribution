package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RotateMode extends js.Object

@JSGlobal("spine.RotateMode")
@js.native
object RotateMode extends js.Object {
  @js.native
  sealed trait Chain extends RotateMode
  
  @js.native
  sealed trait ChainScale extends RotateMode
  
  @js.native
  sealed trait Tangent extends RotateMode
  
}

