package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BasemapGalleryProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.BasemapGallery")
@js.native
/**
  * The BasemapGallery widget displays a collection images representing basemaps from ArcGIS.com or a user-defined set of map or image services. When a new basemap is selected from the BasemapGallery, the map's basemap layers are removed and replaced with the basemap layers of the associated basemap selected in the gallery. By default, the BasemapGallery widget looks like the following image.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html)
  */
class BasemapGalleryCls ()
  extends typings.arcgisJsApi.esri.BasemapGallery {
  def this(properties: BasemapGalleryProperties) = this()
}

