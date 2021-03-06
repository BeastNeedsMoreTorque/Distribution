package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
trait SemanticRolesOptions extends js.Object {
  /** Set this to `true` to return entity information for subjects and objects. */
  var entities: js.UndefOr[Boolean] = js.undefined
  /** Set this to `true` to return keyword information for subjects and objects. */
  var keywords: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of semantic_roles results to return. */
  var limit: js.UndefOr[Double] = js.undefined
}

object SemanticRolesOptions {
  @scala.inline
  def apply(
    entities: js.UndefOr[Boolean] = js.undefined,
    keywords: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined
  ): SemanticRolesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keywords)) __obj.updateDynamic("keywords")(keywords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesOptions]
  }
}

