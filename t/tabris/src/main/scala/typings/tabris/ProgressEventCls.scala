package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ProgressEvent")
@js.native
class ProgressEventCls protected () extends ProgressEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: ProgressEventInit) = this()
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  /* CompleteClass */
  override val currentTarget: EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  /* CompleteClass */
  override val lengthComputable: Boolean = js.native
  /* CompleteClass */
  override val loaded: Double = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val total: Double = js.native
  /* CompleteClass */
  override val `type`: String = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  /* CompleteClass */
  override def initProgressEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    lengthComputableArg: Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

