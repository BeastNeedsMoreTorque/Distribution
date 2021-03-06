package typings.amapJsApi.AMap.TileLayer.WMS

import typings.amapJsApi.AMap.Map
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapJsApi.AMap.TileLayer.Flexible.Options {
  /**
    * 地图级别切换时，不同级别的图片是否进行混合
    */
  var blend: js.UndefOr[Boolean] = js.undefined
  /**
    * OGC标准的WMS地图服务的GetMap接口的参数
    */
  var params: Params
  /**
    * wms服务的url地址
    */
  var url: String
}

object Options {
  @scala.inline
  def apply(
    params: Params,
    url: String,
    blend: js.UndefOr[Boolean] = js.undefined,
    cacheSize: js.UndefOr[Double] = js.undefined,
    createTile: (/* x */ Double, /* y */ Double, /* z */ Double, /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], /* fail */ js.Function0[Unit]) => Unit = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]) = null,
    map: Map = null,
    opacity: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tileUrl: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(blend)) __obj.updateDynamic("blend")(blend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (createTile != null) __obj.updateDynamic("createTile")(js.Any.fromFunction5(createTile))
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.get.asInstanceOf[js.Any])
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl.asInstanceOf[js.Any])
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(getTileUrl.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

