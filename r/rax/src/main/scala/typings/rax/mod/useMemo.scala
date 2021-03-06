package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "useMemo")
@js.native
object useMemo extends js.Object {
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
    * the second argument.
    *
    * ```ts
    * function expensive () { ... }
    *
    * function Component () {
    *   const expensiveResult = useMemo(expensive, [expensive])
    *   return ...
    * }
    * ```
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  def apply[T](factory: js.Function0[T]): T = js.native
  def apply[T](factory: js.Function0[T], deps: DependencyList): T = js.native
}

