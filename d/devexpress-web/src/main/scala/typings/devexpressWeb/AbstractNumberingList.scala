package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract numbering list definition that defines the appearance and behavior of numbered paragraphs in a document.
  */
trait AbstractNumberingList extends js.Object {
  /**
    * Gets or sets a value indicating whether an abstract numbering list is deleted.
    */
  var deleted: Boolean
}

object AbstractNumberingList {
  @scala.inline
  def apply(deleted: Boolean): AbstractNumberingList = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractNumberingList]
  }
}

