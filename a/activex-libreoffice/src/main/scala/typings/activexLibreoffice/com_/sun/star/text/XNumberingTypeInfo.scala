package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the numbering types that are supported by a component.
  *
  * To be able to store unknown numbering types in a file format the numbering types correspond to an identifier.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.style.NumberingType
  * @version 1.0
  */
trait XNumberingTypeInfo extends XInterface {
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  val SupportedNumberingTypes: SafeArray[Double]
  /** returns the corresponding identifier to a numbering type. */
  def getNumberingIdentifier(NumberingType: Double): String
  /** returns the corresponding numbering type to an identifier. */
  def getNumberingType(NumberingIdentifier: String): Double
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  def getSupportedNumberingTypes(): SafeArray[Double]
  /** determines whether an identifier is supported. */
  def hasNumberingType(NumberingIdentifier: String): Boolean
}

object XNumberingTypeInfo {
  @scala.inline
  def apply(
    SupportedNumberingTypes: SafeArray[Double],
    acquire: () => Unit,
    getNumberingIdentifier: Double => String,
    getNumberingType: String => Double,
    getSupportedNumberingTypes: () => SafeArray[Double],
    hasNumberingType: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedNumberingTypes = SupportedNumberingTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumberingIdentifier = js.Any.fromFunction1(getNumberingIdentifier), getNumberingType = js.Any.fromFunction1(getNumberingType), getSupportedNumberingTypes = js.Any.fromFunction0(getSupportedNumberingTypes), hasNumberingType = js.Any.fromFunction1(hasNumberingType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingTypeInfo]
  }
}

