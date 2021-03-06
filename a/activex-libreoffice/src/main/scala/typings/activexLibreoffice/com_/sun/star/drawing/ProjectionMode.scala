package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines whether the 3D objects are to be drawn in perspective or parallel projection. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ProjectionMode extends js.Object

object ProjectionMode {
  /**
    * the 3D objects are drawn in the parallel projection.
    *
    * This value specifies a flat parallel projection in the specified degree of freedom (X or Y).
    */
  @scala.inline
  def PARALLEL: `0` = 0.asInstanceOf[`0`]
  /** the 3D objects are drawn in the perspective projection. */
  @scala.inline
  def PERSPECTIVE: `1` = 1.asInstanceOf[`1`]
}

