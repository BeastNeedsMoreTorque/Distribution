package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointLight")
@js.native
class PointLight protected ()
  extends typings.babylonjs.BABYLON.PointLight {
  /**
    * Creates a PointLight object from the passed name and position (Vector3) and adds it in the scene.
    * A PointLight emits the light in every direction.
    * It can cast shadows.
    * If the scene camera is already defined and you want to set your PointLight at the camera position, just set it :
    * ```javascript
    * var pointLight = new PointLight("pl", camera.position, scene);
    * ```
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The light friendly name
    * @param position The position of the point light in the scene
    * @param scene The scene the lights belongs to
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}

