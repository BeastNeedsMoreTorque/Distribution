package typings.dateFns

import typings.dateFns.anon.UseAdditionalWeekYearTokensWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/parse/index", JSImport.Namespace)
@js.native
object esmParseIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateString: String, formatString: String, referenceDate: Double): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: UseAdditionalWeekYearTokensWeekStartsOn
    ): Date = js.native
    def apply(dateString: String, formatString: String, referenceDate: Date): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: UseAdditionalWeekYearTokensWeekStartsOn
    ): Date = js.native
  }
  
}

