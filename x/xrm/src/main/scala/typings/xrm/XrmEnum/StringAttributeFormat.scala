package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.email
import typings.xrm.xrmStrings.phone
import typings.xrm.xrmStrings.text
import typings.xrm.xrmStrings.textarea
import typings.xrm.xrmStrings.tickersymbol
import typings.xrm.xrmStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.email
  - typings.xrm.xrmStrings.phone
  - typings.xrm.xrmStrings.text
  - typings.xrm.xrmStrings.textarea
  - typings.xrm.xrmStrings.tickersymbol
  - typings.xrm.xrmStrings.url
*/
trait StringAttributeFormat extends js.Object

object StringAttributeFormat {
  @scala.inline
  def Email: email = "email".asInstanceOf[email]
  @scala.inline
  def Phone: phone = "phone".asInstanceOf[phone]
  @scala.inline
  def Text: text = "text".asInstanceOf[text]
  @scala.inline
  def TextArea: textarea = "textarea".asInstanceOf[textarea]
  @scala.inline
  def TickerSymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  @scala.inline
  def URL: url = "url".asInstanceOf[url]
}

