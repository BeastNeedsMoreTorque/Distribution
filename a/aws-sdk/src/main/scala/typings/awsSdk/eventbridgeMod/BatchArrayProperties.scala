package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchArrayProperties extends js.Object {
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var Size: js.UndefOr[Integer] = js.native
}

object BatchArrayProperties {
  @scala.inline
  def apply(Size: js.UndefOr[Integer] = js.undefined): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchArrayProperties]
  }
}

