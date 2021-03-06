package typings.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the type of a raised event. For each object type, please keep the order of: deleted, selection changed, data changed, added.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends js.Object {
  /* "AnnotationAdded" */ val annotationAdded: typings.officeJsPreview.Word.EventType.annotationAdded with String = js.native
  /* "AnnotationChanged" */ val annotationChanged: typings.officeJsPreview.Word.EventType.annotationChanged with String = js.native
  /* "AnnotationDeleted" */ val annotationDeleted: typings.officeJsPreview.Word.EventType.annotationDeleted with String = js.native
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeJsPreview.Word.EventType.contentControlAdded with String = js.native
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeJsPreview.Word.EventType.contentControlDataChanged with String = js.native
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeJsPreview.Word.EventType.contentControlDeleted with String = js.native
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeJsPreview.Word.EventType.contentControlSelectionChanged with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.EventType with String] = js.native
}

