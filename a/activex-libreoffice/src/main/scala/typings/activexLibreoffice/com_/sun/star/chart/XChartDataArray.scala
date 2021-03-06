package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to data represented as an array of rows.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  *
  * If used for an {@link XYDiagram} , the row number 0 represents the **x** -values.
  */
trait XChartDataArray extends XChartData {
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  var ColumnDescriptions: SafeArray[String]
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  var Data: SafeArray[SafeArray[Double]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  var RowDescriptions: SafeArray[String]
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  def getColumnDescriptions(): SafeArray[String]
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  def getData(): SafeArray[SafeArray[Double]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  def getRowDescriptions(): SafeArray[String]
  /**
    * sets the description texts for all columns.
    * @param aColumnDescriptions a sequence of strings which represent a description for each column.
    */
  def setColumnDescriptions(aColumnDescriptions: SeqEquiv[String]): Unit
  /**
    * sets the chart data as an array of numbers.
    * @param aData the values as a sequence of sequences. The inner sequence represents rows.
    */
  def setData(aData: SeqEquiv[SeqEquiv[Double]]): Unit
  /**
    * sets the description texts for all rows.
    * @param aRowDescriptions a sequence of strings which represent a description for each row.
    */
  def setRowDescriptions(aRowDescriptions: SeqEquiv[String]): Unit
}

object XChartDataArray {
  @scala.inline
  def apply(
    ColumnDescriptions: SafeArray[String],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getColumnDescriptions: () => SafeArray[String],
    getData: () => SafeArray[SafeArray[Double]],
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
    __obj.asInstanceOf[XChartDataArray]
  }
}

