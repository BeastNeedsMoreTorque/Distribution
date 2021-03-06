package typings.meteorUniverseI18n.mod.i18n

import typings.meteorUniverseI18n.mod.GetTranslationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/universe:i18n", "i18n.getTranslation")
@js.native
object getTranslation extends js.Object {
  def apply(key: String*): String = js.native
  def apply(key: String): String = js.native
  def apply(key: String, params: GetTranslationParams): String = js.native
  def apply(namespace: String, key: String, params: GetTranslationParams): String = js.native
}

