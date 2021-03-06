package typings.webcola.powergraphMod

import typings.webcola.anon.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "getGroups")
@js.native
object getGroups extends js.Object {
  def apply[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link]): Groups = js.native
  def apply[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[_]): Groups = js.native
}

