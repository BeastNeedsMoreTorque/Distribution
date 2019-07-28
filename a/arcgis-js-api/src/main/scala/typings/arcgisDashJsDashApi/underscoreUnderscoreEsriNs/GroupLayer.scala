package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLayer
  extends Layer
     with LayersMixin
     with PortalLayer {
  /**
    * Indicates how to manage the visibility of the children layers. Possible values are described in the table below.
    *
    * Value | Description
    * ------|------------
    * independent | Each child layer manages its visibility independent from other layers.
    * inherited | Each child layer's visibility matches the [GroupLayer’s visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visible).
    * exclusive | Only one child layer is visible at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: String = js.native
  /**
    * Loads all the externally loadable resources associated with the group layer. For the group layer this will load all the layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#loadAll)
    *
    *
    */
  def loadAll(): IPromise[GroupLayer] = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: GroupLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: GroupLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: GroupLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.GroupLayer")
@js.native
/**
  * GroupLayer provides the ability to organize several sublayers into one common layer. Suppose there are several [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that all represent water features in different dimensions. For example, wells (points), streams (lines), and lakes (polygons). The GroupLayer provides the functionality to treat them as one layer called "Water Features" even though they are stored as separate feature layers. To accomplish this, create a new GroupLayer and use the [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#add) method to add each of the water layers to the GroupLayer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html)
  */
class GroupLayerCls () extends GroupLayer {
  def this(properties: GroupLayerProperties) = this()
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
}

