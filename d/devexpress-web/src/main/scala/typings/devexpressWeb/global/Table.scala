package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table in the document.
  */
@JSGlobal("Table")
@js.native
class Table ()
  extends typings.devexpressWeb.Table {
  /**
    * Gets an index of the table.
    */
  /* CompleteClass */
  override val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current table element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the table length in characters.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Provides access to a collection of table rows.
    */
  /* CompleteClass */
  override val rows: js.Array[typings.devexpressWeb.TableRow] = js.native
  /**
    * Gets the table's start position in the document.
    */
  /* CompleteClass */
  override val start: Double = js.native
  /**
    * Gets the name of the style applied to the table (see StyleBase.name).
    */
  /* CompleteClass */
  override val styleName: String = js.native
}

