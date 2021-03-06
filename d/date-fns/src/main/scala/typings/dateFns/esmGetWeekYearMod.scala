package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.dateFns.anon.LocaleLocale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/getWeekYear", JSImport.Namespace)
@js.native
object esmGetWeekYearMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Double = js.native
    def apply(date: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
    def apply(date: Double, options: LocaleLocale): Double = js.native
    def apply(date: Date): Double = js.native
    def apply(date: Date, options: FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
    def apply(date: Date, options: LocaleLocale): Double = js.native
  }
  
}

