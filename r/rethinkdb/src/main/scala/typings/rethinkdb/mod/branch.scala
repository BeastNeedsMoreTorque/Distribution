package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", "branch")
@js.native
object branch extends js.Object {
  def apply(test: Expression[Boolean], trueBranch: Expression[_], falseBranch: Expression[_]): Expression[_] = js.native
}

