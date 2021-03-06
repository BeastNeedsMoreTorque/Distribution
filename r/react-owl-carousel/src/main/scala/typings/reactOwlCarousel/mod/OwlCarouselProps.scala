package typings.reactOwlCarousel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactOwlCarousel.optionsMod.HandlerCallback
import typings.reactOwlCarousel.optionsMod.Options
import typings.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typings.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typings.reactOwlCarousel.reactOwlCarouselStrings.additions
import typings.reactOwlCarousel.reactOwlCarouselStrings.all
import typings.reactOwlCarousel.reactOwlCarouselStrings.ascending
import typings.reactOwlCarousel.reactOwlCarouselStrings.assertive
import typings.reactOwlCarousel.reactOwlCarouselStrings.both
import typings.reactOwlCarousel.reactOwlCarouselStrings.copy
import typings.reactOwlCarousel.reactOwlCarouselStrings.date
import typings.reactOwlCarousel.reactOwlCarouselStrings.decimal
import typings.reactOwlCarousel.reactOwlCarouselStrings.descending
import typings.reactOwlCarousel.reactOwlCarouselStrings.dialog
import typings.reactOwlCarousel.reactOwlCarouselStrings.email
import typings.reactOwlCarousel.reactOwlCarouselStrings.execute
import typings.reactOwlCarousel.reactOwlCarouselStrings.grammar
import typings.reactOwlCarousel.reactOwlCarouselStrings.grid
import typings.reactOwlCarousel.reactOwlCarouselStrings.horizontal
import typings.reactOwlCarousel.reactOwlCarouselStrings.inherit
import typings.reactOwlCarousel.reactOwlCarouselStrings.link
import typings.reactOwlCarousel.reactOwlCarouselStrings.list
import typings.reactOwlCarousel.reactOwlCarouselStrings.listbox
import typings.reactOwlCarousel.reactOwlCarouselStrings.location
import typings.reactOwlCarousel.reactOwlCarouselStrings.menu
import typings.reactOwlCarousel.reactOwlCarouselStrings.mixed
import typings.reactOwlCarousel.reactOwlCarouselStrings.move
import typings.reactOwlCarousel.reactOwlCarouselStrings.no
import typings.reactOwlCarousel.reactOwlCarouselStrings.none
import typings.reactOwlCarousel.reactOwlCarouselStrings.numeric
import typings.reactOwlCarousel.reactOwlCarouselStrings.off
import typings.reactOwlCarousel.reactOwlCarouselStrings.on
import typings.reactOwlCarousel.reactOwlCarouselStrings.other
import typings.reactOwlCarousel.reactOwlCarouselStrings.page
import typings.reactOwlCarousel.reactOwlCarouselStrings.polite
import typings.reactOwlCarousel.reactOwlCarouselStrings.popup
import typings.reactOwlCarousel.reactOwlCarouselStrings.removals
import typings.reactOwlCarousel.reactOwlCarouselStrings.search
import typings.reactOwlCarousel.reactOwlCarouselStrings.spelling
import typings.reactOwlCarousel.reactOwlCarouselStrings.step
import typings.reactOwlCarousel.reactOwlCarouselStrings.tel
import typings.reactOwlCarousel.reactOwlCarouselStrings.text
import typings.reactOwlCarousel.reactOwlCarouselStrings.time
import typings.reactOwlCarousel.reactOwlCarouselStrings.tree
import typings.reactOwlCarousel.reactOwlCarouselStrings.url
import typings.reactOwlCarousel.reactOwlCarouselStrings.vertical
import typings.reactOwlCarousel.reactOwlCarouselStrings.yes
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-owl-carousel.react-owl-carousel/umd/options.Options & react-owl-carousel.react-owl-carousel.ComponentProps */
trait OwlCarouselProps extends js.Object {
  var URLhashListener: js.UndefOr[Boolean] = js.undefined
  val about: js.UndefOr[String] = js.undefined
  val accept: js.UndefOr[String] = js.undefined
  val acceptCharset: js.UndefOr[String] = js.undefined
  val accessKey: js.UndefOr[String] = js.undefined
  val action: js.UndefOr[String] = js.undefined
  val allowFullScreen: js.UndefOr[Boolean] = js.undefined
  val allowTransparency: js.UndefOr[Boolean] = js.undefined
  val alt: js.UndefOr[String] = js.undefined
  var animateIn: js.UndefOr[String | Boolean] = js.undefined
  var animateOut: js.UndefOr[String | Boolean] = js.undefined
  val `aria-activedescendant`: js.UndefOr[String] = js.undefined
  val `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  val `aria-autocomplete`: js.UndefOr[none | `inline` | typings.reactOwlCarousel.reactOwlCarouselStrings.list | both] = js.undefined
  val `aria-busy`: js.UndefOr[Boolean] = js.undefined
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  val `aria-colcount`: js.UndefOr[Double] = js.undefined
  val `aria-colindex`: js.UndefOr[Double] = js.undefined
  val `aria-colspan`: js.UndefOr[Double] = js.undefined
  val `aria-controls`: js.UndefOr[String] = js.undefined
  val `aria-current`: js.UndefOr[
    Boolean | page | typings.reactOwlCarousel.reactOwlCarouselStrings.step | location | date | time
  ] = js.undefined
  val `aria-describedby`: js.UndefOr[String] = js.undefined
  val `aria-details`: js.UndefOr[String] = js.undefined
  val `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  val `aria-errormessage`: js.UndefOr[String] = js.undefined
  val `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  val `aria-flowto`: js.UndefOr[String] = js.undefined
  val `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  val `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  val `aria-label`: js.UndefOr[String] = js.undefined
  val `aria-labelledby`: js.UndefOr[String] = js.undefined
  val `aria-level`: js.UndefOr[Double] = js.undefined
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  val `aria-modal`: js.UndefOr[Boolean] = js.undefined
  val `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  val `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  val `aria-owns`: js.UndefOr[String] = js.undefined
  val `aria-placeholder`: js.UndefOr[String] = js.undefined
  val `aria-posinset`: js.UndefOr[Double] = js.undefined
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  val `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  val `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  val `aria-required`: js.UndefOr[Boolean] = js.undefined
  val `aria-roledescription`: js.UndefOr[String] = js.undefined
  val `aria-rowcount`: js.UndefOr[Double] = js.undefined
  val `aria-rowindex`: js.UndefOr[Double] = js.undefined
  val `aria-rowspan`: js.UndefOr[Double] = js.undefined
  val `aria-selected`: js.UndefOr[Boolean] = js.undefined
  val `aria-setsize`: js.UndefOr[Double] = js.undefined
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  val `aria-valuemax`: js.UndefOr[Double] = js.undefined
  val `aria-valuemin`: js.UndefOr[Double] = js.undefined
  val `aria-valuenow`: js.UndefOr[Double] = js.undefined
  val `aria-valuetext`: js.UndefOr[String] = js.undefined
  val as: js.UndefOr[String] = js.undefined
  val async: js.UndefOr[Boolean] = js.undefined
  val autoCapitalize: js.UndefOr[String] = js.undefined
  val autoComplete: js.UndefOr[String] = js.undefined
  val autoCorrect: js.UndefOr[String] = js.undefined
  val autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoHeightClass: js.UndefOr[String] = js.undefined
  val autoPlay: js.UndefOr[Boolean] = js.undefined
  val autoSave: js.UndefOr[String] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplayHoverPause: js.UndefOr[Boolean] = js.undefined
  var autoplaySpeed: js.UndefOr[Double | Boolean] = js.undefined
  var autoplayTimeout: js.UndefOr[Double] = js.undefined
  var callbacks: js.UndefOr[Boolean] = js.undefined
  val capture: js.UndefOr[Boolean | String] = js.undefined
  val cellPadding: js.UndefOr[Double | String] = js.undefined
  val cellSpacing: js.UndefOr[Double | String] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  val challenge: js.UndefOr[String] = js.undefined
  val charSet: js.UndefOr[String] = js.undefined
  val checked: js.UndefOr[Boolean] = js.undefined
  val children: js.UndefOr[ReactNode] = js.undefined
  val cite: js.UndefOr[String] = js.undefined
  val classID: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val colSpan: js.UndefOr[Double] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val cols: js.UndefOr[Double] = js.undefined
  val content: js.UndefOr[String] = js.undefined
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  val contextMenu: js.UndefOr[String] = js.undefined
  val controls: js.UndefOr[Boolean] = js.undefined
  var controlsClass: js.UndefOr[String] = js.undefined
  val coords: js.UndefOr[String] = js.undefined
  val crossOrigin: js.UndefOr[String] = js.undefined
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  val data: js.UndefOr[String] = js.undefined
  val datatype: js.UndefOr[String] = js.undefined
  val dateTime: js.UndefOr[String] = js.undefined
  val default: js.UndefOr[Boolean] = js.undefined
  val defaultChecked: js.UndefOr[Boolean] = js.undefined
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  val defer: js.UndefOr[Boolean] = js.undefined
  val dir: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  var dotClass: js.UndefOr[String] = js.undefined
  var dotData: js.UndefOr[Boolean] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var dotsClass: js.UndefOr[String] = js.undefined
  var dotsContainer: js.UndefOr[String | Boolean] = js.undefined
  var dotsEach: js.UndefOr[Double | Boolean] = js.undefined
  var dotsSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val download: js.UndefOr[js.Any] = js.undefined
  var dragClass: js.UndefOr[String] = js.undefined
  var dragEndSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val draggable: js.UndefOr[Booleanish] = js.undefined
  val encType: js.UndefOr[String] = js.undefined
  var fallbackEasing: js.UndefOr[String] = js.undefined
  var fluidSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val form: js.UndefOr[String] = js.undefined
  val formAction: js.UndefOr[String] = js.undefined
  val formEncType: js.UndefOr[String] = js.undefined
  val formMethod: js.UndefOr[String] = js.undefined
  val formNoValidate: js.UndefOr[Boolean] = js.undefined
  val formTarget: js.UndefOr[String] = js.undefined
  val frameBorder: js.UndefOr[Double | String] = js.undefined
  var freeDrag: js.UndefOr[Boolean] = js.undefined
  var grabClass: js.UndefOr[String] = js.undefined
  val headers: js.UndefOr[String] = js.undefined
  val height: js.UndefOr[Double | String] = js.undefined
  val hidden: js.UndefOr[Boolean] = js.undefined
  val high: js.UndefOr[Double] = js.undefined
  val href: js.UndefOr[String] = js.undefined
  val hrefLang: js.UndefOr[String] = js.undefined
  val htmlFor: js.UndefOr[String] = js.undefined
  val httpEquiv: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[HandlerCallback] = js.undefined
  val inlist: js.UndefOr[js.Any] = js.undefined
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  val integrity: js.UndefOr[String] = js.undefined
  val is: js.UndefOr[String] = js.undefined
  var itemElement: js.UndefOr[String] = js.undefined
  val itemID: js.UndefOr[String] = js.undefined
  val itemProp: js.UndefOr[String] = js.undefined
  val itemRef: js.UndefOr[String] = js.undefined
  val itemScope: js.UndefOr[Boolean] = js.undefined
  val itemType: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[Double] = js.undefined
  val keyParams: js.UndefOr[String] = js.undefined
  val keyType: js.UndefOr[String] = js.undefined
  val kind: js.UndefOr[String] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val lang: js.UndefOr[String] = js.undefined
  var lazyContent: js.UndefOr[Boolean] = js.undefined
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  val list: js.UndefOr[String] = js.undefined
  var loadedClass: js.UndefOr[String] = js.undefined
  var loadingClass: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  val low: js.UndefOr[Double] = js.undefined
  val manifest: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  val marginHeight: js.UndefOr[Double] = js.undefined
  val marginWidth: js.UndefOr[Double] = js.undefined
  val max: js.UndefOr[Double | String] = js.undefined
  val maxLength: js.UndefOr[Double] = js.undefined
  val media: js.UndefOr[String] = js.undefined
  val mediaGroup: js.UndefOr[String] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
  var mergeFit: js.UndefOr[Boolean] = js.undefined
  val method: js.UndefOr[String] = js.undefined
  val min: js.UndefOr[Double | String] = js.undefined
  val minLength: js.UndefOr[Double] = js.undefined
  var mouseDrag: js.UndefOr[Boolean] = js.undefined
  val multiple: js.UndefOr[Boolean] = js.undefined
  val muted: js.UndefOr[Boolean] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var nav: js.UndefOr[Boolean] = js.undefined
  var navClass: js.UndefOr[js.Array[String]] = js.undefined
  var navContainer: js.UndefOr[String | Boolean] = js.undefined
  var navContainerClass: js.UndefOr[String] = js.undefined
  var navElement: js.UndefOr[String] = js.undefined
  var navSpeed: js.UndefOr[Double | Boolean] = js.undefined
  var navText: js.UndefOr[js.Array[String]] = js.undefined
  var nestedItemSelector: js.UndefOr[String] = js.undefined
  val noValidate: js.UndefOr[Boolean] = js.undefined
  val nonce: js.UndefOr[String] = js.undefined
  val onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  val onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  val onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  val onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onChange: js.UndefOr[HandlerCallback with FormEventHandler[HTMLDivElement]] = js.undefined
  var onChanged: js.UndefOr[HandlerCallback] = js.undefined
  val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onDrag: js.UndefOr[HandlerCallback with DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  var onDragged: js.UndefOr[HandlerCallback] = js.undefined
  val onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  var onInitialize: js.UndefOr[HandlerCallback] = js.undefined
  var onInitialized: js.UndefOr[HandlerCallback] = js.undefined
  val onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  val onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onLoadLazy: js.UndefOr[HandlerCallback] = js.undefined
  val onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onLoadedLazy: js.UndefOr[HandlerCallback] = js.undefined
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  val onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onPlayVideo: js.UndefOr[HandlerCallback] = js.undefined
  val onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onRefresh: js.UndefOr[HandlerCallback] = js.undefined
  var onRefreshed: js.UndefOr[HandlerCallback] = js.undefined
  val onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  var onResize: js.UndefOr[HandlerCallback] = js.undefined
  var onResized: js.UndefOr[HandlerCallback] = js.undefined
  val onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
  val onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onStopVideo: js.UndefOr[HandlerCallback] = js.undefined
  val onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
  var onTranslate: js.UndefOr[HandlerCallback] = js.undefined
  var onTranslated: js.UndefOr[HandlerCallback] = js.undefined
  val onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
  val open: js.UndefOr[Boolean] = js.undefined
  val optimum: js.UndefOr[Double] = js.undefined
  val pattern: js.UndefOr[String] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val playsInline: js.UndefOr[Boolean] = js.undefined
  val poster: js.UndefOr[String] = js.undefined
  val prefix: js.UndefOr[String] = js.undefined
  val preload: js.UndefOr[String] = js.undefined
  val property: js.UndefOr[String] = js.undefined
  var pullDrag: js.UndefOr[Boolean] = js.undefined
  val radioGroup: js.UndefOr[String] = js.undefined
  val readOnly: js.UndefOr[Boolean] = js.undefined
  var refreshClass: js.UndefOr[String] = js.undefined
  val rel: js.UndefOr[String] = js.undefined
  val required: js.UndefOr[Boolean] = js.undefined
  val resource: js.UndefOr[String] = js.undefined
  var responsive: js.UndefOr[StringDictionary[Options]] = js.undefined
  var responsiveBaseElement: js.UndefOr[Element] = js.undefined
  var responsiveClass: js.UndefOr[String | Boolean] = js.undefined
  var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
  val results: js.UndefOr[Double] = js.undefined
  val reversed: js.UndefOr[Boolean] = js.undefined
  var rewind: js.UndefOr[Boolean] = js.undefined
  val role: js.UndefOr[String] = js.undefined
  val rowSpan: js.UndefOr[Double] = js.undefined
  val rows: js.UndefOr[Double] = js.undefined
  var rtlClass: js.UndefOr[String] = js.undefined
  val sandbox: js.UndefOr[String] = js.undefined
  val scope: js.UndefOr[String] = js.undefined
  val scoped: js.UndefOr[Boolean] = js.undefined
  val scrolling: js.UndefOr[String] = js.undefined
  val seamless: js.UndefOr[Boolean] = js.undefined
  val security: js.UndefOr[String] = js.undefined
  val selected: js.UndefOr[Boolean] = js.undefined
  val shape: js.UndefOr[String] = js.undefined
  val size: js.UndefOr[Double] = js.undefined
  val sizes: js.UndefOr[String] = js.undefined
  var slideBy: js.UndefOr[Double | String] = js.undefined
  val slot: js.UndefOr[String] = js.undefined
  var smartSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val span: js.UndefOr[Double] = js.undefined
  val spellCheck: js.UndefOr[Booleanish] = js.undefined
  val src: js.UndefOr[String] = js.undefined
  val srcDoc: js.UndefOr[String] = js.undefined
  val srcLang: js.UndefOr[String] = js.undefined
  val srcSet: js.UndefOr[String] = js.undefined
  var stageClass: js.UndefOr[String] = js.undefined
  var stageElement: js.UndefOr[String] = js.undefined
  var stageOuterClass: js.UndefOr[String] = js.undefined
  var stagePadding: js.UndefOr[Double] = js.undefined
  val start: js.UndefOr[Double] = js.undefined
  var startPosition: js.UndefOr[Double | String] = js.undefined
  val step: js.UndefOr[Double | String] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val summary: js.UndefOr[String] = js.undefined
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  val tabIndex: js.UndefOr[Double] = js.undefined
  val target: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  var touchDrag: js.UndefOr[Boolean] = js.undefined
  val translate: js.UndefOr[yes | no] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  val typeof: js.UndefOr[String] = js.undefined
  val unselectable: js.UndefOr[on | off] = js.undefined
  val useMap: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
  var videoHeight: js.UndefOr[Double | Boolean] = js.undefined
  var videoWidth: js.UndefOr[Double | Boolean] = js.undefined
  val vocab: js.UndefOr[String] = js.undefined
  val width: js.UndefOr[Double | String] = js.undefined
  val wmode: js.UndefOr[String] = js.undefined
  val wrap: js.UndefOr[String] = js.undefined
}

object OwlCarouselProps {
  @scala.inline
  def apply(
    URLhashListener: js.UndefOr[Boolean] = js.undefined,
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    animateIn: String | Boolean = null,
    animateOut: String | Boolean = null,
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
    as: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoHeightClass: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayHoverPause: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Double | Boolean = null,
    autoplayTimeout: js.UndefOr[Double] = js.undefined,
    callbacks: js.UndefOr[Boolean] = js.undefined,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    cite: String = null,
    classID: String = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    color: String = null,
    cols: js.UndefOr[Double] = js.undefined,
    content: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsClass: String = null,
    coords: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: Html = null,
    data: String = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotClass: String = null,
    dotData: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    dotsContainer: String | Boolean = null,
    dotsEach: Double | Boolean = null,
    dotsSpeed: Double | Boolean = null,
    download: js.Any = null,
    dragClass: String = null,
    dragEndSpeed: Double | Boolean = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    encType: String = null,
    fallbackEasing: String = null,
    fluidSpeed: Double | Boolean = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    freeDrag: js.UndefOr[Boolean] = js.undefined,
    grabClass: String = null,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: js.UndefOr[Double] = js.undefined,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    info: /* repeated */ js.Any => Unit = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemElement: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    items: js.UndefOr[Double] = js.undefined,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    lazyContent: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    list: String = null,
    loadedClass: String = null,
    loadingClass: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    manifest: String = null,
    margin: js.UndefOr[Double] = js.undefined,
    marginHeight: js.UndefOr[Double] = js.undefined,
    marginWidth: js.UndefOr[Double] = js.undefined,
    max: Double | String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    media: String = null,
    mediaGroup: String = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    mergeFit: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    min: Double | String = null,
    minLength: js.UndefOr[Double] = js.undefined,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nav: js.UndefOr[Boolean] = js.undefined,
    navClass: js.Array[String] = null,
    navContainer: String | Boolean = null,
    navContainerClass: String = null,
    navElement: String = null,
    navSpeed: Double | Boolean = null,
    navText: js.Array[String] = null,
    nestedItemSelector: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLDivElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLDivElement] => Unit = null,
    onBlur: FocusEvent[HTMLDivElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onChange: HandlerCallback with FormEventHandler[HTMLDivElement] = null,
    onChanged: /* repeated */ js.Any => Unit = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLDivElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLDivElement] => Unit = null,
    onCut: ClipboardEvent[HTMLDivElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onDrag: HandlerCallback with DragEventHandler[HTMLDivElement] = null,
    onDragEnd: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnter: DragEvent[HTMLDivElement] => Unit = null,
    onDragExit: DragEvent[HTMLDivElement] => Unit = null,
    onDragLeave: DragEvent[HTMLDivElement] => Unit = null,
    onDragOver: DragEvent[HTMLDivElement] => Unit = null,
    onDragStart: DragEvent[HTMLDivElement] => Unit = null,
    onDragged: /* repeated */ js.Any => Unit = null,
    onDrop: DragEvent[HTMLDivElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLDivElement] => Unit = null,
    onInitialize: /* repeated */ js.Any => Unit = null,
    onInitialized: /* repeated */ js.Any => Unit = null,
    onInput: FormEvent[HTMLDivElement] => Unit = null,
    onInvalid: FormEvent[HTMLDivElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLDivElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onLoadLazy: /* repeated */ js.Any => Unit = null,
    onLoadStart: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onLoadedLazy: /* repeated */ js.Any => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLDivElement] => Unit = null,
    onPause: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onPlayVideo: /* repeated */ js.Any => Unit = null,
    onPlaying: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLDivElement] => Unit = null
  ): OwlCarouselProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(URLhashListener)) __obj.updateDynamic("URLhashListener")(URLhashListener.get.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
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
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (autoHeightClass != null) __obj.updateDynamic("autoHeightClass")(autoHeightClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause.get.asInstanceOf[js.Any])
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayTimeout)) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(callbacks)) __obj.updateDynamic("callbacks")(callbacks.get.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (controlsClass != null) __obj.updateDynamic("controlsClass")(controlsClass.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dotClass != null) __obj.updateDynamic("dotClass")(dotClass.asInstanceOf[js.Any])
    if (!js.isUndefined(dotData)) __obj.updateDynamic("dotData")(dotData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (dotsContainer != null) __obj.updateDynamic("dotsContainer")(dotsContainer.asInstanceOf[js.Any])
    if (dotsEach != null) __obj.updateDynamic("dotsEach")(dotsEach.asInstanceOf[js.Any])
    if (dotsSpeed != null) __obj.updateDynamic("dotsSpeed")(dotsSpeed.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (dragEndSpeed != null) __obj.updateDynamic("dragEndSpeed")(dragEndSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (fallbackEasing != null) __obj.updateDynamic("fallbackEasing")(fallbackEasing.asInstanceOf[js.Any])
    if (fluidSpeed != null) __obj.updateDynamic("fluidSpeed")(fluidSpeed.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.get.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(freeDrag)) __obj.updateDynamic("freeDrag")(freeDrag.get.asInstanceOf[js.Any])
    if (grabClass != null) __obj.updateDynamic("grabClass")(grabClass.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyContent)) __obj.updateDynamic("lazyContent")(lazyContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.get.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (loadedClass != null) __obj.updateDynamic("loadedClass")(loadedClass.asInstanceOf[js.Any])
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginHeight)) __obj.updateDynamic("marginHeight")(marginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginWidth)) __obj.updateDynamic("marginWidth")(marginWidth.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeFit)) __obj.updateDynamic("mergeFit")(mergeFit.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.get.asInstanceOf[js.Any])
    if (navClass != null) __obj.updateDynamic("navClass")(navClass.asInstanceOf[js.Any])
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (navContainerClass != null) __obj.updateDynamic("navContainerClass")(navContainerClass.asInstanceOf[js.Any])
    if (navElement != null) __obj.updateDynamic("navElement")(navElement.asInstanceOf[js.Any])
    if (navSpeed != null) __obj.updateDynamic("navSpeed")(navSpeed.asInstanceOf[js.Any])
    if (navText != null) __obj.updateDynamic("navText")(navText.asInstanceOf[js.Any])
    if (nestedItemSelector != null) __obj.updateDynamic("nestedItemSelector")(nestedItemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragged != null) __obj.updateDynamic("onDragged")(js.Any.fromFunction1(onDragged))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInitialize != null) __obj.updateDynamic("onInitialize")(js.Any.fromFunction1(onInitialize))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadLazy != null) __obj.updateDynamic("onLoadLazy")(js.Any.fromFunction1(onLoadLazy))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedLazy != null) __obj.updateDynamic("onLoadedLazy")(js.Any.fromFunction1(onLoadedLazy))
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
    if (onPlayVideo != null) __obj.updateDynamic("onPlayVideo")(js.Any.fromFunction1(onPlayVideo))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    __obj.asInstanceOf[OwlCarouselProps]
  }
}

