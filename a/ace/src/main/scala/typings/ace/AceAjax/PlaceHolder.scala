package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceHolder extends js.Object {
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): Unit
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): Unit
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): Unit
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): Unit
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): Unit
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): Unit
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): Unit
}

object PlaceHolder {
  @scala.inline
  def apply(
    cancel: () => Unit,
    detach: () => Unit,
    hideOtherMarkers: () => Unit,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    onCursorChange: () => Unit,
    onUpdate: () => Unit,
    setup: () => Unit,
    showOtherMarkers: () => Unit
  ): PlaceHolder = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), detach = js.Any.fromFunction0(detach), hideOtherMarkers = js.Any.fromFunction0(hideOtherMarkers), on = js.Any.fromFunction2(on), onCursorChange = js.Any.fromFunction0(onCursorChange), onUpdate = js.Any.fromFunction0(onUpdate), setup = js.Any.fromFunction0(setup), showOtherMarkers = js.Any.fromFunction0(showOtherMarkers))
    __obj.asInstanceOf[PlaceHolder]
  }
}

