package typings.semanticUiReact.tableCellMod

import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.baseline
import typings.react.reactStrings.both
import typings.react.reactStrings.bottom
import typings.react.reactStrings.char
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.decimal
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.email
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.inherit
import typings.react.reactStrings.justify
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.middle
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.search
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.top
import typings.react.reactStrings.tree
import typings.react.reactStrings.url
import typings.react.reactStrings.vertical
import typings.react.reactStrings.yes
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.std.Event
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableCellProps extends TdHTMLAttributes[HTMLTableCellElement] {
  /** A cell can be active or selected by a user. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A table can be collapsing, taking up only as much space as its rows. */
  var collapsing: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A cell can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A cell may call attention to an error or a negative value. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** Add an Icon by name, props object, or pass an <Icon /> */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** A cell may let a user know whether a value is bad. */
  var negative: js.UndefOr[Boolean] = js.undefined
  /** A cell may let a user know whether a value is good. */
  var positive: js.UndefOr[Boolean] = js.undefined
  /** A cell can be selectable. */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /** A cell can specify that its contents should remain on a single line and not wrap. */
  var singleLine: js.UndefOr[Boolean] = js.undefined
  /** A table cell can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.undefined
  /** A table cell can adjust its text alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  /** A cell may warn a user. */
  var warning: js.UndefOr[Boolean] = js.undefined
  /** A table can specify the width of individual columns independently. */
  @JSName("width")
  var width_StrictTableCellProps: js.UndefOr[SemanticWIDTHS] = js.undefined
}

object StrictTableCellProps {
  @scala.inline
  def apply(
    abbr: String = null,
    about: String = null,
    accessKey: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    align: typings.react.reactStrings.left | typings.react.reactStrings.center | typings.react.reactStrings.right | justify | char = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    as: js.Any = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    collapsing: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    content: SemanticShorthandContent = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLTableCellElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLTableCellElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLTableCellElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLTableCellElement] => Unit = null,
    onBlur: FocusEvent[HTMLTableCellElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onChange: FormEvent[HTMLTableCellElement] => Unit = null,
    onClick: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLTableCellElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLTableCellElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLTableCellElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLTableCellElement] => Unit = null,
    onCut: ClipboardEvent[HTMLTableCellElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLTableCellElement] => Unit = null,
    onDragEnd: DragEvent[HTMLTableCellElement] => Unit = null,
    onDragEnter: DragEvent[HTMLTableCellElement] => Unit = null,
    onDragExit: DragEvent[HTMLTableCellElement] => Unit = null,
    onDragLeave: DragEvent[HTMLTableCellElement] => Unit = null,
    onDragOver: DragEvent[HTMLTableCellElement] => Unit = null,
    onDragStart: DragEvent[HTMLTableCellElement] => Unit = null,
    onDrop: DragEvent[HTMLTableCellElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLTableCellElement] => Unit = null,
    onInput: FormEvent[HTMLTableCellElement] => Unit = null,
    onInvalid: FormEvent[HTMLTableCellElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLTableCellElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLTableCellElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLTableCellElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLTableCellElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLTableCellElement] => Unit = null,
    onPause: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLTableCellElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLTableCellElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onReset: FormEvent[HTMLTableCellElement] => Unit = null,
    onScroll: UIEvent[HTMLTableCellElement, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLTableCellElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLTableCellElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLTableCellElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLTableCellElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLTableCellElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLTableCellElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLTableCellElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLTableCellElement] => Unit = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    role: String = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    scope: String = null,
    security: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Booleanish] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    textAlign: center | left | right = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    valign: top | middle | bottom | baseline = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    vocab: String = null,
    warning: js.UndefOr[Boolean] = js.undefined,
    width: SemanticWIDTHS = null
  ): StrictTableCellProps = {
    val __obj = js.Dynamic.literal()
    if (abbr != null) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsing)) __obj.updateDynamic("collapsing")(collapsing.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.get.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.get.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTableCellProps]
  }
}

