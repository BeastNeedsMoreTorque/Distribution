package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GqlName extends js.Object {
   // TODO: types
  var gqlName: String
  var item: Email
  var itemId: js.UndefOr[js.Any] = js.undefined
   // TODO: types
  var itemIds: js.UndefOr[js.Any] = js.undefined
  var listKey: String
  var operation: String
  var originalInput: js.UndefOr[js.Any] = js.undefined
}

object GqlName {
  @scala.inline
  def apply(
    gqlName: String,
    item: Email,
    listKey: String,
    operation: String,
    itemId: js.Any = null,
    itemIds: js.Any = null,
    originalInput: js.Any = null
  ): GqlName = {
    val __obj = js.Dynamic.literal(gqlName = gqlName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], listKey = listKey.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (itemIds != null) __obj.updateDynamic("itemIds")(itemIds.asInstanceOf[js.Any])
    if (originalInput != null) __obj.updateDynamic("originalInput")(originalInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[GqlName]
  }
}

