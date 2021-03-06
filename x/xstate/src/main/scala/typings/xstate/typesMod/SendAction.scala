package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAction[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.undefined
  var event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent])
  var id: String | Double
  var to: js.UndefOr[
    String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.undefined
}

object SendAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent, /* <: typings.xstate.typesMod.EventObject */ TSentEvent](
    event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]),
    id: String | Double,
    `type`: String,
    delay: Double | String | (DelayExpr[TContext, TEvent]) = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null,
    to: String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])]) = null
  ): SendAction[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent, TSentEvent]]
  }
}

