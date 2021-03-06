package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseProceduralTexture extends ProceduralTexture {
  var _time: js.Any = js.native
  var _updateShaderUniforms: js.Any = js.native
  /** Gets or sets animation speed factor (default is 1) */
  var animationSpeedFactor: Double = js.native
  /** Gets or sets a value between 0 and 1 indicating the overall brightness of the texture (default is 0.2) */
  var brightness: Double = js.native
  /** Defines the number of octaves to process */
  var octaves: Double = js.native
  /** Defines the level of persistence (0.8 by default) */
  var persistence: Double = js.native
}

