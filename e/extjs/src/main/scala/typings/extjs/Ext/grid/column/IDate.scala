package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends IColumn {
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_IDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}

object IDate {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    defaultRenderer: /* value */ js.UndefOr[js.Any] => Unit = null,
    format: String = null
  ): IDate = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction1(defaultRenderer))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDate]
  }
}

