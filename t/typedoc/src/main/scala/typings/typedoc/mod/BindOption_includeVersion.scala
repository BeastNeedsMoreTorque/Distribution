package typings.typedoc.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.PropertyKey
import typings.typedoc.anon.ApplicationApplication
import typings.typedoc.anon.OptionsOptions
import typings.typedoc.typedocStrings.includeVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "BindOption")
@js.native
object BindOption_includeVersion extends js.Object {
  def apply(name: includeVersion): js.Function2[
    /* target */ (ApplicationApplication | OptionsOptions) with typings.typedoc.typedocStrings.BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
}

