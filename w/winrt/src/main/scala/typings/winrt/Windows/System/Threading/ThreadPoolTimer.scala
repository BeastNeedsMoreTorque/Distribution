package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadPoolTimer extends IThreadPoolTimer

object ThreadPoolTimer {
  @scala.inline
  def apply(cancel: () => Unit, delay: Double, period: Double): ThreadPoolTimer = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadPoolTimer]
  }
}

