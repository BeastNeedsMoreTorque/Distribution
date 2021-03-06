package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration defines the type of polygon. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait PolygonKind extends js.Object

object PolygonKind {
  /** This is the PolygonKind for a ClosedFreeHandShape. */
  @scala.inline
  def FREEFILL: `6` = 6.asInstanceOf[`6`]
  /** This is the PolygonKind for an OpenFreeHandShape. */
  @scala.inline
  def FREELINE: `5` = 5.asInstanceOf[`5`]
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @scala.inline
  def LINE: `0` = 0.asInstanceOf[`0`]
  /** This is the PolygonKind for a {@link ClosedBezierShape} . */
  @scala.inline
  def PATHFILL: `4` = 4.asInstanceOf[`4`]
  /** This is the PolygonKind for an {@link OpenBezierShape} . */
  @scala.inline
  def PATHLINE: `3` = 3.asInstanceOf[`3`]
  /** This is the PolygonKind for a PolyLinePathShape. */
  @scala.inline
  def PATHPLIN: `8` = 8.asInstanceOf[`8`]
  /** This is the PolygonKind for a PolyPolygonPathShape. */
  @scala.inline
  def PATHPOLY: `7` = 7.asInstanceOf[`7`]
  /** This is the PolygonKind for a {@link PolyLineShape} . */
  @scala.inline
  def PLIN: `2` = 2.asInstanceOf[`2`]
  /** This is the PolygonKind for a {@link PolyPolygonShape} . */
  @scala.inline
  def POLY: `1` = 1.asInstanceOf[`1`]
}

