package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Term. */
trait Term extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
}

object Term {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, field: String = null): Term = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
}

