package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
class MergeMeshesOptimization ()
  extends typings.babylonjs.BABYLON.MergeMeshesOptimization {
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  override var priority: Double = js.native
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(scene: typings.babylonjs.BABYLON.Scene, optimizer: typings.babylonjs.BABYLON.SceneOptimizer): Boolean = js.native
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
}

/* static members */
@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
object MergeMeshesOptimization extends js.Object {
  var _UpdateSelectionTree: js.Any = js.native
  /**
    * Gets or sets a boolean which defines if optimization octree has to be updated
    */
  def UpdateSelectionTree: Boolean = js.native
  /**
    * Gets or sets a boolean which defines if optimization octree has to be updated
    */
  def UpdateSelectionTree(value: Boolean): js.Any = js.native
}

