package typings.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FkCreator extends js.Object {
  def apply(opts: RelationalFieldOpts): ForeignKey = js.native
  def apply(toModelName: String): ForeignKey = js.native
  def apply(toModelName: String, relatedName: String): ForeignKey = js.native
}

