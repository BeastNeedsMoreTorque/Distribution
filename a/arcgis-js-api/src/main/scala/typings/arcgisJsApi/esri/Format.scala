package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  /**
    * Contains information that describes how this Format should be converted.  This property should only be set when creating a custom Format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#conversionInfo)
    *
    * @default null
    */
  var conversionInfo: ConversionInfo
  /**
    * A array of [Coordinate Segments](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment).  Each segment represents a section of the Format's coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments)
    *
    * @default null
    */
  var coordinateSegments: js.Array[CoordinateSegment]
  /**
    * A string that serves as a pattern describing how this Format should be displayed.  The pattern should contain all of aliases specified by the Format's [coordinateSegments property](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern)
    *
    * @default null
    */
  var currentPattern: String
  /**
    * The default pattern describing how this Format should be displayed.  See [currentPattern](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#defaultPattern)
    *
    * @default null
    */
  var defaultPattern: String
  /**
    * The name of the coordinate.  A [CoordinateConversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html) widget should not contain multiple Formats with the same name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#name)
    *
    * @default null
    */
  var name: String
  /**
    * The [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) for this format.  Coordinates generated for a format will be derived from points in this spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#spatialReference)
    */
  var spatialReference: SpatialReference
  /**
    * The view model of the [CoordinateConversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html) widget that is utilizing this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#viewModel)
    */
  var viewModel: CoordinateConversionViewModel
}

object Format {
  @scala.inline
  def apply(
    conversionInfo: ConversionInfo,
    coordinateSegments: js.Array[CoordinateSegment],
    currentPattern: String,
    defaultPattern: String,
    name: String,
    spatialReference: SpatialReference,
    viewModel: CoordinateConversionViewModel
  ): Format = {
    val __obj = js.Dynamic.literal(conversionInfo = conversionInfo.asInstanceOf[js.Any], coordinateSegments = coordinateSegments.asInstanceOf[js.Any], currentPattern = currentPattern.asInstanceOf[js.Any], defaultPattern = defaultPattern.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

