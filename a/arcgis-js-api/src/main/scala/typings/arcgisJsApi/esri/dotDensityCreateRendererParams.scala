package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityCreateRendererParams extends Object {
  /**
    * A set of complementary numeric fields/expressions used as the basis of the dot density visualization. For example, if creating an election map, you would indicate the names of each field representing the candidate or political party where total votes are stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var attributes: js.Array[dotDensityCreateRendererParamsAttributes]
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * Indicates whether to enable color blending of different colored dots rendered at the same pixel. This is only visible in highly dense and highly diverse features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    *
    * @default true
    */
  var dotBlendingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined dot density scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var dotDensityScheme: js.UndefOr[DotDensityScheme] = js.undefined
  /**
    * Indicates whether to vary the value of each dot by the view's scale. This will set the [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) of the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    *
    * @default true
    */
  var dotValueOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The **polygon** layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var layer: FeatureLayer | GeoJSONLayer
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var legendOptions: js.UndefOr[dotDensityCreateRendererParamsLegendOptions] = js.undefined
  /**
    * Indicates whether the polygon outline width should vary based on view scale. When false, no outline will be used in the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * The MapView instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}

object dotDensityCreateRendererParams {
  @scala.inline
  def apply(
    attributes: js.Array[dotDensityCreateRendererParamsAttributes],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView,
    basemap: String | Basemap = null,
    dotBlendingEnabled: js.UndefOr[Boolean] = js.undefined,
    dotDensityScheme: DotDensityScheme = null,
    dotValueOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    legendOptions: dotDensityCreateRendererParamsLegendOptions = null,
    outlineOptimizationEnabled: js.UndefOr[Boolean] = js.undefined,
    signal: AbortSignal = null
  ): dotDensityCreateRendererParams = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (!js.isUndefined(dotBlendingEnabled)) __obj.updateDynamic("dotBlendingEnabled")(dotBlendingEnabled.get.asInstanceOf[js.Any])
    if (dotDensityScheme != null) __obj.updateDynamic("dotDensityScheme")(dotDensityScheme.asInstanceOf[js.Any])
    if (!js.isUndefined(dotValueOptimizationEnabled)) __obj.updateDynamic("dotValueOptimizationEnabled")(dotValueOptimizationEnabled.get.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineOptimizationEnabled)) __obj.updateDynamic("outlineOptimizationEnabled")(outlineOptimizationEnabled.get.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[dotDensityCreateRendererParams]
  }
}

