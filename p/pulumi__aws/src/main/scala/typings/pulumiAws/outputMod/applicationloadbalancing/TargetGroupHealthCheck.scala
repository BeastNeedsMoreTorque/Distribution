package typings.pulumiAws.outputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupHealthCheck extends js.Object {
  /**
    * Boolean to enable / disable `stickiness`. Default is `true`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
    */
  var interval: js.UndefOr[Double] = js.native
  var matcher: String = js.native
  /**
    * The destination for the health check request. Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var path: String = js.native
  /**
    * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  var port: js.UndefOr[String] = js.native
  /**
    * The protocol to use for routing traffic to the targets. Should be one of "TCP", "TLS", "UDP", "TCP_UDP", "HTTP" or "HTTPS". Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
    */
  var timeout: Double = js.native
  /**
    * The number of consecutive health check failures required before considering the target unhealthy . For Network Load Balancers, this value must be the same as the `healthyThreshold`. Defaults to 3.
    * * `matcher` (Required for HTTP/HTTPS ALB) The HTTP codes to use when checking for a successful response from a target. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object TargetGroupHealthCheck {
  @scala.inline
  def apply(
    matcher: String,
    path: String,
    timeout: Double,
    enabled: js.UndefOr[Boolean] = js.undefined,
    healthyThreshold: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    port: String = null,
    protocol: String = null,
    unhealthyThreshold: js.UndefOr[Double] = js.undefined
  ): TargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal(matcher = matcher.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(healthyThreshold)) __obj.updateDynamic("healthyThreshold")(healthyThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(unhealthyThreshold)) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupHealthCheck]
  }
}

