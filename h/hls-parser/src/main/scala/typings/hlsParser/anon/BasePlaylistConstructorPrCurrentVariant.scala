package typings.hlsParser.anon

import typings.hlsParser.mod.types.Key
import typings.hlsParser.mod.types.SessionData
import typings.hlsParser.mod.types.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  variants ? :std.Array<hls-parser.hls-parser.types.Variant>,   currentVariant ? :number,   sessionDataList ? :std.Array<hls-parser.hls-parser.types.SessionData>,   sessionKeyList ? :std.Array<hls-parser.hls-parser.types.Key>,   source ? :string} */
trait BasePlaylistConstructorPrCurrentVariant extends js.Object {
  var currentVariant: js.UndefOr[Double] = js.undefined
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  var sessionDataList: js.UndefOr[js.Array[SessionData]] = js.undefined
  var sessionKeyList: js.UndefOr[js.Array[Key]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Offset] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object BasePlaylistConstructorPrCurrentVariant {
  @scala.inline
  def apply(
    currentVariant: js.UndefOr[Double] = js.undefined,
    independentSegments: js.UndefOr[Boolean] = js.undefined,
    sessionDataList: js.Array[SessionData] = null,
    sessionKeyList: js.Array[Key] = null,
    source: String = null,
    start: Offset = null,
    uri: String = null,
    variants: js.Array[Variant] = null,
    version: js.UndefOr[Double] = js.undefined
  ): BasePlaylistConstructorPrCurrentVariant = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentVariant)) __obj.updateDynamic("currentVariant")(currentVariant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(independentSegments)) __obj.updateDynamic("independentSegments")(independentSegments.get.asInstanceOf[js.Any])
    if (sessionDataList != null) __obj.updateDynamic("sessionDataList")(sessionDataList.asInstanceOf[js.Any])
    if (sessionKeyList != null) __obj.updateDynamic("sessionKeyList")(sessionKeyList.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPrCurrentVariant]
  }
}

