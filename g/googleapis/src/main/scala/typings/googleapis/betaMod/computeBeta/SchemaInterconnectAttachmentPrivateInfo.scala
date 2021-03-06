package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information for an interconnect attachment when this belongs to an
  * interconnect of type DEDICATED.
  */
@js.native
trait SchemaInterconnectAttachmentPrivateInfo extends js.Object {
  /**
    * [Output Only] 802.1q encapsulation tag to be used for traffic between
    * Google and the customer, going to and from this network and region.
    */
  var tag8021q: js.UndefOr[Double] = js.native
}

object SchemaInterconnectAttachmentPrivateInfo {
  @scala.inline
  def apply(tag8021q: js.UndefOr[Double] = js.undefined): SchemaInterconnectAttachmentPrivateInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tag8021q)) __obj.updateDynamic("tag8021q")(tag8021q.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectAttachmentPrivateInfo]
  }
}

