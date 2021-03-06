package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.ImageMapTypeOptions
import typings.navermaps.naver.maps.Projection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.ImageMapType")
@js.native
class ImageMapType protected ()
  extends typings.navermaps.naver.maps.ImageMapType {
  def this(imageMapTypeOptions: ImageMapTypeOptions) = this()
  /* CompleteClass */
  override var maxZoom: Double = js.native
  /* CompleteClass */
  override var minZoom: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var projection: Projection = js.native
  /* CompleteClass */
  override var tileSize: typings.navermaps.naver.maps.Size = js.native
  /* CompleteClass */
  override def getMapTypeOptions(): ImageMapTypeOptions = js.native
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  /* CompleteClass */
  override def getName(): String = js.native
  /* CompleteClass */
  override def getTile(x: Double, y: Double, z: Double): HTMLElement | typings.navermaps.naver.maps.Tile = js.native
  /* CompleteClass */
  override def getTileUrls(x: Double, y: Double, z: Double): js.Array[String] = js.native
  /* CompleteClass */
  override def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit = js.native
}

