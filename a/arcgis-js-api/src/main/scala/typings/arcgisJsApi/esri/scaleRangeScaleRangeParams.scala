package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait scaleRangeScaleRangeParams extends Object {
  /**
    * The layer for which to generate a suggested min/max scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer
  /**
    * The number of features in the `layer` to sample for spatial statistics. A higher sample size will yield more precise results. However, higher sample sizes also require more time for the function to process the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#scaleRange)
    *
    * @default 500
    */
  var sampleSize: js.UndefOr[Double] = js.undefined
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
}

object scaleRangeScaleRangeParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: View,
    sampleSize: js.UndefOr[Double] = js.undefined,
    signal: AbortSignal = null
  ): scaleRangeScaleRangeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.get.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[scaleRangeScaleRangeParams]
  }
}

