package typings.winrtUwp.global.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores settings that determine whether the app provides suggestions based on local files, and that define the criteria used to locate and filter these suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
@js.native
/** Creates a new instance of the localContentSuggestionSettings class. */
class LocalContentSuggestionSettings ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.LocalContentSuggestionSettings {
  /** An Advanced Query Syntax (AQS) string that limits the types and kinds of files that are used to provide suggestions. If no AQS string is specified, suggestions are provided from all local files in locations specified by the locations property. */
  /* CompleteClass */
  override var aqsFilter: String = js.native
  /** Indicates whether suggestions based on local files are displayed in the search pane. */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** A list of the storageFolder objects that contain files that are used to provide suggestions. If the list is empty, suggestions are provided from files in all of the local libraries for which the app declared capabilities. */
  /* CompleteClass */
  override var locations: IVector[StorageFolder] = js.native
  /** A list of the file properties whose values are used to provide suggestions from local files. If the list is empty, all of the file properties that are available for suggestions are used. */
  /* CompleteClass */
  override var propertiesToMatch: IVector[String] = js.native
}

