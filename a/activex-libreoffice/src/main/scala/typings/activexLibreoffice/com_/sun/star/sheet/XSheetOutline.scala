package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.table.TableOrientation
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to access the outlines of a sheet. */
trait XSheetOutline extends XInterface {
  /**
    * creates outline groups from formula references in a range.
    * @param aRange the cell range for which outlines are generated.
    */
  def autoOutline(aRange: CellRangeAddress): Unit
  /** removes all outline groups from the sheet. */
  def clearOutline(): Unit
  /**
    * creates an outline group.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the new outline (columns or rows).
    */
  def group(aRange: CellRangeAddress, nOrientation: TableOrientation): Unit
  /**
    * collapses an outline group.
    * @param aRange the cell range for which the outlines are collapsed.
    */
  def hideDetail(aRange: CellRangeAddress): Unit
  /**
    * reopens an outline group.
    * @param aRange the cell range for which the outlines are reopened.
    */
  def showDetail(aRange: CellRangeAddress): Unit
  /**
    * shows all outlined groups below a specific level.
    * @param nLevel all outline levels from 1 to this value will be opened and the higher levels will be closed.
    * @param nOrientation the orientation of the outlines (columns or rows).
    */
  def showLevel(nLevel: Double, nOrientation: TableOrientation): Unit
  /**
    * removes outline groups.
    *
    * In the specified range, all outline groups on the innermost level are removed.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the outlines to remove (columns or rows).
    */
  def ungroup(aRange: CellRangeAddress, nOrientation: TableOrientation): Unit
}

object XSheetOutline {
  @scala.inline
  def apply(
    acquire: () => Unit,
    autoOutline: CellRangeAddress => Unit,
    clearOutline: () => Unit,
    group: (CellRangeAddress, TableOrientation) => Unit,
    hideDetail: CellRangeAddress => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    showDetail: CellRangeAddress => Unit,
    showLevel: (Double, TableOrientation) => Unit,
    ungroup: (CellRangeAddress, TableOrientation) => Unit
  ): XSheetOutline = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), autoOutline = js.Any.fromFunction1(autoOutline), clearOutline = js.Any.fromFunction0(clearOutline), group = js.Any.fromFunction2(group), hideDetail = js.Any.fromFunction1(hideDetail), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showDetail = js.Any.fromFunction1(showDetail), showLevel = js.Any.fromFunction2(showLevel), ungroup = js.Any.fromFunction2(ungroup))
    __obj.asInstanceOf[XSheetOutline]
  }
}

