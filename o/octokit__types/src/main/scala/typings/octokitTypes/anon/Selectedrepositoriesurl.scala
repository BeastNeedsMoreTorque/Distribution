package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectedrepositoriesurl extends js.Object {
  var created_at: String
  var name: String
  var selected_repositories_url: String
  var updated_at: String
  var visibility: String
}

object Selectedrepositoriesurl {
  @scala.inline
  def apply(
    created_at: String,
    name: String,
    selected_repositories_url: String,
    updated_at: String,
    visibility: String
  ): Selectedrepositoriesurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected_repositories_url = selected_repositories_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectedrepositoriesurl]
  }
}

