package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6
trait WebCLMemoryObject extends js.Object {
  def getInfo(name: MemInfo): js.Any
  def release(): Unit
}

object WebCLMemoryObject {
  @scala.inline
  def apply(getInfo: MemInfo => js.Any, release: () => Unit): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLMemoryObject]
  }
}

