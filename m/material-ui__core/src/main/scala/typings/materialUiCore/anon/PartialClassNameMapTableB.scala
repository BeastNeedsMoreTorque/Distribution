package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyClassKey>> */
@js.native
trait PartialClassNameMapTableB extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTableB {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapTableB = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTableB]
  }
}

