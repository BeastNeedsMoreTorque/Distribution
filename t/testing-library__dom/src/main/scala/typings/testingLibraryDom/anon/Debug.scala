package typings.testingLibraryDom.anon

import typings.prettyFormat.mod.OptionsReceived
import typings.std.Element
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  /**
    * Convenience function for `pretty-dom` which also allows an array
    * of elements
    */
  def debug(): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: Element): Unit = js.native
  def debug(element: Element, maxLength: Double): Unit = js.native
  def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: HTMLDocument): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
}

