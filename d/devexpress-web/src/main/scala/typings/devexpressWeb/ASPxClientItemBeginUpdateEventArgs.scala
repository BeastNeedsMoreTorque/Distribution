package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemBeginUpdate event.
  */
trait ASPxClientItemBeginUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientItemBeginUpdateEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientItemBeginUpdateEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientItemBeginUpdateEventArgs]
  }
}

