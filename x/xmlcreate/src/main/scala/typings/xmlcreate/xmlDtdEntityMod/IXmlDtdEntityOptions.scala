package typings.xmlcreate.xmlDtdEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDtdEntityOptions extends js.Object {
  /**
    * The text of the declaration.
    */
  var charData: String
}

object IXmlDtdEntityOptions {
  @scala.inline
  def apply(charData: String): IXmlDtdEntityOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDtdEntityOptions]
  }
}

