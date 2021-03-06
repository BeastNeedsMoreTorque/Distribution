package typings.angularCompiler.mod

import typings.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ExpressionType")
@js.native
class ExpressionType protected ()
  extends typings.angularCompiler.publicApiMod.ExpressionType {
  def this(value: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(value: typings.angularCompiler.outputAstMod.Expression, modifiers: js.Array[TypeModifier]) = this()
  def this(
    value: typings.angularCompiler.outputAstMod.Expression,
    modifiers: js.Array[TypeModifier],
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ) = this()
  def this(
    value: typings.angularCompiler.outputAstMod.Expression,
    modifiers: Null,
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ) = this()
}

