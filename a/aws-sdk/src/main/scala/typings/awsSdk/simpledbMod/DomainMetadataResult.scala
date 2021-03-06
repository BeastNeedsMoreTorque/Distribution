package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMetadataResult extends js.Object {
  /**
    * The number of unique attribute names in the domain.
    */
  var AttributeNameCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all unique attribute names in the domain, in bytes.
    */
  var AttributeNamesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of all attribute name/value pairs in the domain.
    */
  var AttributeValueCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all attribute values in the domain, in bytes.
    */
  var AttributeValuesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of all items in the domain.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all item names in the domain, in bytes.
    */
  var ItemNamesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The data and time when metadata was calculated, in Epoch (UNIX) seconds.
    */
  var Timestamp: js.UndefOr[Integer] = js.native
}

object DomainMetadataResult {
  @scala.inline
  def apply(
    AttributeNameCount: js.UndefOr[Integer] = js.undefined,
    AttributeNamesSizeBytes: js.UndefOr[Long] = js.undefined,
    AttributeValueCount: js.UndefOr[Integer] = js.undefined,
    AttributeValuesSizeBytes: js.UndefOr[Long] = js.undefined,
    ItemCount: js.UndefOr[Integer] = js.undefined,
    ItemNamesSizeBytes: js.UndefOr[Long] = js.undefined,
    Timestamp: js.UndefOr[Integer] = js.undefined
  ): DomainMetadataResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AttributeNameCount)) __obj.updateDynamic("AttributeNameCount")(AttributeNameCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AttributeNamesSizeBytes)) __obj.updateDynamic("AttributeNamesSizeBytes")(AttributeNamesSizeBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AttributeValueCount)) __obj.updateDynamic("AttributeValueCount")(AttributeValueCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AttributeValuesSizeBytes)) __obj.updateDynamic("AttributeValuesSizeBytes")(AttributeValuesSizeBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ItemNamesSizeBytes)) __obj.updateDynamic("ItemNamesSizeBytes")(ItemNamesSizeBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMetadataResult]
  }
}

