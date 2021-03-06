package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordDeleted")
@js.native
class RecordDeleted protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.RecordDeleted {
  def this(recordKey: Double, recordIdx: Double, changeKey: IChangeKey) = this()
  /* CompleteClass */
  override var changeKey: IChangeKey = js.native
  /* CompleteClass */
  override var recordIdx: Double = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

