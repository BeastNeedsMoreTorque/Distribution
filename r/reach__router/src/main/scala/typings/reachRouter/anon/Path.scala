package typings.reachRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: String
  var uri: String
}

object Path {
  @scala.inline
  def apply(path: String, uri: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

