package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apps extends js.Object {
  var apps: js.Array[Events]
  var apps_url: String
  var teams: js.Array[Description]
  var teams_url: String
  var url: String
  var users: js.Array[Eventsurl]
  var users_url: String
}

object Apps {
  @scala.inline
  def apply(
    apps: js.Array[Events],
    apps_url: String,
    teams: js.Array[Description],
    teams_url: String,
    url: String,
    users: js.Array[Eventsurl],
    users_url: String
  ): Apps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apps]
  }
}

