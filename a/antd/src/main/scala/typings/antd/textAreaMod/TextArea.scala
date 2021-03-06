package typings.antd.textAreaMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var clearableInput: typings.antd.clearableLabeledInputMod.default = js.native
  var resizableTextArea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableTextArea */ js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def handleReset(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderComponent(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderTextArea(prefixCls: String): Element = js.native
  def saveClearableInput(clearableInput: typings.antd.clearableLabeledInputMod.default): Unit = js.native
  def saveTextArea(
    textarea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTextArea */ js.Any
  ): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

