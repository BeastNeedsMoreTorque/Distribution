package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.LeftMouseButtonMagnifier")
@js.native
class LeftMouseButtonMagnifier () extends IBehavior {
  def this(options: ILeftMouseButtonMagnifierOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

