package typings.arcgisJsApi.esri

import typings.std.ImageData
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screenshot extends Object {
  /**
    * The raw RGBA image data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#Screenshot)
    */
  var data: ImageData
  /**
    * A data url representing the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#Screenshot)
    */
  var dataUrl: String
}

object Screenshot {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: ImageData,
    dataUrl: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Screenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Screenshot]
  }
}

