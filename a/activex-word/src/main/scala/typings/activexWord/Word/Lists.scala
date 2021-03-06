package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lists extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Lists_typekey")
  var WordDotLists_typekey: Lists
  def Item(Index: Double): List
}

object Lists {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => List,
    Parent: js.Any,
    WordDotLists_typekey: Lists
  ): Lists = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Lists_typekey")(WordDotLists_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lists]
  }
}

