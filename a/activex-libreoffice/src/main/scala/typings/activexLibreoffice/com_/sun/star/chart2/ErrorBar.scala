package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSink
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typings.activexLibreoffice.com_.sun.star.drawing.LineCap
import typings.activexLibreoffice.com_.sun.star.drawing.LineDash
import typings.activexLibreoffice.com_.sun.star.drawing.LineJoint
import typings.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typings.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typings.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBar
  extends XDataSink
     with LineProperties
     with XDataSource {
  /** @see com.sun.star.chart.ErrorBarStyle */
  var ErrorBarStyle: Double
  var NegativeError: Double
  var PositiveError: Double
  var ShowNegativeError: Boolean
  var ShowPositiveError: Boolean
  /** The weight for the standard deviation. */
  var Weight: Double
}

object ErrorBar {
  @scala.inline
  def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    ErrorBarStyle: Double,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    NegativeError: Double,
    PositiveError: Double,
    ShowNegativeError: Boolean,
    ShowPositiveError: Boolean,
    Weight: Double,
    acquire: () => Unit,
    getDataSequences: () => SafeArray[XLabeledDataSequence],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: SeqEquiv[XLabeledDataSequence] => Unit
  ): ErrorBar = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], NegativeError = NegativeError.asInstanceOf[js.Any], PositiveError = PositiveError.asInstanceOf[js.Any], ShowNegativeError = ShowNegativeError.asInstanceOf[js.Any], ShowPositiveError = ShowPositiveError.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[ErrorBar]
  }
}

