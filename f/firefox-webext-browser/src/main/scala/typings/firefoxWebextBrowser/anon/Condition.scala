package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /** The type of param can be either "purpose" or "pref". */
  var condition: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition] = js.undefined
  /** A url parameter name */
  var name: String
  /** The preference to retrieve the value from. */
  var pref: js.UndefOr[String] = js.undefined
  /** The context that initiates a search, required if condition is "purpose". */
  var purpose: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose] = js.undefined
  /** A url parameter value. */
  var value: js.UndefOr[String] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    name: String,
    condition: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition = null,
    pref: String = null,
    purpose: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose = null,
    value: String = null
  ): Condition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (pref != null) __obj.updateDynamic("pref")(pref.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

