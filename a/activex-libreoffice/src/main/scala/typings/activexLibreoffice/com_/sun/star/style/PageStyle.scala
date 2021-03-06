package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.text.XTextColumns
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contributes common properties of page styles.
  * @see com.sun.star.text.TextPageStyle
  * @see com.sun.star.sheet.TablePageStyle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.style.PageProperties because var conflicts: UserDefinedAttributes. Inlined BackColor, BackGraphicFilter, BackGraphicLocation, BackGraphicURL, BackTransparent, BorderDistance, BottomBorder, BottomBorderDistance, BottomMargin, FirstIsShared, FooterBackColor, FooterBackGraphicFilter, FooterBackGraphicLocation, FooterBackGraphicURL, FooterBackTransparent, FooterBodyDistance, FooterBorderDistance, FooterBottomBorder, FooterBottomBorderDistance, FooterDynamicSpacing, FooterHeight, FooterIsDynamicHeight, FooterIsOn, FooterIsShared, FooterLeftBorder, FooterLeftBorderDistance, FooterLeftMargin, FooterRightBorder, FooterRightBorderDistance, FooterRightMargin, FooterShadowFormat, FooterText, FooterTextLeft, FooterTextRight, FooterTopBorder, FooterTopBorderDistance, FootnoteHeight, FootnoteLineAdjust, FootnoteLineColor, FootnoteLineDistance, FootnoteLineRelativeWidth, FootnoteLineStyle, FootnoteLineTextDistance, FootnoteLineWeight, GridBaseHeight, GridColor, GridDisplay, GridLines, GridMode, GridPrint, GridRubyBelow, GridRubyHeight, HeaderBackColor, HeaderBackGraphicFilter, HeaderBackGraphicLocation, HeaderBackGraphicURL, HeaderBackTransparent, HeaderBodyDistance, HeaderBorderDistance, HeaderBottomBorder, HeaderBottomBorderDistance, HeaderDynamicSpacing, HeaderHeight, HeaderIsDynamicHeight, HeaderIsOn, HeaderIsShared, HeaderLeftBorder, HeaderLeftBorderDistance, HeaderLeftMargin, HeaderRightBorder, HeaderRightBorderDistance, HeaderRightMargin, HeaderShadowFormat, HeaderText, HeaderTextLeft, HeaderTextRight, HeaderTopBorder, HeaderTopBorderDistance, Height, IsLandscape, LeftBorder, LeftBorderDistance, LeftMargin, NumberingType, PageStyleLayout, PrinterPaperTray, RegisterModeActive, RegisterParagraphStyle, RightBorder, RightBorderDistance, RightMargin, ShadowFormat, Size, TextColumns, TopBorder, TopBorderDistance, TopMargin, Width, WritingMode */ trait PageStyle extends Style {
  /** contains the background color of the page. */
  var BackColor: Color
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: String
  /** determines the location of the background graphic. */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic. */
  var BackGraphicURL: String
  /**
    * determines if the background color is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.BackColor} will not be used.
    */
  var BackTransparent: Boolean
  /** determines the distance of all borders of the page. */
  var BorderDistance: Double
  /** determines the style of the bottom border line of the page. */
  var BottomBorder: BorderLine
  /** determines the bottom border distance of the page. */
  var BottomBorderDistance: Double
  /** determines the bottom margin of the page. */
  var BottomMargin: Double
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: Boolean
  /** contains the color of the background of the footer. */
  var FooterBackColor: Color
  /** contains the filter name of the background graphic in the footer. */
  var FooterBackGraphicFilter: String
  /** determines the location of the background graphic in the footer. */
  var FooterBackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic in the footer. */
  var FooterBackGraphicURL: String
  /** determines if the background of the footer is transparent. */
  var FooterBackTransparent: Boolean
  /** determines the distance between the footer and the body text area. */
  var FooterBodyDistance: Double
  /** contains the distance of all borders of the footer. */
  var FooterBorderDistance: Double
  /** contains the style of the bottom border line of the footer. */
  var FooterBottomBorder: BorderLine
  /** contains the bottom border distance of the footer. */
  var FooterBottomBorderDistance: Double
  /** determines whether to use dynamic spacing in footer or not. */
  var FooterDynamicSpacing: Boolean
  /** determines the height of the footer. */
  var FooterHeight: Double
  /** determines if the height of the footer depends on the content. */
  var FooterIsDynamicHeight: Boolean
  /** determines if a footer is used on the page. */
  var FooterIsOn: Boolean
  /** determines if the footer content on left and right pages is the same. */
  var FooterIsShared: Boolean
  /** contains the style of the left border line of the footer. */
  var FooterLeftBorder: BorderLine
  /** contains the left border distance of the footer. */
  var FooterLeftBorderDistance: Double
  /** determines the left margin of the footer. */
  var FooterLeftMargin: Double
  /** contains the style of the right border line of the footer. */
  var FooterRightBorder: BorderLine
  /** contains the right border distance of the footer. */
  var FooterRightBorderDistance: Double
  /** determines the right margin of the footer. */
  var FooterRightMargin: Double
  /** determines the shadow of the footer. */
  var FooterShadowFormat: ShadowFormat
  /** contains the interface to the text of the footer. */
  var FooterText: XText
  /** contains the interface to the text of the footer of a left page. */
  var FooterTextLeft: XText
  /** contains the interface to the text of the footer of a right page.contains . */
  var FooterTextRight: XText
  /** contains the style of the top border line of the footer. */
  var FooterTopBorder: BorderLine
  /** contains the top border distance of the footer. */
  var FooterTopBorderDistance: Double
  /** contains the maximum height of the footnote area. If set to zero then the height of the current page is used as limit. */
  var FootnoteHeight: Double
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    *
    * com::sun::star::text::HorizontalAdjusts.
    */
  var FootnoteLineAdjust: Double
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color
  /** contains the distance between the footnote area and the separator line between the text and the footnote area. */
  var FootnoteLineDistance: Double
  /** contains the relative width of the separator line between the text and the footnote area. */
  var FootnoteLineRelativeWidth: Double
  /**
    * contains the style of the separator line between the text and the footnote area.
    * @see com.sun.star.style.FootnoteLineStyle for the possible values.
    */
  var FootnoteLineStyle: Double
  /** contains the distance between the text and the separator line between the text and the footnote area. */
  var FootnoteLineTextDistance: Double
  /** contains the weight of the separator line between the text and the footnote area. */
  var FootnoteLineWeight: Double
  /** contains the height of the base text line inside the text grid */
  var GridBaseHeight: Double
  /** contains the display color of the text grid */
  var GridColor: Color
  /** determines whether the text grid lines are visible or not */
  var GridDisplay: Boolean
  /** contains the number of lines in the text grid */
  var GridLines: Double
  /** contains the mode of the text grid (none, lines, ...), as represented by {@link com.sun.star.text.TextGridMode} constants */
  var GridMode: Double
  /** determines whether the text grid lines are printed */
  var GridPrint: Boolean
  /** determines whether the text grid's ruby line is located below or above the base line */
  var GridRubyBelow: Boolean
  /** contains the height of the ruby text line inside the text grid */
  var GridRubyHeight: Double
  /** contains the color of the background of the header. */
  var HeaderBackColor: Color
  /** contains the filter name of the background graphic of the header. */
  var HeaderBackGraphicFilter: String
  /** determines the location of the background graphic of the header. */
  var HeaderBackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic of the header. */
  var HeaderBackGraphicURL: String
  /**
    * determines if the background color of the header is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.HeaderBackColor} will not be used.
    */
  var HeaderBackTransparent: Boolean
  /** determines the distance between the header and the body text area. */
  var HeaderBodyDistance: Double
  /** determines the distance of all borders of the header. */
  var HeaderBorderDistance: Double
  /** determines the style of the bottom border line of the header. */
  var HeaderBottomBorder: BorderLine
  /** determines the bottom border distance of the header. */
  var HeaderBottomBorderDistance: Double
  /** determines whether to use dynamic spacing in header or not. */
  var HeaderDynamicSpacing: Boolean
  /** contains the height of the header. */
  var HeaderHeight: Double
  /** determines if the height of the header depends on the content. */
  var HeaderIsDynamicHeight: Boolean
  /** determines if a header is used on the page. */
  var HeaderIsOn: Boolean
  /** determines if the header content on left and right pages is the same. */
  var HeaderIsShared: Boolean
  /** determines the style of the left border line of the header. */
  var HeaderLeftBorder: BorderLine
  /** determines the left border distance of the header. */
  var HeaderLeftBorderDistance: Double
  /** contains the left margin of the header. */
  var HeaderLeftMargin: Double
  /** determines the style of the right border line of the header. */
  var HeaderRightBorder: BorderLine
  /** determines the right border distance of the header. */
  var HeaderRightBorderDistance: Double
  /** contains the right margin of the header. */
  var HeaderRightMargin: Double
  /** determines the shadow of the header. */
  var HeaderShadowFormat: ShadowFormat
  /** contains the interface to the text of the header. */
  var HeaderText: XText
  /** contains the interface to the text of the header of left pages. */
  var HeaderTextLeft: XText
  /** contains the interface to the text of the header of right pages. */
  var HeaderTextRight: XText
  /** determines the style of the top border line of the header. */
  var HeaderTopBorder: BorderLine
  /** determines the top border distance of the header. */
  var HeaderTopBorderDistance: Double
  /** contains the height of the page. */
  var Height: Double
  /** determines if the page format is landscape. */
  var IsLandscape: Boolean
  /** determines the style of the left border line of the page. */
  var LeftBorder: BorderLine
  /** determines the left border distance of the page. */
  var LeftBorderDistance: Double
  /** determines the left margin of the page. */
  var LeftMargin: Double
  /** determines the default numbering type for this page. */
  var NumberingType: Double
  /** determines the layout of the page. */
  var PageStyleLayout: typings.activexLibreoffice.com_.sun.star.style.PageStyleLayout
  /** contains the name of a paper tray of the selected printer. */
  var PrinterPaperTray: String
  /** determines if the register mode is active on that page. */
  var RegisterModeActive: Boolean
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String
  /** determines the style of the right border line of the page. */
  var RightBorder: BorderLine
  /** determines the right border distance of the page. */
  var RightBorderDistance: Double
  /** determines the right margin of the page. */
  var RightMargin: Double
  /** determines the shadow of the page. */
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
  /** contains the paper size of the page. */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns
  /** determines the style of the top border line of the page. */
  var TopBorder: BorderLine
  /** determines the top border distance of the page. */
  var TopBorderDistance: Double
  /** determines the top margin of the page. */
  var TopMargin: Double
  /** contains the width of the page. */
  var Width: Double
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double
}

object PageStyle {
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    DisplayName: String,
    FirstIsShared: Boolean,
    FollowStyle: String,
    FooterBackColor: Color,
    FooterBackGraphicFilter: String,
    FooterBackGraphicLocation: GraphicLocation,
    FooterBackGraphicURL: String,
    FooterBackTransparent: Boolean,
    FooterBodyDistance: Double,
    FooterBorderDistance: Double,
    FooterBottomBorder: BorderLine,
    FooterBottomBorderDistance: Double,
    FooterDynamicSpacing: Boolean,
    FooterHeight: Double,
    FooterIsDynamicHeight: Boolean,
    FooterIsOn: Boolean,
    FooterIsShared: Boolean,
    FooterLeftBorder: BorderLine,
    FooterLeftBorderDistance: Double,
    FooterLeftMargin: Double,
    FooterRightBorder: BorderLine,
    FooterRightBorderDistance: Double,
    FooterRightMargin: Double,
    FooterShadowFormat: ShadowFormat,
    FooterText: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FooterTopBorder: BorderLine,
    FooterTopBorderDistance: Double,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineStyle: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    GridBaseHeight: Double,
    GridColor: Color,
    GridDisplay: Boolean,
    GridLines: Double,
    GridMode: Double,
    GridPrint: Boolean,
    GridRubyBelow: Boolean,
    GridRubyHeight: Double,
    HeaderBackColor: Color,
    HeaderBackGraphicFilter: String,
    HeaderBackGraphicLocation: GraphicLocation,
    HeaderBackGraphicURL: String,
    HeaderBackTransparent: Boolean,
    HeaderBodyDistance: Double,
    HeaderBorderDistance: Double,
    HeaderBottomBorder: BorderLine,
    HeaderBottomBorderDistance: Double,
    HeaderDynamicSpacing: Boolean,
    HeaderHeight: Double,
    HeaderIsDynamicHeight: Boolean,
    HeaderIsOn: Boolean,
    HeaderIsShared: Boolean,
    HeaderLeftBorder: BorderLine,
    HeaderLeftBorderDistance: Double,
    HeaderLeftMargin: Double,
    HeaderRightBorder: BorderLine,
    HeaderRightBorderDistance: Double,
    HeaderRightMargin: Double,
    HeaderShadowFormat: ShadowFormat,
    HeaderText: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    HeaderTopBorder: BorderLine,
    HeaderTopBorderDistance: Double,
    Height: Double,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsLandscape: Boolean,
    IsPhysical: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Name: String,
    NumberingType: Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PrinterPaperTray: String,
    PropertySetInfo: XPropertySetInfo,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): PageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], FirstIsShared = FirstIsShared.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], FooterBackColor = FooterBackColor.asInstanceOf[js.Any], FooterBackGraphicFilter = FooterBackGraphicFilter.asInstanceOf[js.Any], FooterBackGraphicLocation = FooterBackGraphicLocation.asInstanceOf[js.Any], FooterBackGraphicURL = FooterBackGraphicURL.asInstanceOf[js.Any], FooterBackTransparent = FooterBackTransparent.asInstanceOf[js.Any], FooterBodyDistance = FooterBodyDistance.asInstanceOf[js.Any], FooterBorderDistance = FooterBorderDistance.asInstanceOf[js.Any], FooterBottomBorder = FooterBottomBorder.asInstanceOf[js.Any], FooterBottomBorderDistance = FooterBottomBorderDistance.asInstanceOf[js.Any], FooterDynamicSpacing = FooterDynamicSpacing.asInstanceOf[js.Any], FooterHeight = FooterHeight.asInstanceOf[js.Any], FooterIsDynamicHeight = FooterIsDynamicHeight.asInstanceOf[js.Any], FooterIsOn = FooterIsOn.asInstanceOf[js.Any], FooterIsShared = FooterIsShared.asInstanceOf[js.Any], FooterLeftBorder = FooterLeftBorder.asInstanceOf[js.Any], FooterLeftBorderDistance = FooterLeftBorderDistance.asInstanceOf[js.Any], FooterLeftMargin = FooterLeftMargin.asInstanceOf[js.Any], FooterRightBorder = FooterRightBorder.asInstanceOf[js.Any], FooterRightBorderDistance = FooterRightBorderDistance.asInstanceOf[js.Any], FooterRightMargin = FooterRightMargin.asInstanceOf[js.Any], FooterShadowFormat = FooterShadowFormat.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FooterTopBorder = FooterTopBorder.asInstanceOf[js.Any], FooterTopBorderDistance = FooterTopBorderDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineStyle = FootnoteLineStyle.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], GridBaseHeight = GridBaseHeight.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], GridDisplay = GridDisplay.asInstanceOf[js.Any], GridLines = GridLines.asInstanceOf[js.Any], GridMode = GridMode.asInstanceOf[js.Any], GridPrint = GridPrint.asInstanceOf[js.Any], GridRubyBelow = GridRubyBelow.asInstanceOf[js.Any], GridRubyHeight = GridRubyHeight.asInstanceOf[js.Any], HeaderBackColor = HeaderBackColor.asInstanceOf[js.Any], HeaderBackGraphicFilter = HeaderBackGraphicFilter.asInstanceOf[js.Any], HeaderBackGraphicLocation = HeaderBackGraphicLocation.asInstanceOf[js.Any], HeaderBackGraphicURL = HeaderBackGraphicURL.asInstanceOf[js.Any], HeaderBackTransparent = HeaderBackTransparent.asInstanceOf[js.Any], HeaderBodyDistance = HeaderBodyDistance.asInstanceOf[js.Any], HeaderBorderDistance = HeaderBorderDistance.asInstanceOf[js.Any], HeaderBottomBorder = HeaderBottomBorder.asInstanceOf[js.Any], HeaderBottomBorderDistance = HeaderBottomBorderDistance.asInstanceOf[js.Any], HeaderDynamicSpacing = HeaderDynamicSpacing.asInstanceOf[js.Any], HeaderHeight = HeaderHeight.asInstanceOf[js.Any], HeaderIsDynamicHeight = HeaderIsDynamicHeight.asInstanceOf[js.Any], HeaderIsOn = HeaderIsOn.asInstanceOf[js.Any], HeaderIsShared = HeaderIsShared.asInstanceOf[js.Any], HeaderLeftBorder = HeaderLeftBorder.asInstanceOf[js.Any], HeaderLeftBorderDistance = HeaderLeftBorderDistance.asInstanceOf[js.Any], HeaderLeftMargin = HeaderLeftMargin.asInstanceOf[js.Any], HeaderRightBorder = HeaderRightBorder.asInstanceOf[js.Any], HeaderRightBorderDistance = HeaderRightBorderDistance.asInstanceOf[js.Any], HeaderRightMargin = HeaderRightMargin.asInstanceOf[js.Any], HeaderShadowFormat = HeaderShadowFormat.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], HeaderTopBorder = HeaderTopBorder.asInstanceOf[js.Any], HeaderTopBorderDistance = HeaderTopBorderDistance.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageStyleLayout = PageStyleLayout.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PrinterPaperTray = PrinterPaperTray.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[PageStyle]
  }
}

