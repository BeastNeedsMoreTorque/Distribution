package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowStart
  extends FlowNodeBase
     with FlowNode {
  var node: js.UndefOr[FunctionExpression | ArrowFunction | MethodDeclaration] = js.undefined
}

object FlowStart {
  @scala.inline
  def apply(
    flags: FlowFlags,
    id: js.UndefOr[Double] = js.undefined,
    node: FunctionExpression | ArrowFunction | MethodDeclaration = null
  ): FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowStart]
  }
}

