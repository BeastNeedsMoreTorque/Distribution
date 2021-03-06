package typings.evernote.mod.Types

import typings.evernote.anon.InMyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.NotebookRecipientSettings")
@js.native
class NotebookRecipientSettings () extends js.Object {
  def this(args: InMyList) = this()
  var inMyList: js.UndefOr[Boolean] = js.native
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[String] = js.native
}

