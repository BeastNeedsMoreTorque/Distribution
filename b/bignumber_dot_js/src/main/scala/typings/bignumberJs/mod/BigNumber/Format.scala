package typings.bignumberJs.mod.BigNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See `FORMAT` and `toFormat`. */
trait Format extends js.Object {
  /** The decimal separator. */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /** The grouping separator of the fraction part. */
  var fractionGroupSeparator: js.UndefOr[String] = js.undefined
  /** The grouping size of the fraction part. */
  var fractionGroupSize: js.UndefOr[Double] = js.undefined
  /** The grouping separator of the integer part. */
  var groupSeparator: js.UndefOr[String] = js.undefined
  /** The primary grouping size of the integer part. */
  var groupSize: js.UndefOr[Double] = js.undefined
  /** The string to prepend. */
  var prefix: js.UndefOr[String] = js.undefined
  /** The secondary grouping size of the integer part. */
  var secondaryGroupSize: js.UndefOr[Double] = js.undefined
  /** The string to append. */
  var suffix: js.UndefOr[String] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    decimalSeparator: String = null,
    fractionGroupSeparator: String = null,
    fractionGroupSize: js.UndefOr[Double] = js.undefined,
    groupSeparator: String = null,
    groupSize: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    secondaryGroupSize: js.UndefOr[Double] = js.undefined,
    suffix: String = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (fractionGroupSeparator != null) __obj.updateDynamic("fractionGroupSeparator")(fractionGroupSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(fractionGroupSize)) __obj.updateDynamic("fractionGroupSize")(fractionGroupSize.get.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSize)) __obj.updateDynamic("groupSize")(groupSize.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryGroupSize)) __obj.updateDynamic("secondaryGroupSize")(secondaryGroupSize.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

