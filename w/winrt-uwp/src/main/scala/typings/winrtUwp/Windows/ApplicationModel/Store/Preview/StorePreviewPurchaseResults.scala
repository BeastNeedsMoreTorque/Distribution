package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the results of a purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
trait StorePreviewPurchaseResults extends js.Object {
  /** Gets the current state of the purchase transaction for an in-app product SKU that was purchased by using the RequestProductPurchaseByProductIdAndSkuIdAsync method. */
  var productPurchaseStatus: StorePreviewProductPurchaseStatus
}

object StorePreviewPurchaseResults {
  @scala.inline
  def apply(productPurchaseStatus: StorePreviewProductPurchaseStatus): StorePreviewPurchaseResults = {
    val __obj = js.Dynamic.literal(productPurchaseStatus = productPurchaseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewPurchaseResults]
  }
}

