package typings.cavy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesterProps extends js.Object {
  var clearAsyncStorage: js.UndefOr[Boolean] = js.undefined
  var reporter: js.UndefOr[js.Function1[/* report */ TestReport, Unit]] = js.undefined
  // Deprecated
  var sendReport: js.UndefOr[Boolean] = js.undefined
  var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]]
  var startDelay: js.UndefOr[Double] = js.undefined
  var store: TestHookStore
  var waitTime: js.UndefOr[Double] = js.undefined
}

object TesterProps {
  @scala.inline
  def apply(
    specs: js.Array[js.Function1[/* spec */ TestScope, Unit]],
    store: TestHookStore,
    clearAsyncStorage: js.UndefOr[Boolean] = js.undefined,
    reporter: /* report */ TestReport => Unit = null,
    sendReport: js.UndefOr[Boolean] = js.undefined,
    startDelay: js.UndefOr[Double] = js.undefined,
    waitTime: js.UndefOr[Double] = js.undefined
  ): TesterProps = {
    val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (!js.isUndefined(clearAsyncStorage)) __obj.updateDynamic("clearAsyncStorage")(clearAsyncStorage.get.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(js.Any.fromFunction1(reporter))
    if (!js.isUndefined(sendReport)) __obj.updateDynamic("sendReport")(sendReport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startDelay)) __obj.updateDynamic("startDelay")(startDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitTime)) __obj.updateDynamic("waitTime")(waitTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TesterProps]
  }
}

