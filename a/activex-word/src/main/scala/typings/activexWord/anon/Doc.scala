package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doc extends js.Object {
  var Cancel: Boolean
  val Doc: Document
  val SaveAsUI: Boolean
}

object Doc {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, SaveAsUI: Boolean): Doc = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
}

