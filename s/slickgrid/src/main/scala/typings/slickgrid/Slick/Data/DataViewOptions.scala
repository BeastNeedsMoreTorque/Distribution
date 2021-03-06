package typings.slickgrid.Slick.Data

import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewOptions[T /* <: SlickData */] extends js.Object {
  var groupItemMetadataProvider: js.UndefOr[GroupItemMetadataProvider[T]] = js.undefined
  var inlineFilters: js.UndefOr[Boolean] = js.undefined
}

object DataViewOptions {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](
    groupItemMetadataProvider: GroupItemMetadataProvider[T] = null,
    inlineFilters: js.UndefOr[Boolean] = js.undefined
  ): DataViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (groupItemMetadataProvider != null) __obj.updateDynamic("groupItemMetadataProvider")(groupItemMetadataProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineFilters)) __obj.updateDynamic("inlineFilters")(inlineFilters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewOptions[T]]
  }
}

