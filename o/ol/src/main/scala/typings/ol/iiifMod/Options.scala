package typings.ol.iiifMod

import typings.ol.extentMod.Extent
import typings.ol.iiifinfoMod.Versions
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var size: Size
  var sizes: js.UndefOr[js.Array[Size]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
  var supports: js.UndefOr[js.Array[String]] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double | Size] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Versions] = js.undefined
  var zDirection: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    size: Size,
    attributions: AttributionLike = null,
    attributionsCollapsible: js.UndefOr[Boolean] = js.undefined,
    cacheSize: js.UndefOr[Double] = js.undefined,
    crossOrigin: String = null,
    extent: Extent = null,
    format: String = null,
    projection: ProjectionLike = null,
    quality: String = null,
    reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined,
    resolutions: js.Array[Double] = null,
    sizes: js.Array[Size] = null,
    state: State = null,
    supports: js.Array[String] = null,
    tilePixelRatio: js.UndefOr[Double] = js.undefined,
    tileSize: Double | Size = null,
    transition: js.UndefOr[Double] = js.undefined,
    url: String = null,
    version: Versions = null,
    zDirection: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionsCollapsible)) __obj.updateDynamic("attributionsCollapsible")(attributionsCollapsible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(reprojectionErrorThreshold)) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.get.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    if (!js.isUndefined(tilePixelRatio)) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.get.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(zDirection)) __obj.updateDynamic("zDirection")(zDirection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

