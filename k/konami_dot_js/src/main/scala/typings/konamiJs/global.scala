package typings.konamiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Konami protected ()
    extends typings.konamiJs.Konami {
    def this(action: String) = this()
    def this(action: js.Function) = this()
  }
  
}

