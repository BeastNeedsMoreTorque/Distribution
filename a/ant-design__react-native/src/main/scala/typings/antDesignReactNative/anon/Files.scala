package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var files: js.Array[scala.Nothing]
  var selectable: Boolean
  def onChange(): Unit
  def onFail(): Unit
}

object Files {
  @scala.inline
  def apply(files: js.Array[scala.Nothing], onChange: () => Unit, onFail: () => Unit, selectable: Boolean): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

