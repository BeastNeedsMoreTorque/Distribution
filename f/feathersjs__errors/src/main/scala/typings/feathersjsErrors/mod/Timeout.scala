package typings.feathersjsErrors.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "Timeout")
@js.native
class Timeout () extends FeathersError {
  def this(msg: String) = this()
  def this(msg: Error) = this()
  def this(msg: String, data: js.Any) = this()
  def this(msg: Error, data: js.Any) = this()
}

