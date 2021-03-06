package typings.tannin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tannin extends js.Object {
  /**
    * Jed-formatted locale data.
    *
    * @name Tannin#data
    * @type {TanninLocaleData}
    */
  var data: TanninLocaleData = js.native
  /**
    * Effective options for instance, including defaults.
    *
    * @name Tannin#options
    * @type {TanninOptions}
    */
  var options: TanninOptions = js.native
  /**
    * Plural forms function cache, keyed by plural forms string.
    *
    * @name Tannin#pluralForms
    * @type {Object<string,Function>}
    */
  var pluralForms: StringDictionary[js.Function] = js.native
  def dcnpgettext(domain: String, context: String, singular: String): String = js.native
  def dcnpgettext(domain: String, context: String, singular: String, plural: String): String = js.native
  def dcnpgettext(domain: String, context: String, singular: String, plural: String, n: Double): String = js.native
  def dcnpgettext(domain: String, context: Unit, singular: String): String = js.native
  def dcnpgettext(domain: String, context: Unit, singular: String, plural: String): String = js.native
  def dcnpgettext(domain: String, context: Unit, singular: String, plural: String, n: Double): String = js.native
  def getPluralForm(domain: String, n: Double): Double = js.native
}

