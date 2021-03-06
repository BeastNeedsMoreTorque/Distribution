package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ascending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var emphasized: js.UndefOr[String] = js.undefined
  var inactive: js.UndefOr[Boolean] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var words: js.UndefOr[String] = js.undefined
}

object Ascending {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    emphasized: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    notebookGuid: String = null,
    order: js.UndefOr[Double] = js.undefined,
    tagGuids: js.Array[String] = null,
    timeZone: String = null,
    words: String = null
  ): Ascending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (emphasized != null) __obj.updateDynamic("emphasized")(emphasized.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.get.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascending]
  }
}

