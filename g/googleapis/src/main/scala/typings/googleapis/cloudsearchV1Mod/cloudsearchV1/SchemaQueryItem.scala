package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information relevant only to a query entry.
  */
@js.native
trait SchemaQueryItem extends js.Object {
  /**
    * True if the text was generated by means other than a previous user
    * search.
    */
  var isSynthetic: js.UndefOr[Boolean] = js.native
}

object SchemaQueryItem {
  @scala.inline
  def apply(isSynthetic: js.UndefOr[Boolean] = js.undefined): SchemaQueryItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSynthetic)) __obj.updateDynamic("isSynthetic")(isSynthetic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryItem]
  }
}

