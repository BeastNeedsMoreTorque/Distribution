package typings.smoothScrollbar.scrollbarMod

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.anon.PartialScrollToOptions
import typings.smoothScrollbar.anon.PartialSetPositionOptions
import typings.smoothScrollbar.data2dMod.Data2d
import typings.smoothScrollbar.trackMod.TrackController
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scrollbar extends js.Object {
  var bounding: ScrollbarBounding = js.native
  val containerEl: HTMLElement = js.native
  val contentEl: HTMLElement = js.native
  var limit: Data2d = js.native
  var offset: Data2d = js.native
  val options: ScrollbarOptions = js.native
  val parent: Scrollbar | Null = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var size: ScrollbarSize = js.native
  val track: TrackController = js.native
  def addListener(fn: ScrollListener): Unit = js.native
  def addMomentum(x: Double, y: Double): Unit = js.native
  def addTransformableMomentum(x: Double, y: Double, fromEvent: Event): Unit = js.native
  def addTransformableMomentum(x: Double, y: Double, fromEvent: Event, callback: AddTransformableMomentumCallback): Unit = js.native
  def destroy(): Unit = js.native
  def getSize(): ScrollbarSize = js.native
  def isVisible(elem: HTMLElement): Boolean = js.native
  def removeListener(fn: ScrollListener): Unit = js.native
  def scrollIntoView(elem: HTMLElement): Unit = js.native
  def scrollIntoView(elem: HTMLElement, options: PartialScrollIntoViewOpti): Unit = js.native
  def scrollTo(): Unit = js.native
  def scrollTo(x: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, duration: Double, options: PartialScrollToOptions): Unit = js.native
  def setMomentum(x: Double, y: Double): Unit = js.native
  def setPosition(): Unit = js.native
  def setPosition(x: Double): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setPosition(x: Double, y: Double, options: PartialSetPositionOptions): Unit = js.native
  def update(): Unit = js.native
  def updatePluginOptions(pluginName: String): Unit = js.native
  def updatePluginOptions(pluginName: String, options: js.Any): Unit = js.native
}

