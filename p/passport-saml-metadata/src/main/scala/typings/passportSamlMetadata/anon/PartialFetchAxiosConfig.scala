package typings.passportSamlMetadata.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
trait PartialFetchAxiosConfig extends js.Object {
  var backupStore: js.UndefOr[Map[String, String]] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialFetchAxiosConfig {
  @scala.inline
  def apply(
    backupStore: Map[String, String] = null,
    responseType: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialFetchAxiosConfig = {
    val __obj = js.Dynamic.literal()
    if (backupStore != null) __obj.updateDynamic("backupStore")(backupStore.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFetchAxiosConfig]
  }
}

