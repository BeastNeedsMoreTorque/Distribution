package typings.chrome.global.chrome

import typings.chrome.chrome.notifications.NotificationButtonClickedEvent
import typings.chrome.chrome.notifications.NotificationClickedEvent
import typings.chrome.chrome.notifications.NotificationClosedEvent
import typings.chrome.chrome.notifications.NotificationOptions
import typings.chrome.chrome.notifications.NotificationPermissionLevelChangedEvent
import typings.chrome.chrome.notifications.NotificationShowSettingsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Notifications
// https://developer.chrome.com/extensions/notifications
////////////////////
/**
  * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
  * Permissions:  "notifications"
  * @since Chrome 28.
  */
@JSGlobal("chrome.notifications")
@js.native
object notifications extends js.Object {
  var onButtonClicked: NotificationButtonClickedEvent = js.native
  var onClicked: NotificationClickedEvent = js.native
  var onClosed: NotificationClosedEvent = js.native
  var onPermissionLevelChanged: NotificationPermissionLevelChangedEvent = js.native
  var onShowSettings: NotificationShowSettingsEvent = js.native
  def clear(notificationId: String): Unit = js.native
  def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def create(notificationId: String, options: NotificationOptions): Unit = js.native
  def create(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  def create(options: NotificationOptions): Unit = js.native
  def create(options: NotificationOptions, callback: js.Function1[/* notificationId */ String, Unit]): Unit = js.native
  def getAll(callback: js.Function1[/* notifications */ js.Object, Unit]): Unit = js.native
  def getPermissionLevel(callback: js.Function1[/* level */ String, Unit]): Unit = js.native
  def update(notificationId: String, options: NotificationOptions): Unit = js.native
  def update(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}

