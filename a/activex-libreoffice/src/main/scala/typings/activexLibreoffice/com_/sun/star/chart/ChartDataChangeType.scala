package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of change that was applied to the data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait ChartDataChangeType extends js.Object

object ChartDataChangeType {
  /** Major changes were applied to the data. */
  @scala.inline
  def ALL: `0` = 0.asInstanceOf[`0`]
  /** The column given in the {@link ChartDataChangeEvent} , was deleted. */
  @scala.inline
  def COLUMN_DELETED: `4` = 4.asInstanceOf[`4`]
  /** The column given in the {@link ChartDataChangeEvent} , was inserted. */
  @scala.inline
  def COLUMN_INSERTED: `2` = 2.asInstanceOf[`2`]
  /** The range of columns and rows, given in the {@link ChartDataChangeEvent} , has changed. */
  @scala.inline
  def DATA_RANGE: `1` = 1.asInstanceOf[`1`]
  /** The row given in the {@link ChartDataChangeEvent} , was deleted. */
  @scala.inline
  def ROW_DELETED: `5` = 5.asInstanceOf[`5`]
  /** The row given in the {@link ChartDataChangeEvent} , was inserted. */
  @scala.inline
  def ROW_INSERTED: `3` = 3.asInstanceOf[`3`]
}

