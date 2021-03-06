package typings.babylonjs

import typings.babylonjs.blurPostProcessMod.BlurPostProcess
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/depthOfFieldBlurPostProcess", JSImport.Namespace)
@js.native
object depthOfFieldBlurPostProcessMod extends js.Object {
  @js.native
  class DepthOfFieldBlurPostProcess protected () extends BlurPostProcess {
    /**
      * Creates a new instance CircleOfConfusionPostProcess
      * @param name The name of the effect.
      * @param scene The scene the effect belongs to.
      * @param direction The direction the blur should be applied.
      * @param kernel The size of the kernel used to blur.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param circleOfConfusion The circle of confusion + depth map to be used to avoid blurring accross edges
      * @param imageToBlur The image to apply the blur to (default: Current rendered frame)
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(
      name: String,
      scene: Scene,
      direction: Vector2,
      kernel: Double,
      options: Double,
      camera: Nullable[Camera],
      circleOfConfusion: PostProcess,
      imageToBlur: js.UndefOr[Nullable[PostProcess]],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    def this(
      name: String,
      scene: Scene,
      direction: Vector2,
      kernel: Double,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      circleOfConfusion: PostProcess,
      imageToBlur: js.UndefOr[Nullable[PostProcess]],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
  }
  
}

