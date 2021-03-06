package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Split extends js.Object {
  /**
    * Blurs the current editor.
    **/
  def blur(): Unit
  /**
    * Focuses the current editor.
    **/
  def focus(): Unit
  /**
    * Executes `callback` on all of the available editors.
    * @param callback A callback function to execute
    * @param scope The default scope for the callback
    **/
  def forEach(callback: js.Function, scope: String): Unit
  /**
    * Returns the current editor.
    **/
  def getCurrentEditor(): Editor
  /**
    * Returns the editor identified by the index `idx`.
    * @param idx The index of the editor you want
    **/
  def getEditor(idx: Double): Unit
  /**
    * Returns the orientation.
    **/
  def getOrientation(): Double
  /**
    * Returns the number of splits.
    **/
  def getSplits(): Double
  /**
    * Resizes the editor.
    **/
  def resize(): Unit
  /**
    * Sets the font size, in pixels, for all the available editors.
    * @param size The new font size
    **/
  def setFontSize(size: Double): Unit
  /**
    * Sets the keyboard handler for the editor.
    * @param keybinding
    **/
  def setKeyboardHandler(keybinding: String): Unit
  /**
    * Sets the orientation.
    * @param orientation The new orientation value
    **/
  def setOrientation(orientation: Double): Unit
  /**
    * Sets a new [[EditSession `EditSession`]] for the indicated editor.
    * @param session The new edit session
    * @param idx The editor's index you're interested in
    **/
  def setSession(session: IEditSession, idx: Double): Unit
  /**
    * Sets a theme for each of the available editors.
    * @param theme The name of the theme to set
    **/
  def setTheme(theme: String): Unit
}

object Split {
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    forEach: (js.Function, String) => Unit,
    getCurrentEditor: () => Editor,
    getEditor: Double => Unit,
    getOrientation: () => Double,
    getSplits: () => Double,
    resize: () => Unit,
    setFontSize: Double => Unit,
    setKeyboardHandler: String => Unit,
    setOrientation: Double => Unit,
    setSession: (IEditSession, Double) => Unit,
    setTheme: String => Unit
  ): Split = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), forEach = js.Any.fromFunction2(forEach), getCurrentEditor = js.Any.fromFunction0(getCurrentEditor), getEditor = js.Any.fromFunction1(getEditor), getOrientation = js.Any.fromFunction0(getOrientation), getSplits = js.Any.fromFunction0(getSplits), resize = js.Any.fromFunction0(resize), setFontSize = js.Any.fromFunction1(setFontSize), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler), setOrientation = js.Any.fromFunction1(setOrientation), setSession = js.Any.fromFunction2(setSession), setTheme = js.Any.fromFunction1(setTheme))
    __obj.asInstanceOf[Split]
  }
}

