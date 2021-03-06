package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlacemarkOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  var hasHint: js.UndefOr[Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  var iconOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconShape: js.UndefOr[IGeometryJson | Null] = js.undefined
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  var interactivityModel: js.UndefOr[String] = js.undefined
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var pointOverlay: js.UndefOr[String] = js.undefined
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zIndexActive: js.UndefOr[Double] = js.undefined
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  var zIndexHover: js.UndefOr[Double] = js.undefined
}

object IPlacemarkOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hasBalloon: js.UndefOr[Boolean] = js.undefined,
    hasHint: js.UndefOr[Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined,
    iconOffset: js.Array[Double] = null,
    iconShape: js.UndefOr[Null | IGeometryJson] = js.undefined,
    interactiveZIndex: js.UndefOr[Boolean] = js.undefined,
    interactivityModel: String = null,
    openBalloonOnClick: js.UndefOr[Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[Boolean] = js.undefined,
    pane: String = null,
    pointOverlay: String = null,
    syncOverlayInit: js.UndefOr[Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zIndexActive: js.UndefOr[Double] = js.undefined,
    zIndexDrag: js.UndefOr[Double] = js.undefined,
    zIndexHover: js.UndefOr[Double] = js.undefined
  ): IPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIconOnBalloonOpen)) __obj.updateDynamic("hideIconOnBalloonOpen")(hideIconOnBalloonOpen.get.asInstanceOf[js.Any])
    if (iconOffset != null) __obj.updateDynamic("iconOffset")(iconOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(iconShape)) __obj.updateDynamic("iconShape")(iconShape.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex.get.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (pointOverlay != null) __obj.updateDynamic("pointOverlay")(pointOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(syncOverlayInit)) __obj.updateDynamic("syncOverlayInit")(syncOverlayInit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMarginInDragging)) __obj.updateDynamic("useMapMarginInDragging")(useMapMarginInDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexActive)) __obj.updateDynamic("zIndexActive")(zIndexActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexDrag)) __obj.updateDynamic("zIndexDrag")(zIndexDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexHover)) __obj.updateDynamic("zIndexHover")(zIndexHover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlacemarkOptions]
  }
}

