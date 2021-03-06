package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceClientCreate[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  def create(details: U): js.Promise[T]
}

object ResourceClientCreate {
  @scala.inline
  def apply[/* <: js.Object */ T, /* <: js.Object */ U](create: U => js.Promise[T]): ResourceClientCreate[T, U] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ResourceClientCreate[T, U]]
  }
}

