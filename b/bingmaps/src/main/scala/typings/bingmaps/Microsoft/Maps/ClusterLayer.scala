package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterLayer extends IDataLayer {
  /**
    * Gets the pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    */
  def getClusterPushpinByGridKey(gridKey: Double): ClusterPushpin | Pushpin
  /**
    * Gets all the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    * @returns All the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    */
  def getDisplayedPushpins(): js.Array[Pushpin]
  /**
    * Gets the current options used by the cluster layer.
    * @returns The current options used by the cluster layer.
    */
  def getOptions(): IClusterLayerOptions
  /**
    * Gets all pushpins that are in the layers.
    * @returns An array of all the pushpins that are in the layers.
    */
  def getPushpins(): js.Array[Pushpin]
  /**
    * Gets the original pushpins that are in the specified grid cell.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The original pushpins that are in the specified grid cell.
    */
  def getPushpinsByGridKey(gridKey: Double): js.Array[Pushpin]
  /**
    * Sets the clustering options to use in the layer.
    * @params options The clustering options to use in the layer.
    */
  def setOptions(options: IClusterLayerOptions): Unit
  /**
    * Sets the array of pushpins that are used in the clustering layer.
    * @param pushpins An array of pushpins that are to be used by the clustering layer.
    */
  def setPushpins(pushpins: js.Array[Pushpin]): Unit
}

object ClusterLayer {
  @scala.inline
  def apply(
    clear: () => Unit,
    getClusterPushpinByGridKey: Double => ClusterPushpin | Pushpin,
    getDisplayedPushpins: () => js.Array[Pushpin],
    getOptions: () => IClusterLayerOptions,
    getPushpins: () => js.Array[Pushpin],
    getPushpinsByGridKey: Double => js.Array[Pushpin],
    setOptions: IClusterLayerOptions => Unit,
    setPushpins: js.Array[Pushpin] => Unit
  ): ClusterLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getClusterPushpinByGridKey = js.Any.fromFunction1(getClusterPushpinByGridKey), getDisplayedPushpins = js.Any.fromFunction0(getDisplayedPushpins), getOptions = js.Any.fromFunction0(getOptions), getPushpins = js.Any.fromFunction0(getPushpins), getPushpinsByGridKey = js.Any.fromFunction1(getPushpinsByGridKey), setOptions = js.Any.fromFunction1(setOptions), setPushpins = js.Any.fromFunction1(setPushpins))
    __obj.asInstanceOf[ClusterLayer]
  }
}

