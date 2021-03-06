package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** properties that are used for {@link DataSeries} that display symbols. */
trait Symbol extends js.Object {
  /**
    * The color used for drawing the border of symbols.
    *
    * Only effective if {@link Style} is SymbolStyle::AUTO, SymbolStyle::STANDARD or SymbolStyle::POLYGON.
    */
  var BorderColor: Double
  /**
    * The color used for filling symbols that contain closed polygons.
    *
    * Only effective if {@link Style} is SymbolStyle::AUTO, SymbolStyle::STANDARD or SymbolStyle::POLYGON.
    */
  var FillColor: Double
  /** use this graphic as symbol */
  var Graphic: XGraphic
  /** The given polygon is used as symbol. */
  var PolygonCoords: PolyPolygonBezierCoords
  /** The size of the symbol in 100th of a mm. */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  /**
    * Use the nth standard symbol, if {@link Style} is set to SymbolStlye::STANDARD.
    *
    * If n is the number of standard symbols available in an implementation, the symbol number is {@link StandardSymbol} modulo n.
    *
    * The default implementation for example currently uses 8 different standard symbols that are matched to the numbers 0 to 7.
    *
    * {{table here, see documentation}}
    */
  var StandardSymbol: Double
  /** determines which of the following members determines the appearance of the symbol. */
  var Style: SymbolStyle
}

object Symbol {
  @scala.inline
  def apply(
    BorderColor: Double,
    FillColor: Double,
    Graphic: XGraphic,
    PolygonCoords: PolyPolygonBezierCoords,
    Size: Size,
    StandardSymbol: Double,
    Style: SymbolStyle
  ): Symbol = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], PolygonCoords = PolygonCoords.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StandardSymbol = StandardSymbol.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

