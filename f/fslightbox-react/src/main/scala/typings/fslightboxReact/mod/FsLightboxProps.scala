package typings.fslightboxReact.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsLightboxProps extends js.Object {
  // custom sources
  var customSources: js.UndefOr[js.Array[Element]] = js.undefined
  // types
  var disableLocalStorage: js.UndefOr[Boolean] = js.undefined
  // preferences
  var loadOnlyCurrentSource: js.UndefOr[Boolean] = js.undefined
  var maxYoutubeVideoDimensions: js.UndefOr[VideoDimensions] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  // events
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openOnMount: js.UndefOr[Boolean] = js.undefined
  // slide number controlling
  var slide: js.UndefOr[Double] = js.undefined
  var slideDistance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourceIndex: js.UndefOr[Double] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
  var toggler: Boolean
  var `type`: js.UndefOr[SourceType] = js.undefined
  var types: js.UndefOr[js.Array[SourceType]] = js.undefined
  // sources
  var videosPosters: js.UndefOr[js.Array[VideoPoster]] = js.undefined
}

object FsLightboxProps {
  @scala.inline
  def apply(
    toggler: Boolean,
    customSources: js.Array[Element] = null,
    disableLocalStorage: js.UndefOr[Boolean] = js.undefined,
    loadOnlyCurrentSource: js.UndefOr[Boolean] = js.undefined,
    maxYoutubeVideoDimensions: VideoDimensions = null,
    onClose: () => Unit = null,
    onInit: () => Unit = null,
    onOpen: () => Unit = null,
    onShow: () => Unit = null,
    openOnMount: js.UndefOr[Boolean] = js.undefined,
    slide: js.UndefOr[Double] = js.undefined,
    slideDistance: js.UndefOr[Double] = js.undefined,
    source: String = null,
    sourceIndex: js.UndefOr[Double] = js.undefined,
    sources: js.Array[String] = null,
    `type`: js.UndefOr[Null | SourceType] = js.undefined,
    types: js.Array[SourceType] = null,
    videosPosters: js.Array[VideoPoster] = null
  ): FsLightboxProps = {
    val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    if (customSources != null) __obj.updateDynamic("customSources")(customSources.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLocalStorage)) __obj.updateDynamic("disableLocalStorage")(disableLocalStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnlyCurrentSource)) __obj.updateDynamic("loadOnlyCurrentSource")(loadOnlyCurrentSource.get.asInstanceOf[js.Any])
    if (maxYoutubeVideoDimensions != null) __obj.updateDynamic("maxYoutubeVideoDimensions")(maxYoutubeVideoDimensions.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(openOnMount)) __obj.updateDynamic("openOnMount")(openOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideDistance)) __obj.updateDynamic("slideDistance")(slideDistance.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceIndex)) __obj.updateDynamic("sourceIndex")(sourceIndex.get.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (videosPosters != null) __obj.updateDynamic("videosPosters")(videosPosters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsLightboxProps]
  }
}

