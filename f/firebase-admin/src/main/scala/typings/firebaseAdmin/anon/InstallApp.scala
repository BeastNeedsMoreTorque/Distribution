package typings.firebaseAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallApp extends js.Object {
  /**
    * Whether to install the Android app if the device supports it and the app is
    * not already installed.
    */
  var installApp: js.UndefOr[Boolean] = js.undefined
  /**
    * The Android minimum version if available. If the installed app is an older
    * version, the user is taken to the GOogle Play Store to upgrade the app.
    */
  var minimumVersion: js.UndefOr[String] = js.undefined
  /**
    * Defines the required Android package name of the app where the link should be
    * handled if the Android app is installed.
    */
  var packageName: String
}

object InstallApp {
  @scala.inline
  def apply(packageName: String, installApp: js.UndefOr[Boolean] = js.undefined, minimumVersion: String = null): InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    if (!js.isUndefined(installApp)) __obj.updateDynamic("installApp")(installApp.get.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallApp]
  }
}

