package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIsCompleteReplyIncomplete extends js.Object {
  var indent: String
  var status: incomplete
}

object IIsCompleteReplyIncomplete {
  @scala.inline
  def apply(indent: String, status: incomplete): IIsCompleteReplyIncomplete = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyIncomplete]
  }
}

