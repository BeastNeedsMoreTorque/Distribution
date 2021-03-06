package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupPlanOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * The date and time a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of DeletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var DeletionDate: js.UndefOr[timestamp] = js.native
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version Ids cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteBackupPlanOutput {
  @scala.inline
  def apply(
    BackupPlanArn: ARN = null,
    BackupPlanId: String = null,
    DeletionDate: timestamp = null,
    VersionId: String = null
  ): DeleteBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanArn != null) __obj.updateDynamic("BackupPlanArn")(BackupPlanArn.asInstanceOf[js.Any])
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupPlanOutput]
  }
}

