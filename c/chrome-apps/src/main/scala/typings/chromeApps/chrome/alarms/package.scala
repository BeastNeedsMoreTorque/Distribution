package typings.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarms {
  type AlarmEvent = typings.chromeApps.chrome.events.Event[js.Function1[/* alarm */ typings.chromeApps.chrome.alarms.Alarm, scala.Unit]]
}
