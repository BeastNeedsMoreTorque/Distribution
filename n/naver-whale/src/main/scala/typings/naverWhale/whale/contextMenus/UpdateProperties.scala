package typings.naverWhale.whale.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. Since Chrome 20.  */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var onclick: js.UndefOr[js.Function] = js.undefined
  /** Optional. Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[js.Any] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * @since Chrome 62.
    * Whether the item is visible in the menu.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[String] = null,
    documentUrlPatterns: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onclick: js.Function = null,
    parentId: js.Any = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProperties]
  }
}

