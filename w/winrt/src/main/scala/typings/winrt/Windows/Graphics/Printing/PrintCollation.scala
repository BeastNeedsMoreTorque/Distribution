package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintCollation extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintCollation")
@js.native
object PrintCollation extends js.Object {
  @js.native
  sealed trait collated extends PrintCollation
  
  @js.native
  sealed trait default extends PrintCollation
  
  @js.native
  sealed trait notAvailable extends PrintCollation
  
  @js.native
  sealed trait printerCustom extends PrintCollation
  
  @js.native
  sealed trait uncollated extends PrintCollation
  
}

