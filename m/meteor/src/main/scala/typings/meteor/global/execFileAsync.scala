package typings.meteor.global

import typings.meteor.anon.Cwd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("execFileAsync")
@js.native
object execFileAsync extends js.Object {
  def apply(command: String): js.Any = js.native
  def apply(command: String, args: js.Array[_]): js.Any = js.native
  def apply(command: String, args: js.Array[_], options: Cwd): js.Any = js.native
}

