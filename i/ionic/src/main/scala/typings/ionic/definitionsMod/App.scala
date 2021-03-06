package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var association: js.UndefOr[Null | AppAssociation] = js.undefined
  var id: String
  var name: String
  @JSName("org")
  var org_ : Null | Org
  var repo_url: js.UndefOr[String] = js.undefined
  var slug: String
}

object App {
  @scala.inline
  def apply(
    id: String,
    name: String,
    slug: String,
    association: js.UndefOr[Null | AppAssociation] = js.undefined,
    org_ : Org = null,
    repo_url: String = null
  ): App = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (!js.isUndefined(association)) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (repo_url != null) __obj.updateDynamic("repo_url")(repo_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

