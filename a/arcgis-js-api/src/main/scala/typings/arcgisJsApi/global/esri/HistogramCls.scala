package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.HistogramProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Histogram")
@js.native
/**
  * Renders a histogram to visualize the spread of a dataset based on [bins](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins) representing buckets, or sub-ranges, of data. Each [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin) is defined by a minimum and maximum value and a total count.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html)
  */
class HistogramCls ()
  extends typings.arcgisJsApi.esri.Histogram_ {
  def this(properties: HistogramProperties) = this()
}

