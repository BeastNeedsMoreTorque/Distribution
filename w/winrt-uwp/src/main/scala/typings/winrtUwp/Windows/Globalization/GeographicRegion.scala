package typings.winrtUwp.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a region. This is usually a country, but may be a macroregion. */
trait GeographicRegion extends js.Object {
  /** Gets the string that contains the best available identifier that represents the region. */
  var code: String
  /** Gets the three-digit identifier for this region, as a string. */
  var codeThreeDigit: String
  /** Gets the three-letter identifier for this region. */
  var codeThreeLetter: String
  /** Gets the two-letter identifier for this region. */
  var codeTwoLetter: String
  /** Gets the set of currencies in use in this region. */
  var currenciesInUse: IVectorView[String]
  /** Gets a localized string that is suitable for display to the user for identifying the region. */
  var displayName: String
  /** Gets the name of the region in the primary language spoken in this region. */
  var nativeName: String
}

object GeographicRegion {
  @scala.inline
  def apply(
    code: String,
    codeThreeDigit: String,
    codeThreeLetter: String,
    codeTwoLetter: String,
    currenciesInUse: IVectorView[String],
    displayName: String,
    nativeName: String
  ): GeographicRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeThreeDigit = codeThreeDigit.asInstanceOf[js.Any], codeThreeLetter = codeThreeLetter.asInstanceOf[js.Any], codeTwoLetter = codeTwoLetter.asInstanceOf[js.Any], currenciesInUse = currenciesInUse.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicRegion]
  }
}

