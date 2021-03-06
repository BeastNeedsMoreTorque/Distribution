package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplate extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val ListLevels: typings.activexWord.Word.ListLevels = js.native
  var Name: String = js.native
  var OutlineNumbered: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ListTemplate_typekey")
  var WordDotListTemplate_typekey: ListTemplate = js.native
  def Convert(): ListTemplate = js.native
  def Convert(Level: js.Any): ListTemplate = js.native
}

