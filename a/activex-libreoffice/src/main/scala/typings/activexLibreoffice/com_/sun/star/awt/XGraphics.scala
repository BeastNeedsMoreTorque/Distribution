package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the basic output operation of a device. */
trait XGraphics extends XInterface {
  /** returns the device of this graphics. */
  val Device: XDevice
  /** returns the font metric of the current font. */
  val FontMetric: SimpleFontMetric
  /** copies a rectangle of pixels from another device into this one. */
  def copy(
    xSource: XDevice,
    nSourceX: Double,
    nSourceY: Double,
    nSourceWidth: Double,
    nSourceHeight: Double,
    nDestX: Double,
    nDestY: Double,
    nDestWidth: Double,
    nDestHeight: Double
  ): Unit
  /** draws a part of the specified bitmap to the output device. */
  def draw(
    xBitmapHandle: XDisplayBitmap,
    SourceX: Double,
    SourceY: Double,
    SourceWidth: Double,
    SourceHeight: Double,
    DestX: Double,
    DestY: Double,
    DestWidth: Double,
    DestHeight: Double
  ): Unit
  /** draws an arc (part of a circle) in the output device. */
  def drawArc(
    X: Double,
    Y: Double,
    Width: Double,
    Height: Double,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit
  /**
    * draws a chord of a circular area in the output device.
    *
    * A chord is a segment of a circle. You get two chords from a circle if you intersect the circle with a straight line joining two points on the circle.
    */
  def drawChord(
    nX: Double,
    nY: Double,
    nWidth: Double,
    nHeight: Double,
    nX1: Double,
    nY1: Double,
    nX2: Double,
    nY2: Double
  ): Unit
  /** draws an ellipse in the output device. */
  def drawEllipse(X: Double, Y: Double, Width: Double, Height: Double): Unit
  /** draws a color dispersion in the output device. */
  def drawGradient(nX: Double, nY: Double, nWidth: Double, Height: Double, aGradient: Gradient): Unit
  /** draws a line in the output device. */
  def drawLine(X1: Double, Y1: Double, X2: Double, Y2: Double): Unit
  /** draws a circular area in the output device. */
  def drawPie(
    X: Double,
    Y: Double,
    Width: Double,
    Height: Double,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit
  /** sets a single pixel in the output device. */
  def drawPixel(X: Double, Y: Double): Unit
  /** draws multiple lines in the output device at once. */
  def drawPolyLine(DataX: SeqEquiv[Double], DataY: SeqEquiv[Double]): Unit
  /** draws multiple polygons in the output device at once. */
  def drawPolyPolygon(DataX: SeqEquiv[SeqEquiv[Double]], DataY: SeqEquiv[SeqEquiv[Double]]): Unit
  /** draws a polygon line in the output device. */
  def drawPolygon(DataX: SeqEquiv[Double], DataY: SeqEquiv[Double]): Unit
  /** draws a rectangle in the output device. */
  def drawRect(X: Double, Y: Double, Width: Double, Height: Double): Unit
  /** draws a rectangle with rounded corners in the output device. */
  def drawRoundedRect(X: Double, Y: Double, Width: Double, Height: Double, nHorzRound: Double, nVertRound: Double): Unit
  /** draws text in the output device. */
  def drawText(X: Double, Y: Double, Text: String): Unit
  /** draws texts in the output device using an explicit kerning table. */
  def drawTextArray(X: Double, Y: Double, Text: String, Longs: SeqEquiv[Double]): Unit
  /** returns the device of this graphics. */
  def getDevice(): XDevice
  /** returns the font metric of the current font. */
  def getFontMetric(): SimpleFontMetric
  /** builds the intersection with the current region. */
  def intersectClipRegion(xClipping: XRegion): Unit
  /** restores all previous saved settings. */
  def pop(): Unit
  /** saves all current settings (Font, TextColor, TextFillColor, LineColor, FillColor, RasterOp, ClipRegion). */
  def push(): Unit
  /** creates a new font and sets the font. */
  def selectFont(aDescription: FontDescriptor): Unit
  /** sets the clip region to specified clipping. */
  def setClipRegion(Clipping: XRegion): Unit
  /** sets the fill color. */
  def setFillColor(nColor: Color): Unit
  /** sets the font used by text operations. */
  def setFont(xNewFont: XFont): Unit
  /** sets the line color. */
  def setLineColor(nColor: Color): Unit
  /**
    * sets the raster operation.
    *
    * If the device does not support raster operations then this call is ignored.
    */
  def setRasterOp(ROP: RasterOperation): Unit
  /** sets the text color used by text operations. */
  def setTextColor(nColor: Color): Unit
  /** sets the fill color used by text operations. */
  def setTextFillColor(nColor: Color): Unit
}

object XGraphics {
  @scala.inline
  def apply(
    Device: XDevice,
    FontMetric: SimpleFontMetric,
    acquire: () => Unit,
    copy: (XDevice, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    draw: (XDisplayBitmap, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawChord: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawEllipse: (Double, Double, Double, Double) => Unit,
    drawGradient: (Double, Double, Double, Double, Gradient) => Unit,
    drawLine: (Double, Double, Double, Double) => Unit,
    drawPie: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawPixel: (Double, Double) => Unit,
    drawPolyLine: (SeqEquiv[Double], SeqEquiv[Double]) => Unit,
    drawPolyPolygon: (SeqEquiv[SeqEquiv[Double]], SeqEquiv[SeqEquiv[Double]]) => Unit,
    drawPolygon: (SeqEquiv[Double], SeqEquiv[Double]) => Unit,
    drawRect: (Double, Double, Double, Double) => Unit,
    drawRoundedRect: (Double, Double, Double, Double, Double, Double) => Unit,
    drawText: (Double, Double, String) => Unit,
    drawTextArray: (Double, Double, String, SeqEquiv[Double]) => Unit,
    getDevice: () => XDevice,
    getFontMetric: () => SimpleFontMetric,
    intersectClipRegion: XRegion => Unit,
    pop: () => Unit,
    push: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectFont: FontDescriptor => Unit,
    setClipRegion: XRegion => Unit,
    setFillColor: Color => Unit,
    setFont: XFont => Unit,
    setLineColor: Color => Unit,
    setRasterOp: RasterOperation => Unit,
    setTextColor: Color => Unit,
    setTextFillColor: Color => Unit
  ): XGraphics = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction9(copy), draw = js.Any.fromFunction9(draw), drawArc = js.Any.fromFunction8(drawArc), drawChord = js.Any.fromFunction8(drawChord), drawEllipse = js.Any.fromFunction4(drawEllipse), drawGradient = js.Any.fromFunction5(drawGradient), drawLine = js.Any.fromFunction4(drawLine), drawPie = js.Any.fromFunction8(drawPie), drawPixel = js.Any.fromFunction2(drawPixel), drawPolyLine = js.Any.fromFunction2(drawPolyLine), drawPolyPolygon = js.Any.fromFunction2(drawPolyPolygon), drawPolygon = js.Any.fromFunction2(drawPolygon), drawRect = js.Any.fromFunction4(drawRect), drawRoundedRect = js.Any.fromFunction6(drawRoundedRect), drawText = js.Any.fromFunction3(drawText), drawTextArray = js.Any.fromFunction4(drawTextArray), getDevice = js.Any.fromFunction0(getDevice), getFontMetric = js.Any.fromFunction0(getFontMetric), intersectClipRegion = js.Any.fromFunction1(intersectClipRegion), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction0(push), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction1(selectFont), setClipRegion = js.Any.fromFunction1(setClipRegion), setFillColor = js.Any.fromFunction1(setFillColor), setFont = js.Any.fromFunction1(setFont), setLineColor = js.Any.fromFunction1(setLineColor), setRasterOp = js.Any.fromFunction1(setRasterOp), setTextColor = js.Any.fromFunction1(setTextColor), setTextFillColor = js.Any.fromFunction1(setTextFillColor))
    __obj.asInstanceOf[XGraphics]
  }
}

