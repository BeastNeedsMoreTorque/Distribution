package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemQueryResult extends IStorageQueryResultBase {
  def getItemsAsync(): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  def getItemsAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}

