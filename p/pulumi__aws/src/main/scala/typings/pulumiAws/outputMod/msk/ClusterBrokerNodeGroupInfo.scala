package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerNodeGroupInfo extends js.Object {
  /**
    * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
    */
  var azDistribution: js.UndefOr[String] = js.native
  /**
    * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
    */
  var clientSubnets: js.Array[String] = js.native
  /**
    * The size in GiB of the EBS volume for the data drive on each broker node.
    */
  var ebsVolumeSize: Double = js.native
  /**
    * Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
    */
  var instanceType: String = js.native
  /**
    * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
    */
  var securityGroups: js.Array[String] = js.native
}

object ClusterBrokerNodeGroupInfo {
  @scala.inline
  def apply(
    clientSubnets: js.Array[String],
    ebsVolumeSize: Double,
    instanceType: String,
    securityGroups: js.Array[String],
    azDistribution: String = null
  ): ClusterBrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    if (azDistribution != null) __obj.updateDynamic("azDistribution")(azDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBrokerNodeGroupInfo]
  }
}

