package typings.blueprintjsCore.compareUtilsMod

import typings.blueprintjsCore.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
@js.native
object getDeepUnequalKeyValues extends js.Object {
  def apply[T /* <: js.Object */](): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
}

