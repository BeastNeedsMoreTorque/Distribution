package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`above-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`always-horizontal`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-start`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelClassProperties extends js.Object {
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). If working with [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), use [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) instead.  Attribute values may be included in labels using SQL syntax. To include an attribute value in a label, wrap the name of the field in square brackets `[]`. See the example snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    *
    * @default null
    */
  var labelExpression: js.UndefOr[String] = js.undefined
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). If working with [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), use [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    *
    * @default null
    */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.undefined
  /**
    * The position of the label. Possible values are based on the feature type. This property requires a value.
    *
    * | Feature Type | Possible Values |
    * |--------------|-----------------|
    * | Points       | `above-center`, `above-left`, `above-right`, `below-center`, `below-left`, `below-right`, `center-center`, `center-left`, `center-right` |
    * | Polylines    | `above-after`, `above-along`, `above-before`, `above-start`, `above-end`, `below-after`, `below-along`, `below-before`, `below-start`, `below-end`, `center-after`, `center-along`, `center-before`, `center-start`, `center-end`|
    * | Polygons     | `always-horizontal`|
    *
    * > **Known Limitations**
    *   * Currently, if the label has a [line callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html) in a 3D SceneView, then only `above-center` is supported.
    *   * Label placement only applies to [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) layers in 3D SceneViews.
    *   * FeatureLayer [Polylines](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) only support `center-along` label placement in 2D MapViews.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    *
    * @default null
    */
  var labelPlacement: js.UndefOr[
    `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
  ] = js.undefined
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view. A value of `0` means the label's visibility does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    *
    * @default 0
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view. A value of `0` means the label's visibility does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    *
    * @default 0
    */
  var minScale: js.UndefOr[Double] = js.undefined
  /**
    * Defines the symbol used for rendering the label. If not set, the default symbol will be used. See the example below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: js.UndefOr[TextSymbolProperties | LabelSymbol3DProperties] = js.undefined
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: js.UndefOr[Boolean] = js.undefined
  /**
    * A SQL where clause used to determine the features to which the label class should be applied. When specified, only features evaluating to `true` based on this expression will be labeled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    *
    * @default null
    */
  var where: js.UndefOr[String] = js.undefined
}

object LabelClassProperties {
  @scala.inline
  def apply(
    labelExpression: String = null,
    labelExpressionInfo: LabelClassLabelExpressionInfo = null,
    labelPlacement: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal` = null,
    maxScale: js.UndefOr[Double] = js.undefined,
    minScale: js.UndefOr[Double] = js.undefined,
    symbol: TextSymbolProperties | LabelSymbol3DProperties = null,
    useCodedValues: js.UndefOr[Boolean] = js.undefined,
    where: String = null
  ): LabelClassProperties = {
    val __obj = js.Dynamic.literal()
    if (labelExpression != null) __obj.updateDynamic("labelExpression")(labelExpression.asInstanceOf[js.Any])
    if (labelExpressionInfo != null) __obj.updateDynamic("labelExpressionInfo")(labelExpressionInfo.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScale)) __obj.updateDynamic("maxScale")(maxScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScale)) __obj.updateDynamic("minScale")(minScale.get.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(useCodedValues)) __obj.updateDynamic("useCodedValues")(useCodedValues.get.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelClassProperties]
  }
}

