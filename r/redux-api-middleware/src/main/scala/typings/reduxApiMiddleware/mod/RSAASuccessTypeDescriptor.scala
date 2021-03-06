package typings.reduxApiMiddleware.mod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAASuccessTypeDescriptor[State, Payload, Meta] extends js.Object {
  var meta: js.UndefOr[
    (js.Function3[
      /* action */ RSAAAction[_, _, _], 
      /* state */ State, 
      /* res */ Response, 
      Meta | js.Promise[Meta]
    ]) | Meta
  ] = js.undefined
  var payload: js.UndefOr[
    (js.Function3[
      /* action */ RSAAAction[_, _, _], 
      /* state */ State, 
      /* res */ Response, 
      Payload | js.Promise[Payload]
    ]) | Payload
  ] = js.undefined
  var `type`: String | js.Symbol
}

object RSAASuccessTypeDescriptor {
  @scala.inline
  def apply[State, Payload, Meta](
    `type`: String | js.Symbol,
    meta: (js.Function3[
      /* action */ RSAAAction[_, _, _], 
      /* state */ State, 
      /* res */ Response, 
      Meta | js.Promise[Meta]
    ]) | Meta = null,
    payload: (js.Function3[
      /* action */ RSAAAction[_, _, _], 
      /* state */ State, 
      /* res */ Response, 
      Payload | js.Promise[Payload]
    ]) | Payload = null
  ): RSAASuccessTypeDescriptor[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAASuccessTypeDescriptor[State, Payload, Meta]]
  }
}

