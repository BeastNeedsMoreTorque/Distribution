package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.transpile")
@js.native
object transpile extends js.Object {
  def apply(input: String): String = js.native
  def apply(input: String, compilerOptions: CompilerOptions): String = js.native
  def apply(input: String, compilerOptions: CompilerOptions, fileName: String): String = js.native
  def apply(
    input: String,
    compilerOptions: CompilerOptions,
    fileName: String,
    diagnostics: js.Array[Diagnostic]
  ): String = js.native
  def apply(
    input: String,
    compilerOptions: CompilerOptions,
    fileName: String,
    diagnostics: js.Array[Diagnostic],
    moduleName: String
  ): String = js.native
}

