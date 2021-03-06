package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "visitParameterList")
@js.native
object visitParameterList extends js.Object {
  def apply(
    nodes: js.UndefOr[NodeArray[ParameterDeclaration]],
    visitor: Visitor,
    context: TransformationContext
  ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(
    nodes: js.UndefOr[NodeArray[ParameterDeclaration]],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: js.Function5[
      /* nodes */ js.UndefOr[NodeArray[Node]], 
      /* visitor */ Visitor, 
      /* test */ js.UndefOr[js.Function1[/* node */ Node, Boolean]], 
      /* start */ js.UndefOr[Double], 
      /* count */ js.UndefOr[Double], 
      js.UndefOr[NodeArray[Node]]
    ]
  ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  /**
    * Starts a new lexical environment and visits a parameter list, suspending the lexical
    * environment upon completion.
    */
  def apply(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
  def apply(
    nodes: NodeArray[ParameterDeclaration],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: js.Function5[
      /* nodes */ NodeArray[Node], 
      /* visitor */ Visitor, 
      /* test */ js.UndefOr[js.Function1[/* node */ Node, Boolean]], 
      /* start */ js.UndefOr[Double], 
      /* count */ js.UndefOr[Double], 
      NodeArray[Node]
    ]
  ): NodeArray[ParameterDeclaration] = js.native
}

