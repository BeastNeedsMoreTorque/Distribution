package typings.dateFns

import typings.dateFns.anon.AdditionalDigits
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/endOfDecade/index", JSImport.Namespace)
@js.native
object esmEndOfDecadeIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: AdditionalDigits): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: AdditionalDigits): Date = js.native
  }
  
}

