package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "ModelShape")
@js.native
class ModelShape protected ()
  extends typings.babylonjs.legacyMod.ModelShape {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    shape: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    indices: js.Array[Double],
    normals: js.Array[Double],
    colors: js.Array[Double],
    shapeUV: js.Array[Double],
    posFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.solidParticleMod.SolidParticle, 
          /* i */ Double, 
          /* s */ Double, 
          Unit
        ]
      ],
    vtxFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.solidParticleMod.SolidParticle, 
          /* vertex */ typings.babylonjs.mathVectorMod.Vector3, 
          /* i */ Double, 
          Unit
        ]
      ],
    material: Nullable[typings.babylonjs.materialMod.Material]
  ) = this()
}

