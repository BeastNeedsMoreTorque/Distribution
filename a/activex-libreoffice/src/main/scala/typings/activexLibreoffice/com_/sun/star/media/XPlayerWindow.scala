package typings.activexLibreoffice.com_.sun.star.media

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typings.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typings.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interacts with the media player window */
trait XPlayerWindow extends XWindow {
  /** gets the current media ratio. */
  var ZoomLevel: typings.activexLibreoffice.com_.sun.star.media.ZoomLevel
  /** gets the current media ratio. */
  def getZoomLevel(): ZoomLevel
  /**
    * changes the pointer for the player window.
    * @param SystemPointerType a {@link com.sun.star.awt.SystemPointer}
    */
  def setPointerType(SystemPointerType: Double): Unit
  /** changes the zoom of the media played by the window. */
  def setZoomLevel(ZoomLevel: ZoomLevel): Boolean
  /** redraws the player window */
  def update(): Unit
}

object XPlayerWindow {
  @scala.inline
  def apply(
    PosSize: Rectangle,
    ZoomLevel: ZoomLevel,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    dispose: () => Unit,
    getPosSize: () => Rectangle,
    getZoomLevel: () => ZoomLevel,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setPointerType: Double => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit,
    setZoomLevel: ZoomLevel => Boolean,
    update: () => Unit
  ): XPlayerWindow = {
    val __obj = js.Dynamic.literal(PosSize = PosSize.asInstanceOf[js.Any], ZoomLevel = ZoomLevel.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), dispose = js.Any.fromFunction0(dispose), getPosSize = js.Any.fromFunction0(getPosSize), getZoomLevel = js.Any.fromFunction0(getZoomLevel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPointerType = js.Any.fromFunction1(setPointerType), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoomLevel = js.Any.fromFunction1(setZoomLevel), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XPlayerWindow]
  }
}

