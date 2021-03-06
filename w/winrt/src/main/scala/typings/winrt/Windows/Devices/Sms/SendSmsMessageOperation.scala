package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.anon.CompletedGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendSmsMessageOperation extends IAsyncAction {
  var operation: CompletedGetResults = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](
    success: js.Function0[_],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
}

