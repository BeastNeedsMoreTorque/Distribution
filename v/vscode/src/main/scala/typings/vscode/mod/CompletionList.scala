package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "CompletionList")
@js.native
/**
  * Creates a new completion list.
  *
  * @param items The completion items.
  * @param isIncomplete The list is not complete.
  */
class CompletionList[T] () extends js.Object {
  def this(items: js.Array[T]) = this()
  def this(items: js.Array[T], isIncomplete: Boolean) = this()
  /**
    * This list is not complete. Further typing should result in recomputing
    * this list.
    */
  var isIncomplete: js.UndefOr[Boolean] = js.native
  /**
    * The completion items.
    */
  var items: js.Array[T] = js.native
}

