package typings.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CodeActionKind")
@js.native
object CodeActionKind extends js.Object {
  /**
    * Empty kind.
    */
  val Empty: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for quickfix actions: 'quickfix'
    */
  val QuickFix: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for refactoring actions: 'refactor'
    */
  val Refactor: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for refactoring extraction actions: 'refactor.extract'
    *
    * Example extract actions:
    *
    * - Extract method
    * - Extract function
    * - Extract variable
    * - Extract interface from class
    * - ...
    */
  val RefactorExtract: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for refactoring inline actions: 'refactor.inline'
    *
    * Example inline actions:
    *
    * - Inline function
    * - Inline variable
    * - Inline constant
    * - ...
    */
  val RefactorInline: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for refactoring rewrite actions: 'refactor.rewrite'
    *
    * Example rewrite actions:
    *
    * - Convert JavaScript function to class
    * - Add or remove parameter
    * - Encapsulate field
    * - Make method static
    * - Move method to base class
    * - ...
    */
  val RefactorRewrite: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file.
    */
  val Source: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for auto-fix source actions: `source.fixAll`.
    *
    * Fix all actions automatically fix errors that have a clear fix that do not require user input.
    * They should not suppress errors or perform unsafe fixes such as generating new types or classes.
    *
    * @since 3.15.0
    */
  val SourceFixAll: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
  /**
    * Base kind for an organize imports source action: `source.organizeImports`
    */
  val SourceOrganizeImports: typings.vscodeLanguageserverTypes.mod.CodeActionKind = js.native
}

