package typings.waterline.mod

import typings.waterline.waterlineStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined waterline.waterline.BaseAttribute<string> & {  type  :'text'} */
trait TextAttribute extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.undefined
  var autoCreatedAt: js.UndefOr[Boolean] = js.undefined
  var autoUpdatedAt: js.UndefOr[Boolean] = js.undefined
  var columnName: js.UndefOr[String] = js.undefined
  var defaultsTo: js.UndefOr[String | DefaultsToFn[String]] = js.undefined
  var enum: js.UndefOr[js.Array[String]] = js.undefined
  var index: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String with text] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
  var validations: js.UndefOr[AttributeValidations] = js.undefined
}

object TextAttribute {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[Boolean] = js.undefined,
    autoCreatedAt: js.UndefOr[Boolean] = js.undefined,
    autoUpdatedAt: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    defaultsTo: String | DefaultsToFn[String] = null,
    enum: js.Array[String] = null,
    index: js.UndefOr[Boolean] = js.undefined,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    `type`: String with text = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    validations: AttributeValidations = null
  ): TextAttribute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreatedAt)) __obj.updateDynamic("autoCreatedAt")(autoCreatedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdatedAt)) __obj.updateDynamic("autoUpdatedAt")(autoUpdatedAt.get.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (defaultsTo != null) __obj.updateDynamic("defaultsTo")(defaultsTo.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    if (validations != null) __obj.updateDynamic("validations")(validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAttribute]
  }
}

