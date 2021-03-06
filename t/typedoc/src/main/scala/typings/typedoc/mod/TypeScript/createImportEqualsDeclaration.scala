package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportEqualsDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createImportEqualsDeclaration")
@js.native
object createImportEqualsDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
}

