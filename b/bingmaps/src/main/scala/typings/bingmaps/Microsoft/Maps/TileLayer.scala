package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayer extends ILayer {
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any
  /**
    * Gets the opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    * @returns The opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    */
  def getOpacity(): Double
  /**
    * Gets the tile source of the tile layer.
    * @returns The tile source of the tile layer.
    */
  def getTileSource(): TileSource
  /**
    * Gets a boolean that indicates if the tile layer is visible or not.
    * @returns A boolean that indicates if the tile layer is visible or not.
    */
  def getVisible(): Boolean
  /**
    * Gets the zIndex of the tile layer.
    * @returns The zIndex of the tile layer.
    */
  def getZIndex(): Double
  /**
    * Sets the opacity of the tile layer. Value must be a number between 0 and 1.
    * @param opacity The opacity of the tile layer. Value must be a number between 0 and 1.
    */
  def setOpacity(opacity: Double): Unit
  /**
    * Sets options for the tile layer.
    * @param options The options for the tile layer.
    */
  def setOptions(options: ITileLayerOptions): Unit
  /**
    * Sets the visibility of the tile layer.
    * @param show A boolean indicating if the tile layer should be visible or not.
    */
  def setVisible(show: Boolean): Unit
  /**
    * Sets the zIndex of the tile layer.
    * @param idx The zIndex of the tile layer.
    */
  def setZIndex(idx: Double): Unit
}

object TileLayer {
  @scala.inline
  def apply(
    getOpacity: () => Double,
    getTileSource: () => TileSource,
    getVisible: () => Boolean,
    getZIndex: () => Double,
    metadata: js.Any,
    setOpacity: Double => Unit,
    setOptions: ITileLayerOptions => Unit,
    setVisible: Boolean => Unit,
    setZIndex: Double => Unit
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getOpacity = js.Any.fromFunction0(getOpacity), getTileSource = js.Any.fromFunction0(getTileSource), getVisible = js.Any.fromFunction0(getVisible), getZIndex = js.Any.fromFunction0(getZIndex), metadata = metadata.asInstanceOf[js.Any], setOpacity = js.Any.fromFunction1(setOpacity), setOptions = js.Any.fromFunction1(setOptions), setVisible = js.Any.fromFunction1(setVisible), setZIndex = js.Any.fromFunction1(setZIndex))
    __obj.asInstanceOf[TileLayer]
  }
}

