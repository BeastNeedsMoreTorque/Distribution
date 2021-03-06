package typings.antDesignReactNative.gridPropsTypeMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPropsType extends js.Object {
  var carouselMaxRow: Double
  var columnNum: Double
  var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.undefined
  var hasLine: js.UndefOr[Boolean] = js.undefined
  var isCarousel: js.UndefOr[Boolean] = js.undefined
  var onPress: js.UndefOr[js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Unit]] = js.undefined
  var renderItem: js.UndefOr[
    js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, ReactElement]
  ] = js.undefined
}

object GridPropsType {
  @scala.inline
  def apply(
    carouselMaxRow: Double,
    columnNum: Double,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    onPress: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement = null
  ): GridPropsType = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel.get.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction2(onPress))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    __obj.asInstanceOf[GridPropsType]
  }
}

