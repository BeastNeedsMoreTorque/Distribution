package typings.backbonePaginator.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableSetSortingOptions[TModel /* <: Model[_, ModelSetOptions] */] extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var sortValue: js.UndefOr[js.Function2[/* model */ TModel, /* sortKey */ String, _ | String]] = js.undefined
}

object PageableSetSortingOptions {
  @scala.inline
  def apply[/* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel](
    full: js.UndefOr[Boolean] = js.undefined,
    side: String = null,
    sortValue: (/* model */ TModel, /* sortKey */ String) => _ | String = null
  ): PageableSetSortingOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (sortValue != null) __obj.updateDynamic("sortValue")(js.Any.fromFunction2(sortValue))
    __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
  }
}

