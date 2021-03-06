package typings.xstate.anon

import typings.xstate.typesMod.DoneInvokeEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InvokeCreator
import typings.xstate.typesMod.Mapper
import typings.xstate.typesMod.PropertyMapper
import typings.xstate.typesMod.SingleOrArray
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.TransitionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var autoForward: js.UndefOr[Boolean] = js.undefined
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])] = js.undefined
  /**
    * @deprecated
    *
    *  Use `autoForward` property instead of `forward`. Support for `forward` will get removed in the future.
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  /**
    * The unique identifier for the invoked machine. If not specified, this
    * will be the machine's own `id`, or the URL (from `src`).
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The transition to take upon the invoked child machine reaching its final top-level state.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])] = js.undefined
  /**
    * The transition to take upon the invoked child machine sending an error event.
    */
  var onError: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])] = js.undefined
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _])
}

object Data {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    src: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _]),
    autoForward: js.UndefOr[Boolean] = js.undefined,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    forward: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onDone: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]]) = null,
    onError: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]]) = null
  ): Data[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TContext, TEvent]]
  }
}

