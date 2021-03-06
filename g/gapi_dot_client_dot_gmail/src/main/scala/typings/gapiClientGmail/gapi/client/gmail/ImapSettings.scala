package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapSettings extends js.Object {
  /**
    * If this value is true, Gmail will immediately expunge a message when it is marked as deleted in IMAP. Otherwise, Gmail will wait for an update from the
    * client before expunging messages marked as deleted.
    */
  var autoExpunge: js.UndefOr[Boolean] = js.undefined
  /** Whether IMAP is enabled for the account. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** The action that will be executed on a message when it is marked as deleted and expunged from the last visible IMAP folder. */
  var expungeBehavior: js.UndefOr[String] = js.undefined
  /**
    * An optional limit on the number of messages that an IMAP folder may contain. Legal values are 0, 1000, 2000, 5000 or 10000. A value of zero is
    * interpreted to mean that there is no limit.
    */
  var maxFolderSize: js.UndefOr[Double] = js.undefined
}

object ImapSettings {
  @scala.inline
  def apply(
    autoExpunge: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expungeBehavior: String = null,
    maxFolderSize: js.UndefOr[Double] = js.undefined
  ): ImapSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpunge)) __obj.updateDynamic("autoExpunge")(autoExpunge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (expungeBehavior != null) __obj.updateDynamic("expungeBehavior")(expungeBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFolderSize)) __obj.updateDynamic("maxFolderSize")(maxFolderSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapSettings]
  }
}

