package typings.gaeaModel.FitGaea

import typings.gaeaModel.anon.MapUniqueKey
import typings.gaeaModel.anon.Source
import typings.gaeaModel.anon.UniqueKey
import typings.gaeaModel.gaeaModelStrings.`new`
import typings.gaeaModel.gaeaModelStrings.combo
import typings.gaeaModel.gaeaModelStrings.viewport
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[Source] = js.undefined
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  var newInfo: js.UndefOr[UniqueKey] = js.undefined
  // 类型
  var `type`: `new` | combo | viewport
  var viewportInfo: js.UndefOr[MapUniqueKey] = js.undefined
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(
    dragStartIndex: Double,
    dragStartParentElement: HTMLElement,
    `type`: `new` | combo | viewport,
    comboInfo: Source = null,
    newInfo: UniqueKey = null,
    viewportInfo: MapUniqueKey = null
  ): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comboInfo != null) __obj.updateDynamic("comboInfo")(comboInfo.asInstanceOf[js.Any])
    if (newInfo != null) __obj.updateDynamic("newInfo")(newInfo.asInstanceOf[js.Any])
    if (viewportInfo != null) __obj.updateDynamic("viewportInfo")(viewportInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
}

