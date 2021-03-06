package typings.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  /* "Active" */ val Active: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
  /* "Initial" */ val Initial: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
  /* "NotifyWait" */ val NotifyWait: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
  /* "Pending" */ val Pending: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
  /* "Terminated" */ val Terminated: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.subscriptionSubscriptionMod.SubscriptionState with String] = js.native
}

