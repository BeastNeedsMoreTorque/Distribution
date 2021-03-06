package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** determines which page number is displayed in a page number text field. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait PageNumberType extends js.Object

object PageNumberType {
  /** The number of the current page is displayed. */
  @scala.inline
  def CURRENT: `1` = 1.asInstanceOf[`1`]
  /** The number of the next page is displayed if there is any, otherwise the field is empty. */
  @scala.inline
  def NEXT: `2` = 2.asInstanceOf[`2`]
  /** The number of the previous page is displayed if there is any, otherwise the field is empty. */
  @scala.inline
  def PREV: `0` = 0.asInstanceOf[`0`]
}

