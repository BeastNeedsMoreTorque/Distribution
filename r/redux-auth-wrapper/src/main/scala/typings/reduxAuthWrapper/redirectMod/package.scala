package typings.reduxAuthWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redirectMod {
  type ConnectedReduxRedirectConfig[OwnProps, State] = typings.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig[OwnProps, State]
  type StateMutateSelector[State, R] = js.Function2[/* state */ State, /* nextState */ State, R]
}
