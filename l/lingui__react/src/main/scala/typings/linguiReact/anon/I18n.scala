package typings.linguiReact.anon

import typings.linguiCore.mod.I18n_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  var i18n: I18n_
  var i18nHash: js.UndefOr[String] = js.undefined
}

object I18n {
  @scala.inline
  def apply(i18n: I18n_, i18nHash: String = null): I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    if (i18nHash != null) __obj.updateDynamic("i18nHash")(i18nHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
}

