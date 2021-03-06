package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySuggestionResults extends ClientValueObject {
  def get_peopleNames(): js.Array[String]
  def get_personalResults(): js.Array[PersonalResultSuggestion]
  def get_queries(): js.Array[QuerySuggestionQuery]
  def set_peopleNames(value: js.Array[String]): Unit
  def set_personalResults(value: js.Array[PersonalResultSuggestion]): Unit
  def set_queries(value: js.Array[QuerySuggestionQuery]): Unit
}

object QuerySuggestionResults {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_peopleNames: () => js.Array[String],
    get_personalResults: () => js.Array[PersonalResultSuggestion],
    get_queries: () => js.Array[QuerySuggestionQuery],
    get_typeId: () => String,
    set_peopleNames: js.Array[String] => Unit,
    set_personalResults: js.Array[PersonalResultSuggestion] => Unit,
    set_queries: js.Array[QuerySuggestionQuery] => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): QuerySuggestionResults = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_peopleNames = js.Any.fromFunction0(get_peopleNames), get_personalResults = js.Any.fromFunction0(get_personalResults), get_queries = js.Any.fromFunction0(get_queries), get_typeId = js.Any.fromFunction0(get_typeId), set_peopleNames = js.Any.fromFunction1(set_peopleNames), set_personalResults = js.Any.fromFunction1(set_personalResults), set_queries = js.Any.fromFunction1(set_queries), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[QuerySuggestionResults]
  }
}

