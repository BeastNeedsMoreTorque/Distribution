package typings.reactNativeFirebase.mod.RNFirebase.storage

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettableMetadata extends js.Object {
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  var contentDisposition: js.UndefOr[String | Null] = js.undefined
  var contentEncoding: js.UndefOr[String | Null] = js.undefined
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  var contentType: js.UndefOr[String | Null] = js.undefined
  var customMetadata: js.UndefOr[Partial[Record[String, String]]] = js.undefined
}

object SettableMetadata {
  @scala.inline
  def apply(
    cacheControl: js.UndefOr[Null | String] = js.undefined,
    contentDisposition: js.UndefOr[Null | String] = js.undefined,
    contentEncoding: js.UndefOr[Null | String] = js.undefined,
    contentLanguage: js.UndefOr[Null | String] = js.undefined,
    contentType: js.UndefOr[Null | String] = js.undefined,
    customMetadata: Partial[Record[String, String]] = null
  ): SettableMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheControl)) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (!js.isUndefined(contentDisposition)) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEncoding)) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLanguage)) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(contentType)) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableMetadata]
  }
}

