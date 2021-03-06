package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeploymentJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.native
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  /**
    * The deployment job failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * A short description of the reason why the deployment job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * A list of robot deployment summaries.
    */
  var robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary] = js.native
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  /**
    * The list of all tags added to the specified deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeDeploymentJobResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: CreatedAt = null,
    deploymentApplicationConfigs: DeploymentApplicationConfigs = null,
    deploymentConfig: DeploymentConfig = null,
    failureCode: DeploymentJobErrorCode = null,
    failureReason: GenericString = null,
    fleet: Arn = null,
    robotDeploymentSummary: RobotDeploymentSummary = null,
    status: DeploymentStatus = null,
    tags: TagMap = null
  ): DescribeDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (deploymentApplicationConfigs != null) __obj.updateDynamic("deploymentApplicationConfigs")(deploymentApplicationConfigs.asInstanceOf[js.Any])
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (fleet != null) __obj.updateDynamic("fleet")(fleet.asInstanceOf[js.Any])
    if (robotDeploymentSummary != null) __obj.updateDynamic("robotDeploymentSummary")(robotDeploymentSummary.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeploymentJobResponse]
  }
}

