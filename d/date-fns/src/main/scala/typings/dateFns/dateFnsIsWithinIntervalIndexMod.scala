package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isWithinInterval/index", JSImport.Namespace)
@js.native
object dateFnsIsWithinIntervalIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, interval: typings.dateFns.mod.Interval): Boolean = js.native
    def apply(date: Date, interval: typings.dateFns.mod.Interval): Boolean = js.native
  }
  
}

