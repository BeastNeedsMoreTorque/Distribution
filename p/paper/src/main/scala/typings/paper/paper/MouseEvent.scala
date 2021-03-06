package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The MouseEvent object is received by the {@link Item}'s mouse event
  * handlers {@link Item#onMouseDown}, {@link Item#onMouseDrag},
  * {@link Item#onMouseMove}, {@link Item#onMouseUp}, {@link Item#onClick},
  * {@link Item#onDoubleClick}, {@link Item#onMouseEnter} and
  * {@link Item#onMouseLeave}. The MouseEvent object is the only parameter passed
  * to these functions and contains information about the mouse event.
  */
trait MouseEvent extends Event {
  /** 
    * The current target for the event, as the event traverses the scene graph.
    * It always refers to the element the event handler has been attached to as
    * opposed to {@link #target} which identifies the element on
    * which the event occurred.
    */
  var currentTarget: Item
  var delta: Point
  /** 
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  var point: Point
  /** 
    * The item that dispatched the event. It is different from
    * {@link #currentTarget} when the event handler is called during
    * the bubbling phase of the event.
    */
  var target: Item
  /** 
    * The type of mouse event.
    */
  var `type`: String
}

object MouseEvent {
  @scala.inline
  def apply(
    currentTarget: Item,
    delta: Point,
    modifiers: js.Any,
    point: Point,
    preventDefault: () => Unit,
    stop: () => Unit,
    stopPropagation: () => Unit,
    target: Item,
    timeStamp: Double,
    `type`: String
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stop = js.Any.fromFunction0(stop), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
}

