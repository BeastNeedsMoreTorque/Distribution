package typings.karmaSpecReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecReporterOptions extends js.Object {
  /** test would finish with error when a first fail occurs */
  var failFast: js.UndefOr[Boolean] = js.undefined
  /** limit number of lines logged per test */
  var maxLogLines: js.UndefOr[Double] = js.undefined
  /** print the time elapsed for each spec */
  var showSpecTiming: js.UndefOr[Boolean] = js.undefined
  /** do not print error summary */
  var suppressErrorSummary: js.UndefOr[Boolean] = js.undefined
  /** do not print information about failed tests */
  var suppressFailed: js.UndefOr[Boolean] = js.undefined
  /** do not print information about passed tests */
  var suppressPassed: js.UndefOr[Boolean] = js.undefined
  /** do not print information about skipped tests */
  var suppressSkipped: js.UndefOr[Boolean] = js.undefined
}

object SpecReporterOptions {
  @scala.inline
  def apply(
    failFast: js.UndefOr[Boolean] = js.undefined,
    maxLogLines: js.UndefOr[Double] = js.undefined,
    showSpecTiming: js.UndefOr[Boolean] = js.undefined,
    suppressErrorSummary: js.UndefOr[Boolean] = js.undefined,
    suppressFailed: js.UndefOr[Boolean] = js.undefined,
    suppressPassed: js.UndefOr[Boolean] = js.undefined,
    suppressSkipped: js.UndefOr[Boolean] = js.undefined
  ): SpecReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failFast)) __obj.updateDynamic("failFast")(failFast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLogLines)) __obj.updateDynamic("maxLogLines")(maxLogLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSpecTiming)) __obj.updateDynamic("showSpecTiming")(showSpecTiming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrorSummary)) __obj.updateDynamic("suppressErrorSummary")(suppressErrorSummary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFailed)) __obj.updateDynamic("suppressFailed")(suppressFailed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressPassed)) __obj.updateDynamic("suppressPassed")(suppressPassed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressSkipped)) __obj.updateDynamic("suppressSkipped")(suppressSkipped.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecReporterOptions]
  }
}

