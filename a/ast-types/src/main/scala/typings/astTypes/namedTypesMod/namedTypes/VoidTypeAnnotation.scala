package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.FlowKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait VoidTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var `type`: typings.astTypes.astTypesStrings.VoidTypeAnnotation
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.VoidTypeAnnotation")
@js.native
object VoidTypeAnnotation extends TopLevel[Type[VoidTypeAnnotation]]

