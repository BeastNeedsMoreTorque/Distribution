package typings.fabric.fabricImplMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorMatrix extends IBaseFilter {
  var matrix: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Applies filter to canvas element
    * @param canvasEl Canvas element to apply filter to
    */
  def applyTo(canvasEl: HTMLCanvasElement): Unit = js.native
}

