package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMonitoring extends js.Object {
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: typings.awsSdk.kafkaMod.Prometheus = js.native
}

object OpenMonitoring {
  @scala.inline
  def apply(Prometheus: Prometheus): OpenMonitoring = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoring]
  }
}

