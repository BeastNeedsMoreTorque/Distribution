package typings.activexLibreoffice.com_.sun.star.xsd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant decimal type]{@link url="http://www.w3.org/TR/xmlschema-2/#decimal"} */
trait Decimal extends XDataType {
  /**
    * fractionDigits is the maximum number of digits in the fractional part of values of decimal data
    *
    * The value of fractionDigits must be a non negative integer.
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits"}
    */
  var FractionDigits: Double
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveDouble: Double
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveDouble: Double
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveDouble: Double
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveDouble: Double
  /**
    * totalDigits is the maximum number of digits in values of decimal data types.
    *
    * The value of totalDigits must be a positive integer.
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-totalDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-totalDigits"}
    */
  var TotalDigits: Double
}

object Decimal {
  @scala.inline
  def apply(
    FractionDigits: Double,
    IsBasic: scala.Boolean,
    MaxExclusiveDouble: Double,
    MaxInclusiveDouble: Double,
    MinExclusiveDouble: Double,
    MinInclusiveDouble: Double,
    Name: java.lang.String,
    Pattern: java.lang.String,
    PropertySetInfo: XPropertySetInfo,
    TotalDigits: Double,
    TypeClass: Double,
    WhiteSpaceTreatment: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Unit,
    explainInvalid: java.lang.String => java.lang.String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Unit,
    setPropertyValue: (java.lang.String, js.Any) => Unit,
    validate: java.lang.String => scala.Boolean
  ): Decimal = {
    val __obj = js.Dynamic.literal(FractionDigits = FractionDigits.asInstanceOf[js.Any], IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDouble = MaxExclusiveDouble.asInstanceOf[js.Any], MaxInclusiveDouble = MaxInclusiveDouble.asInstanceOf[js.Any], MinExclusiveDouble = MinExclusiveDouble.asInstanceOf[js.Any], MinInclusiveDouble = MinInclusiveDouble.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TotalDigits = TotalDigits.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Decimal]
  }
}

