package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.chart.X3DDefaultSetter
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagram
  extends XDiagram
     with XCoordinateSystemContainer
     with XTitled
     with X3DDefaultSetter {
  /** Draw connection lines for stacked bar charts. */
  var ConnectBars: Boolean
  /** Chart Datatable flags */
  var DataTableHBorder: Boolean
  var DataTableOutline: Boolean
  var DataTableVBorder: Boolean
  var ExternalData: String
  /**
    * If bars of a bar or column chart are attached to different axis, this property determines how to display those. If `TRUE` , the bars are grouped
    * together in one block for each axis, thus they are painted one group over the other.
    *
    * If `FALSE` , the bars are displayed side-by-side, as if they were all attached to the same axis.
    *
    * If all data series of a bar or column chart are attached to only one axis, this property has no effect.
    */
  var GroupBarsPerAxis: Boolean
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see com.sun.star.chart.MissingValueTreatment
    */
  var MissingValueTreatment: Double
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: Double
  /**
    * The attributes {@link RelativePosition} and {@link RelativeSize} should be used for the inner coordinate region without axis labels and without data
    * labels.
    */
  var PosSizeExcludeLabels: Boolean
  /**
    * The position is as a relative position on the page.
    *
    * If a relative position is given the diagram is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: typings.activexLibreoffice.com_.sun.star.chart2.RelativePosition
  /** The size of the diagram as relative size of the page size. */
  var RelativeSize: typings.activexLibreoffice.com_.sun.star.chart2.RelativeSize
  var RightAngledAxes: Boolean
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: Double
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: Double
  /** Sort data points by x values for rendering */
  var SortByXValues: Boolean
  /** Starting angle in degrees for pie charts and doughnut charts. */
  var StartingAngle: Double
}

object Diagram {
  @scala.inline
  def apply(
    ConnectBars: Boolean,
    CoordinateSystems: SafeArray[XCoordinateSystem],
    DataTableHBorder: Boolean,
    DataTableOutline: Boolean,
    DataTableVBorder: Boolean,
    DefaultColorScheme: XColorScheme,
    ExternalData: String,
    Floor: XPropertySet,
    GroupBarsPerAxis: Boolean,
    Legend: XLegend,
    MissingValueTreatment: Double,
    Perspective: Double,
    PosSizeExcludeLabels: Boolean,
    RelativePosition: RelativePosition,
    RelativeSize: RelativeSize,
    RightAngledAxes: Boolean,
    RotationHorizontal: Double,
    RotationVertical: Double,
    SortByXValues: Boolean,
    StartingAngle: Double,
    TitleObject: XTitle,
    Wall: XPropertySet,
    acquire: () => Unit,
    addCoordinateSystem: XCoordinateSystem => Unit,
    getCoordinateSystems: () => SafeArray[XCoordinateSystem],
    getDefaultColorScheme: () => XColorScheme,
    getFloor: () => XPropertySet,
    getLegend: () => XLegend,
    getTitleObject: () => XTitle,
    getWall: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCoordinateSystem: XCoordinateSystem => Unit,
    set3DSettingsToDefault: () => Unit,
    setCoordinateSystems: SeqEquiv[XCoordinateSystem] => Unit,
    setDefaultColorScheme: XColorScheme => Unit,
    setDefaultIllumination: () => Unit,
    setDefaultRotation: () => Unit,
    setDiagramData: (XDataSource, SeqEquiv[PropertyValue]) => Unit,
    setLegend: XLegend => Unit,
    setTitleObject: XTitle => Unit
  ): Diagram = {
    val __obj = js.Dynamic.literal(ConnectBars = ConnectBars.asInstanceOf[js.Any], CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], DataTableHBorder = DataTableHBorder.asInstanceOf[js.Any], DataTableOutline = DataTableOutline.asInstanceOf[js.Any], DataTableVBorder = DataTableVBorder.asInstanceOf[js.Any], DefaultColorScheme = DefaultColorScheme.asInstanceOf[js.Any], ExternalData = ExternalData.asInstanceOf[js.Any], Floor = Floor.asInstanceOf[js.Any], GroupBarsPerAxis = GroupBarsPerAxis.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], MissingValueTreatment = MissingValueTreatment.asInstanceOf[js.Any], Perspective = Perspective.asInstanceOf[js.Any], PosSizeExcludeLabels = PosSizeExcludeLabels.asInstanceOf[js.Any], RelativePosition = RelativePosition.asInstanceOf[js.Any], RelativeSize = RelativeSize.asInstanceOf[js.Any], RightAngledAxes = RightAngledAxes.asInstanceOf[js.Any], RotationHorizontal = RotationHorizontal.asInstanceOf[js.Any], RotationVertical = RotationVertical.asInstanceOf[js.Any], SortByXValues = SortByXValues.asInstanceOf[js.Any], StartingAngle = StartingAngle.asInstanceOf[js.Any], TitleObject = TitleObject.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addCoordinateSystem = js.Any.fromFunction1(addCoordinateSystem), getCoordinateSystems = js.Any.fromFunction0(getCoordinateSystems), getDefaultColorScheme = js.Any.fromFunction0(getDefaultColorScheme), getFloor = js.Any.fromFunction0(getFloor), getLegend = js.Any.fromFunction0(getLegend), getTitleObject = js.Any.fromFunction0(getTitleObject), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCoordinateSystem = js.Any.fromFunction1(removeCoordinateSystem), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setCoordinateSystems = js.Any.fromFunction1(setCoordinateSystems), setDefaultColorScheme = js.Any.fromFunction1(setDefaultColorScheme), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation), setDiagramData = js.Any.fromFunction2(setDiagramData), setLegend = js.Any.fromFunction1(setLegend), setTitleObject = js.Any.fromFunction1(setTitleObject))
    __obj.asInstanceOf[Diagram]
  }
}

