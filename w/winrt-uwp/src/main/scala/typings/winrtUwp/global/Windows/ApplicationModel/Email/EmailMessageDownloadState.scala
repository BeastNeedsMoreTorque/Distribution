package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the download status of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageDownloadState")
@js.native
object EmailMessageDownloadState extends js.Object {
  /* 2 */ val downloaded: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.downloaded with Double = js.native
  /* 1 */ val downloading: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.downloading with Double = js.native
  /* 3 */ val failed: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.failed with Double = js.native
  /* 0 */ val partiallyDownloaded: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.partiallyDownloaded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState with Double
  ] = js.native
}

