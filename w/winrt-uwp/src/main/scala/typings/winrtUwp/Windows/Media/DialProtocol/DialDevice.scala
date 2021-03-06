package typings.winrtUwp.Windows.Media.DialProtocol

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the remote device capable of running DIAL apps. */
trait DialDevice extends js.Object {
  /** Gets the friendly name for the DIAL device. */
  var friendlyName: String
  /** Gets the remote device's ID. You can use this ID with the Windows.Devices.Enumeration APIs as well. */
  var id: String
  /** Gets a stream containing the thumbnail image for the DIAL device. */
  var thumbnail: IRandomAccessStreamReference
  /**
    * Creates a new DialApp object. This method does not establish a connection to the device or validate that the app exists. That is done when any function is called on the resulting DialApp object.
    * @param appName The name of the app. This becomes the AppName property of the new object.
    * @return The DialApp object for the app.
    */
  def getDialApp(appName: String): DialApp
}

object DialDevice {
  @scala.inline
  def apply(
    friendlyName: String,
    getDialApp: String => DialApp,
    id: String,
    thumbnail: IRandomAccessStreamReference
  ): DialDevice = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], getDialApp = js.Any.fromFunction1(getDialApp), id = id.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDevice]
  }
}

