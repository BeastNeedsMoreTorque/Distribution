package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileImageryLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object TileImageryLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): TileImageryLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileImageryLayerLayerviewDestroyEvent]
  }
}

