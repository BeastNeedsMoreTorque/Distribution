package typings.tstl.mod.default

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "fill_n")
@js.native
object fillN extends js.Object {
  def apply[OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](first: OutputIterator, n: Double, `val`: ValueType[OutputIterator]): OutputIterator = js.native
}

