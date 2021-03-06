package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  var action: AssignAction[TContext, TEvent]
  var state: js.UndefOr[State[TContext, TEvent, _, Context[TContext]]] = js.undefined
}

object AssignMeta {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    action: AssignAction[TContext, TEvent],
    state: State[TContext, TEvent, _, Context[TContext]] = null
  ): AssignMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignMeta[TContext, TEvent]]
  }
}

