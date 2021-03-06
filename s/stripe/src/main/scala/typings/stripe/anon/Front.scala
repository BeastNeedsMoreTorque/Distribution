package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Front extends js.Object {
  /**
    * The back of a document returned by a file upload with a purpose value of identity_document.
    */
  var back: String
  /**
    * The front of a document returned by a file upload with a purpose value of identity_document.
    */
  var front: String
}

object Front {
  @scala.inline
  def apply(back: String, front: String): Front = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[Front]
  }
}

