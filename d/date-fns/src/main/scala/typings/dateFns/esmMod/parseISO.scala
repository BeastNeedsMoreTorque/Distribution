package typings.dateFns.esmMod

import typings.dateFns.anon.AdditionalDigits
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "parseISO")
@js.native
object parseISO extends js.Object {
  def apply(argument: String): Date = js.native
  def apply(argument: String, options: AdditionalDigits): Date = js.native
}

