package typings.openfin.externalApplicationMod

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import typings.openfin.openfinStrings.externalapplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalApplicationEvents extends BaseEventMap {
  var connected: RuntimeEvent[externalapplication, typings.openfin.openfinStrings.connected]
  var disconnected: RuntimeEvent[externalapplication, typings.openfin.openfinStrings.disconnected]
}

object ExternalApplicationEvents {
  @scala.inline
  def apply(
    connected: RuntimeEvent[externalapplication, connected],
    disconnected: RuntimeEvent[externalapplication, disconnected],
    listenerRemoved: String,
    newListener: String
  ): ExternalApplicationEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalApplicationEvents]
  }
}

