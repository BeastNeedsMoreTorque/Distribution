package typings.lestate.mod

import typings.lestate.anon.InitialState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lestate", "createState")
@js.native
object createState extends js.Object {
  def apply(): LeState = js.native
  def apply(props: InitialState): LeState = js.native
}

