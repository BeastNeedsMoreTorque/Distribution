package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client column.
  */
trait ASPxClientTreeListColumn extends js.Object {
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String
  /**
    * Gets the column's position within the collection.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String
}

object ASPxClientTreeListColumn {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String): ASPxClientTreeListColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumn]
  }
}

