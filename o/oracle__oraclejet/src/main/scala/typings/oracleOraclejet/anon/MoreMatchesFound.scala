package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreMatchesFound extends js.Object {
  var filterFurther: js.UndefOr[String] = js.undefined
  var moreMatchesFound: js.UndefOr[String] = js.undefined
  var noMatchesFound: js.UndefOr[String] = js.undefined
  var oneMatchesFound: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Hint] = js.undefined
  var searchField: js.UndefOr[String] = js.undefined
}

object MoreMatchesFound {
  @scala.inline
  def apply(
    filterFurther: String = null,
    moreMatchesFound: String = null,
    noMatchesFound: String = null,
    oneMatchesFound: String = null,
    required: Hint = null,
    searchField: String = null
  ): MoreMatchesFound = {
    val __obj = js.Dynamic.literal()
    if (filterFurther != null) __obj.updateDynamic("filterFurther")(filterFurther.asInstanceOf[js.Any])
    if (moreMatchesFound != null) __obj.updateDynamic("moreMatchesFound")(moreMatchesFound.asInstanceOf[js.Any])
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound.asInstanceOf[js.Any])
    if (oneMatchesFound != null) __obj.updateDynamic("oneMatchesFound")(oneMatchesFound.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (searchField != null) __obj.updateDynamic("searchField")(searchField.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreMatchesFound]
  }
}

