package typings.reactAce.anon

import typings.reactAce.typesMod.IEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-ace.react-ace/lib/diff.IDiffEditorProps> */
trait PartialIDiffEditorProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var cursorStart: js.UndefOr[Double] = js.undefined
  var editorProps: js.UndefOr[js.Object] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var minLines: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var scrollMargin: js.UndefOr[js.Array[Double]] = js.undefined
  var setOptions: js.UndefOr[js.Object] = js.undefined
  var showGutter: js.UndefOr[Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[Boolean] = js.undefined
  var splits: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Array[String]] = js.undefined
  var width: js.UndefOr[String] = js.undefined
  var wrapEnabled: js.UndefOr[Boolean] = js.undefined
}

object PartialIDiffEditorProps {
  @scala.inline
  def apply(
    className: String = null,
    cursorStart: js.UndefOr[Double] = js.undefined,
    editorProps: js.Object = null,
    enableBasicAutocompletion: Boolean | js.Array[String] = null,
    enableLiveAutocompletion: Boolean | js.Array[String] = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    fontSize: js.UndefOr[Double] = js.undefined,
    height: String = null,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    maxLines: js.UndefOr[Double] = js.undefined,
    minLines: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    name: String = null,
    onChange: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit = null,
    onLoad: /* editor */ IEditorProps => Unit = null,
    onPaste: /* value */ String => Unit = null,
    onScroll: /* editor */ IEditorProps => Unit = null,
    orientation: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollMargin: js.Array[Double] = null,
    setOptions: js.Object = null,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    splits: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    tabSize: js.UndefOr[Double] = js.undefined,
    theme: String = null,
    value: js.Array[String] = null,
    width: String = null,
    wrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): PartialIDiffEditorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorStart)) __obj.updateDynamic("cursorStart")(cursorStart.get.asInstanceOf[js.Any])
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps.asInstanceOf[js.Any])
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLines)) __obj.updateDynamic("minLines")(minLines.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splits)) __obj.updateDynamic("splits")(splits.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIDiffEditorProps]
  }
}

