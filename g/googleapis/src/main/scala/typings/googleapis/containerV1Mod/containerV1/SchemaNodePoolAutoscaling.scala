package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodePoolAutoscaling contains information required by cluster autoscaler to
  * adjust the size of the node pool to the current cluster usage.
  */
@js.native
trait SchemaNodePoolAutoscaling extends js.Object {
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
    * There has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.native
  /**
    * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.native
}

object SchemaNodePoolAutoscaling {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxNodeCount: js.UndefOr[Double] = js.undefined,
    minNodeCount: js.UndefOr[Double] = js.undefined
  ): SchemaNodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNodeCount)) __obj.updateDynamic("maxNodeCount")(maxNodeCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minNodeCount)) __obj.updateDynamic("minNodeCount")(minNodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodePoolAutoscaling]
  }
}

