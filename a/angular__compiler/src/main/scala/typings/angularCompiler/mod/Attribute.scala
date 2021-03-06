package typings.angularCompiler.mod

import typings.angularCompiler.i18nAstMod.I18nMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Attribute")
@js.native
class Attribute protected ()
  extends typings.angularCompiler.publicApiMod.Attribute {
  def this(name: String, value: String, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
}

