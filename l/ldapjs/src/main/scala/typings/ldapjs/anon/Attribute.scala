package typings.ldapjs.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attribute: String
  var value: String | Buffer
}

object Attribute {
  @scala.inline
  def apply(attribute: String, value: String | Buffer): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

