package typings.googleapis.fileV1beta1Mod.fileV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Filestore API
  *
  * The Cloud Filestore API is used for creating and managing cloud file
  * servers.
  *
  * @example
  * const {google} = require('googleapis');
  * const file = google.file('v1beta1');
  *
  * @namespace file
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for File
  */
@JSImport("googleapis/build/src/apis/file/v1beta1", "file_v1beta1.File")
@js.native
class File protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

