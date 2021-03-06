package typings.html5plus

import typings.html5plus.html5plusStrings.email
import typings.html5plus.html5plusStrings.number
import typings.html5plus.html5plusStrings.search
import typings.html5plus.html5plusStrings.tel
import typings.html5plus.html5plusStrings.text
import typings.html5plus.html5plusStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 输入框样式
  * 用于定义输入框的显示样式，如字体大小，提示内容等信息。
  *     输入文本内容在指定区域水平居左，垂直居中显示。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjInputStyles extends js.Object {
  /**
    * 输入框的边框颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示红色边框。默认值为"#000000"（黑色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * 输入框边框圆角半径
    * 可取值：圆角半径像素值，数字加"px"格式字符串，如"6px"。
    *     默认值为"0px"（边框无圆角）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderRadius: js.UndefOr[String] = js.undefined
  /**
    * 输入框的边框宽度
    * 可取值：像素值，数字加"px"格式字符串，如"2px"。 默认值为"1px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderWidth: js.UndefOr[String] = js.undefined
  /**
    * 输入框的字体大小
    * 可取值：字体高度像素值，数字加"px"格式字符串，如"12px"。 
    *     默认值为"16px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * 输入框失去焦点事件
    * 当编辑框失去焦点时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onBlur: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  /**
    * 输入框完成输入事件
    * 弹出软键盘完成输入后，点击软键盘上的“完成”、“前往”按钮时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onComplete: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  /**
    * 输入框获取焦点事件
    * 当编辑框获取焦点时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onFocus: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  /**
    * 输入框的提示文本
    * 当用户未输入内容时显示在编辑框中（灰色文字）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * 输入框类型
    * 可取值：
    *         "email" - 邮箱地址输入框；
    *         "number" - 数字输入框；
    *         "search" - 搜索文本输入框；
    *         "tel" - 电话号码输入框；
    *         "text" - 普通文本输入框；
    *         "url" - URL地址输入框。
    *     默认为text（即普通文本输入框）。
    * - email: 邮箱地址输入框
    * - number: 数字输入框
    * - search: 搜索文本输入框
    * - tel: 电话号码输入框
    * - text: 普通文本输入框
    * - url: URL地址输入框
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var `type`: js.UndefOr[email | number | search | tel | text | url] = js.undefined
}

object PlusNativeObjInputStyles {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderRadius: String = null,
    borderWidth: String = null,
    fontSize: String = null,
    onBlur: /* result */ js.Any => Unit = null,
    onComplete: /* result */ js.Any => Unit = null,
    onFocus: /* result */ js.Any => Unit = null,
    placeholder: String = null,
    `type`: email | number | search | tel | text | url = null
  ): PlusNativeObjInputStyles = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeObjInputStyles]
  }
}

