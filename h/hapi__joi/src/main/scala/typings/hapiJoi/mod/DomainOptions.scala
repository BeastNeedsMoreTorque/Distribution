package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptions extends js.Object {
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of segments required for the domain.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.undefined
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.undefined
}

object DomainOptions {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[Boolean] = js.undefined,
    minDomainSegments: js.UndefOr[Double] = js.undefined,
    tlds: TopLevelDomainOptions | `false` = null
  ): DomainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDomainSegments)) __obj.updateDynamic("minDomainSegments")(minDomainSegments.get.asInstanceOf[js.Any])
    if (tlds != null) __obj.updateDynamic("tlds")(tlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainOptions]
  }
}

