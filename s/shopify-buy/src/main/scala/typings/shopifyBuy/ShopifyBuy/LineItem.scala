package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItem extends GraphModel {
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the product
    * previously before the product went on sale.
    * If no compareAtPrice is set then this value will be null. An example value: "5.00".
    */
  var compareAtPrice: String | Null
  /**
    * Variant's weight in grams. If no weight is set then 0 is returned.
    */
  var grams: Double
  /**
    * A line item ID.
    */
  var id: String | Double
  /**
    * Variant's image.
    */
  var image: Image
  /**
    * The total price for this line item. For instance if the variant costs 1.50 and you have a
    * quantity of 2 then line_price will be 3.00.
    */
  var linePrice: String
  /**
    * Price of the variant. For example: "5.00".
    */
  var price: String
  /**
    * ID of variant's product.
    */
  var productId: String | Double
  /**
    * Count of variants to order.
    */
  var quantity: Double
  /**
    * Product title of variant's parent product.
    */
  var title: String
  /**
    * ID of line item variant.
    */
  var variantId: String | Double
  /**
    * Title of variant.
    */
  var variantTitle: String
}

object LineItem {
  @scala.inline
  def apply(
    grams: Double,
    id: String | Double,
    image: Image,
    linePrice: String,
    price: String,
    productId: String | Double,
    quantity: Double,
    title: String,
    variantId: String | Double,
    variantTitle: String,
    attrs: js.Any = null,
    compareAtPrice: String = null,
    onlineStoreUrl: String = null
  ): LineItem = {
    val __obj = js.Dynamic.literal(grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], linePrice = linePrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any], variantTitle = variantTitle.asInstanceOf[js.Any], compareAtPrice = compareAtPrice.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
}

