package typings.angularCompiler.mod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "NodeWithI18n")
@js.native
abstract class NodeWithI18n protected ()
  extends typings.angularCompiler.publicApiMod.NodeWithI18n {
  def this(sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Message) = this()
  def this(sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Node) = this()
}

