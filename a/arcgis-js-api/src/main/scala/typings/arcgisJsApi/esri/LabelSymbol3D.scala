package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSymbol3D
  extends Symbol3D
     with typings.arcgisJsApi.esri.symbols.Symbol2D3D
     with Symbol2D3D
     with typings.arcgisJsApi.esri.symbols.Symbol3D
     with symbolsSymbol3D {
  /**
    * Settings for adding a callout visualization to the symbol. Callouts are drawn from the point feature location that is being symbolized, to the vertical offset of the symbol. This property has no effect if [verticalOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset) is not set. At the moment only callouts of type `line` are supported. See [LineCallout3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout)
    */
  var callout: Callout3D = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#type)
    */
  @JSName("type")
  val type_LabelSymbol3D: `label-3d` = js.native
  /**
    * Shifts the symbol along the vertical world axis by a given height. The height is set in screen space units like points or pixels. For points displayed with a [callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout) `verticalOffset` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var verticalOffset: LabelSymbol3DVerticalOffset = js.native
}

