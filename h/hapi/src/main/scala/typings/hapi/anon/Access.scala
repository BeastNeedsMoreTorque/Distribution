package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Access extends js.Object {
  /**
    * Validates a request against the route's authentication access configuration, where:
    * @param request - the request object.
    * @return Return value: true if the request would have passed the route's access requirements.
    * Note that the route's authentication mode and strategies are ignored. The only match is made between the request.auth.credentials scope and entity information and the route access
    *     configuration. If the route uses dynamic scopes, the scopes are constructed against the request.query, request.params, request.payload, and request.auth.credentials which may or may
    *     not match between the route and the request's route. If this method is called using a request that has not been authenticated (yet or not at all), it will return false if the route
    *     requires any authentication.
    * [See docs](https://hapijs.com/api/17.0.1#-requestrouteauthaccessrequest)
    */
  def access(request: typings.hapi.mod.Request): Boolean
}

object Access {
  @scala.inline
  def apply(access: typings.hapi.mod.Request => Boolean): Access = {
    val __obj = js.Dynamic.literal(access = js.Any.fromFunction1(access))
    __obj.asInstanceOf[Access]
  }
}

