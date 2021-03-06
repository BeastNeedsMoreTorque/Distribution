package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload extends js.Object {
  /**
    * The content of the payload. You can use a string expression that includes quoted strings ('&lt;string&gt;'), variables ($variable.&lt;variable-name&gt;), input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;), string concatenations, and quoted strings that contain ${} as the content. The recommended maximum size of a content expression is 1 KB.
    */
  var contentExpression: ContentExpression = js.native
  /**
    * The value of the payload type can be either STRING or JSON.
    */
  var `type`: PayloadType = js.native
}

object Payload {
  @scala.inline
  def apply(contentExpression: ContentExpression, `type`: PayloadType): Payload = {
    val __obj = js.Dynamic.literal(contentExpression = contentExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

