package typings.heremaps.global.H.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a view of the map. It consists of a virtual camera and a look-at point both of which have a position in geo-space and orientation angles. The view model allows to
  * change the values of these objects in order to move or rotate the map or zoom in and out.
  */
@JSGlobal("H.map.ViewModel")
@js.native
class ViewModel ()
  extends typings.heremaps.H.map.ViewModel

@JSGlobal("H.map.ViewModel")
@js.native
object ViewModel extends js.Object {
  /**
    * Update event is fired whenever view model data is changed. It contains property which hold currently requested data
    * @fixme find documentation and update constructor typings
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  class UpdateEvent protected ()
    extends typings.heremaps.H.map.ViewModel.UpdateEvent {
    /**
      * Constructor
      * @param requested {any}
      */
    def this(requested: js.Any) = this()
    /* CompleteClass */
    override var currentTarget: js.Any = js.native
    /* CompleteClass */
    override var defaultPrevented: Boolean = js.native
    /* CompleteClass */
    override var target: js.Any = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    /**
      * Stops propagation for current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
  }
  
}

