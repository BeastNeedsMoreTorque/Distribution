package typings.ionic.ionicAngularAilmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsMajorUpdateAvailable")
@js.native
class AppScriptsMajorUpdateAvailable () extends IonicAngularAilment {
  var currentVersion: js.UndefOr[String] = js.native
  var latestVersion: js.UndefOr[String] = js.native
  def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
}

