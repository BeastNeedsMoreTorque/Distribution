package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPropertyValue extends ClientValueObject {
  def get_boolVal(): Boolean
  def get_intVal(): Double
  def get_queryPropertyValueTypeIndex(): Double
  def get_strArray(): js.Array[String]
  def get_strVal(): String
  def set_boolVal(value: Boolean): Boolean
  def set_intVal(value: Double): Double
  def set_queryPropertyValueTypeIndex(value: Double): Unit
  def set_strArray(value: js.Array[String]): js.Array[String]
  def set_strVal(value: String): String
}

object QueryPropertyValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_boolVal: () => Boolean,
    get_intVal: () => Double,
    get_queryPropertyValueTypeIndex: () => Double,
    get_strArray: () => js.Array[String],
    get_strVal: () => String,
    get_typeId: () => String,
    set_boolVal: Boolean => Boolean,
    set_intVal: Double => Double,
    set_queryPropertyValueTypeIndex: Double => Unit,
    set_strArray: js.Array[String] => js.Array[String],
    set_strVal: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): QueryPropertyValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_boolVal = js.Any.fromFunction0(get_boolVal), get_intVal = js.Any.fromFunction0(get_intVal), get_queryPropertyValueTypeIndex = js.Any.fromFunction0(get_queryPropertyValueTypeIndex), get_strArray = js.Any.fromFunction0(get_strArray), get_strVal = js.Any.fromFunction0(get_strVal), get_typeId = js.Any.fromFunction0(get_typeId), set_boolVal = js.Any.fromFunction1(set_boolVal), set_intVal = js.Any.fromFunction1(set_intVal), set_queryPropertyValueTypeIndex = js.Any.fromFunction1(set_queryPropertyValueTypeIndex), set_strArray = js.Any.fromFunction1(set_strArray), set_strVal = js.Any.fromFunction1(set_strVal), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[QueryPropertyValue]
  }
}

