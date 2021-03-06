package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponseInfo extends ClientValueObject {
  def get_body(): String
  def get_headers(): js.Any
  def get_statusCode(): Double
  def set_body(value: String): Unit
  def set_headers(value: js.Any): Unit
  def set_statusCode(value: Double): Unit
}

object WebResponseInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_body: () => String,
    get_headers: () => js.Any,
    get_statusCode: () => Double,
    get_typeId: () => String,
    set_body: String => Unit,
    set_headers: js.Any => Unit,
    set_statusCode: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WebResponseInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_body = js.Any.fromFunction0(get_body), get_headers = js.Any.fromFunction0(get_headers), get_statusCode = js.Any.fromFunction0(get_statusCode), get_typeId = js.Any.fromFunction0(get_typeId), set_body = js.Any.fromFunction1(set_body), set_headers = js.Any.fromFunction1(set_headers), set_statusCode = js.Any.fromFunction1(set_statusCode), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WebResponseInfo]
  }
}

