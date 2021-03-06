package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Angle
import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/Builders/decalBuilder", JSImport.Namespace)
@js.native
object decalBuilderMod extends js.Object {
  @js.native
  class DecalBuilder () extends js.Object
  
  /* static members */
  @js.native
  object DecalBuilder extends js.Object {
    /**
      * Creates a decal mesh.
      * A decal is a mesh usually applied as a model onto the surface of another mesh. So don't forget the parameter `sourceMesh` depicting the decal
      * * The parameter `position` (Vector3, default `(0, 0, 0)`) sets the position of the decal in World coordinates
      * * The parameter `normal` (Vector3, default `Vector3.Up`) sets the normal of the mesh where the decal is applied onto in World coordinates
      * * The parameter `size` (Vector3, default `(1, 1, 1)`) sets the decal scaling
      * * The parameter `angle` (float in radian, default 0) sets the angle to rotate the decal
      * @param name defines the name of the mesh
      * @param sourceMesh defines the mesh where the decal must be applied
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns the decal mesh
      * @see https://doc.babylonjs.com/how_to/decals
      */
    def CreateDecal(name: String, sourceMesh: AbstractMesh, options: Angle): Mesh = js.native
  }
  
}

