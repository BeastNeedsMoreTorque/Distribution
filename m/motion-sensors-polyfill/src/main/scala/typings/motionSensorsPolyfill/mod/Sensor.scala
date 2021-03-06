package typings.motionSensorsPolyfill.mod

import typings.std.DOMHighResTimeStamp
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("motion-sensors-polyfill", "Sensor")
@js.native
class Sensor () extends EventTarget {
  val activated: Boolean = js.native
  val hasReading: Boolean = js.native
  @JSName("onactivate")
  var onactivate_Original: EventHandler = js.native
  @JSName("onerror")
  var onerror_Original: EventHandler = js.native
  @JSName("onreading")
  var onreading_Original: EventHandler = js.native
  val timestamp: js.UndefOr[DOMHighResTimeStamp] = js.native
  def onactivate(event: Event): Unit = js.native
  def onerror(event: Event): Unit = js.native
  def onreading(event: Event): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

