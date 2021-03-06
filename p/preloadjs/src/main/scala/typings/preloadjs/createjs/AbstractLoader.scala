package typings.preloadjs.createjs

import typings.createjsLib.createjs.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractLoader extends EventDispatcher {
  var canceled: Boolean = js.native
  var loaded: Boolean = js.native
  var progress: Double = js.native
  var `type`: String = js.native
  // methods
  def cancel(): Unit = js.native
  def destroy(): Unit = js.native
  def getItem(): js.Object = js.native
  def getItem(value: String): js.Object = js.native
  def getLoadedItems(): js.Array[js.Object] = js.native
  def getResult(): js.Object = js.native
  def getResult(value: js.Any): js.Object = js.native
  def getResult(value: js.Any, rawResult: Boolean): js.Object = js.native
  def getTag(): js.Object = js.native
  def load(): Unit = js.native
  def resultFormatter(): js.Any = js.native
  def setTag(tag: js.Object): Unit = js.native
}

