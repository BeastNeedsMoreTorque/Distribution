package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes all graphic properties that are available via the {@link com.sun.star.beans.XPropertySet} interface
  * @see XPropertySet
  */
trait GraphicDescriptor extends XPropertySet {
  /**
    * Indicates that it is a pixel graphic with an alpha channel
    *
    * The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of just querying for the {@link GraphicDescriptor}
    */
  var Alpha: Boolean
  /**
    * Indicates that it is a graphic that consists of several frames that can be played as an animation
    *
    * The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of just querying for the {@link GraphicDescriptor}
    */
  var Animated: Boolean
  /**
    * The number of bits per pixel used for the pixel graphic
    *
    * This property is not available for vector graphics and may not be available for some kinds of pixel graphics
    */
  var BitsPerPixel: Double
  /**
    * The type of the graphic
    * @see GraphicType
    */
  var GraphicType: Double
  /**
    * The MimeType of the loaded graphic
    *
    * The mime can be the original mime type of the graphic source the graphic container was constructed from or it can be the internal mime type
    * image/x-vclgraphic, in which case the original mime type is not available anymore
    *
    * Currently, the following mime types are supported for loaded graphics:
    *
    * erimage/x-targaimage/x-photoshopimage/x-epsimage/x-dxfimage/x-metimage/x-pictimage/x-sgfimage/x-svmimage/x-wmfimage/x-sgvimage/x-emfimage/x-vclgraphic
    */
  var MimeType: String
  /**
    * The Size of the graphic in 100th mm.
    *
    * This property may not be available in case of pixel graphics or if the logical size can not be determined correctly for some formats without loading
    * the whole graphic
    */
  var Size100thMM: Size
  /**
    * The Size of the graphic in pixel.
    *
    * This property may not be available in case of vector graphics or if the pixel size can not be determined correctly for some formats without loading
    * the whole graphic
    */
  var SizePixel: Size
  /**
    * Indicates that it is a transparent graphic
    *
    * This property is always `TRUE` for vector graphics. The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of
    * just querying for the {@link GraphicDescriptor} .
    */
  var Transparent: Boolean
}

object GraphicDescriptor {
  @scala.inline
  def apply(
    Alpha: Boolean,
    Animated: Boolean,
    BitsPerPixel: Double,
    GraphicType: Double,
    MimeType: String,
    PropertySetInfo: XPropertySetInfo,
    Size100thMM: Size,
    SizePixel: Size,
    Transparent: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): GraphicDescriptor = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Animated = Animated.asInstanceOf[js.Any], BitsPerPixel = BitsPerPixel.asInstanceOf[js.Any], GraphicType = GraphicType.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size100thMM = Size100thMM.asInstanceOf[js.Any], SizePixel = SizePixel.asInstanceOf[js.Any], Transparent = Transparent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[GraphicDescriptor]
  }
}

