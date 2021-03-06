package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createExportDeclaration")
@js.native
object createExportDeclaration extends js.Object {
  def apply(): ExportDeclaration = js.native
  def apply(decorators: js.Array[Decorator]): ExportDeclaration = js.native
  def apply(decorators: js.Array[Decorator], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
  def apply(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], exportClause: NamedExportBindings): ExportDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
}

