package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayAnimationAction extends Action {
  var _target: js.Any = js.native
  /**
    * Where the animation should start (animation frame)
    */
  var from: Double = js.native
  /**
    * Define if the animation should loop or stop after the first play.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Where the animation should stop (animation frame)
    */
  var to: Double = js.native
}

