package typings.rax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rax.anon.Html
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T]
  extends // weex
/* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[RaxNode] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onAbortCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAppear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onCanPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onCanPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onCanPlayThrough: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onDisappear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDurationChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onEmptied: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onEmptiedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onEncrypted: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onEncryptedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onEnded: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onEndedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onError: js.UndefOr[RaxEventHandler[T]] = js.undefined
   // also a Media Event
  var onErrorCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInvalidCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadStart: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadStartCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadedData: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadedMetadata: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  // Weex Common Events
  var onLongpress: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onPause: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onPauseCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onPlaying: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onPlayingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onProgress: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onProgressCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onRateChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onRateChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
  var onSeeked: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onSeekedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onSeeking: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onSeekingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onSelectCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onStalled: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onStalledCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onSuspend: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onSuspendCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onTimeUpdate: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  var onVolumeChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onWaiting: js.UndefOr[RaxEventHandler[T]] = js.undefined
  var onWaitingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: js.UndefOr[Null | RaxNode] = js.undefined,
    dangerouslySetInnerHTML: Html = null,
    onAbort: SyntheticEvent[T, Event] => Unit = null,
    onAbortCapture: SyntheticEvent[T, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[T] => Unit = null,
    onAnimationEndCapture: AnimationEvent[T] => Unit = null,
    onAnimationIteration: AnimationEvent[T] => Unit = null,
    onAnimationIterationCapture: AnimationEvent[T] => Unit = null,
    onAnimationStart: AnimationEvent[T] => Unit = null,
    onAnimationStartCapture: AnimationEvent[T] => Unit = null,
    onAppear: AppearEvent[T] => Unit = null,
    onAuxClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onAuxClickCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[T] => Unit = null,
    onBeforeInputCapture: FormEvent[T] => Unit = null,
    onBlur: FocusEvent[T] => Unit = null,
    onBlurCapture: FocusEvent[T] => Unit = null,
    onCanPlay: SyntheticEvent[T, Event] => Unit = null,
    onCanPlayCapture: SyntheticEvent[T, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[T, Event] => Unit = null,
    onCanPlayThroughCapture: SyntheticEvent[T, Event] => Unit = null,
    onChange: FormEvent[T] => Unit = null,
    onChangeCapture: FormEvent[T] => Unit = null,
    onClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onClickCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[T] => Unit = null,
    onCompositionEndCapture: CompositionEvent[T] => Unit = null,
    onCompositionStart: CompositionEvent[T] => Unit = null,
    onCompositionStartCapture: CompositionEvent[T] => Unit = null,
    onCompositionUpdate: CompositionEvent[T] => Unit = null,
    onCompositionUpdateCapture: CompositionEvent[T] => Unit = null,
    onContextMenu: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onContextMenuCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[T] => Unit = null,
    onCopyCapture: ClipboardEvent[T] => Unit = null,
    onCut: ClipboardEvent[T] => Unit = null,
    onCutCapture: ClipboardEvent[T] => Unit = null,
    onDisappear: AppearEvent[T] => Unit = null,
    onDoubleClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onDoubleClickCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[T] => Unit = null,
    onDragCapture: DragEvent[T] => Unit = null,
    onDragEnd: DragEvent[T] => Unit = null,
    onDragEndCapture: DragEvent[T] => Unit = null,
    onDragEnter: DragEvent[T] => Unit = null,
    onDragEnterCapture: DragEvent[T] => Unit = null,
    onDragExit: DragEvent[T] => Unit = null,
    onDragExitCapture: DragEvent[T] => Unit = null,
    onDragLeave: DragEvent[T] => Unit = null,
    onDragLeaveCapture: DragEvent[T] => Unit = null,
    onDragOver: DragEvent[T] => Unit = null,
    onDragOverCapture: DragEvent[T] => Unit = null,
    onDragStart: DragEvent[T] => Unit = null,
    onDragStartCapture: DragEvent[T] => Unit = null,
    onDrop: DragEvent[T] => Unit = null,
    onDropCapture: DragEvent[T] => Unit = null,
    onDurationChange: SyntheticEvent[T, Event] => Unit = null,
    onDurationChangeCapture: SyntheticEvent[T, Event] => Unit = null,
    onEmptied: SyntheticEvent[T, Event] => Unit = null,
    onEmptiedCapture: SyntheticEvent[T, Event] => Unit = null,
    onEncrypted: SyntheticEvent[T, Event] => Unit = null,
    onEncryptedCapture: SyntheticEvent[T, Event] => Unit = null,
    onEnded: SyntheticEvent[T, Event] => Unit = null,
    onEndedCapture: SyntheticEvent[T, Event] => Unit = null,
    onError: SyntheticEvent[T, Event] => Unit = null,
    onErrorCapture: SyntheticEvent[T, Event] => Unit = null,
    onFocus: FocusEvent[T] => Unit = null,
    onFocusCapture: FocusEvent[T] => Unit = null,
    onGotPointerCapture: PointerEvent[T] => Unit = null,
    onGotPointerCaptureCapture: PointerEvent[T] => Unit = null,
    onInput: FormEvent[T] => Unit = null,
    onInputCapture: FormEvent[T] => Unit = null,
    onInvalid: FormEvent[T] => Unit = null,
    onInvalidCapture: FormEvent[T] => Unit = null,
    onKeyDown: KeyboardEvent[T] => Unit = null,
    onKeyDownCapture: KeyboardEvent[T] => Unit = null,
    onKeyPress: KeyboardEvent[T] => Unit = null,
    onKeyPressCapture: KeyboardEvent[T] => Unit = null,
    onKeyUp: KeyboardEvent[T] => Unit = null,
    onKeyUpCapture: KeyboardEvent[T] => Unit = null,
    onLoad: SyntheticEvent[T, Event] => Unit = null,
    onLoadCapture: SyntheticEvent[T, Event] => Unit = null,
    onLoadStart: SyntheticEvent[T, Event] => Unit = null,
    onLoadStartCapture: SyntheticEvent[T, Event] => Unit = null,
    onLoadedData: SyntheticEvent[T, Event] => Unit = null,
    onLoadedDataCapture: SyntheticEvent[T, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[T, Event] => Unit = null,
    onLoadedMetadataCapture: SyntheticEvent[T, Event] => Unit = null,
    onLongpress: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onLostPointerCapture: PointerEvent[T] => Unit = null,
    onLostPointerCaptureCapture: PointerEvent[T] => Unit = null,
    onMouseDown: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseDownCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseMoveCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOutCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOverCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseUpCapture: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[T] => Unit = null,
    onPasteCapture: ClipboardEvent[T] => Unit = null,
    onPause: SyntheticEvent[T, Event] => Unit = null,
    onPauseCapture: SyntheticEvent[T, Event] => Unit = null,
    onPlay: SyntheticEvent[T, Event] => Unit = null,
    onPlayCapture: SyntheticEvent[T, Event] => Unit = null,
    onPlaying: SyntheticEvent[T, Event] => Unit = null,
    onPlayingCapture: SyntheticEvent[T, Event] => Unit = null,
    onPointerCancel: PointerEvent[T] => Unit = null,
    onPointerCancelCapture: PointerEvent[T] => Unit = null,
    onPointerDown: PointerEvent[T] => Unit = null,
    onPointerDownCapture: PointerEvent[T] => Unit = null,
    onPointerEnter: PointerEvent[T] => Unit = null,
    onPointerEnterCapture: PointerEvent[T] => Unit = null,
    onPointerLeave: PointerEvent[T] => Unit = null,
    onPointerLeaveCapture: PointerEvent[T] => Unit = null,
    onPointerMove: PointerEvent[T] => Unit = null,
    onPointerMoveCapture: PointerEvent[T] => Unit = null,
    onPointerOut: PointerEvent[T] => Unit = null,
    onPointerOutCapture: PointerEvent[T] => Unit = null,
    onPointerOver: PointerEvent[T] => Unit = null,
    onPointerOverCapture: PointerEvent[T] => Unit = null,
    onPointerUp: PointerEvent[T] => Unit = null,
    onPointerUpCapture: PointerEvent[T] => Unit = null,
    onProgress: SyntheticEvent[T, Event] => Unit = null,
    onProgressCapture: SyntheticEvent[T, Event] => Unit = null,
    onRateChange: SyntheticEvent[T, Event] => Unit = null,
    onRateChangeCapture: SyntheticEvent[T, Event] => Unit = null,
    onReset: FormEvent[T] => Unit = null,
    onResetCapture: FormEvent[T] => Unit = null,
    onScroll: UIEvent[T] => Unit = null,
    onScrollCapture: UIEvent[T] => Unit = null,
    onSeeked: SyntheticEvent[T, Event] => Unit = null,
    onSeekedCapture: SyntheticEvent[T, Event] => Unit = null,
    onSeeking: SyntheticEvent[T, Event] => Unit = null,
    onSeekingCapture: SyntheticEvent[T, Event] => Unit = null,
    onSelect: SyntheticEvent[T, Event] => Unit = null,
    onSelectCapture: SyntheticEvent[T, Event] => Unit = null,
    onStalled: SyntheticEvent[T, Event] => Unit = null,
    onStalledCapture: SyntheticEvent[T, Event] => Unit = null,
    onSubmit: FormEvent[T] => Unit = null,
    onSubmitCapture: FormEvent[T] => Unit = null,
    onSuspend: SyntheticEvent[T, Event] => Unit = null,
    onSuspendCapture: SyntheticEvent[T, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[T, Event] => Unit = null,
    onTimeUpdateCapture: SyntheticEvent[T, Event] => Unit = null,
    onTouchCancel: TouchEvent[T] => Unit = null,
    onTouchCancelCapture: TouchEvent[T] => Unit = null,
    onTouchEnd: TouchEvent[T] => Unit = null,
    onTouchEndCapture: TouchEvent[T] => Unit = null,
    onTouchMove: TouchEvent[T] => Unit = null,
    onTouchMoveCapture: TouchEvent[T] => Unit = null,
    onTouchStart: TouchEvent[T] => Unit = null,
    onTouchStartCapture: TouchEvent[T] => Unit = null,
    onTransitionEnd: TransitionEvent[T] => Unit = null,
    onTransitionEndCapture: TransitionEvent[T] => Unit = null,
    onVolumeChange: SyntheticEvent[T, Event] => Unit = null,
    onVolumeChangeCapture: SyntheticEvent[T, Event] => Unit = null,
    onWaiting: SyntheticEvent[T, Event] => Unit = null,
    onWaitingCapture: SyntheticEvent[T, Event] => Unit = null,
    onWheel: WheelEvent[T] => Unit = null,
    onWheelCapture: WheelEvent[T] => Unit = null
  ): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1(onAbortCapture))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(onAnimationEndCapture))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(onAnimationIterationCapture))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(onAnimationStartCapture))
    if (onAppear != null) __obj.updateDynamic("onAppear")(js.Any.fromFunction1(onAppear))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(js.Any.fromFunction1(onAuxClickCapture))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(js.Any.fromFunction1(onBeforeInputCapture))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(onCanPlayCapture))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(onCanPlayThroughCapture))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1(onCompositionEndCapture))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1(onCompositionStartCapture))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1(onCompositionUpdateCapture))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1(onCopyCapture))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1(onCutCapture))
    if (onDisappear != null) __obj.updateDynamic("onDisappear")(js.Any.fromFunction1(onDisappear))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(js.Any.fromFunction1(onDoubleClickCapture))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1(onDragExitCapture))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(onDurationChangeCapture))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(onEmptiedCapture))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(js.Any.fromFunction1(onEncryptedCapture))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1(onEndedCapture))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1(onErrorCapture))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1(onGotPointerCapture))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1(onGotPointerCaptureCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1(onInvalidCapture))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(onLoadStartCapture))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(onLoadedDataCapture))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(onLoadedMetadataCapture))
    if (onLongpress != null) __obj.updateDynamic("onLongpress")(js.Any.fromFunction1(onLongpress))
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(js.Any.fromFunction1(onLostPointerCapture))
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1(onLostPointerCaptureCapture))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(onMouseUpCapture))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1(onPasteCapture))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1(onPauseCapture))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1(onPlayCapture))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1(onPlayingCapture))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(onPointerCancelCapture))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(onPointerDownCapture))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(onPointerEnterCapture))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(onPointerLeaveCapture))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(onPointerMoveCapture))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(onPointerOutCapture))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(onPointerOverCapture))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(onPointerUpCapture))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1(onProgressCapture))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(onRateChangeCapture))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1(onSeekedCapture))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1(onSeekingCapture))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1(onSelectCapture))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1(onStalledCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1(onSuspendCapture))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(onTimeUpdateCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1(onTouchCancelCapture))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1(onTouchMoveCapture))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction1(onTouchStartCapture))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1(onTransitionEndCapture))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(onVolumeChangeCapture))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1(onWaitingCapture))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

