package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameServerGroupInput extends js.Object {
  /**
    * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting. The scaling policy uses the metric "PercentUtilizedGameServers" to maintain a buffer of idle game servers that can immediately accommodate new games and players. Once the game server and Auto Scaling groups are created, you can update the scaling policy settings directly in Auto Scaling Groups.
    */
  var AutoScalingPolicy: js.UndefOr[GameServerGroupAutoScalingPolicy] = js.native
  /**
    * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once again be used. Method options include:   SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and not replaced.   SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and replaced with new On-Demand instances.   
    */
  var BalancingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.BalancingStrategy] = js.native
  /**
    * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS account.
    */
  var GameServerGroupName: typings.awsSdk.gameliftMod.GameServerGroupName = js.native
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running may by terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status. This property is set to NO_PROTECTION by default.
    */
  var GameServerProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.native
  /**
    * A set of EC2 instance types to use when creating instances in the group. The instance definitions must specify at least two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see EC2 Instance Types in the Amazon EC2 User Guide.
    */
  var InstanceDefinitions: typings.awsSdk.gameliftMod.InstanceDefinitions = js.native
  /**
    * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group. You can specify the template using either the template name or ID. For help with creating a launch template, see Creating a Launch Template for an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var LaunchTemplate: LaunchTemplateSpecification = js.native
  /**
    * The maximum number of instances allowed in the EC2 Auto Scaling group. During autoscaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum.
    */
  var MaxSize: PositiveInteger = js.native
  /**
    * The minimum number of instances allowed in the EC2 Auto Scaling group. During autoscaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at least 1.
    */
  var MinSize: WholeNumber = js.native
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is validated to ensure that it contains the necessary permissions for game server groups.
    */
  var RoleArn: IamRoleArn = js.native
  /**
    * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management, and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all GameLift FleetIQ-supported availability zones are used; this parameter allows you to specify VPCs that you've set up. 
    */
  var VpcSubnets: js.UndefOr[typings.awsSdk.gameliftMod.VpcSubnets] = js.native
}

object CreateGameServerGroupInput {
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupName,
    InstanceDefinitions: InstanceDefinitions,
    LaunchTemplate: LaunchTemplateSpecification,
    MaxSize: PositiveInteger,
    MinSize: WholeNumber,
    RoleArn: IamRoleArn,
    AutoScalingPolicy: GameServerGroupAutoScalingPolicy = null,
    BalancingStrategy: BalancingStrategy = null,
    GameServerProtectionPolicy: GameServerProtectionPolicy = null,
    Tags: TagList = null,
    VpcSubnets: VpcSubnets = null
  ): CreateGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], InstanceDefinitions = InstanceDefinitions.asInstanceOf[js.Any], LaunchTemplate = LaunchTemplate.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy.asInstanceOf[js.Any])
    if (BalancingStrategy != null) __obj.updateDynamic("BalancingStrategy")(BalancingStrategy.asInstanceOf[js.Any])
    if (GameServerProtectionPolicy != null) __obj.updateDynamic("GameServerProtectionPolicy")(GameServerProtectionPolicy.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcSubnets != null) __obj.updateDynamic("VpcSubnets")(VpcSubnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameServerGroupInput]
  }
}

