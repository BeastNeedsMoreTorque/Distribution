package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddFieldOptions extends js.Object

@JSGlobal("SP.AddFieldOptions")
@js.native
object AddFieldOptions extends js.Object {
  @js.native
  sealed trait addFieldCheckDisplayName extends AddFieldOptions
  
  @js.native
  sealed trait addFieldInternalNameHint extends AddFieldOptions
  
  @js.native
  sealed trait addFieldToDefaultView extends AddFieldOptions
  
  @js.native
  sealed trait addToAllContentTypes extends AddFieldOptions
  
  @js.native
  sealed trait addToDefaultContentType extends AddFieldOptions
  
  @js.native
  sealed trait addToNoContentType extends AddFieldOptions
  
  @js.native
  sealed trait defaultValue extends AddFieldOptions
  
}

