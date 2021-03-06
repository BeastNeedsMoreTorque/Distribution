package typings.activexLibreoffice.com_.sun.star.uno

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the base of all UNO exceptions
  *
  * All exceptions defined in UNO idl should derive from this exception.
  */
trait Exception extends js.Object {
  /**
    * should contain a reference to the original, which raised the exception.
    *
    * May be NULL.
    */
  var Context: XInterface
  /**
    * gives a detailed description of the reason, why the exception was thrown.
    *
    * The description should be as detailed as possible.
    */
  var Message: String
}

object Exception {
  @scala.inline
  def apply(Context: XInterface, Message: String): Exception = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
}

