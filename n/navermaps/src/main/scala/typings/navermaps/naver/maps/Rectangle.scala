package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends OverlayView {
  def getAreaSize(): Double = js.native
  def getBounds(): Bounds = js.native
  def getClickable(): Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): RectangleOptions = js.native
  def getOptions(key: String): RectangleOptions = js.native
  def getStyles(): RectangleOptions = js.native
  def getStyles(key: String): RectangleOptions = js.native
  def getVisible(): Boolean = js.native
  def getZIndex(): Double = js.native
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: BoundsLiteral): Unit = js.native
  def setClickable(clickable: Boolean): Unit = js.native
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
  def setStyles(key: String, value: js.Any): Unit = js.native
  def setStyles(options: RectangleOptions): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

