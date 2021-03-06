package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Accessibility Features
////////////////////
/**
  * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features. This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features. In order to get feature states the extension must request accessibilityFeatures.read permission. For modifying feature state, the extension needs accessibilityFeatures.modify permission. Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
  * Availability: Since Chrome 37.
  * Permissions: "accessibilityFeatures.read"
  * Important: This API works only on Chrome OS.
  */
@JSGlobal("chrome.accessibilityFeatures")
@js.native
object accessibilityFeatures extends js.Object

