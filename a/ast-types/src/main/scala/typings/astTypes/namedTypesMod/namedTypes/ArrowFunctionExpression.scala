package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.astTypesBooleans.`false`
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id' | 'body' | 'generator'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrowFunctionExpression
  extends ASTNode
     with ExpressionKind
     with FunctionKind
     with NodeKind
     with PrintableKind {
  var body: BlockStatementKind | ExpressionKind
  var generator: js.UndefOr[`false`] = js.undefined
  var id: js.UndefOr[Null] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.ArrowFunctionExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrowFunctionExpression")
@js.native
object ArrowFunctionExpression extends TopLevel[Type[ArrowFunctionExpression]]

