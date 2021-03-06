package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceFileMode extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "SourceFileMode")
@js.native
object SourceFileMode extends js.Object {
  @js.native
  sealed trait File extends SourceFileMode
  
  @js.native
  sealed trait Modules extends SourceFileMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceFileMode with Double] = js.native
  /* 0 */ @js.native
  object File extends TopLevel[File with Double]
  
  /* 1 */ @js.native
  object Modules extends TopLevel[Modules with Double]
  
}

