package typings.babelTypes.mod

import typings.babelTypes.anon.Computed
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "toComputedKey")
@js.native
object toComputedKey extends js.Object {
  def apply[T /* <: Extract[Node, Computed] */](node: T): Expression = js.native
  def apply[T /* <: Extract[Node, Computed] */](node: T, key: Expression): Expression = js.native
  def apply[T /* <: Extract[Node, Computed] */](node: T, key: Identifier_): Expression = js.native
}

