package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelExportTaskRequest extends js.Object {
  /**
    * The ID of the export task. This is the ID returned by CreateInstanceExportTask.
    */
  var ExportTaskId: ExportVmTaskId = js.native
}

object CancelExportTaskRequest {
  @scala.inline
  def apply(ExportTaskId: ExportVmTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(ExportTaskId = ExportTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
}

