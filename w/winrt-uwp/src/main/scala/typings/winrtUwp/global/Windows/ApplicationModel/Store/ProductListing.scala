package typings.winrtUwp.global.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides localized information that details an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductListing")
@js.native
abstract class ProductListing ()
  extends typings.winrtUwp.Windows.ApplicationModel.Store.ProductListing {
  /* CompleteClass */
  override var currencyCode: js.Any = js.native
   /* unmapped type */ /** Gets the description for the in-app product. */
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var formattedBasePrice: js.Any = js.native
   /* unmapped type */ /** Gets the purchase price for the in-app product with the appropriate formatting for the current market. */
  /* CompleteClass */
  override var formattedPrice: String = js.native
  /** Gets the URI of the image associated with the in-app product. */
  /* CompleteClass */
  override var imageUri: Uri = js.native
  /* CompleteClass */
  override var isOnSale: js.Any = js.native
   /* unmapped type */ /** Gets the list of keywords associated with the in-app product. These keywords are useful for filtering product lists by keyword, for example, when calling LoadListingInformationByKeywordsAsync . */
  /* CompleteClass */
  override var keywords: IIterable[String] = js.native
  /** Gets the descriptive name of the in-app product that is displayed customers in the current market. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets the in-app product ID. */
  /* CompleteClass */
  override var productId: String = js.native
  /** Gets the type of this in-app product. Possible values are defined by ProductType . */
  /* CompleteClass */
  override var productType: typings.winrtUwp.Windows.ApplicationModel.Store.ProductType = js.native
  /** Gets the end date of the sale period for the in-app product. */
  /* CompleteClass */
  override var saleEndDate: Date = js.native
  /** Gets the tag string that contains custom information about an in-app product. */
  /* CompleteClass */
  override var tag: String = js.native
}

