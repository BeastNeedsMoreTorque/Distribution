package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellText extends js.Object {
  var cellLabel: String
  var cellText: String
  var cellTextSelected: String
  var itemChecked: String
  var itemDecorator: String
  var itemValue: String
  var label: String
  var materialDecorator: String
  var root: String
  var row: String
}

object CellText {
  @scala.inline
  def apply(
    cellLabel: String,
    cellText: String,
    cellTextSelected: String,
    itemChecked: String,
    itemDecorator: String,
    itemValue: String,
    label: String,
    materialDecorator: String,
    root: String,
    row: String
  ): CellText = {
    val __obj = js.Dynamic.literal(cellLabel = cellLabel.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellText]
  }
}

