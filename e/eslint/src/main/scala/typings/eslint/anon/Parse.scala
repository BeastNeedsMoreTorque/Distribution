package typings.eslint.anon

import typings.eslint.mod.AST.Program
import typings.eslint.mod.Linter.ParserModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parse extends ParserModule {
  def parse(text: String): Program = js.native
  def parse(text: String, options: js.Any): Program = js.native
}

