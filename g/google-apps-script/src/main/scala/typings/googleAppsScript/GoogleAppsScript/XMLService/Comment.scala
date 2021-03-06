package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML Comment node.
  */
trait Comment extends Content {
  def getText(): String
  def setText(text: String): Comment
}

object Comment {
  @scala.inline
  def apply(
    asCdata: () => Cdata,
    asComment: () => Comment,
    asDocType: () => DocType,
    asElement: () => Element,
    asEntityRef: () => EntityRef,
    asProcessingInstruction: () => ProcessingInstruction,
    asText: () => Text,
    detach: () => Content,
    getParentElement: () => Element,
    getText: () => String,
    getType: () => ContentType,
    getValue: () => String,
    setText: String => Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[Comment]
  }
}

