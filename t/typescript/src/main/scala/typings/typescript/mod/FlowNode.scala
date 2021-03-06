package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.AfterFinallyFlow
  - typings.typescript.mod.PreFinallyFlow
  - typings.typescript.mod.FlowStart
  - typings.typescript.mod.FlowLabel
  - typings.typescript.mod.FlowAssignment
  - typings.typescript.mod.FlowCall
  - typings.typescript.mod.FlowCondition
  - typings.typescript.mod.FlowSwitchClause
  - typings.typescript.mod.FlowArrayMutation
*/
trait FlowNode extends js.Object

object FlowNode {
  @scala.inline
  def FlowCall(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: CallExpression,
    id: js.UndefOr[Double] = js.undefined
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowAssignment(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: Expression | VariableDeclaration | BindingElement,
    id: js.UndefOr[Double] = js.undefined
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowArrayMutation(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: CallExpression | BinaryExpression,
    id: js.UndefOr[Double] = js.undefined
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression, id: js.UndefOr[Double] = js.undefined): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def AfterFinallyFlow(
    antecedent: FlowNode,
    flags: FlowFlags,
    id: js.UndefOr[Double] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement,
    id: js.UndefOr[Double] = js.undefined
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def PreFinallyFlow(antecedent: FlowNode, flags: FlowFlags, lock: FlowLock, id: js.UndefOr[Double] = js.undefined): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowStart(
    flags: FlowFlags,
    id: js.UndefOr[Double] = js.undefined,
    node: FunctionExpression | ArrowFunction | MethodDeclaration = null
  ): FlowNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowLabel(flags: FlowFlags, antecedents: js.Array[FlowNode] = null, id: js.UndefOr[Double] = js.undefined): FlowNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (antecedents != null) __obj.updateDynamic("antecedents")(antecedents.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
}

