package typings.googleapis.playcustomappV1Mod.playcustomappV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Custom App Publishing API
  *
  * An API to publish custom Android apps.
  *
  * @example
  * const {google} = require('googleapis');
  * const playcustomapp = google.playcustomapp('v1');
  *
  * @namespace playcustomapp
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Playcustomapp
  */
@JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Playcustomapp")
@js.native
class Playcustomapp protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: ResourceAccounts = js.native
  var context: APIRequestContext = js.native
}

