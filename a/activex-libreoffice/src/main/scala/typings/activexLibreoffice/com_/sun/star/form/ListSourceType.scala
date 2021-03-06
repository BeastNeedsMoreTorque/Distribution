package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the kind of data source used to fill the list data of a listbox or a combobox control.
  * @see com.sun.star.form.component.ListBox
  * @see com.sun.star.form.component.ComboBox
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait ListSourceType extends js.Object

object ListSourceType {
  /** The control should be filled with the results of a database query. */
  @scala.inline
  def QUERY: `2` = 2.asInstanceOf[`2`]
  /** The control should be filled with the results of a database statement. */
  @scala.inline
  def SQL: `3` = 3.asInstanceOf[`3`]
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  @scala.inline
  def SQLPASSTHROUGH: `4` = 4.asInstanceOf[`4`]
  /** The control should be filled with the data of a table. */
  @scala.inline
  def TABLE: `1` = 1.asInstanceOf[`1`]
  /** The control should be filled with the field names of a database table. */
  @scala.inline
  def TABLEFIELDS: `5` = 5.asInstanceOf[`5`]
  /** The control should be filled with a list of string values. */
  @scala.inline
  def VALUELIST: `0` = 0.asInstanceOf[`0`]
}

