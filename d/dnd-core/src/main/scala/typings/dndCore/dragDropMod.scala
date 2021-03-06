package typings.dndCore

import typings.dndCore.anon.BeginDrag
import typings.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop", JSImport.Namespace)
@js.native
object dragDropMod extends js.Object {
  val BEGIN_DRAG: /* "dnd-core/BEGIN_DRAG" */ String = js.native
  val DROP: /* "dnd-core/DROP" */ String = js.native
  val END_DRAG: /* "dnd-core/END_DRAG" */ String = js.native
  val HOVER: /* "dnd-core/HOVER" */ String = js.native
  val INIT_COORDS: /* "dnd-core/INIT_COORDS" */ String = js.native
  val PUBLISH_DRAG_SOURCE: /* "dnd-core/PUBLISH_DRAG_SOURCE" */ String = js.native
  def default(manager: DragDropManager): BeginDrag = js.native
}

