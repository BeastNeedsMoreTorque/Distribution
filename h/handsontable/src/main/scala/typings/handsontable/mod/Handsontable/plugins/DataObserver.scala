package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObserver extends js.Object {
  var observedData: js.Array[_]
  var observer: js.Object
  var paused: Boolean
  def destroy(): Unit
  def isPaused(): Boolean
  def pause(): Unit
  def resume(): Unit
  def setObservedData(observedData: js.Any): Unit
}

object DataObserver {
  @scala.inline
  def apply(
    destroy: () => Unit,
    isPaused: () => Boolean,
    observedData: js.Array[_],
    observer: js.Object,
    pause: () => Unit,
    paused: Boolean,
    resume: () => Unit,
    setObservedData: js.Any => Unit
  ): DataObserver = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isPaused = js.Any.fromFunction0(isPaused), observedData = observedData.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), setObservedData = js.Any.fromFunction1(setObservedData))
    __obj.asInstanceOf[DataObserver]
  }
}

