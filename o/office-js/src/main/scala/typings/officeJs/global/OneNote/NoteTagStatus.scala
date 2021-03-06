package typings.officeJs.global.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagStatus")
@js.native
object NoteTagStatus extends js.Object {
  /* "Completed" */ val completed: typings.officeJs.OneNote.NoteTagStatus.completed with String = js.native
  /* "Disabled" */ val disabled: typings.officeJs.OneNote.NoteTagStatus.disabled with String = js.native
  /* "Normal" */ val normal: typings.officeJs.OneNote.NoteTagStatus.normal with String = js.native
  /* "OutlookTask" */ val outlookTask: typings.officeJs.OneNote.NoteTagStatus.outlookTask with String = js.native
  /* "TaskNotSyncedYet" */ val taskNotSyncedYet: typings.officeJs.OneNote.NoteTagStatus.taskNotSyncedYet with String = js.native
  /* "TaskRemoved" */ val taskRemoved: typings.officeJs.OneNote.NoteTagStatus.taskRemoved with String = js.native
  /* "Unknown" */ val unknown: typings.officeJs.OneNote.NoteTagStatus.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.NoteTagStatus with String] = js.native
}

