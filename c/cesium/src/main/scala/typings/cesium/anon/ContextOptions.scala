package typings.cesium.anon

import typings.cesium.mod.MapMode2D
import typings.cesium.mod.MapProjection
import typings.std.Element
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var canvas: HTMLCanvasElement
  var contextOptions: js.UndefOr[js.Any] = js.undefined
  var creditContainer: js.UndefOr[Element] = js.undefined
  var creditViewport: js.UndefOr[Element] = js.undefined
  var mapMode2D: js.UndefOr[MapMode2D] = js.undefined
  var mapProjection: js.UndefOr[MapProjection] = js.undefined
  var maximumRenderTimeChange: js.UndefOr[Double] = js.undefined
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined
  var requestRenderMode: js.UndefOr[Boolean] = js.undefined
  var scene3DOnly: js.UndefOr[Boolean] = js.undefined
  var shadows: js.UndefOr[Boolean] = js.undefined
  var terrainExaggeration: js.UndefOr[Double] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement,
    contextOptions: js.Any = null,
    creditContainer: Element = null,
    creditViewport: Element = null,
    mapMode2D: MapMode2D = null,
    mapProjection: MapProjection = null,
    maximumRenderTimeChange: js.UndefOr[Double] = js.undefined,
    orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined,
    requestRenderMode: js.UndefOr[Boolean] = js.undefined,
    scene3DOnly: js.UndefOr[Boolean] = js.undefined,
    shadows: js.UndefOr[Boolean] = js.undefined,
    terrainExaggeration: js.UndefOr[Double] = js.undefined
  ): ContextOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    if (contextOptions != null) __obj.updateDynamic("contextOptions")(contextOptions.asInstanceOf[js.Any])
    if (creditContainer != null) __obj.updateDynamic("creditContainer")(creditContainer.asInstanceOf[js.Any])
    if (creditViewport != null) __obj.updateDynamic("creditViewport")(creditViewport.asInstanceOf[js.Any])
    if (mapMode2D != null) __obj.updateDynamic("mapMode2D")(mapMode2D.asInstanceOf[js.Any])
    if (mapProjection != null) __obj.updateDynamic("mapProjection")(mapProjection.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumRenderTimeChange)) __obj.updateDynamic("maximumRenderTimeChange")(maximumRenderTimeChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orderIndependentTranslucency)) __obj.updateDynamic("orderIndependentTranslucency")(orderIndependentTranslucency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestRenderMode)) __obj.updateDynamic("requestRenderMode")(requestRenderMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scene3DOnly)) __obj.updateDynamic("scene3DOnly")(scene3DOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadows)) __obj.updateDynamic("shadows")(shadows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(terrainExaggeration)) __obj.updateDynamic("terrainExaggeration")(terrainExaggeration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

