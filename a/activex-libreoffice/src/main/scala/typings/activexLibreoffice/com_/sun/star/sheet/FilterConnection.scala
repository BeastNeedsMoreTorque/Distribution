package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify how two conditions in a filter descriptor are connected. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait FilterConnection extends js.Object

object FilterConnection {
  /** both conditions have to be fulfilled. */
  @scala.inline
  def AND: `0` = 0.asInstanceOf[`0`]
  /** at least one of the conditions has to be fulfilled. */
  @scala.inline
  def OR: `1` = 1.asInstanceOf[`1`]
}

