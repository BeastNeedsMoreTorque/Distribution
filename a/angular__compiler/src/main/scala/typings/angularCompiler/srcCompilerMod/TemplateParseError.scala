package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.angularCompiler.templateParserMod.TemplateParseError {
  def this(
    message: String,
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

