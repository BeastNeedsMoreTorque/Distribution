package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButton extends ActionBase {
  /**
    * The URL to an image that will be used to represent the action. This property will be used as a background image for the node. It may be used in conjunction with the `className` property or by itself. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
    */
  var image: String
}

object ActionButton {
  @scala.inline
  def apply(
    active: Boolean,
    className: String,
    disabled: Boolean,
    id: String,
    image: String,
    title: String,
    `type`: String,
    visible: Boolean
  ): ActionButton = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButton]
  }
}

