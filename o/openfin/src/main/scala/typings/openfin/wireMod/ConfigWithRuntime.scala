package typings.openfin.wireMod

import typings.openfin.anon.Alias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigWithRuntime extends BaseConfig {
  @JSName("runtime")
  var runtime_ConfigWithRuntime: RuntimeConfig
}

object ConfigWithRuntime {
  @scala.inline
  def apply(
    runtime: RuntimeConfig,
    address: String = null,
    appAssets: js.Array[Alias] = null,
    assetsUrl: String = null,
    client: js.Any = null,
    customItems: js.Array[_] = null,
    devToolsPort: js.UndefOr[Double] = js.undefined,
    installerUI: js.UndefOr[Boolean] = js.undefined,
    licenseKey: String = null,
    lrsUrl: String = null,
    manifestUrl: String = null,
    name: String = null,
    nonPersistent: js.UndefOr[Boolean] = js.undefined,
    runtimeClient: js.UndefOr[Boolean] = js.undefined,
    services: js.Array[ServiceConfig] = null,
    startupApp: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined,
    uuid: String = null
  ): ConfigWithRuntime = {
    val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (appAssets != null) __obj.updateDynamic("appAssets")(appAssets.asInstanceOf[js.Any])
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (customItems != null) __obj.updateDynamic("customItems")(customItems.asInstanceOf[js.Any])
    if (!js.isUndefined(devToolsPort)) __obj.updateDynamic("devToolsPort")(devToolsPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(installerUI)) __obj.updateDynamic("installerUI")(installerUI.get.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey.asInstanceOf[js.Any])
    if (lrsUrl != null) __obj.updateDynamic("lrsUrl")(lrsUrl.asInstanceOf[js.Any])
    if (manifestUrl != null) __obj.updateDynamic("manifestUrl")(manifestUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistent)) __obj.updateDynamic("nonPersistent")(nonPersistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeClient)) __obj.updateDynamic("runtimeClient")(runtimeClient.get.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (startupApp != null) __obj.updateDynamic("startupApp")(startupApp.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigWithRuntime]
  }
}

