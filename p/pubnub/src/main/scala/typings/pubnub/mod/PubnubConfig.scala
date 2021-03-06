package typings.pubnub.mod

import typings.pubnub.anon.FreeSocketKeepAliveTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubnubConfig extends js.Object {
  var authKey: js.UndefOr[String] = js.undefined
  var autoNetworkDetection: js.UndefOr[Boolean] = js.undefined
  var cipherKey: js.UndefOr[String] = js.undefined
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveSettings: js.UndefOr[FreeSocketKeepAliveTimeout] = js.undefined
  var listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.undefined
  var logVerbosity: js.UndefOr[Boolean] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var presenceTimeout: js.UndefOr[Double] = js.undefined
  var publishKey: js.UndefOr[String] = js.undefined
  var requestMessageCountThreshold: js.UndefOr[Double] = js.undefined
  var restore: js.UndefOr[Boolean] = js.undefined
  var secretKey: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var subscribeKey: String
  var suppressLeaveEvents: js.UndefOr[Boolean] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object PubnubConfig {
  @scala.inline
  def apply(
    subscribeKey: String,
    authKey: String = null,
    autoNetworkDetection: js.UndefOr[Boolean] = js.undefined,
    cipherKey: String = null,
    heartbeatInterval: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveSettings: FreeSocketKeepAliveTimeout = null,
    listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.undefined,
    logVerbosity: js.UndefOr[Boolean] = js.undefined,
    origin: String = null,
    presenceTimeout: js.UndefOr[Double] = js.undefined,
    publishKey: String = null,
    requestMessageCountThreshold: js.UndefOr[Double] = js.undefined,
    restore: js.UndefOr[Boolean] = js.undefined,
    secretKey: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    suppressLeaveEvents: js.UndefOr[Boolean] = js.undefined,
    uuid: String = null
  ): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNetworkDetection)) __obj.updateDynamic("autoNetworkDetection")(autoNetworkDetection.get.asInstanceOf[js.Any])
    if (cipherKey != null) __obj.updateDynamic("cipherKey")(cipherKey.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatInterval)) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (keepAliveSettings != null) __obj.updateDynamic("keepAliveSettings")(keepAliveSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(listenToBrowserNetworkEvents)) __obj.updateDynamic("listenToBrowserNetworkEvents")(listenToBrowserNetworkEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logVerbosity)) __obj.updateDynamic("logVerbosity")(logVerbosity.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(presenceTimeout)) __obj.updateDynamic("presenceTimeout")(presenceTimeout.get.asInstanceOf[js.Any])
    if (publishKey != null) __obj.updateDynamic("publishKey")(publishKey.asInstanceOf[js.Any])
    if (!js.isUndefined(requestMessageCountThreshold)) __obj.updateDynamic("requestMessageCountThreshold")(requestMessageCountThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore.get.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressLeaveEvents)) __obj.updateDynamic("suppressLeaveEvents")(suppressLeaveEvents.get.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubConfig]
  }
}

