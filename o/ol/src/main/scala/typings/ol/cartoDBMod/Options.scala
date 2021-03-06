package typings.ol.cartoDBMod

import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var account: String
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    account: String,
    attributions: AttributionLike = null,
    cacheSize: js.UndefOr[Double] = js.undefined,
    config: js.Any = null,
    crossOrigin: String = null,
    map: String = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    projection: ProjectionLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

