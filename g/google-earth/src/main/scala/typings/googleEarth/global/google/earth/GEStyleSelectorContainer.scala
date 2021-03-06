package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEStyleSelectorContainer")
@js.native
class GEStyleSelectorContainer ()
  extends typings.googleEarth.google.earth.GESchemaObjectContainer[typings.googleEarth.google.earth.KmlStyleSelector] {
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  /* CompleteClass */
  override def appendChild(`object`: typings.googleEarth.google.earth.KmlStyleSelector): Unit = js.native
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  /* CompleteClass */
  override def getChildNodes(): typings.googleEarth.google.earth.KmlObjectList[typings.googleEarth.google.earth.KmlStyleSelector] = js.native
  /**
    * First child in the list of objects.
    */
  /* CompleteClass */
  override def getFirstChild(): typings.googleEarth.google.earth.KmlStyleSelector = js.native
  /**
    * Last child in the list of objects.
    */
  /* CompleteClass */
  override def getLastChild(): typings.googleEarth.google.earth.KmlStyleSelector = js.native
  /**
    * Returns true if the container is not empty.
    */
  /* CompleteClass */
  override def hasChildNodes(): Boolean = js.native
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  /* CompleteClass */
  override def insertBefore(
    newChild: typings.googleEarth.google.earth.KmlStyleSelector,
    refChild: typings.googleEarth.google.earth.KmlStyleSelector
  ): Unit = js.native
  /**
    * Removes a node from the list of children of a specified object.
    */
  /* CompleteClass */
  override def removeChild(oldChild: typings.googleEarth.google.earth.KmlStyleSelector): Unit = js.native
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  /* CompleteClass */
  override def replaceChild(
    newChild: typings.googleEarth.google.earth.KmlStyleSelector,
    oldChild: typings.googleEarth.google.earth.KmlStyleSelector
  ): Unit = js.native
}

