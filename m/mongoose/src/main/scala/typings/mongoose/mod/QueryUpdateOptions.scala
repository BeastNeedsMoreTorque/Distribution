package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryUpdateOptions extends ModelUpdateOptions {
  /**
    * if set to 'query' and runValidators is on, this will refer to the query
    * in customvalidator functions that update validation runs. Does nothing
    * if runValidators is false.
    */
  var context: js.UndefOr[String] = js.undefined
}

object QueryUpdateOptions {
  @scala.inline
  def apply(
    arrayFilters: js.Array[StringDictionary[_]] = null,
    context: String = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    multipleCastError: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    runValidators: js.UndefOr[Boolean] = js.undefined,
    safe: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Null | ClientSession] = js.undefined,
    setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined,
    strict: Boolean | `throw` = null,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): QueryUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert.get.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryUpdateOptions]
  }
}

