package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlStyleMap extends KmlObject {
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyle(): KmlStyle
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyleUrl(): String
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyle(): KmlStyle
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyleUrl(): String
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyle(highlightStyle: KmlStyle): Unit
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyleUrl(highlightStyleUrl: String): Unit
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyle(normalStyle: KmlStyle): Unit
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyleUrl(normalStyleUrl: String): Unit
  /**
    * Sets both placemark styles.
    */
  def setStyle(normalStyle: KmlStyle, highlightStyle: KmlStyle): Unit
  /**
    * Sets both URLs for the placemark style.
    */
  def setUrl(normalStyleUrl: String, highlightStyleUrl: String): Unit
}

object KmlStyleMap {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getHighlightStyle: () => KmlStyle,
    getHighlightStyleUrl: () => String,
    getId: () => String,
    getNormalStyle: () => KmlStyle,
    getNormalStyleUrl: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setHighlightStyle: KmlStyle => Unit,
    setHighlightStyleUrl: String => Unit,
    setNormalStyle: KmlStyle => Unit,
    setNormalStyleUrl: String => Unit,
    setStyle: (KmlStyle, KmlStyle) => Unit,
    setUrl: (String, String) => Unit
  ): KmlStyleMap = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getHighlightStyle = js.Any.fromFunction0(getHighlightStyle), getHighlightStyleUrl = js.Any.fromFunction0(getHighlightStyleUrl), getId = js.Any.fromFunction0(getId), getNormalStyle = js.Any.fromFunction0(getNormalStyle), getNormalStyleUrl = js.Any.fromFunction0(getNormalStyleUrl), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setHighlightStyle = js.Any.fromFunction1(setHighlightStyle), setHighlightStyleUrl = js.Any.fromFunction1(setHighlightStyleUrl), setNormalStyle = js.Any.fromFunction1(setNormalStyle), setNormalStyleUrl = js.Any.fromFunction1(setNormalStyleUrl), setStyle = js.Any.fromFunction2(setStyle), setUrl = js.Any.fromFunction2(setUrl))
    __obj.asInstanceOf[KmlStyleMap]
  }
}

