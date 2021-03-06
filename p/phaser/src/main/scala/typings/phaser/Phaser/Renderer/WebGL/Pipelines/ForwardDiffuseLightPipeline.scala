package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ForwardDiffuseLightPipeline implements a forward rendering approach for 2D lights.
  * This pipeline extends TextureTintPipeline so it implements all it's rendering functions
  * and batching system.
  */
@js.native
trait ForwardDiffuseLightPipeline extends TextureTintPipeline {
  /**
    * Sets the Game Objects normal map as the active texture.
    * @param gameObject The Game Object to update.
    */
  def setNormalMap(gameObject: GameObject): Unit = js.native
  /**
    * Rotates the normal map vectors inversely by the given angle.
    * Only works in 2D space.
    * @param rotation The angle of rotation in radians.
    */
  def setNormalMapRotation(rotation: Double): Unit = js.native
}

