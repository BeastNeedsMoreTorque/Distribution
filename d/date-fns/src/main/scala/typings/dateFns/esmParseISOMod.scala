package typings.dateFns

import typings.dateFns.anon.AdditionalDigits
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/parseISO", JSImport.Namespace)
@js.native
object esmParseISOMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(argument: String): Date = js.native
    def apply(argument: String, options: AdditionalDigits): Date = js.native
  }
  
}

