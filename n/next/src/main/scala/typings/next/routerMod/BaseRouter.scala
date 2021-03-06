package typings.next.routerMod

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRouter extends js.Object {
  var asPath: String
  var basePath: String
  var pathname: String
  var query: ParsedUrlQuery
  var route: String
}

object BaseRouter {
  @scala.inline
  def apply(asPath: String, basePath: String, pathname: String, query: ParsedUrlQuery, route: String): BaseRouter = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRouter]
  }
}

