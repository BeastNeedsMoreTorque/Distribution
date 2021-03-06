package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HCEMessageRes extends js.Object {
  /**
    * 客户端接收到 NFC 设备的指令
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 消息类型
    */
  var messageType: js.UndefOr[Double] = js.undefined
  /**
    * 此参数当且仅当 messageType=2 时有效
    */
  var reason: js.UndefOr[Double] = js.undefined
}

object HCEMessageRes {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    messageType: js.UndefOr[Double] = js.undefined,
    reason: js.UndefOr[Double] = js.undefined
  ): HCEMessageRes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(messageType)) __obj.updateDynamic("messageType")(messageType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reason)) __obj.updateDynamic("reason")(reason.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCEMessageRes]
  }
}

