package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.WwwFormUrlDecoder")
@js.native
class WwwFormUrlDecoder protected ()
  extends typings.winrt.Windows.Foundation.WwwFormUrlDecoder {
  def this(query: String) = this()
  /* CompleteClass */
  override def first(): IIterator[IWwwFormUrlDecoderEntry] = js.native
}

