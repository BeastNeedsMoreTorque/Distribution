package typings.reactVirtualized

import typings.reactVirtualized.anon.DisableHeight
import typings.reactVirtualized.esAutoSizerMod.AutoSizerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/AutoSizer", JSImport.Namespace)
@js.native
object autoSizerMod extends js.Object {
  @js.native
  class AutoSizer protected ()
    extends typings.reactVirtualized.esAutoSizerMod.AutoSizer {
    def this(props: AutoSizerProps) = this()
  }
  
  /* static members */
  @js.native
  object AutoSizer extends js.Object {
    var defaultProps: DisableHeight = js.native
  }
  
}

