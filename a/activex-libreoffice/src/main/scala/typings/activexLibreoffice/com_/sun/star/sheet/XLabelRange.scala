package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a label range in a spreadsheet document.
  *
  * These can be column or row labels, depending on where they are used.
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRange extends XInterface {
  /** returns the cell range address for which the labels are valid. */
  var DataArea: CellRangeAddress
  /** returns the cell range address that contains the labels. */
  var LabelArea: CellRangeAddress
  /** returns the cell range address for which the labels are valid. */
  def getDataArea(): CellRangeAddress
  /** returns the cell range address that contains the labels. */
  def getLabelArea(): CellRangeAddress
  /** sets the cell range address for which the labels are valid. */
  def setDataArea(aDataArea: CellRangeAddress): Unit
  /** sets the cell range address that contains the labels. */
  def setLabelArea(aLabelArea: CellRangeAddress): Unit
}

object XLabelRange {
  @scala.inline
  def apply(
    DataArea: CellRangeAddress,
    LabelArea: CellRangeAddress,
    acquire: () => Unit,
    getDataArea: () => CellRangeAddress,
    getLabelArea: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDataArea: CellRangeAddress => Unit,
    setLabelArea: CellRangeAddress => Unit
  ): XLabelRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea.asInstanceOf[js.Any], LabelArea = LabelArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataArea = js.Any.fromFunction0(getDataArea), getLabelArea = js.Any.fromFunction0(getLabelArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataArea = js.Any.fromFunction1(setDataArea), setLabelArea = js.Any.fromFunction1(setLabelArea))
    __obj.asInstanceOf[XLabelRange]
  }
}

