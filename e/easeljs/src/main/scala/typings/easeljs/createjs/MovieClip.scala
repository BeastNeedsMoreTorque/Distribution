package typings.easeljs.createjs

import typings.tweenjs.createjs.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovieClip extends Container {
  // properties
  var actionsEnabled: Boolean = js.native
  var autoReset: Boolean = js.native
  var currentFrame: Double = js.native
  var currentLabel: String = js.native
  var duration: Double = js.native
  var frameBounds: js.Array[Rectangle] = js.native
  var framerate: Double = js.native
  var labels: js.Array[js.Object] = js.native
  var loop: Boolean = js.native
  var mode: String = js.native
  var paused: Boolean = js.native
  var startPosition: Double = js.native
  var timeline: Timeline = js.native
  var totalFrames: Double = js.native
  // methods
  def advance(): Unit = js.native
  def advance(time: Double): Unit = js.native
   // not supported
  /**
    * @deprecated - use 'currentLabel' property instead
    */
  def getCurrentLabel(): String = js.native
    // deprecated
  /**
    * @deprecated - use 'labels' property instead
    */
  def getLabels(): js.Array[js.Object] = js.native
  def gotoAndPlay(positionOrLabel: String): Unit = js.native
  def gotoAndPlay(positionOrLabel: Double): Unit = js.native
  def gotoAndStop(positionOrLabel: String): Unit = js.native
  def gotoAndStop(positionOrLabel: Double): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
}

