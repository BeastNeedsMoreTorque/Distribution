package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorImageLayer", JSImport.Namespace)
@js.native
object vectorImageLayerMod extends js.Object {
  @js.native
  trait CanvasVectorImageLayerRenderer
    extends typings.ol.imageLayerMod.default
  
  @js.native
  class default protected () extends CanvasVectorImageLayerRenderer {
    def this(layer: typings.ol.vectorImageMod.default) = this()
  }
  
}

