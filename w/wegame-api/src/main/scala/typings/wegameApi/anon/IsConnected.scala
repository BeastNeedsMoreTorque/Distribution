package typings.wegameApi.anon

import typings.wegameApi.wx.types.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsConnected extends js.Object {
  /**
    * 当前是否有网络链接
    */
  var isConnected: Boolean
  /**
    * none - 无网络, unknown - Android 下不常见的网络类型
    */
  var networkType: NetworkType
}

object IsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: NetworkType): IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnected]
  }
}

