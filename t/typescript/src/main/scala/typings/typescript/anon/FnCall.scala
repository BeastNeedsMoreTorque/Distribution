package typings.typescript.anon

import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T /* <: Node */](nodes: js.UndefOr[NodeArray[T]], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[NodeArray[T]], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[NodeArray[T]],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[NodeArray[T]],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
}

