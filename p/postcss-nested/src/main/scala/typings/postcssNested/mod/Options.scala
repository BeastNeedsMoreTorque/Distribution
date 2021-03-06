package typings.postcssNested.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * By default, plugin will bubble only @media and @supports at-rules.
    * You can add your custom at-rules to this list by this option.
    */
  var bubble: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * By default, plugin will strip out any empty selector generated by intermediate nesting
    * levels. You can set this option to true to preserve them.
    */
  var preserveEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, plugin will unwrap only @font-face, @keyframes and @document at-rules.
    * You can add your custom at-rules to this list by this option.
    */
  var unwrap: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bubble: js.Array[String] = null,
    preserveEmpty: js.UndefOr[Boolean] = js.undefined,
    unwrap: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bubble != null) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveEmpty)) __obj.updateDynamic("preserveEmpty")(preserveEmpty.get.asInstanceOf[js.Any])
    if (unwrap != null) __obj.updateDynamic("unwrap")(unwrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

