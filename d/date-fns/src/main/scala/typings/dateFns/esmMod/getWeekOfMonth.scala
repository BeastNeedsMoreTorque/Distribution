package typings.dateFns.esmMod

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "getWeekOfMonth")
@js.native
object getWeekOfMonth extends js.Object {
  def apply(date: Double): Double = js.native
  def apply(date: Double, options: WeekStartsOn): Double = js.native
  def apply(date: Date): Double = js.native
  def apply(date: Date, options: WeekStartsOn): Double = js.native
}

