package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditChangesSavingEventArgs extends CancelEventArgs {
  val deletedValues: js.Any
  val insertedValues: js.Any
  val updatedValues: js.Any
}

object CardViewBatchEditChangesSavingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): CardViewBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditChangesSavingEventArgs]
  }
}

