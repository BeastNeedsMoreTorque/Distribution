package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revwalk")
@js.native
class Revwalk ()
  extends typings.nodegit.revWalkMod.Revwalk

/* static members */
@JSImport("nodegit", "Revwalk")
@js.native
object Revwalk extends js.Object {
  def create(repo: typings.nodegit.repositoryMod.Repository): typings.nodegit.revWalkMod.Revwalk = js.native
}

