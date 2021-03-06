package typings.recompose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ReactLifeCycleFunctionsThisArguments[TProps, TState] extends js.Object {
  var context: js.Any = js.native
  var props: TProps = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: TState = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  def setState[TKeyOfState /* <: /* keyof TState */ String */](f: js.Function2[/* prevState */ TState, /* props */ TProps, Pick[TState, TKeyOfState]]): Unit = js.native
  def setState[TKeyOfState /* <: /* keyof TState */ String */](
    f: js.Function2[/* prevState */ TState, /* props */ TProps, Pick[TState, TKeyOfState]],
    callback: js.Function0[_]
  ): Unit = js.native
  def setState[TKeyOfState /* <: /* keyof TState */ String */](state: Pick[TState, TKeyOfState]): Unit = js.native
  def setState[TKeyOfState /* <: /* keyof TState */ String */](state: Pick[TState, TKeyOfState], callback: js.Function0[_]): Unit = js.native
}

