package typings.reactTable.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableRowProps> */
trait PartialTableRowProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTableRowProps {
  @scala.inline
  def apply(className: String = null, key: Key = null, role: String = null, style: CSSProperties = null): PartialTableRowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableRowProps]
  }
}

