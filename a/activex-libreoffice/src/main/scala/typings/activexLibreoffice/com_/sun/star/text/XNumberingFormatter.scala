package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports the formatting of numberings in various language environments.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.text.NumberingLevel
  * @version 1.0
  */
trait XNumberingFormatter extends XInterface {
  /** @returns the formatted numbering string according to the given {@link com.sun.star.text.NumberingLevel} and the given {@link com.sun.star.lang.Locale} . */
  def makeNumberingString(aProperties: SeqEquiv[PropertyValue], aLocale: Locale): String
}

object XNumberingFormatter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    makeNumberingString: (SeqEquiv[PropertyValue], Locale) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingFormatter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), makeNumberingString = js.Any.fromFunction2(makeNumberingString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingFormatter]
  }
}

