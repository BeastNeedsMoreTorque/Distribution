package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about server-generated posts.
  This type can only be specified in a server-to-server call. */
trait SocialPostDefinitionData extends ClientValueObject {
  def get_items(): js.Array[SocialPostDefinitionDataItem]
  def get_name(): String
  def set_items(value: js.Array[SocialPostDefinitionDataItem]): js.Array[SocialPostDefinitionDataItem]
  def set_name(value: String): String
}

object SocialPostDefinitionData {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_items: () => js.Array[SocialPostDefinitionDataItem],
    get_name: () => String,
    get_typeId: () => String,
    set_items: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem],
    set_name: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostDefinitionData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_items = js.Any.fromFunction0(get_items), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), set_items = js.Any.fromFunction1(set_items), set_name = js.Any.fromFunction1(set_name), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostDefinitionData]
  }
}

