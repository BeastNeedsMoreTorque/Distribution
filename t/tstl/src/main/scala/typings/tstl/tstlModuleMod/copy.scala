package typings.tstl.tstlModuleMod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/module", "copy")
@js.native
object copy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
}

