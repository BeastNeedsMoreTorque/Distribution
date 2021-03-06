package typings.googleapis.mod.analyticsreportingV4

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Analytics Reporting API
  *
  * Accesses Analytics report data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analyticsreporting = google.analyticsreporting('v4');
  *
  * @namespace analyticsreporting
  * @type {Function}
  * @version v4
  * @variation v4
  * @param {object=} options Options for Analyticsreporting
  */
@JSImport("googleapis", "analyticsreporting_v4.Analyticsreporting")
@js.native
class Analyticsreporting protected ()
  extends typings.googleapis.v4Mod.analyticsreportingV4.Analyticsreporting {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

