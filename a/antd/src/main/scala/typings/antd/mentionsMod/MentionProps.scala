package typings.antd.mentionsMod

import typings.rcMentions.mentionsMod.Direction
import typings.rcMentions.mentionsMod.MentionsProps
import typings.rcMentions.mentionsMod.Placement
import typings.rcMentions.rcMentionsBooleans.`false`
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends MentionsProps {
  var loading: js.UndefOr[Boolean] = js.undefined
}

object MentionProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: String = null,
    direction: Direction = null,
    filterOption: `false` | (js.Function2[/* input */ String, /* hasValue */ typings.rcMentions.optionMod.OptionProps, Boolean]) = null,
    getPopupContainer: () => HTMLElement = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: ReactNode = null,
    onBlur: FocusEvent[HTMLTextAreaElement] => Unit = null,
    onChange: /* text */ String => Unit = null,
    onFocus: FocusEvent[HTMLTextAreaElement] => Unit = null,
    onSearch: (/* text */ String, /* prefix */ String) => Unit = null,
    onSelect: (/* option */ typings.rcMentions.optionMod.OptionProps, /* prefix */ String) => Unit = null,
    placement: Placement = null,
    prefix: String | js.Array[String] = null,
    prefixCls: String = null,
    split: String = null,
    style: CSSProperties = null,
    transitionName: String = null,
    validateSearch: (/* text */ String, MentionProps) => Boolean = null,
    value: String = null
  ): MentionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction0(getPopupContainer))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (validateSearch != null) __obj.updateDynamic("validateSearch")(js.Any.fromFunction2(validateSearch))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionProps]
  }
}

