package typings.three.geometriesMod

import typings.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ShapeBufferGeometry")
@js.native
class ShapeBufferGeometry protected ()
  extends typings.three.shapeGeometryMod.ShapeBufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], curveSegments: Double) = this()
  def this(shapes: Shape, curveSegments: Double) = this()
}

