package typings.pouchdbCore.PouchDB.Configuration

import typings.pouchdbCore.Fetch
import typings.pouchdbCore.anon.Password
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  var auth: js.UndefOr[Password] = js.undefined
  var fetch: js.UndefOr[Fetch] = js.undefined
  /**
    * Disables automatic creation of databases.
    */
  var skip_setup: js.UndefOr[Boolean] = js.undefined
}

object RemoteDatabaseConfiguration {
  @scala.inline
  def apply(
    adapter: String = null,
    auth: Password = null,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[Response] = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): RemoteDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDatabaseConfiguration]
  }
}

