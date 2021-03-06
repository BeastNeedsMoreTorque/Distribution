package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupCreationInformation extends ClientValueObject {
  def get_description(): String
  def get_title(): String
  def set_description(value: String): Unit
  def set_title(value: String): Unit
}

object GroupCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_description: () => String,
    get_title: () => String,
    get_typeId: () => String,
    set_description: String => Unit,
    set_title: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): GroupCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_description = js.Any.fromFunction0(get_description), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), set_description = js.Any.fromFunction1(set_description), set_title = js.Any.fromFunction1(set_title), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[GroupCreationInformation]
  }
}

