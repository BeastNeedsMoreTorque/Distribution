package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeKind extends js.Object

@JSGlobal("Srch.DateTimeKind")
@js.native
object DateTimeKind extends js.Object {
  @js.native
  sealed trait local extends DateTimeKind
  
  @js.native
  sealed trait unspecified extends DateTimeKind
  
  @js.native
  sealed trait utc extends DateTimeKind
  
}

