package typings.xstate.anon

import typings.xstate.typesMod.ChooseAction
import typings.xstate.typesMod.ChooseConditon
import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallConds extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = js.native
}

