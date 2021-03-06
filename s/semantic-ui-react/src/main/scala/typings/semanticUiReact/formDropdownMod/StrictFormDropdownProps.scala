package typings.semanticUiReact.formDropdownMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.semanticUiReact.dropdownDropdownMod.DropdownOnSearchChangeData
import typings.semanticUiReact.dropdownDropdownMod.DropdownProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.formFieldMod.StrictFormFieldProps
import typings.semanticUiReact.genericMod.HtmlLabelProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.semanticUiReact.dropdownDropdownMod.StrictDropdownProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined additionLabel, additionPosition, allowAdditions, basic, button, clearable, closeOnBlur, closeOnEscape, closeOnChange, compact, deburr, defaultOpen, defaultSearchQuery, defaultSelectedLabel, defaultUpward, defaultValue, direction, floating, fluid, header, icon, item, labeled, lazyLoad, loading, minCharacters, multiple, noResultsMessage, onAddItem, onBlur, onChange, onClick, onClose, onFocus, onLabelClick, onMouseDown, onOpen, onSearchChange, open, openOnFocus, options, placeholder, pointing, renderLabel, scrolling, search, searchInput, searchQuery, selectOnBlur, selectOnNavigation, selectedLabel, selection, simple, tabIndex, text, trigger, value, upward, wrapSelection */ trait StrictFormDropdownProps extends StrictFormFieldProps {
  /** Label prefixed to an option added by a user. */
  var additionLabel: js.UndefOr[Double | String | ReactNode] = js.undefined
  /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
  var additionPosition: js.UndefOr[top | bottom] = js.undefined
  /**
    * Allow user additions to the list of options (boolean).
    * Requires the use of `selection`, `options` and `search`.
    */
  var allowAdditions: js.UndefOr[Boolean] = js.undefined
  /** A Dropdown can reduce its complexity. */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** Format the Dropdown to appear as a button. */
  var button: js.UndefOr[Boolean] = js.undefined
  /** Using the clearable setting will let users remove their selection from a dropdown. */
  var clearable: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the menu should close when the dropdown is blurred. */
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the menu should close when a value is selected from the dropdown.
    * By default, multiple selection dropdowns will remain open on change, while single
    * selection dropdowns will close on change.
    */
  var closeOnChange: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the dropdown should close when the escape key is pressed. */
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  /** A compact dropdown has no minimum width. */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the dropdown should strip diacritics in options and input search */
  var deburr: js.UndefOr[Boolean] = js.undefined
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  /** Initial value of searchQuery. */
  var defaultSearchQuery: js.UndefOr[String] = js.undefined
  /** Currently selected label in multi-select. */
  var defaultSelectedLabel: js.UndefOr[Double | String] = js.undefined
  /** Initial value of upward. */
  var defaultUpward: js.UndefOr[Boolean] = js.undefined
  /** Initial value or value array if multiple. */
  var defaultValue: js.UndefOr[String | Double | Boolean | (js.Array[Double | String | Boolean])] = js.undefined
  /** A dropdown menu can open to the left or to the right. */
  var direction: js.UndefOr[left | right] = js.undefined
  /** Individual fields may display an error state along with a message. */
  @JSName("error")
  var error_StrictFormDropdownProps: js.UndefOr[js.Any] = js.undefined
  /** A dropdown menu can contain floated content. */
  var floating: js.UndefOr[Boolean] = js.undefined
  /** A dropdown can take the full width of its parent */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** A dropdown menu can contain a header. */
  var header: js.UndefOr[ReactNode] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** A dropdown can be formatted as a Menu item. */
  var item: js.UndefOr[Boolean] = js.undefined
  /** A dropdown can be labeled. */
  var labeled: js.UndefOr[Boolean] = js.undefined
  /** A dropdown can defer rendering its options until it is open. */
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  /** A dropdown can show that it is currently loading data. */
  var loading: js.UndefOr[Boolean] = js.undefined
  /** The minimum characters for a search to begin showing results. */
  var minCharacters: js.UndefOr[Double] = js.undefined
  /** A selection dropdown can allow multiple selections. */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[ReactNode] = js.undefined
  /**
    * Called when a user adds a new item. Use this to update the options list.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and the new item's value.
    */
  var onAddItem: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called when the user attempts to change the value.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed value.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called when a multi-select label is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All label props.
    */
  var onLabelClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
  ] = js.undefined
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* data */ DropdownProps, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.undefined
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of searchQuery.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[HTMLElement, Event], 
      /* data */ DropdownOnSearchChangeData, 
      Unit
    ]
  ] = js.undefined
  /** Controls whether or not the dropdown menu is displayed. */
  var open: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the menu should open when the dropdown is focused. */
  var openOnFocus: js.UndefOr[Boolean] = js.undefined
  /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
  var options: js.UndefOr[js.Array[DropdownItemProps]] = js.undefined
  /** Placeholder text. */
  var placeholder: js.UndefOr[String] = js.undefined
  /** A dropdown can be formatted so that its menu is pointing. */
  var pointing: js.UndefOr[
    Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
  ] = js.undefined
  /**
    * Mapped over the active items and returns shorthand for the active item Labels.
    * Only applies to `multiple` Dropdowns.
    *
    * @param {object} item - A currently active dropdown item.
    * @param {number} index - The current index.
    * @param {object} defaultLabelProps - The default props for an active item Label.
    * @returns {*} Shorthand for a Label.
    */
  var renderLabel: js.UndefOr[
    js.Function3[
      /* item */ DropdownItemProps, 
      /* index */ Double, 
      /* defaultLabelProps */ LabelProps, 
      _
    ]
  ] = js.undefined
  /** A dropdown can have its menu scroll. */
  var scrolling: js.UndefOr[Boolean] = js.undefined
  /**
    * A selection dropdown can allow a user to search through a large list of choices.
    * Pass a function here to replace the default search.
    */
  var search: js.UndefOr[
    Boolean | (js.Function2[
      /* options */ js.Array[DropdownItemProps], 
      /* value */ String, 
      js.Array[DropdownItemProps]
    ])
  ] = js.undefined
  /** A shorthand for a search input. */
  var searchInput: js.UndefOr[js.Any] = js.undefined
  /** Current value of searchQuery. Creates a controlled component. */
  var searchQuery: js.UndefOr[String] = js.undefined
  /** Define whether the highlighted item should be selected on blur. */
  var selectOnBlur: js.UndefOr[Boolean] = js.undefined
  /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
  var selectOnNavigation: js.UndefOr[Boolean] = js.undefined
  /** Currently selected label in multi-select. */
  var selectedLabel: js.UndefOr[Double | String] = js.undefined
  /** A dropdown can be used to select between choices in a form. */
  var selection: js.UndefOr[js.Any] = js.undefined
  /** A simple dropdown can open without Javascript. */
  var simple: js.UndefOr[Boolean] = js.undefined
  /** A dropdown can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.undefined
  /** The text displayed in the dropdown, usually for the active item. */
  var text: js.UndefOr[String] = js.undefined
  /** Custom element to trigger the menu to become visible. Takes place of 'text'. */
  var trigger: js.UndefOr[ReactNode] = js.undefined
  /** Controls whether the dropdown will open upward. */
  var upward: js.UndefOr[Boolean] = js.undefined
  /** Current value or value array if multiple. Creates a controlled component. */
  var value: js.UndefOr[Boolean | Double | String | (js.Array[Boolean | Double | String])] = js.undefined
  /**
    * A dropdown will go to the last element when ArrowUp is pressed on the first,
    * or go to the first when ArrowDown is pressed on the last( aka infinite selection )
    */
  var wrapSelection: js.UndefOr[Boolean] = js.undefined
}

object StrictFormDropdownProps {
  @scala.inline
  def apply(
    additionLabel: Double | String | ReactNode = null,
    additionPosition: top | bottom = null,
    allowAdditions: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    button: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    clearable: js.UndefOr[Boolean] = js.undefined,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnChange: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    control: js.Any = null,
    deburr: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultSearchQuery: String = null,
    defaultSelectedLabel: Double | String = null,
    defaultUpward: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | Boolean | (js.Array[Double | String | Boolean]) = null,
    direction: left | right = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.Any = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    header: ReactNode = null,
    icon: js.Any = null,
    id: Double | String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    item: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    labeled: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    minCharacters: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    noResultsMessage: ReactNode = null,
    onAddItem: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit = null,
    onBlur: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit = null,
    onChange: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit = null,
    onClick: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit = null,
    onClose: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit = null,
    onFocus: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit = null,
    onLabelClick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit = null,
    onMouseDown: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ DropdownProps) => Unit = null,
    onOpen: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit = null,
    onSearchChange: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownOnSearchChangeData) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnFocus: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[DropdownItemProps] = null,
    placeholder: String = null,
    pointing: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`) = null,
    renderLabel: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => _ = null,
    required: js.Any = null,
    scrolling: js.UndefOr[Boolean] = js.undefined,
    search: Boolean | (js.Function2[
      /* options */ js.Array[DropdownItemProps], 
      /* value */ String, 
      js.Array[DropdownItemProps]
    ]) = null,
    searchInput: js.Any = null,
    searchQuery: String = null,
    selectOnBlur: js.UndefOr[Boolean] = js.undefined,
    selectOnNavigation: js.UndefOr[Boolean] = js.undefined,
    selectedLabel: Double | String = null,
    selection: js.Any = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Double | String = null,
    text: String = null,
    trigger: ReactNode = null,
    `type`: String = null,
    upward: js.UndefOr[Boolean] = js.undefined,
    value: Boolean | Double | String | (js.Array[Boolean | Double | String]) = null,
    width: SemanticWIDTHS = null,
    wrapSelection: js.UndefOr[Boolean] = js.undefined
  ): StrictFormDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (additionLabel != null) __obj.updateDynamic("additionLabel")(additionLabel.asInstanceOf[js.Any])
    if (additionPosition != null) __obj.updateDynamic("additionPosition")(additionPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAdditions)) __obj.updateDynamic("allowAdditions")(allowAdditions.get.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnChange)) __obj.updateDynamic("closeOnChange")(closeOnChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (!js.isUndefined(deburr)) __obj.updateDynamic("deburr")(deburr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.get.asInstanceOf[js.Any])
    if (defaultSearchQuery != null) __obj.updateDynamic("defaultSearchQuery")(defaultSearchQuery.asInstanceOf[js.Any])
    if (defaultSelectedLabel != null) __obj.updateDynamic("defaultSelectedLabel")(defaultSelectedLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultUpward)) __obj.updateDynamic("defaultUpward")(defaultUpward.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labeled)) __obj.updateDynamic("labeled")(labeled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCharacters)) __obj.updateDynamic("minCharacters")(minCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (noResultsMessage != null) __obj.updateDynamic("noResultsMessage")(noResultsMessage.asInstanceOf[js.Any])
    if (onAddItem != null) __obj.updateDynamic("onAddItem")(js.Any.fromFunction2(onAddItem))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onLabelClick != null) __obj.updateDynamic("onLabelClick")(js.Any.fromFunction2(onLabelClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (pointing != null) __obj.updateDynamic("pointing")(pointing.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction3(renderLabel))
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(scrolling)) __obj.updateDynamic("scrolling")(scrolling.get.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnBlur)) __obj.updateDynamic("selectOnBlur")(selectOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnNavigation)) __obj.updateDynamic("selectOnNavigation")(selectOnNavigation.get.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.get.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(upward)) __obj.updateDynamic("upward")(upward.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapSelection)) __obj.updateDynamic("wrapSelection")(wrapSelection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFormDropdownProps]
  }
}

