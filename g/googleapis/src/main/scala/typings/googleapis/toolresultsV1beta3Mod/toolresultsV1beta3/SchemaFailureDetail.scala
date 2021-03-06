package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFailureDetail extends js.Object {
  /**
    * If the failure was severe because the system (app) under test crashed.
    */
  var crashed: js.UndefOr[Boolean] = js.native
  /**
    * If an app is not installed and thus no test can be run with the app. This
    * might be caused by trying to run a test on an unsupported platform.
    */
  var notInstalled: js.UndefOr[Boolean] = js.native
  /**
    * If a native process (including any other than the app) crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
  /**
    * If the test overran some time limit, and that is why it failed.
    */
  var timedOut: js.UndefOr[Boolean] = js.native
  /**
    * If the robo was unable to crawl the app; perhaps because the app did not
    * start.
    */
  var unableToCrawl: js.UndefOr[Boolean] = js.native
}

object SchemaFailureDetail {
  @scala.inline
  def apply(
    crashed: js.UndefOr[Boolean] = js.undefined,
    notInstalled: js.UndefOr[Boolean] = js.undefined,
    otherNativeCrash: js.UndefOr[Boolean] = js.undefined,
    timedOut: js.UndefOr[Boolean] = js.undefined,
    unableToCrawl: js.UndefOr[Boolean] = js.undefined
  ): SchemaFailureDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crashed)) __obj.updateDynamic("crashed")(crashed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notInstalled)) __obj.updateDynamic("notInstalled")(notInstalled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(otherNativeCrash)) __obj.updateDynamic("otherNativeCrash")(otherNativeCrash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timedOut)) __obj.updateDynamic("timedOut")(timedOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unableToCrawl)) __obj.updateDynamic("unableToCrawl")(unableToCrawl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFailureDetail]
  }
}

