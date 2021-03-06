package typings.kdbxweb.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Group")
@js.native
class Group () extends KdbxObject {
  var customIcon: KdbxUuid = js.native
  var defaultAutoTypeSeq: StringProtected = js.native
  var enableAutoType: Boolean = js.native
  var enableSearching: Boolean = js.native
  var entries: js.Array[Entry] = js.native
  var expanded: Boolean = js.native
  var groups: js.Array[Group] = js.native
  var icon: Double = js.native
  var lastTopVisibleEntry: KdbxUuid = js.native
  var name: StringProtected = js.native
  var notes: StringProtected = js.native
  var parentGroup: Group = js.native
  var times: Times = js.native
  var uuid: KdbxUuid = js.native
  def copyFrom(group: Group): Unit = js.native
  def forEach(
    callback: js.Function2[
      /* thisArg */ js.Function1[/* value */ js.Any, Unit], 
      /* entry */ js.UndefOr[Entry], 
      Unit
    ],
    thisArg: js.Function1[/* value */ js.Any, Unit]
  ): Unit = js.native
  def merge(objectMap: ObjectMap): Unit = js.native
  def write(parentNode: Node, ctx: Context): Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Group")
@js.native
object Group extends js.Object {
  def create(name: StringProtected, parentGroup: Group): Group = js.native
  def read(xmlNode: Node, ctx: Context, parentGroup: Group): Group = js.native
}

