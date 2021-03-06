package typings.babylonjs.mod

import typings.babylonjs.anon.Segments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "HemisphereBuilder")
@js.native
class HemisphereBuilder ()
  extends typings.babylonjs.legacyMod.HemisphereBuilder

/* static members */
@JSImport("babylonjs", "HemisphereBuilder")
@js.native
object HemisphereBuilder extends js.Object {
  /**
    * Creates a hemisphere mesh
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the hemisphere mesh
    */
  def CreateHemisphere(name: String, options: Segments, scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
}

