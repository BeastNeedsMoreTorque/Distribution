package typings.nativeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlWithParsedQuery extends Url

object UrlWithParsedQuery {
  @scala.inline
  def apply(
    href: String,
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ js.Any) = null,
    search: String = null,
    slashes: Boolean = null.asInstanceOf[Boolean]
  ): UrlWithParsedQuery = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlWithParsedQuery]
  }
}

