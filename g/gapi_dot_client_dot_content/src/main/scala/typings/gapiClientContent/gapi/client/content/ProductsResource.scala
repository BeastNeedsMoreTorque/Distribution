package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.AltFields
import typings.gapiClientContent.anon.DryRun
import typings.gapiClientContent.anon.IncludeInvalidInsertedItems
import typings.gapiClientContent.anon.MerchantId
import typings.gapiClientContent.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Retrieves, inserts, and deletes multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: DryRun): Request[ProductsCustomBatchResponse]
  /** Deletes a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: UserIp): Request[Unit]
  /** Retrieves a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AltFields): Request[Product]
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this
    * method updates that entry. This method can only be called for non-multi-client accounts.
    */
  def insert(request: MerchantId): Request[Product]
  /** Lists the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: IncludeInvalidInsertedItems): Request[ProductsListResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[ProductsCustomBatchResponse],
    delete: UserIp => Request[Unit],
    get: AltFields => Request[Product],
    insert: MerchantId => Request[Product],
    list: IncludeInvalidInsertedItems => Request[ProductsListResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProductsResource]
  }
}

