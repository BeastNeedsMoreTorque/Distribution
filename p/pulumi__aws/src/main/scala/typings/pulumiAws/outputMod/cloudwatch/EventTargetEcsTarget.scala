package typings.pulumiAws.outputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetEcsTarget extends js.Object {
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values are EC2 or FARGATE.
    */
  var launchType: js.UndefOr[String] = js.native
  /**
    * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launchType is FARGATE because the awsvpc mode is required for Fargate tasks.
    */
  var networkConfiguration: js.UndefOr[EventTargetEcsTargetNetworkConfiguration] = js.native
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks to create based on the TaskDefinition. The default is 1.
    */
  var taskCount: js.UndefOr[Double] = js.native
  /**
    * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
    */
  var taskDefinitionArn: String = js.native
}

object EventTargetEcsTarget {
  @scala.inline
  def apply(
    taskDefinitionArn: String,
    group: String = null,
    launchType: String = null,
    networkConfiguration: EventTargetEcsTargetNetworkConfiguration = null,
    platformVersion: String = null,
    taskCount: js.UndefOr[Double] = js.undefined
  ): EventTargetEcsTarget = {
    val __obj = js.Dynamic.literal(taskDefinitionArn = taskDefinitionArn.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(taskCount)) __obj.updateDynamic("taskCount")(taskCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetEcsTarget]
  }
}

