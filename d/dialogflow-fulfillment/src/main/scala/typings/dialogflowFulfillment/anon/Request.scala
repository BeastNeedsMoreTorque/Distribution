package typings.dialogflowFulfillment.anon

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var request: Request_[ParamsDictionary, _, _, Query]
  var response: Response_[_]
}

object Request {
  @scala.inline
  def apply(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

