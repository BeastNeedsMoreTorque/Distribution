package typings.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: typings.grammarkdown.parserMod.TextChange): String = js.native
  def clone(change: typings.grammarkdown.parserMod.TextChange): typings.grammarkdown.anon.Range = js.native
  def create(text: String, range: typings.grammarkdown.coreMod.Range): typings.grammarkdown.anon.Range = js.native
  def isUnchanged(change: typings.grammarkdown.parserMod.TextChange): Boolean = js.native
}

