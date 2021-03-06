package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var Days: js.UndefOr[typings.awsSdk.s3Mod.Days] = js.native
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var Years: js.UndefOr[typings.awsSdk.s3Mod.Years] = js.native
}

object DefaultRetention {
  @scala.inline
  def apply(
    Days: js.UndefOr[Days] = js.undefined,
    Mode: ObjectLockRetentionMode = null,
    Years: js.UndefOr[Years] = js.undefined
  ): DefaultRetention = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days.get.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (!js.isUndefined(Years)) __obj.updateDynamic("Years")(Years.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRetention]
  }
}

