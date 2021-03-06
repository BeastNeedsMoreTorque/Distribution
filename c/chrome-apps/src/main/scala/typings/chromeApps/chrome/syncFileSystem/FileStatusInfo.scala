package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonCONFLICTING
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CONFLICTING
import typings.chromeApps.chromeAppsStrings.PENDING
import typings.chromeApps.chromeAppsStrings.SYNCED
import typings.chromeApps.chromeAppsStrings.conflicting_
import typings.chromeApps.chromeAppsStrings.pending_
import typings.chromeApps.chromeAppsStrings.synced_
import typings.filesystem.FileEntry
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStatusInfo extends js.Object {
  /** Optional error that is only returned if there was a problem retrieving the FileStatus for the given file. */
  var error: js.UndefOr[String] = js.undefined
  /** One of the Entry's originally given to getFileStatuses. */
  var fileEntry: FileEntry
  /**
    * Status value
    * @see FileStatus
    */
  var status: ToStringLiteral[
    AnonCONFLICTING, 
    SYNCED | PENDING | CONFLICTING, 
    Exclude[SYNCED | PENDING | CONFLICTING, synced_ | pending_ | conflicting_]
  ]
}

object FileStatusInfo {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[
      AnonCONFLICTING, 
      SYNCED | PENDING | CONFLICTING, 
      Exclude[SYNCED | PENDING | CONFLICTING, synced_ | pending_ | conflicting_]
    ],
    error: String = null
  ): FileStatusInfo = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusInfo]
  }
}

