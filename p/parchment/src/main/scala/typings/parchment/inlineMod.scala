package typings.parchment

import typings.parchment.registryMod.Scope
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/inline", JSImport.Namespace)
@js.native
object inlineMod extends js.Object {
  @js.native
  trait InlineBlot
    extends typings.parchment.formatMod.default
  
  @js.native
  class default () extends InlineBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var scope: Scope = js.native
    var tagName: String = js.native
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

