package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enumeration specifies the position of a text inside a shape in relation to the shape.
  * @deprecated Deprecated  This counts for the complete text, not individual lines.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
*/
trait TextAdjust extends js.Object

object TextAdjust {
  /**
    * The text extends from the left to the right edge of the shape.
    *
    * The text extends from the top to the bottom edge of the shape.
    */
  @scala.inline
  def BLOCK: `3` = 3.asInstanceOf[`3`]
  /** The text is centered inside the shape. */
  @scala.inline
  def CENTER: `1` = 1.asInstanceOf[`1`]
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @scala.inline
  def LEFT: `0` = 0.asInstanceOf[`0`]
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @scala.inline
  def RIGHT: `2` = 2.asInstanceOf[`2`]
  /**
    * the bitmap is stretched to fill the area.
    *
    * The text is stretched so that the longest line goes from the left to the right edge of the shape.
    */
  @scala.inline
  def STRETCH: `4` = 4.asInstanceOf[`4`]
}

