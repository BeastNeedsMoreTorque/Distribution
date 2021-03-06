package typings.reactNative.mod

import typings.react.mod.Component
import typings.reactNative.anon.AnimatedBoolean
import typings.reactNative.anon.AnimatedItem
import typings.reactNative.anon.AnimatedOffset
import typings.reactNative.anon.ViewPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "VirtualizedList")
@js.native
class VirtualizedList[ItemT] ()
  extends Component[VirtualizedListProps[ItemT], js.Object, js.Any] {
  def recordInteraction(): Unit = js.native
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: AnimatedBoolean): Unit = js.native
  def scrollToIndex(params: ViewPosition): Unit = js.native
  def scrollToItem(params: AnimatedItem[ItemT]): Unit = js.native
  /**
    * Scroll to a specific content pixel offset in the list.
    * Param `offset` expects the offset to scroll to. In case of horizontal is true, the
    * offset is the x-value, in any other case the offset is the y-value.
    * Param `animated` (true by default) defines whether the list should do an animation while scrolling.
    */
  def scrollToOffset(params: AnimatedOffset): Unit = js.native
}

