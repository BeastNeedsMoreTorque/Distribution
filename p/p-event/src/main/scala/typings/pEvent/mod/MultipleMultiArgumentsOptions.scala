package typings.pEvent.mod

import typings.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends MultipleOptions[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultipleMultiArgumentsOptions: `true`
}

object MultipleMultiArgumentsOptions {
  @scala.inline
  def apply[/* <: js.Array[_] */ EmittedType](
    count: Double,
    multiArgs: `true`,
    filter: EmittedType => Boolean = null,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    resolveImmediately: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): MultipleMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], multiArgs = multiArgs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveImmediately)) __obj.updateDynamic("resolveImmediately")(resolveImmediately.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
  }
}

