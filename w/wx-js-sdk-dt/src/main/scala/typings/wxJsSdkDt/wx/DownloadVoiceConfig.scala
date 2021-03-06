package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadVoiceConfig extends WxBaseRequestConfig {
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  /**
    * 需要下载的音频的服务器端 ID，由 uploadVoice 接口获得
    */
  var serverId: String
  /**
    * 下载成功回调
    */
  @JSName("success")
  def success_MDownloadVoiceConfig(res: js.Any): Unit
}

object DownloadVoiceConfig {
  @scala.inline
  def apply(
    serverId: String,
    success: js.Any => Unit,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    isShowProgressTips: js.UndefOr[Double] = js.undefined
  ): DownloadVoiceConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(isShowProgressTips)) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadVoiceConfig]
  }
}

