package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbsOptions extends js.Object {
  var autoScrollOffset: js.UndefOr[Double] = js.undefined
  var multipleActiveThumbs: js.UndefOr[Boolean] = js.undefined
  var slideThumbActiveClass: js.UndefOr[String] = js.undefined
  var swiper: js.UndefOr[Swiper] = js.undefined
  var thumbsContainerClass: js.UndefOr[String] = js.undefined
}

object ThumbsOptions {
  @scala.inline
  def apply(
    autoScrollOffset: js.UndefOr[Double] = js.undefined,
    multipleActiveThumbs: js.UndefOr[Boolean] = js.undefined,
    slideThumbActiveClass: String = null,
    swiper: Swiper = null,
    thumbsContainerClass: String = null
  ): ThumbsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScrollOffset)) __obj.updateDynamic("autoScrollOffset")(autoScrollOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleActiveThumbs)) __obj.updateDynamic("multipleActiveThumbs")(multipleActiveThumbs.get.asInstanceOf[js.Any])
    if (slideThumbActiveClass != null) __obj.updateDynamic("slideThumbActiveClass")(slideThumbActiveClass.asInstanceOf[js.Any])
    if (swiper != null) __obj.updateDynamic("swiper")(swiper.asInstanceOf[js.Any])
    if (thumbsContainerClass != null) __obj.updateDynamic("thumbsContainerClass")(thumbsContainerClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbsOptions]
  }
}

