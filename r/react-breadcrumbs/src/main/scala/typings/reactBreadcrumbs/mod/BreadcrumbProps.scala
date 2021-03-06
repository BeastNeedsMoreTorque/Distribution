package typings.reactBreadcrumbs.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.reactBreadcrumbs.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var data: LocationDescriptor[LocationState] with Title
  var hidden: js.UndefOr[Boolean] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(data: LocationDescriptor[LocationState] with Title, hidden: js.UndefOr[Boolean] = js.undefined): BreadcrumbProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

