package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.MapTypeOptions
import typings.baidumapWebSdk.BMap.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MapType")
@js.native
class MapType protected ()
  extends typings.baidumapWebSdk.BMap.MapType {
  def this(name: String, layers: js.Array[typings.baidumapWebSdk.BMap.TileLayer]) = this()
  def this(name: String, layers: typings.baidumapWebSdk.BMap.TileLayer) = this()
  def this(name: String, layers: js.Array[typings.baidumapWebSdk.BMap.TileLayer], opts: MapTypeOptions) = this()
  def this(name: String, layers: typings.baidumapWebSdk.BMap.TileLayer, opts: MapTypeOptions) = this()
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  /* CompleteClass */
  override def getName(): String = js.native
  /* CompleteClass */
  override def getProjection(): Projection = js.native
  /* CompleteClass */
  override def getTextColor(): String = js.native
  /* CompleteClass */
  override def getTileLayer(): typings.baidumapWebSdk.BMap.TileLayer = js.native
  /* CompleteClass */
  override def getTips(): String = js.native
}

