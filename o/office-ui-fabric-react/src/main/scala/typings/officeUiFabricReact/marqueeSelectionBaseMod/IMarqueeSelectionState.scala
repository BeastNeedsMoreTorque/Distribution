package typings.officeUiFabricReact.marqueeSelectionBaseMod

import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarqueeSelectionState extends js.Object {
  var dragOrigin: js.UndefOr[Point] = js.undefined
  var dragRect: js.UndefOr[IRectangle] = js.undefined
}

object IMarqueeSelectionState {
  @scala.inline
  def apply(dragOrigin: Point = null, dragRect: IRectangle = null): IMarqueeSelectionState = {
    val __obj = js.Dynamic.literal()
    if (dragOrigin != null) __obj.updateDynamic("dragOrigin")(dragOrigin.asInstanceOf[js.Any])
    if (dragRect != null) __obj.updateDynamic("dragRect")(dragRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionState]
  }
}

