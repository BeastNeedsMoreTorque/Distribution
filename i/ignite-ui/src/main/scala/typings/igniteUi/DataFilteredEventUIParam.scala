package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilteredEventUIParam extends js.Object {
  /**
    * Gets the column index. Applicable only when filtering mode is "simple".
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets the column key. Applicable only when filtering mode is "simple".
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Gets the filtered expressions.
    */
  var expressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataFilteredEventUIParam {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    expressions: js.Array[_] = null,
    owner: js.Any = null
  ): DataFilteredEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFilteredEventUIParam]
  }
}

