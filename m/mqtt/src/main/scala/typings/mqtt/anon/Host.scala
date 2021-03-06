package typings.mqtt.anon

import typings.mqtt.mqttStrings.mqtt
import typings.mqtt.mqttStrings.mqtts
import typings.mqtt.mqttStrings.ssl
import typings.mqtt.mqttStrings.tcp
import typings.mqtt.mqttStrings.ws
import typings.mqtt.mqttStrings.wss
import typings.mqtt.mqttStrings.wx
import typings.mqtt.mqttStrings.wxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var port: Double
  var protocol: js.UndefOr[wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs] = js.undefined
}

object Host {
  @scala.inline
  def apply(host: String, port: Double, protocol: wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs = null): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

