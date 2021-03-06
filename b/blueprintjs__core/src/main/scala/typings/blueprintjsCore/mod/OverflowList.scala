package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.anon.PartialIOverflowListPropsClassName
import typings.blueprintjsCore.overflowListMod.IOverflowListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "OverflowList")
@js.native
class OverflowList[T] ()
  extends typings.blueprintjsCore.componentsMod.OverflowList[T]

/* static members */
@JSImport("@blueprintjs/core", "OverflowList")
@js.native
object OverflowList extends js.Object {
  var defaultProps: PartialIOverflowListPropsClassName = js.native
  var displayName: String = js.native
  def ofType[T](): Instantiable1[
    /* props */ IOverflowListProps[T], 
    typings.blueprintjsCore.overflowListMod.OverflowList[T]
  ] = js.native
}

