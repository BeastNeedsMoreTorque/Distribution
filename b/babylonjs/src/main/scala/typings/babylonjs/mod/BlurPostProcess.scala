package typings.babylonjs.mod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BlurPostProcess")
@js.native
class BlurPostProcess protected ()
  extends typings.babylonjs.legacyMod.BlurPostProcess {
  /**
    * Creates a new instance BlurPostProcess
    * @param name The name of the effect.
    * @param direction The direction in which to blur the image.
    * @param kernel The size of the kernel to be used when computing the blur. eg. Size of 3 will blur the center pixel by 2 pixels surrounding it.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    /** The direction in which to blur the image. */
  direction: typings.babylonjs.mathVectorMod.Vector2,
    kernel: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    defines: js.UndefOr[String],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
  def this(
    name: String,
    /** The direction in which to blur the image. */
  direction: typings.babylonjs.mathVectorMod.Vector2,
    kernel: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    defines: js.UndefOr[String],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}

