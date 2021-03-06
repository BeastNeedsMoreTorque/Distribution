package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReplyErrorContent
  extends _ReplyContent[js.Any] {
  /**
    * Exception name
    */
  var ename: String
  /**
    * Exception value
    */
  var evalue: String
  var status: error
  /**
    * Traceback
    */
  var traceback: js.Array[String]
}

object IReplyErrorContent {
  @scala.inline
  def apply(ename: String, evalue: String, status: error, traceback: js.Array[String]): IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyErrorContent]
  }
}

